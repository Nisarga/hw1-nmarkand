
public class HelloWorld {
	public static void main(String[] args)
	{
		System.out.println("hello world dkjg slkfjsnslk slkfls");
		String x="This is a sample document.For testing the annotator codes. \n";
		
		System.out.println(x.split(" ")[1]);
		String [] arr = x.split(" ", 2);
		String sentenceId=arr[0]; //Contains senetence id
		String geneTagDetails = (arr[1]); 
		
		System.out.println(geneTagDetails);
		String b="xxx";
		int len=b.length();
		String xx="xxx p53 jfjfj jfjfj";
		//xx=xx.replaceAll("[\\[\\],]","");
		System.out.println(xx.substring(0+len, 3+len+1)); 
		
		String new1="Takayasu's disease: association with HLA-B5. : [37-43:GENE@-Infinity]";
		//new1.con
	}
}
