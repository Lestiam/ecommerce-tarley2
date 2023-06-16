package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Categoria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Create {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("EC-PU");

        EntityManager em = factory.createEntityManager();


        em.getTransaction().begin();

        Categoria c = new Categoria();
        c.setId(1);
        c.setNome("Jogos");

        em.persist(c);

        em.getTransaction().commit();
        em.close();
        factory.close();

    }
}
