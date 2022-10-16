package com.ejer2.Reto0;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class ModeloMessage implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name ="id")
    @JsonIgnoreProperties({"messages", "client", "reservation"})
    private ModeloDoctor doctor;

    @ManyToOne
    @JoinColumn(name = "idClient")
    @JsonIgnoreProperties({"messages", "reservation", "client"})
    private ModeloClient client;

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public ModeloDoctor getDoctor() {
        return doctor;
    }

    public void setDoctor(ModeloDoctor doctor) {
        this.doctor = doctor;
    }

    public ModeloClient getClient() {
        return client;
    }

    public void setClient(ModeloClient client) {
        this.client = client;
    }
}
