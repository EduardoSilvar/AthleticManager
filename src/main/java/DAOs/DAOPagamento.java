/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Modelo.Pagamento;
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
public class DAOPagamento implements Serializable {
    @PersistenceContext
    EntityManager em;

    public void SalvaDespesa(Pagamento pagamento) {
        em.persist(pagamento);
    }
    public Pagamento RetornaUmaDespesa(int id) {
        Pagamento pagamento = em.find(Pagamento.class, id);
        return pagamento;
    }
  
     public void DeletaDespesa(int id) {
        Pagamento pagamento = em.find(Pagamento.class,id);
        em.remove(pagamento);

    }
    public List<Pagamento> RetornaTodosPagamentos() {
        String consulta = "SELECT e FROM Pagamento e";
        return em.createQuery(consulta, Pagamento.class)
                .getResultList();
    }
}