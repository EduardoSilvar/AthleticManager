/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerenciador;

import DAOs.DAOCadastro;
import Modelo.Cadastro;
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
public class CadastroBean {

    private Cadastro cadastro;
    @EJB
    private DAOCadastro DAOcadastro;

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public DAOCadastro getDAOcadastro() {
        return DAOcadastro;
    }

    public void setDAOcadastro(DAOCadastro DAOcadastro) {
        this.DAOcadastro = DAOcadastro;
    }

    @PostConstruct
    public void iniciar() {
        cadastro = new Cadastro();
    }

    public void salvar() {
        DAOcadastro.SalvaCadastro(cadastro);
    }

    public void consultaEmail() {
        if (DAOcadastro.Confimacaocadastro(cadastro.getEmail()).size() <= 0) {
            DAOcadastro.SalvaCadastro(cadastro);
        } else {
            System.err.println("error");
        }
    }

    public void ultimoteste() {
        if (DAOcadastro.TestLogin(cadastro.getEmail(), cadastro.getSenha()).size() > 0) {
            System.err.println("Login feito com sucesso !!");

        } else {
            System.out.println("email ou senha errado !!");
        }
    }
}
