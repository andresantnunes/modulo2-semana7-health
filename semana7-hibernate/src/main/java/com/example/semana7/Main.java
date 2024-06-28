package com.example.semana7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Criação da fábrica de sessões
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Criação da sessão
        Session session = sessionFactory.openSession();

        // Inserção de um novo gerente
        // Transação é a execução de um comando em uma sessão
        Transaction transaction = session.beginTransaction();

        Gerente novoGerente = new Gerente();
        novoGerente.setNome("Notebook");
        novoGerente.setSalario(12000.0);

        session.save(novoGerente); //comando de insert no banco de dados
        transaction.commit();      //escreve as alterações no banco de dados

        // Consulta de gerentes
        transaction = session.beginTransaction();
        Gerente gerenteConsultado = session.get(Gerente.class, 1L);
        System.out.println("Gerente Consultado: " + gerenteConsultado.getNome());
        System.out.println("Gerente Salario: " + gerenteConsultado.getSalario());
        transaction.commit();

        // Atualização de um gerente
        transaction = session.beginTransaction();
        gerenteConsultado.setSalario(18000.0);
        session.update(gerenteConsultado);
        transaction.commit();

        // Consulta de gerentes
        transaction = session.beginTransaction();
        gerenteConsultado = session.get(Gerente.class, 1L);
        System.out.println("Gerente Consultado: " + gerenteConsultado.getNome());
        System.out.println("Gerente Salario: " + gerenteConsultado.getSalario());
        transaction.commit();

        // Exclusão de um gerente
        transaction = session.beginTransaction();
        session.delete(gerenteConsultado);
        transaction.commit();

        // Fechamento da sessão e da fábrica de sessões
        session.close();
        sessionFactory.close();

    }
}


