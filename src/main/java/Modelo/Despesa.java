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

/**
 *
 * @author eduardo
 */
@Entity
public class Despesa implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_despesa", sequenceName = "seq_despesa_id_despesa", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Cadastro IdCadastro;
    private transient boolean editar;
    private String descricao;
    private double Valor;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data = new Date();

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    public Cadastro getIdCadastro() {
        return IdCadastro;
    }

    public void setIdCadastro(Cadastro IdCadastro) {
        this.IdCadastro = IdCadastro;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    @Override
    public String toString() {
        return "Despesa{" + "id=" + id + ", IdCadastro=" + IdCadastro + ", editar=" + editar + ", Descri\u00e7\u00e3o=" + descricao + ", Valor=" + Valor + ", data=" + data + '}';
    }

}
