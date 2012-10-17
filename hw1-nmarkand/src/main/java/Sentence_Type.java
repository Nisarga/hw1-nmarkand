
/* First created by JCasGen Sun Oct 14 13:30:06 EDT 2012 */

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
 * Updated by JCasGen Mon Oct 15 00:44:23 EDT 2012
 * @generated */
public class Sentence_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sentence_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sentence_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sentence(addr, Sentence_Type.this);
  			   Sentence_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sentence(addr, Sentence_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Sentence");
 
  /** @generated */
  final Feature casFeat_SentenceID;
  /** @generated */
  final int     casFeatCode_SentenceID;
  /** @generated */ 
  public String getSentenceID(int addr) {
        if (featOkTst && casFeat_SentenceID == null)
      jcas.throwFeatMissing("SentenceID", "Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SentenceID);
  }
  /** @generated */    
  public void setSentenceID(int addr, String v) {
        if (featOkTst && casFeat_SentenceID == null)
      jcas.throwFeatMissing("SentenceID", "Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_SentenceID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_SentenceString;
  /** @generated */
  final int     casFeatCode_SentenceString;
  /** @generated */ 
  public String getSentenceString(int addr) {
        if (featOkTst && casFeat_SentenceString == null)
      jcas.throwFeatMissing("SentenceString", "Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SentenceString);
  }
  /** @generated */    
  public void setSentenceString(int addr, String v) {
        if (featOkTst && casFeat_SentenceString == null)
      jcas.throwFeatMissing("SentenceString", "Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_SentenceString, v);}
    
  
 
  /** @generated */
  final Feature casFeat_GeneLoc;
  /** @generated */
  final int     casFeatCode_GeneLoc;
  /** @generated */ 
  public String getGeneLoc(int addr) {
        if (featOkTst && casFeat_GeneLoc == null)
      jcas.throwFeatMissing("GeneLoc", "Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GeneLoc);
  }
  /** @generated */    
  public void setGeneLoc(int addr, String v) {
        if (featOkTst && casFeat_GeneLoc == null)
      jcas.throwFeatMissing("GeneLoc", "Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_GeneLoc, v);}
    
  
 
  /** @generated */
  final Feature casFeat_GeneName;
  /** @generated */
  final int     casFeatCode_GeneName;
  /** @generated */ 
  public String getGeneName(int addr) {
        if (featOkTst && casFeat_GeneName == null)
      jcas.throwFeatMissing("GeneName", "Sentence");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GeneName);
  }
  /** @generated */    
  public void setGeneName(int addr, String v) {
        if (featOkTst && casFeat_GeneName == null)
      jcas.throwFeatMissing("GeneName", "Sentence");
    ll_cas.ll_setStringValue(addr, casFeatCode_GeneName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Sentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SentenceID = jcas.getRequiredFeatureDE(casType, "SentenceID", "uima.cas.String", featOkTst);
    casFeatCode_SentenceID  = (null == casFeat_SentenceID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceID).getCode();

 
    casFeat_SentenceString = jcas.getRequiredFeatureDE(casType, "SentenceString", "uima.cas.String", featOkTst);
    casFeatCode_SentenceString  = (null == casFeat_SentenceString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceString).getCode();

 
    casFeat_GeneLoc = jcas.getRequiredFeatureDE(casType, "GeneLoc", "uima.cas.String", featOkTst);
    casFeatCode_GeneLoc  = (null == casFeat_GeneLoc) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GeneLoc).getCode();

 
    casFeat_GeneName = jcas.getRequiredFeatureDE(casType, "GeneName", "uima.cas.String", featOkTst);
    casFeatCode_GeneName  = (null == casFeat_GeneName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GeneName).getCode();

  }
}



    