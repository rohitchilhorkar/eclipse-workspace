package abc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
	
		public static void main(String[] args) {
			
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb", "root", "Rdc@1437801");
				stmt = conn.createStatement();
				String str = "insert into tbl_product(name, price, quantity)values('MYphone', 100000, 19)";
				stmt.executeUpdate(str); //DML : INSERT, Update, Delete: return count of how many rows got impacted
				System.out.println("Record Added!!!");
			}
			catch(ClassNotFoundException e) {
				System.out.println("Driver Not Found!");
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {conn.close();}catch(Exception e) {}
			}
	}
}

