package com.victorzhao.type;

/* First created by JCasGen Mon Sep 22 01:32:32 EDT 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Sep 23 01:49:04 EDT 2014
 * @generated */
public class GeneType_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GeneType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GeneType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GeneType(addr, GeneType_Type.this);
  			   GeneType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GeneType(addr, GeneType_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GeneType.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.victorzhao.type.GeneType");
 
  /** @generated */
  final Feature casFeat_Id;
  /** @generated */
  final int     casFeatCode_Id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_Id == null)
      jcas.throwFeatMissing("Id", "com.victorzhao.type.GeneType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_Id == null)
      jcas.throwFeatMissing("Id", "com.victorzhao.type.GeneType");
    ll_cas.ll_setStringValue(addr, casFeatCode_Id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Spelling;
  /** @generated */
  final int     casFeatCode_Spelling;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSpelling(int addr) {
        if (featOkTst && casFeat_Spelling == null)
      jcas.throwFeatMissing("Spelling", "com.victorzhao.type.GeneType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Spelling);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpelling(int addr, String v) {
        if (featOkTst && casFeat_Spelling == null)
      jcas.throwFeatMissing("Spelling", "com.victorzhao.type.GeneType");
    ll_cas.ll_setStringValue(addr, casFeatCode_Spelling, v);}
    
  
 
  /** @generated */
  final Feature casFeat_BeginWithoutSpace;
  /** @generated */
  final int     casFeatCode_BeginWithoutSpace;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBeginWithoutSpace(int addr) {
        if (featOkTst && casFeat_BeginWithoutSpace == null)
      jcas.throwFeatMissing("BeginWithoutSpace", "com.victorzhao.type.GeneType");
    return ll_cas.ll_getIntValue(addr, casFeatCode_BeginWithoutSpace);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBeginWithoutSpace(int addr, int v) {
        if (featOkTst && casFeat_BeginWithoutSpace == null)
      jcas.throwFeatMissing("BeginWithoutSpace", "com.victorzhao.type.GeneType");
    ll_cas.ll_setIntValue(addr, casFeatCode_BeginWithoutSpace, v);}
    
  
 
  /** @generated */
  final Feature casFeat_EndWithoutSpace;
  /** @generated */
  final int     casFeatCode_EndWithoutSpace;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndWithoutSpace(int addr) {
        if (featOkTst && casFeat_EndWithoutSpace == null)
      jcas.throwFeatMissing("EndWithoutSpace", "com.victorzhao.type.GeneType");
    return ll_cas.ll_getIntValue(addr, casFeatCode_EndWithoutSpace);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndWithoutSpace(int addr, int v) {
        if (featOkTst && casFeat_EndWithoutSpace == null)
      jcas.throwFeatMissing("EndWithoutSpace", "com.victorzhao.type.GeneType");
    ll_cas.ll_setIntValue(addr, casFeatCode_EndWithoutSpace, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public GeneType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Id = jcas.getRequiredFeatureDE(casType, "Id", "uima.cas.String", featOkTst);
    casFeatCode_Id  = (null == casFeat_Id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Id).getCode();

 
    casFeat_Spelling = jcas.getRequiredFeatureDE(casType, "Spelling", "uima.cas.String", featOkTst);
    casFeatCode_Spelling  = (null == casFeat_Spelling) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Spelling).getCode();

 
    casFeat_BeginWithoutSpace = jcas.getRequiredFeatureDE(casType, "BeginWithoutSpace", "uima.cas.Integer", featOkTst);
    casFeatCode_BeginWithoutSpace  = (null == casFeat_BeginWithoutSpace) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_BeginWithoutSpace).getCode();

 
    casFeat_EndWithoutSpace = jcas.getRequiredFeatureDE(casType, "EndWithoutSpace", "uima.cas.Integer", featOkTst);
    casFeatCode_EndWithoutSpace  = (null == casFeat_EndWithoutSpace) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_EndWithoutSpace).getCode();

  }
}



    