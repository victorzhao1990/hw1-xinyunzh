package com.victorzhao.annotator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;

import com.victorzhao.nlp.*;
import com.victorzhao.type.PreGene;
import com.victorzhao.type.SentenceType;

/** PreGeneAnnotator is used to add nouns features to words with one sentence.
 * 	
 * @author victorzhao
 *
 */

public class PreGeneAnnotator extends JCasAnnotator_ImplBase {

	private PosTagNamedEntityRecognizer posTagReco;
	
	@Override
	/** This method will initialize one instance for private variable posTagReco
	 * , which can be called in main process as third-party class/tools.
	 * 
	 * @param aContext
	 */
	public void initialize(UimaContext aContext) throws ResourceInitializationException {
		posTagReco = new PosTagNamedEntityRecognizer();
	}
	
	@Override
	/** process(JCas aJCas) will call annoPreGene(JCas aJCas, String text) to process JCAS with 
	 * annotation of sentences, adding noun annotation to words.
	 * 
	 * @param aJCas 
	 * 			a JCAS that PreGeneAnnotator should process.
	 */
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub

		try {
			posTagReco = new PosTagNamedEntityRecognizer();
		} catch (ResourceInitializationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		AnnotationIndex<Annotation> sentenceIndex = aJCas
				.getAnnotationIndex(SentenceType.type);
		FSIterator<Annotation> sentenceIterator = sentenceIndex.iterator();
		while (sentenceIterator.hasNext()) {
			SentenceType st = (SentenceType) sentenceIterator.get();
			List<PreGene> geneList = annoPreGene(aJCas, st.getContent());
			for (PreGene preGene : geneList) {
				preGene.setId(st.getId());
				preGene.addToIndexes();
			}
//			System.out.println(st.getId());
//			System.out.println(st.getContent());
			sentenceIterator.moveToNext();
		}
	}
	
	/** annoPreGene(JCas aJCas, String text) will call an instance of PosTagNamedEntityRecognizer 
	 * to process sentences, and add annotation of noun. This method will return an object of List type.  
	 * 
	 * @param aJCas
	 * 			a JCAS that annoPreGene(JCas aJCas, String text) should process.
	 * @param text
	 * 			The content of one specific sentence which this method will process.
	 * @return
	 */
	private List<PreGene> annoPreGene(JCas aJCas, String text) {
		List<PreGene> geneList = new LinkedList<PreGene>();
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
		HashSet<String> hsString = new HashSet<String>();
		Iterator<Map.Entry<Integer, Integer>> geneSpansIter = geneSpans.entrySet().iterator();
		while (geneSpansIter.hasNext()) {
			Map.Entry<Integer, Integer> entry = geneSpansIter.next();
			int beginIndex = entry.getKey();
			int endIndex = entry.getValue();
			PreGene gt = new PreGene(aJCas);
			String name = text.substring(beginIndex, endIndex);
			
			if (!hsString.contains(name)) {
				hsString.add(name);
				gt.setBegin(beginIndex);
				gt.setEnd(endIndex);
				gt.setSpelling(name);
				geneList.add(gt);
			}
		}
		return geneList;
	}
}
