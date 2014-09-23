package com.victorzhao.reader;
import java.io.IOException;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.util.Progress;

import java.io.File;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * @author victorzhao
 *
 */

public class CollectionReader extends CollectionReader_ImplBase {
	public static final String PARAM_INPUTDIR = "InputFile";
	boolean isRead = true;
	@Override
	public void getNext(CAS aCAS) throws IOException, CollectionException {
		// TODO Auto-generated method stub
		JCas jcas;
		try {
			jcas = aCAS.getJCas();
		} catch (CASException e) {
			throw new CollectionException(e);
		}
		
		// open input stream to file
		File file = new File((String) getConfigParameterValue(PARAM_INPUTDIR));
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));
		try {
		    byte[] contents = new byte[(int) file.length()];
		    fis.read(contents);
		    String text;
		    text = new String(contents);
		    // System.out.println(text);
		    // put document in CAS
		    jcas.setDocumentText(text);
		  } finally {
			  if (fis != null)
				  fis.close();
		 }
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public Progress[] getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasNext() throws IOException, CollectionException {
		// TODO Auto-generated method stub
		if (this.isRead) {
			this.isRead = false;
			return true;
		}
		return false;
	}

}
