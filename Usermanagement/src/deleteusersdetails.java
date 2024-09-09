import java.sql.*;
public class deleteusersdetails {
 
	public void userdelete()throws Exception {
		String url ="jdbc:mysql://127.0.0.1:3306/userdetails";
		String username ="root";
		String password ="23092003";
		String Query = "delete from usertable where userid= 23"; 
		Connection man = DriverManager.getConnection(url,username,password);
		PreparedStatement ben = man.prepareStatement(Query);
		ben.executeUpdate();
		man.close();
	
	}
	
	
	public static void main (String[]args) throws Exception {
		deleteusersdetails object = new deleteusersdetails ();
		object.userdelete();
	}
}
