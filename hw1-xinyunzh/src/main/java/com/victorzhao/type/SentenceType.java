package com.victorzhao.type;


/* First created by JCasGen Mon Sep 22 01:32:32 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 23 01:49:04 EDT 2014
 * XML source: /Users/victorzhao/git/hw1-xinyunzh/hw1-xinyunzh/src/main/resources/desc/typeSystemDescriptor.xml
 * @generated */
public class SentenceType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(SentenceType.class);
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
  protected SentenceType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public SentenceType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public SentenceType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public SentenceType(JCas jcas, int begin, int end) {
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
  //* Feature: Content

  /** getter for Content - gets The content of sentence.
   * @generated
   * @return value of the feature 
   */
  public String getContent() {
    if (SentenceType_Type.featOkTst && ((SentenceType_Type)jcasType).casFeat_Content == null)
      jcasType.jcas.throwFeatMissing("Content", "com.victorzhao.type.SentenceType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SentenceType_Type)jcasType).casFeatCode_Content);}
    
  /** setter for Content - sets The content of sentence. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setContent(String v) {
    if (SentenceType_Type.featOkTst && ((SentenceType_Type)jcasType).casFeat_Content == null)
      jcasType.jcas.throwFeatMissing("Content", "com.victorzhao.type.SentenceType");
    jcasType.ll_cas.ll_setStringValue(addr, ((SentenceType_Type)jcasType).casFeatCode_Content, v);}    
   
    
  //*--------------*
  //* Feature: Id

  /** getter for Id - gets The identifier of sentence.
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (SentenceType_Type.featOkTst && ((SentenceType_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "com.victorzhao.type.SentenceType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SentenceType_Type)jcasType).casFeatCode_Id);}
    
  /** setter for Id - sets The identifier of sentence. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (SentenceType_Type.featOkTst && ((SentenceType_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "com.victorzhao.type.SentenceType");
    jcasType.ll_cas.ll_setStringValue(addr, ((SentenceType_Type)jcasType).casFeatCode_Id, v);}    
  }

    