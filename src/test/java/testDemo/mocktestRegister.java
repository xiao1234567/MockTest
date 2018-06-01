package testDemo;

import org.testng.annotations.Test;

import demo.Mail;
import demo.Register;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;


public class mocktestRegister {
	
	@Mocked
	Mail mockMail;

	@Test
	public void testRegister1() {

		// record	
		new Expectations() {
			{
				mockMail.sendMail();
				result = true;
			}
		};

		// replay
		Register r = new Register();
		r.signIn("Mary");
		

		// verify
		new Verifications() {
			{
				mockMail.sendMail();
				times = 1;
			}
		};
	}
	
	@Test
	public void testRegister2() {

		// record	
		new Expectations() {
			{
				mockMail.sendMail();
				result = false;
			}
		};

		// replay
		Register r = new Register();
		r.signIn("Mary");
		

		// verify
		new Verifications() {
			{
				mockMail.sendMail();
				times = 1;
			}
		};
	}
}
