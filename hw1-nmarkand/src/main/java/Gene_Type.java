
/* First created by JCasGen Sun Oct 14 16:52:27 EDT 2012 */

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
 * Updated by JCasGen Sun Oct 14 16:52:27 EDT 2012
 * @generated */
public class Gene_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Gene_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Gene_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Gene(addr, Gene_Type.this);
  			   Gene_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Gene(addr, Gene_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Gene.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Gene");
 
  /** @generated */
  final Feature casFeat_GeneID;
  /** @generated */
  final int     casFeatCode_GeneID;
  /** @generated */ 
  public String getGeneID(int addr) {
        if (featOkTst && casFeat_GeneID == null)
      jcas.throwFeatMissing("GeneID", "Gene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GeneID);
  }
  /** @generated */    
  public void setGeneID(int addr, String v) {
        if (featOkTst && casFeat_GeneID == null)
      jcas.throwFeatMissing("GeneID", "Gene");
    ll_cas.ll_setStringValue(addr, casFeatCode_GeneID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_GeneString;
  /** @generated */
  final int     casFeatCode_GeneString;
  /** @generated */ 
  public String getGeneString(int addr) {
        if (featOkTst && casFeat_GeneString == null)
      jcas.throwFeatMissing("GeneString", "Gene");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GeneString);
  }
  /** @generated */    
  public void setGeneString(int addr, String v) {
        if (featOkTst && casFeat_GeneString == null)
      jcas.throwFeatMissing("GeneString", "Gene");
    ll_cas.ll_setStringValue(addr, casFeatCode_GeneString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Gene_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_GeneID = jcas.getRequiredFeatureDE(casType, "GeneID", "uima.cas.String", featOkTst);
    casFeatCode_GeneID  = (null == casFeat_GeneID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GeneID).getCode();

 
    casFeat_GeneString = jcas.getRequiredFeatureDE(casType, "GeneString", "uima.cas.String", featOkTst);
    casFeatCode_GeneString  = (null == casFeat_GeneString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GeneString).getCode();

  }
}



    