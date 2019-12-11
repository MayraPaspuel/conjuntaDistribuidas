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
public class AdmAsignaturaParaleloPk implements Serializable{
    @Column(name="COD_ASIGNATURA", nullable = false)
    private Integer codigoAsignatura;
    
    @Column(name="PARALELO", nullable = false, length = 1)
    private String paralelo;

    public AdmAsignaturaParaleloPk() {
    }

    public AdmAsignaturaParaleloPk(Integer codigoAsignatura, String paralelo) {
        this.codigoAsignatura = codigoAsignatura;
        this.paralelo = paralelo;
    }

    public Integer getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(Integer codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }
  
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.codigoAsignatura);
        hash = 19 * hash + Objects.hashCode(this.paralelo);
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
        final AdmAsignaturaParaleloPk other = (AdmAsignaturaParaleloPk) obj;
        if (!Objects.equals(this.paralelo, other.paralelo)) {
            return false;
        }
        if (!Objects.equals(this.codigoAsignatura, other.codigoAsignatura)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignaturaParaleloPk{" + "codigoAsignatura=" + codigoAsignatura + ", paralelo=" + paralelo + '}';
    } 
    
}
