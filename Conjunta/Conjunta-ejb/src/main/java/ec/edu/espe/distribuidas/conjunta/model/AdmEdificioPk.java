/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.conjunta.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author mayra
 */
@Embeddable
public class AdmEdificioPk implements Serializable{
    @Column(name="COD_SEDE",nullable = false, length = 10)
    private String codigo;
    
    @Column(name="COD_EDIFICIO",nullable = false,length = 10)
    private String codigoEdificio;

    public AdmEdificioPk() {
    }

    public AdmEdificioPk(String codigo, String codigoEdificio) {
        this.codigo = codigo;
        this.codigoEdificio = codigoEdificio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoEdificio() {
        return codigoEdificio;
    }

    public void setCodigoEdificio(String codigoEdificio) {
        this.codigoEdificio = codigoEdificio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.codigo);
        hash = 29 * hash + Objects.hashCode(this.codigoEdificio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AdmEdificioPk other = (AdmEdificioPk) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.codigoEdificio, other.codigoEdificio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmEdificioPk{" + "codigo=" + codigo + ", codigoEdificio=" + codigoEdificio + '}';
    }
    
    
    
}
