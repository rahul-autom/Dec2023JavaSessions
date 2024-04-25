package hashMap;

import java.util.HashMap;

public class UserRole {

	
	public void doLogin(String un, String pwd) {
		System.out.println("user log in with : "+un+"-"+pwd);
		
	}
	public void doLogin(String role) {
		String creds=getUserCreds(role);
		String un=creds.split(":")[0].trim();
		String pwd=creds.split(":")[1].trim();
		System.out.println("user login with:"+un+"-"+pwd);
	}
	
	public String getUserCreds(String role)
	{
		HashMap<String, String> userMap=new HashMap<String,String>();
		userMap.put("admin", "admin:admin123");
		userMap.put("seller", "seller:seller123");
		userMap.put("vendor", "vendor:vendor@1234");
		userMap.put("partner", "partner:partner@12390");
		userMap.put("user", "naveen:naveen1909");
		
		if(userMap.containsKey(role)) {
			return userMap.get(role);
		}
		return userMap.get(role);
	}
	public static void main(String[] args) {
		//Amazon - RBAC - Role based access control
		//UM - IAM
	String role="manager";	
	UserRole app=new UserRole();
	app.doLogin(role);
	//app.doLogin("sekhar@gmail.com", "skh@123");
	
//	String creds=app.getUserCreds(role);//admin:admin123
//	System.out.println(creds);
//	creds.split(":");
//	String cred[]=creds.split(":");
//	String un=cred[0].trim();
//	String pwd=cred[1].trim();
//	app.doLogin(un, pwd);
	
	}

}
