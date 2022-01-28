/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Modelo.Cadastro;
import Modelo.Despesa;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author eduardo
 */
@Stateless
public class DAOCadastro implements Serializable {

    @PersistenceContext
    EntityManager em;

    public void SalvaCadastro(Cadastro cadastro) {
        em.persist(cadastro);
    }

    public Cadastro RetornaUmaDespesa(int id) {
        Cadastro cadastro = em.find(Cadastro.class, id);
        return cadastro;
    }

    public void DeletaDespesa(Cadastro cadastro) {
        em.remove(cadastro);
    }

    public List<String> Confimacaocadastro(String desc) {
        String jpql = " select u.Email from Cadastro u where u.Email = :desc";
        return em.createQuery(jpql, String.class)
                .setParameter("desc", desc)
                .getResultList();
    }

    public List<String> TestLogin(String desc, String senha) {
        String jpql = " select u from Cadastro u where u.Email = :desc and  u.senha = :senha";
        return em.createQuery(jpql, String.class)
                .setParameter("desc", desc)
                .setParameter("senha", senha)
                .getResultList();

    }

}
