package Conexao_com_banco_de_dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunoDao {

	public void cadastrarAlunos(Aluno aluno) {
		
		// 1º Pegar a conexão com o banco de dados
		Connection con = Conexao.obterConexao();
		
		// 2º Definir o comando que será executado no banco de dados
		String sql = "INSERT INTO aluno(nome, prim, seg, ter, qua, media, status_final) VALUES (?,?,?,?,?,?,?)";
		
		// 3º Preparar a linha de intrução(Statement) / Alterar os pontos de interrogação por valores dos objetos

		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			preparador.setString(1, aluno.getNome());
			preparador.setDouble(2, aluno.getPrim());
			preparador.setDouble(3, aluno.getSeg());
			preparador.setDouble(4, aluno.getTer());
			preparador.setDouble(5, aluno.getQua());
			preparador.setDouble(6, aluno.getMedia());
			preparador.setString(7, aluno.getStatusFinal());
			
			// 4º Executar no banco de dados
			preparador.execute();
			
			preparador.close();
			
			System.out.println("O aluno foi cadastrado com sucesso!");
			
		} catch (SQLException e) {
			System.err.println("Erro ao cadastrar o aluno!");
			e.printStackTrace();
		}
	}

	public ArrayList<Aluno> mostrarTodosAlunos() {
		
		Connection con = Conexao.obterConexao();
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		String sql = "SELECT * FROM aluno";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			
			while(resultado.next()) {
				Aluno aluno = new Aluno();
				aluno.setCodigo(resultado.getInt("codigo"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setPrim(resultado.getDouble("prim"));
				aluno.setSeg(resultado.getDouble("seg"));
				aluno.setTer(resultado.getDouble("ter"));
				aluno.setQua(resultado.getDouble("qua"));
				aluno.setMedia(resultado.getDouble("media"));
				aluno.setStatusFinal(resultado.getString("status_Final"));
				
				alunos.add(aluno);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alunos;
	}

	public  Aluno mostrarAlunoPorCodigo (int codigo) {
		
		Connection con = Conexao.obterConexao();
		Aluno aluno = null;
		
		String sql = "SELECT * FROM aluno WHERE codigo=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, codigo);
			ResultSet resultado = preparador.executeQuery();
			
			if(resultado.next()) {
				
				aluno = new Aluno();
				aluno.setCodigo(resultado.getInt("codigo"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setPrim(resultado.getDouble("prim"));
				aluno.setSeg(resultado.getDouble("seg"));
				aluno.setTer(resultado.getDouble("ter"));
				aluno.setQua(resultado.getDouble("qua"));
				aluno.setMedia(resultado.getDouble("media"));
				aluno.setStatusFinal(resultado.getString("status_final"));
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	return aluno;		
	}
	
	public void excluirAlunoPorCodigo(int codigo) {
		
		Connection con = Conexao.obterConexao();
		
		String sql = "DELETE FROM aluno WHERE codigo=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, codigo);
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Aluno excluído com sucesso!");
			
		}catch (SQLException e) {
			System.out.println("Não foi possível excluir o aluno selecionado!");
			e.printStackTrace();
		}
	}

	public void alterarAlunoPorCodigo(Aluno aluno) {
		
		Connection con = Conexao.obterConexao();
		
		String sql = "UPDATE aluno SET nome=?, prim=?, seg=?, ter=?, qua=?, media=?, status_final=? WHERE codigo=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, aluno.getNome());
			preparador.setDouble(2, aluno.getPrim());
			preparador.setDouble(3, aluno.getSeg());
			preparador.setDouble(4, aluno.getTer());
			preparador.setDouble(5, aluno.getQua());
			preparador.setDouble(6, aluno.calcularMedia());
			preparador.setString(7, aluno.getStatusFinal());
			preparador.setInt(8, aluno.getCodigo());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("O aluno foi alterado com sucesso!");
		} catch (SQLException e) {
			System.err.println("Erro ao alterar o aluno!");
			e.printStackTrace();
		}
	}
	
}