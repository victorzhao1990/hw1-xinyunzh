package com.victorzhao.annotator;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;

import com.victorzhao.type.*;

/** SentencesAnnotator is used to break the input text 
 * 	into individual lines based on line breaks.
 * @author victorzhao
 *
 */

public class SentencesAnnotator extends JCasAnnotator_ImplBase {

	@Override
	/** process(JCas aJCas) will process the CAS, adding sentence features to lines.
	 * 
	 * @param aJCas			
	 *			a JCAS that SentencesAnnotator should process.
	 * 
	 * @throws AnalysisEngineProcessException
	 * 			if a problem occurs during processing
	 */
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// get document text
		String docText = aJCas.getDocumentText();
		String[] sentences = docText.split("[\r\n]");
		for (String s : sentences) {
			// System.out.println(s);
			// System.out.println("*********");
			SentenceType annotation = new SentenceType(aJCas);
			// annotation.setBuilding("Yorktown");

			String[] sepeSent = s.split(" ", 2);
			// System.out.println("*********");
			annotation.setId(sepeSent[0]);
			// System.out.println("*********");
			annotation.setContent(sepeSent[1]);
			// System.out.println(sepeSent[0]+ " " + sepeSent[1]);
			annotation.addToIndexes();
		}

	}

}
