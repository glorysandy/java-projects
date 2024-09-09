import java.sql.*;
public class getuserdetails {
public static void getuser() throws Exception {
	String url = "jdbc:mysql://127.0.0.1:3306/userdetails";
	String username ="root";
	String password ="23092003";
	String Query = "select*from usertable";
	Connection connect = DriverManager.getConnection(url,username,password);
	Statement state = connect.createStatement();
	ResultSet res = state.executeQuery(Query);
	while(res.next()) {
		System.out.println("userid"+res.getInt(1));
		System.out.println("username"+res.getString(2));
		System.out.println("useremail"+res.getString(3));
		System.out.println("userno"+res.getInt(4)); 
	}
		connect.close();
		;
	}
	
public static void main (String[]args) throws Exception {
	getuserdetails obj = new getuserdetails();
	obj.getuser();
}

	
	
}
