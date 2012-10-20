

/* First created by JCasGen Sun Oct 14 16:52:27 EDT 2012 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Sun Oct 14 16:52:27 EDT 2012
 * XML source: /Users/Nisarga/Documents/hw1-nmarkand/src/main/resources/GeneAeDescriptor.xml
 * @generated */
public class Gene extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Gene.class);
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
  protected Gene() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Gene(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Gene(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Gene(JCas jcas, int begin, int end) {
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
  //* Feature: GeneID

  /** getter for GeneID - gets Store the gene id

   * @generated */
  public String getGeneID() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_GeneID == null)
      jcasType.jcas.throwFeatMissing("GeneID", "Gene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_Type)jcasType).casFeatCode_GeneID);}
    
  /** setter for GeneID - sets Store the gene id
 
   * @generated */
  public void setGeneID(String v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_GeneID == null)
      jcasType.jcas.throwFeatMissing("GeneID", "Gene");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_Type)jcasType).casFeatCode_GeneID, v);}    
   
    
  //*--------------*
  //* Feature: GeneString

  /** getter for GeneString - gets Store the actual string which contains the gene

   * @generated */
  public String getGeneString() {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_GeneString == null)
      jcasType.jcas.throwFeatMissing("GeneString", "Gene");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Gene_Type)jcasType).casFeatCode_GeneString);}
    
  /** setter for GeneString - sets Store the actual string which contains the gene
 
   * @generated */
  public void setGeneString(String v) {
    if (Gene_Type.featOkTst && ((Gene_Type)jcasType).casFeat_GeneString == null)
      jcasType.jcas.throwFeatMissing("GeneString", "Gene");
    jcasType.ll_cas.ll_setStringValue(addr, ((Gene_Type)jcasType).casFeatCode_GeneString, v);}    
  }

    