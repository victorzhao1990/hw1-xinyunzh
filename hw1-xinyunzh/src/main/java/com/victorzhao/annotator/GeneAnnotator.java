package com.victorzhao.annotator;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
// import java.util.Map;
import java.util.Set;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
// import com.aliasi.chunk.ConfidenceChunker;
import com.aliasi.util.AbstractExternalizable;
import com.victorzhao.type.*;

/**
 * @author victorzhao
 *
 */

public class GeneAnnotator extends JCasAnnotator_ImplBase {

	private Chunker chunker; 
//  private PosTagNamedEntityRecognizer posTagReco;
//	nBestChunk implementation
//	private ConfidenceChunker chunker;
	
//	public GeneAnnotator() throws ResourceInitializationException {
//		posTagReco = new PosTagNamedEntityRecognizer();
//	}
	
	@Override
	/** This method will initialize one instance for private variable chunker
	 * , which is one of the components of Lingpipe. It also loads the Genetag Model into
	 * the annotator.
	 * 
	 * @param aContext
	 */
	public void initialize(UimaContext aContext) throws ResourceInitializationException {
//		First-Best Named Entity Chunking
		try {
			chunker = (Chunker) AbstractExternalizable.
					readObject(new File("src/main/resources/ne-en-bio-genetag.HmmChunker"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		nBestChunk implementation
//		try {
//			chunker = (ConfidenceChunker) AbstractExternalizable.
//					readObject(new File("src/main/resources/ne-en-bio-genetag.HmmChunker"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
		
	@Override
	/** process(JCas aJCas) will call annoGene(JCas aJCas, String text) to process JCAS with 
	 * annotation of noun/phrase, adding gene annotation to them.
	 * 
	 * @param aJCas 
	 * 			a JCAS that GeneAnnotator should process.
	 */
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		AnnotationIndex<Annotation> sentenceIndex = aJCas
				.getAnnotationIndex(PreGene.type);
		FSIterator<Annotation> PreGeneIterator = sentenceIndex.iterator();
		while (PreGeneIterator.hasNext()) {
			PreGene st = (PreGene) PreGeneIterator.get();
			List<GeneType> geneList = annoGene(aJCas, st.getSpelling());
			for (GeneType gene : geneList) {
				gene.setId(st.getId());
				gene.addToIndexes();
				// System.out.println(gene.toString());
			}
			PreGeneIterator.moveToNext();
		}
		
	}
	
	/** annoGene(JCas aJCas, String text) will call an instance of Chunker 
	 * to process sentences, and add annotation of gene. This method will return an object of List type.  
	 * 
	 * @param aJCas
	 * 			a JCAS that annoGene(JCas aJCas, String text) should process.
	 * @param text
	 * 			The content of one specific noun/phrase which this method will process.
	 * @return
	 */
	private List<GeneType> annoGene(JCas aJCas, String text) {
		List<GeneType> geneList = new LinkedList<GeneType>();
		HashSet<String> hsString = new HashSet<String>();
		
//		First-Best Named Entity Chunking
		Chunking chunking = chunker.chunk(text);
		Set<Chunk> chSet = chunking.chunkSet();
		Iterator<Chunk> itChSet = chSet.iterator();
		// String cs = text.toString();
		while (itChSet.hasNext()) {
			GeneType gt = new GeneType(aJCas);
			Chunk chunk = itChSet.next();
			String name = text.substring(chunk.start(), chunk.end());
			if (!hsString.contains(name)) {
				hsString.add(name);
				gt.setBegin(chunk.start());
				gt.setEnd(chunk.end());
				gt.setSpelling(name);
				geneList.add(gt);
			}
//			gt.setBegin(chunk.start());
//			gt.setEnd(chunk.end());
//			gt.setSpelling(text.substring(chunk.start(), chunk.end()));
//			geneList.add(gt);
		}
// 		nBestChunk implementation
//		Iterator<Chunk> it
//	      = chunker.nBestChunks(cs, 0 , cs.length, 2);
//		char[] cs = text.toCharArray();
//		while (it.hasNext()){
//			GeneType gt = new GeneType(aJCas);
//			Chunk chunk = it.next();
//			double conf = Math.pow(2.0, chunk.score());
//			gt.setBegin(chunk.start());
//			gt.setEnd(chunk.end());
//			gt.setSpelling(text.substring(chunk.start(), chunk.end()));
//			geneList.add(gt);
//		}
		return geneList;
	}
	
	/* Abandoned process method
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub

//		try {
//			posTagReco = new PosTagNamedEntityRecognizer();
//		} catch (ResourceInitializationException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		AnnotationIndex<Annotation> sentenceIndex = aJCas
				.getAnnotationIndex(SentenceType.type);
		FSIterator<Annotation> sentenceIterator = sentenceIndex.iterator();

		while (sentenceIterator.hasNext()) {
			SentenceType st = (SentenceType) sentenceIterator.get();
			List<GeneType> geneList = annoGene(aJCas, st.getContent());
			for (GeneType gene : geneList) {
				gene.setId(st.getId());
				gene.addToIndexes();
			}
//			System.out.println(st.getId());
//			System.out.println(st.getContent());
			sentenceIterator.moveToNext();
		}
	}
	*/
	
	/* Abandoned annoGene method
	private List<GeneType> annoGene(JCas aJCas, String text) {
		List<GeneType> geneList = new LinkedList<GeneType>();
		Map<Integer, Integer> geneSpans = posTagReco.getGeneSpans(text);
		// Set<Map.Entry<Integer, Integer>> entrySpans = geneSpans.entrySet();
//		for (Map.Entry<Integer, Integer> item : entrySpans) {
//		// for (Map.Entry<Integer, Integer> item : geneSpans)	
//			int beginIndex = item.getKey();
//			int endIndex = item.getValue();
//			GeneType gt = new GeneType(aJCas);
//			String name = text.substring(beginIndex, endIndex);
//			gt.setBegin(beginIndex);
//			gt.setEnd(endIndex);
//			gt.setSpelling(name);
//			geneList.add(gt);
//		}
		Iterator<Map.Entry<Integer, Integer>> geneSpansIter = geneSpans.entrySet().iterator();
		while (geneSpansIter.hasNext()) {
			Map.Entry<Integer, Integer> entry = geneSpansIter.next();
			int beginIndex = entry.getKey();
			int endIndex = entry.getValue();
			GeneType gt = new GeneType(aJCas);
			String name = text.substring(beginIndex, endIndex);
			gt.setBegin(beginIndex);
			gt.setEnd(endIndex);
			gt.setSpelling(name);
			geneList.add(gt);
		}
		return geneList;
	}
	*/
}
