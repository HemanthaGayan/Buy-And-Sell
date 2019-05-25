package model;
import java.sql.Connection;
import java.sql.DriverManager;
public class dbconnection {

	public static Connection createConnection(){
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/product_management?zeroDateTimeBehavior=convertToNull";
		String username="root";
		String password="admin";
		
		try{
			try{
				Class.forName("com.mysql.jdbc.Driver");
				
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
			con=DriverManager.getConnection(url,username,password);
			System.out.println("printing connection object"+con);
		}
		catch(Exception ex){
			
		}
		return con;
	}
	

}
