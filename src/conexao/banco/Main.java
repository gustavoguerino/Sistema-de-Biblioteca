package conexao.banco;
import java.sql.*;

public class Main{
	public static void main(String[] args) throws SQLException {
		System.out.println("Tentando conectar ao Bando de Dados");
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();
	}
}