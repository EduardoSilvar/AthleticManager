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
public class Pagamento implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_pagamento",sequenceName = "seq_pagamento_id_pagamento",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Membro IdMembro;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data = new Date();
    private String MesReferente;

    public Pagamento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Membro getIdMembro() {
        return IdMembro;
    }

    public void setIdMembro(Membro IdMembro) {
        this.IdMembro = IdMembro;
    }
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMesReferente() {
        return MesReferente;
    }

    public void setMesReferente(String MesReferente) {
        this.MesReferente = MesReferente;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "id=" + id + ", IdMembro=" + IdMembro + ", data=" + data + ", MesReferente=" + MesReferente + '}';
    }

   
  
    
}
