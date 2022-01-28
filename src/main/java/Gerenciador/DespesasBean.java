/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerenciador;

import DAOs.DAODespesa;
import Modelo.Despesa;
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
@ManagedBean
public class DespesasBean implements Serializable {

    private List<Despesa> despesas;
    private Despesa despesa;
    private Despesa retornodespesa;
    @EJB
    private DAODespesa DAOdespesa;

    @PostConstruct
    public void iniciar() {
        despesa = new Despesa();
        retornodespesa = new Despesa();
        despesas = DAOdespesa.RetornaTodasDespesas();
    }

    public void salvar() {
        DAOdespesa.SalvaDespesa(despesa);
        iniciar();
    }

    public void DeletarDespesa(int id) {
        DAOdespesa.DeletaDespesa(id);
        iniciar();
    }

    public void RetornadespesaporID(int id) {
        retornodespesa = DAOdespesa.RetornaUmaDespesa(id);
        System.err.println(retornodespesa);
    }

    public void AtualizarDespesa(int id) {
        DAOdespesa.AtualizarDespesa(retornodespesa);
        iniciar();
    }

    public Despesa getRetornodespesa() {
        return retornodespesa;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }

    public Despesa getDespesa() {
        return despesa;
    }

    public void setDespesa(Despesa despesa) {
        this.despesa = despesa;
    }

    public DAODespesa getDAOdespesa() {
        return DAOdespesa;
    }

    public void setDAOdespesa(DAODespesa DAOdespesa) {
        this.DAOdespesa = DAOdespesa;
    }

}
