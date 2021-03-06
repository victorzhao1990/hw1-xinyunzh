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
public class GeneType extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneType.class);
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
  protected GeneType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public GeneType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public GeneType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public GeneType(JCas jcas, int begin, int end) {
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

  /** getter for Id - gets The identifier of gene.
   * @generated
   * @return value of the feature 
   */
  public String getId() {
    if (GeneType_Type.featOkTst && ((GeneType_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "com.victorzhao.type.GeneType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneType_Type)jcasType).casFeatCode_Id);}
    
  /** setter for Id - sets The identifier of gene. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setId(String v) {
    if (GeneType_Type.featOkTst && ((GeneType_Type)jcasType).casFeat_Id == null)
      jcasType.jcas.throwFeatMissing("Id", "com.victorzhao.type.GeneType");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneType_Type)jcasType).casFeatCode_Id, v);}    
   
    
  //*--------------*
  //* Feature: Spelling

  /** getter for Spelling - gets The spelling of gene.
   * @generated
   * @return value of the feature 
   */
  public String getSpelling() {
    if (GeneType_Type.featOkTst && ((GeneType_Type)jcasType).casFeat_Spelling == null)
      jcasType.jcas.throwFeatMissing("Spelling", "com.victorzhao.type.GeneType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneType_Type)jcasType).casFeatCode_Spelling);}
    
  /** setter for Spelling - sets The spelling of gene. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSpelling(String v) {
    if (GeneType_Type.featOkTst && ((GeneType_Type)jcasType).casFeat_Spelling == null)
      jcasType.jcas.throwFeatMissing("Spelling", "com.victorzhao.type.GeneType");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneType_Type)jcasType).casFeatCode_Spelling, v);}    
   
    
  //*--------------*
  //* Feature: BeginWithoutSpace

  /** getter for BeginWithoutSpace - gets The begin offset without spaces counted in.
   * @generated
   * @return value of the feature 
   */
  public int getBeginWithoutSpace() {
    if (GeneType_Type.featOkTst && ((GeneType_Type)jcasType).casFeat_BeginWithoutSpace == null)
      jcasType.jcas.throwFeatMissing("BeginWithoutSpace", "com.victorzhao.type.GeneType");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneType_Type)jcasType).casFeatCode_BeginWithoutSpace);}
    
  /** setter for BeginWithoutSpace - sets The begin offset without spaces counted in. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBeginWithoutSpace(int v) {
    if (GeneType_Type.featOkTst && ((GeneType_Type)jcasType).casFeat_BeginWithoutSpace == null)
      jcasType.jcas.throwFeatMissing("BeginWithoutSpace", "com.victorzhao.type.GeneType");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneType_Type)jcasType).casFeatCode_BeginWithoutSpace, v);}    
   
    
  //*--------------*
  //* Feature: EndWithoutSpace

  /** getter for EndWithoutSpace - gets The end offset without spaces counted in.
   * @generated
   * @return value of the feature 
   */
  public int getEndWithoutSpace() {
    if (GeneType_Type.featOkTst && ((GeneType_Type)jcasType).casFeat_EndWithoutSpace == null)
      jcasType.jcas.throwFeatMissing("EndWithoutSpace", "com.victorzhao.type.GeneType");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneType_Type)jcasType).casFeatCode_EndWithoutSpace);}
    
  /** setter for EndWithoutSpace - sets The end offset without spaces counted in. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEndWithoutSpace(int v) {
    if (GeneType_Type.featOkTst && ((GeneType_Type)jcasType).casFeat_EndWithoutSpace == null)
      jcasType.jcas.throwFeatMissing("EndWithoutSpace", "com.victorzhao.type.GeneType");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneType_Type)jcasType).casFeatCode_EndWithoutSpace, v);}    
  }

    