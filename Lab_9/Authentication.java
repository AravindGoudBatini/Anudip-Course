package Lab_9;

class UserManage{
	public static void  authenticate(String username, String password) {
		System.out.println(username+" YOUR login successful.");
	}
	public static void authenticate(String email, long phoneno) {
		System.out.println(email+"  YOUR  login successful using EmailId.");
	}
	public static void  authenticate(long phoneno,int pin) {
		System.out.println(phoneno+" YOUR login successful using phoneNo.  ");
	}
	public static void authenticate(String email, int pin) {
		System.out.println(email+"  YOUR  login successful using EmailId.");
	}
	public static void authenticate(long phoneno,String password) {
		System.out.println(phoneno+"  YOUR  login successful using Phone No.");
	}
	
}
 class Authentication {

	public static void main(String[] args) {

		UserManage u =  new UserManage();
		u.authenticate(9701959406l, 234567);
		u.authenticate("aravind463436@gmail.com",9701959406l);
		u.authenticate("Aravind123", "*************");
		u.authenticate("aravindwer@gmail.com", 123456);
		u.authenticate(9701959406l, "***********");

	}

}
