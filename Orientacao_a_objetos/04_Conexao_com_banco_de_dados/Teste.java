package Conexao_com_banco_de_dados;

import java.sql.SQLException;
import java.util.ArrayList;

public class Teste {

	public static void main (String[] args) throws SQLException{
		
		// Insira aqui a função
		Conexao.obterConexao();
		AlterarAlunoPorCodigo();
	}	

	// Função "Cadastrar" e abaixo mais funções
	public static void Cadastrar() {
		
		Aluno aluno01 = new Aluno("Yara de Franco Rossi", 4.5, 3.0, 2.5, 1.5);
		
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.cadastrarAlunos(aluno01);
	}
	
	public static void MostrarTodosAlunos() {
		
		AlunoDao alunoDao = new AlunoDao();
		ArrayList<Aluno> alunosDoBanco = alunoDao.mostrarTodosAlunos();
		
		for (int i=0; i < alunosDoBanco.size(); i++) {
			
			Aluno aluno = alunosDoBanco.get(i);
			
			System.out.println("Código: " + aluno.getCodigo());
			System.out.println("Nome: " + aluno.getNome());
			System.out.printf("1º Bim: %.1f - 2º Bim: %.1f - 3º Bim: %.1f - 4º Bim: %.1f%n", aluno.getPrim(), aluno.getSeg(), aluno.getTer(), aluno.getQua());
			System.out.printf("Média: %.1f ", aluno.getMedia());
			System.out.println("Status: " + aluno.getStatusFinal());
			System.out.println();
		}
	}

	public static void MostrarAlunosPorCodigo() {
		
		AlunoDao alunoDao = new AlunoDao();
		
		// Insira o código na linha abaixo "5 por exemplo" para a consulta
		Aluno aluno = alunoDao.mostrarAlunoPorCodigo(5);
		
		System.out.println("Código: " + aluno.getCodigo());
		System.out.println("Nome: " + aluno.getNome());
		System.out.printf("1º Bim: %.1f - 2º Bim: %.1f - 3º Bim: %.1f - 4º Bim: %.1f%n", aluno.getPrim(), aluno.getSeg(), aluno.getTer(), aluno.getQua());
		System.out.printf("Média: %.1f ", aluno.getMedia());
		System.out.println("Status: " + aluno.getStatusFinal());
		System.out.println();
	}

	public static void ExcluirAlunoPorCodigo() {
		
		AlunoDao alunoDao = new AlunoDao();
		
		// Insira o código na linha abaixo "5 por exemplo" para a excluir
		alunoDao.excluirAlunoPorCodigo(5);		
	}

	public static void AlterarAlunoPorCodigo() {
		
		Aluno aluno01 = new Aluno();
		aluno01.setCodigo(5);
		aluno01.setNome("Nelson Meirelles");
		aluno01.setPrim(6.5);
		aluno01.setSeg(9.5);
		aluno01.setTer(8.5);
		aluno01.setQua(7.5);
		aluno01.setMedia(aluno01.calcularMedia());
		aluno01.setStatusFinal(aluno01.verificarStatus());
		
		AlunoDao alunoDao = new AlunoDao();
		alunoDao.alterarAlunoPorCodigo(aluno01);
	}

}