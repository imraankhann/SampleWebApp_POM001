package testScripts;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageLib.SignIn_pgLib;
import testBase.TestBase;
import utill.CommonUtill;

public class TC001_TestLogin extends TestBase {
	
	SignIn_pgLib signInPg;
	CommonUtill commonUtil;

	@BeforeClass
	public void setup() throws IOException {
		init();
		
	}
	
	@Test
	public void testLogin() throws InterruptedException {

       // SignIn_pgLib signInPg = PageFactory.initElements(driver,pageLib.SignIn_pgLib.class);

		signInPg=new SignIn_pgLib(driver);
//		commonUtil.wait(20);
		signInPg.clkSignInInhmePg();
//		commonUtil.wait(20);
		signInPg.passEmailInSignIn("test@practice.com");
//		commonUtil.wait(10);
		signInPg.passPswdInSignIn("123456");
//		commonUtil.wait(10);
		signInPg.clkSignBtn();
	}


}
