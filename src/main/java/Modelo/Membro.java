/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;


@Entity
public class Membro implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_membro", sequenceName = "seq_membro_id_membro", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Cadastro Id_Cadastro;
    private String nome;
    @NotNull
    private String cpf;
    private String endereco;
    private String celular;
    private String senha;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Data_Inscricao = new Date();
    private transient boolean editar;

    public Membro() {
    }

    public Membro(int id, Cadastro Idcadastro, String nome, String cpf, String endereco, String celular, String senha, boolean editar) {
        this.id = id;
        this.Id_Cadastro = Idcadastro;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.celular = celular;
        this.senha = senha;
        this.editar = editar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cadastro getId_Cadastro() {
        return Id_Cadastro;
    }

    public void setId_Cadastro(Cadastro Id_Cadastro) {
        this.Id_Cadastro = Id_Cadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getData_Inscricao() {
        return Data_Inscricao;
    }

    public void setData_Inscricao(Date Data_Inscricao) {
        this.Data_Inscricao = Data_Inscricao;
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    @Override
    public String toString() {
        return "Membro{" + "id=" + id + ", Idcadastro=" + Id_Cadastro + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", celular=" + celular + ", senha=" + senha + ", dataInscricao=" + Data_Inscricao + ", editar=" + editar + '}';
    }

}
