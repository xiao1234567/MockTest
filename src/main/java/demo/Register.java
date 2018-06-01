package demo;

public class Register {
	
	public void signIn(String name){
		
		Mail m = new Mail();
		
		System.out.println("processing registration");
		
		if(m.sendMail()){
			System.out.println(name+" has been our membership");
		}
		else{
			System.out.println("registration error");
		}
		
		
		
	}

}
