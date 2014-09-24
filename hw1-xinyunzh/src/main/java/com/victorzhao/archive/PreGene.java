

/* First created by JCasGen Mon Sep 22 13:40:29 EDT 2014 */
package com.victorzhao.archive;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** The preprocessed gene type.
 * Updated by JCasGen Tue Sep 23 01:49:04 EDT 2014
 * XML source: /Users/victorzhao/git/hw1-xinyunzh/hw1-xinyunzh/src/main/resources/desc/typeSystemDescriptor.xml
 * @generated */
public class PreGene extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PreGene.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected PreGene() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public PreGene(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public PreGene(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public PreGene(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Id

  /** getter for Id - gets 
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (PreGene_Type.featOkTst && ((PreGene_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "com.victorzhao.type.PreGene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PreGene_Type)jcasType).casFeatCode_Id);}
    
  /** setter for Id - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (PreGene_Type.featOkTst && ((PreGene_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "com.victorzhao.type.PreGene");
    jcasType.ll_cas.ll_setStringValue(addr, ((PreGene_Type)jcasType).casFeatCode_Id, v);}    
   
    
  //*--------------*
  //* Feature: Spelling

  /** getter for Spelling - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSpelling() {
    if (PreGene_Type.featOkTst && ((PreGene_Type)jcasType).casFeat_Spelling == null)
      jcasType.jcas.throwFeatMissing("Spelling", "com.victorzhao.type.PreGene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PreGene_Type)jcasType).casFeatCode_Spelling);}
    
  /** setter for Spelling - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpelling(String v) {
    if (PreGene_Type.featOkTst && ((PreGene_Type)jcasType).casFeat_Spelling == null)
      jcasType.jcas.throwFeatMissing("Spelling", "com.victorzhao.type.PreGene");
    jcasType.ll_cas.ll_setStringValue(addr, ((PreGene_Type)jcasType).casFeatCode_Spelling, v);}    
  }

    