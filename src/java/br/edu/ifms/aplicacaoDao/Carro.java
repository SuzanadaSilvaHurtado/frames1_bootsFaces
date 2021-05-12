/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.aplicacaoDao;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Sabrina-Samara
 */
@Entity
public class Carro implements Serializable {
    
    private String marca, modelo, ano_fabricacao, ano_modelo, observacao;
    @Id
    @GeneratedValue
    private Long ID;

    public Carro() {
    }

    public Carro(String marca, String modelo, String ano_fabricacao, String ano_modelo, String observacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano_fabricacao = ano_fabricacao;
        this.ano_modelo = ano_modelo;
        this.observacao = observacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(String ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public String getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(String ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

   
    
    
    
}
