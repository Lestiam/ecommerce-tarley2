package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Categoria;
import br.newtonpaiva.dominio.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Create {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("EC-PU");

        EntityManager em = factory.createEntityManager();


        em.getTransaction().begin();

        Produto p = new Produto();
        p.setNome("DOTA2");

        List<Produto> produtos = new ArrayList<>();
        produtos.add(p);

        Categoria c = new Categoria();
        c.setNome("Jogos");
        c.setProdutos(produtos);

        em.persist(c);

        em.getTransaction().commit();
        em.close();
        factory.close();

    }
}
