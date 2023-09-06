package Main;
import connect.DataConnect;
import service.UserService;
public class Main {
		public static void main(String[] args) 
		{
			System.out.println("Welcome To Online Store");
			
			UserService userService=new UserService();
			userService.mainPage();
			
//			DataConnect d= new DataConnect();
//			d.loginUser();
			
		}
		
}
