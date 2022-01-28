/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Modelo.Membro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author eduardo
 */
@Stateless
public class DAOMembro implements Serializable {

    @PersistenceContext
    EntityManager em;

    public void SalvaMembro(Membro membro) {
        em.persist(membro);
    }

    public Membro RetornaUmMembro(int id) {
        Membro membro = em.find(Membro.class, id);
        return membro;
    }

    public List<Membro> RetornaTodosMembros() {
        String consulta = "SELECT e FROM Membro e";
        return em.createQuery(consulta, Membro.class)
                .getResultList();
    }

    public Membro AtualizarMembro(Membro ds) {
        Membro despesa;
        System.err.println(ds + "aaaaa");
        despesa = ds;
        em.merge(despesa);
        System.out.println(despesa + "eeeeee");
        em.flush();
        return despesa;
    }

    public void DeletaMembro(int id) {
        Membro membro = em.find(Membro.class, id);
        em.remove(membro);

    }
}
