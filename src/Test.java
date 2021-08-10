
public class Test {
	public Curnecey getCurency(String str){
		  if(str.equals("india")){
			  return new India();
		  }
		  else if(str.equals("America")){
			  return new America();
		  }
		  
		 throw new RuntimeException("invlid currenecy ");
		 
	}
    public static void main(String[] args) {
		
    	Test ts=new Test();
    	     Curnecey d=ts.getCurency("dfdf");
    	       d.dollare();
	}
}
