package abc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class AutoInsert {	
		public static void main(String[] args) {
			
			Connection conn = null;
			Statement stmt = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratitidb", "root", "Rdc@1437801");
				stmt = conn.createStatement();
				boolean yes = true;
				
				while(yes) {
					
					Scanner s = new Scanner(System.in);
					System.out.println("Enter Product Name");
					String name = s.nextLine();
					System.out.println("Enter Product Price");
					double price = Double.parseDouble(s.nextLine());
					System.out.println("Enter Product Quantity");
					int quantity = Integer.parseInt(s.nextLine());
					
					String sql = "insert into tbl_product(name, price, quantity)values('" + name +"', " + price + ", " + quantity + ")";
					
					int count = stmt.executeUpdate(sql); //return number of rows impacted
					if(count == 1)
						System.out.println("Record Inserted");
					System.out.println("Do you wish to continue: true or false");
					yes=Boolean.parseBoolean(s.nextLine());
					s.close();
				}
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

