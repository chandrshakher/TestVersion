
public class TestUserPassword {
	
	public  Object[][] dataProvide(String s, String P){
		return new Object[][]{{}};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserNAmePAssword  usp=new UserNAmePAssword("chandra123", "passw1234");
		 
	System.out.println(usp.getUserName()); 
		usp.setUserName("rahul");
		System.out.println(usp.getUserName());
	}

}
