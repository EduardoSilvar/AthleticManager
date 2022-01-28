/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerenciador;

import DAOs.DAODespesa;
import DAOs.DAOMembro;
import DAOs.DAOPagamento;
import Modelo.Membro;
import Modelo.Pagamento;
import java.util.AbstractList;
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
@ManagedBean
@ViewScoped
public class PagamentosBean {

    @EJB
    private DAOMembro DAOMembro;
    private Pagamento pagamento;
    private int id_membro;
    private List<Pagamento> pagamentos;
    @EJB
    private DAOPagamento DAOPagamento;

    public int getId_membro() {
        return id_membro;
    }

    public void setId_membro(int id_membro) {
        this.id_membro = id_membro;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public DAOPagamento getDAOPagamento() {
        return DAOPagamento;
    }

    public void setDAOPagamento(DAOPagamento DAOPagamento) {
        this.DAOPagamento = DAOPagamento;
    }

    @PostConstruct
    public void iniciar() {
        pagamento = new Pagamento();
        pagamentos = DAOPagamento.RetornaTodosPagamentos();
    }

    public void salvar() {
        Membro membro = DAOMembro.RetornaUmMembro(id_membro);
        pagamento.setIdMembro(membro);
        DAOPagamento.SalvaDespesa(pagamento);
        pagamentos = DAOPagamento.RetornaTodosPagamentos();
        iniciar();

    }
    public void Deletar(int id){
    DAOPagamento.DeletaDespesa(id);
    iniciar();
    }
}
