/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

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
public class DAODespesa implements Serializable {

    @PersistenceContext
    EntityManager em;

    public void SalvaDespesa(Despesa despesa) {
        em.persist(despesa);
    }

    public Despesa RetornaUmaDespesa(int id) {
        Despesa despesa = em.find(Despesa.class, id);
        return despesa;
    }

    public List<Despesa> RetornaTodasDespesas() {
        String consulta = "SELECT e FROM  Despesa e";
        return em.createQuery(consulta, Despesa.class)
                .getResultList();
    }

    public void DeletaDespesa(int id) {
        Despesa despesa = em.find(Despesa.class, id);
        em.remove(despesa);

    }

    public Despesa AtualizarDespesa(Despesa ds) {
        Despesa despesa ;
        despesa = ds;
        em.merge(despesa);
        em.flush();
        return despesa;
    }
}
