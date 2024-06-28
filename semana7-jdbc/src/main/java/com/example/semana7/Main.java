package com.example.semana7;

import lombok.Value;

import java.sql.*;

public class Main {

    // Configurações do banco de dados
    private static final String URL = "jdbc:postgresql://localhost:5431/meuBancoDeDados";
    private static final String USUARIO = "meuUsuario";
    private static String SENHA;

    public static void main(String[] args) {
        Connection conexao = null; // espera uma conexão
        PreparedStatement consulta = null; // espera uma consulta
        ResultSet resultado = null; // espera um resultado
        try {

            SENHA = System.getenv("SENHA_PROJ"); // busca a senha da variável de ambiente SENHA_PROJ
            // Estabelece a conexão com o banco de dados
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);

            // Consulta SQL
            String sql = "SELECT * FROM trabalhador WHERE salario > ? AND nome != ?";

            // Prepara a consulta com parâmetros
            consulta = conexao.prepareStatement(sql); // comando preparado
            consulta.setInt(1, 60000); // adiciona valor ao ?
            consulta.setString(2, "Bob"); // adiciona valor ao ?

            // Executa a consulta
            resultado = consulta.executeQuery(); // executa o comando

            // Processa os resultados
            while (resultado.next()) {
                int id = resultado.getInt("trabalhador_id");
                String nome = resultado.getString("nome");

                // Faça algo com os dados recuperados
                System.out.println("ID: " + id + ", Nome: " + nome);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fecha os recursos
            try {
                if (resultado != null) resultado.close();
                if (consulta != null) consulta.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


