
package mypackage.demo;

public class UserValidate
{
		public boolean checkUser(String user,String pass)
		{
			if(user.equals("admin")&&pass.equals("admin"))
			{
				return true;
			}
			else
			{
				return false;
			}
			
			
		}
	}