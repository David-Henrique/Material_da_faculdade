package Conexao_com_banco_de_dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection obterConexao() {
		
		Connection con = null;
		
		try {
			// apos localhost deve ser colocado o nome da pasta no banco de dados
			con = DriverManager.getConnection("jdbc:mysql://localhost/dbalunos?useTimezone=true&serverTimezone=UTC&SSL=false","root","root");
			System.out.println("Banco de Dados conectado com sucesso!");
		}catch(SQLException e){
			System.err.println("Não foi possível conectar ao banco de dados!");
			e.printStackTrace();
		}
		return con;
	}
}