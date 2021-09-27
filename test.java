package led_project;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class test {

	user s= new user(null, null);
	Dboperation d=new Dboperation();
	 @Test
	    void test_method() {
	        s.setUsername("rubi");
	        String user= s.getUsername();
	        assertEquals("rubi",user);

	    }
	    @Test
	    void test2_method() {
	        s.setPassword("rubi11");
	        String pass=s.getPassword();
	        assertEquals("rubi11",pass);
	    }
	    
	  
	    @Test
	    void registration_test3() {
	        String pas="karki123";
	        String cpass="karki123";
	        Register reg=new Register();
	        boolean result=reg.registration_test(pas,cpass);
	        assertEquals(true,result);
	    }
	    
	    
	    @Test
	    void registration_test4() {
	        String pas="sita";
	        String cpass="sita";
	        Register reg=new Register();
	        boolean result=reg.registration_test(pas,cpass);
	        assertEquals(false,result);
	    }
	    
	    
	    @Test
	    void login_test9(){
	        String username="rama";
	        String password="246";
	        Login log=new Login();
	        boolean result=log.login_test(username,password);
	        assertEquals(true,result);
	    }
	    
	    @Test
	    void login_test5(){
	        String username="rubina";
	        String password="123";
	        Login log=new Login();
	        boolean result=log.login_test(username,password);
	        assertEquals(false,result);
	    }

}
