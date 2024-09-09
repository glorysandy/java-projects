import java.sql.*;
public class insertuserdetails {
public void userinsert () throws Exception {
	String url ="jdbc:mysql://127.0.0.1:3306/userdetails";
	String username ="root";
	String password ="23092003";
	String Query = "insert into usertable values (?,?,?,?)";
	Connection sandy = DriverManager.getConnection(url,username,password);
	PreparedStatement ben = sandy.prepareStatement(Query);
	ben.setInt(1, 23);
	ben.setString(2, "benny");
	ben.setString (3,"benny@gmail.com");
	ben.setInt(4,9043860);
	ben.executeUpdate();
	sandy.close();
	
}
	
	
	public static void main (String[]args) throws Exception{
		insertuserdetails object = new insertuserdetails ();
		object.userinsert();
	}
}
