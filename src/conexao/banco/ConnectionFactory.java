package conexao.banco;
import java.sql.*;
public class ConnectionFactory {

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3315/trabalhopoo", "root", "");
		} catch (SQLException e) {
			System.out.println("Conexão falhou");
			return null;
		}
	}
}