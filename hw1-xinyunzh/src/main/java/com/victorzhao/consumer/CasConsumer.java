package com.victorzhao.consumer;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;

import com.victorzhao.type.*;

/**
 * @author victorzhao
 *
 */

public class CasConsumer extends CasConsumer_ImplBase {
	private File mOutputPath;
	private static final String PARAM_OUTPUTPATH = "OutputFile";

	@Override
	public void initialize() throws ResourceInitializationException {
		mOutputPath = new File(
				(String) getConfigParameterValue(PARAM_OUTPUTPATH));
		if (!mOutputPath.exists()) {
			try {
				mOutputPath.createNewFile();
			} catch (IOException e) {
				throw new ResourceInitializationException(e);
			}
		}
	}

	@Override
	public void processCas(CAS aCAS) throws ResourceProcessException {
		// TODO Auto-generated method stub
		JCas jcas;
		FileWriter out = null;
		try {
			jcas = aCAS.getJCas();
		} catch (CASException e) {
			throw new ResourceProcessException(e);
		}
		FSIterator<Annotation> geneIt = jcas.getAnnotationIndex(GeneType.type)
				.iterator();
		try {
			out = new FileWriter(mOutputPath, true);
			BufferedWriter output = new BufferedWriter(out);
			while (geneIt.hasNext()) {
				GeneType gene = (GeneType) geneIt.next();
				output.write(gene.getId() + "|" + gene.getBegin() + " " + gene.getEnd() + "|" + gene.getSpelling() + "\n");
			}
			output.close();
			// System.out.println("*************");
		} catch (IOException e) {
			throw new ResourceProcessException(e);
		}
	}
}
