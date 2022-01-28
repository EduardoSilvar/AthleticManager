/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerenciador;

import DAOs.DAOMembro;
import Modelo.Membro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author eduardo
 */
@ViewScoped
@javax.faces.bean.ManagedBean

public class MembrosBean implements Serializable {

    private Membro retornaMembro;
    private Membro membro;
    private List<Membro> membros;

    @EJB
    private DAOMembro DAOmembro;

    @PostConstruct
    public void iniciar() {
        membro = new Membro();
        retornaMembro = new Membro();
        membros = DAOmembro.RetornaTodosMembros();
    }

    public void salvar() {
        DAOmembro.SalvaMembro(membro);
        iniciar();
    }

    public void excluirMembro(int id) {
        DAOmembro.DeletaMembro(id);
        iniciar();
    }

    public void RetornaMembrorID(int id) {
        retornaMembro = DAOmembro.RetornaUmMembro(id);
        System.err.println(retornaMembro + "retornooo");
    }

    public void AtualizarMembro(int id) {
        DAOmembro.AtualizarMembro(retornaMembro);
        iniciar();
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public Membro getRetornaMembro() {
        return retornaMembro;
    }

    public void setRetornaMembro(Membro retornaMembro) {
        this.retornaMembro = retornaMembro;
    }

    public void setMembros(List<Membro> membros) {
        this.membros = membros;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public DAOMembro getDAOmembro() {
        return DAOmembro;
    }

    public void setDAOmembro(DAOMembro DAOmembro) {
        this.DAOmembro = DAOmembro;
    }
}
