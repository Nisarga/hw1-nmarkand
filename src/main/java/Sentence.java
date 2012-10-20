

/* First created by JCasGen Sun Oct 14 13:30:06 EDT 2012 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Oct 15 00:44:23 EDT 2012
 * XML source: /Users/Nisarga/Documents/hw1-nmarkand/src/main/resources/SentenceAeDescriptor.xml
 * @generated */
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: SentenceID

  /** getter for SentenceID - gets 
   * @generated */
  public String getSentenceID() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_SentenceID == null)
      jcasType.jcas.throwFeatMissing("SentenceID", "Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_SentenceID);}
    
  /** setter for SentenceID - sets  
   * @generated */
  public void setSentenceID(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_SentenceID == null)
      jcasType.jcas.throwFeatMissing("SentenceID", "Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_SentenceID, v);}    
   
    
  //*--------------*
  //* Feature: SentenceString

  /** getter for SentenceString - gets 
   * @generated */
  public String getSentenceString() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_SentenceString == null)
      jcasType.jcas.throwFeatMissing("SentenceString", "Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_SentenceString);}
    
  /** setter for SentenceString - sets  
   * @generated */
  public void setSentenceString(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_SentenceString == null)
      jcasType.jcas.throwFeatMissing("SentenceString", "Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_SentenceString, v);}    
   
    
  //*--------------*
  //* Feature: GeneLoc

  /** getter for GeneLoc - gets 
   * @generated */
  public String getGeneLoc() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_GeneLoc == null)
      jcasType.jcas.throwFeatMissing("GeneLoc", "Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_GeneLoc);}
    
  /** setter for GeneLoc - sets  
   * @generated */
  public void setGeneLoc(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_GeneLoc == null)
      jcasType.jcas.throwFeatMissing("GeneLoc", "Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_GeneLoc, v);}    
   
    
  //*--------------*
  //* Feature: GeneName

  /** getter for GeneName - gets 
   * @generated */
  public String getGeneName() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_GeneName == null)
      jcasType.jcas.throwFeatMissing("GeneName", "Sentence");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_GeneName);}
    
  /** setter for GeneName - sets  
   * @generated */
  public void setGeneName(String v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_GeneName == null)
      jcasType.jcas.throwFeatMissing("GeneName", "Sentence");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sentence_Type)jcasType).casFeatCode_GeneName, v);}    
  }

    