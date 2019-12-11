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
public class AdmAsignatParalHorarioPk implements Serializable{
    @Column(name="COD_ASIGNATURA",nullable = false)
    private Integer codigoAsignatura;
    
    @Column(name="PARALELO",nullable = false, length = 1)
    private String paralelo;
    
    @Column(name="COD_AULA",nullable = false)
    private Integer codigoAula;

    @Column(name="DIA", nullable = false, length = 3)
    private String dia;

    public AdmAsignatParalHorarioPk() {
    }

    public AdmAsignatParalHorarioPk(Integer codigoAsignatura, String paralelo, Integer codigoAula, String dia) {
        this.codigoAsignatura = codigoAsignatura;
        this.paralelo = paralelo;
        this.codigoAula = codigoAula;
        this.dia = dia;
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

    public Integer getCodigoAula() {
        return codigoAula;
    }

    public void setCodigoAula(Integer codigoAula) {
        this.codigoAula = codigoAula;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.codigoAsignatura);
        hash = 71 * hash + Objects.hashCode(this.paralelo);
        hash = 71 * hash + Objects.hashCode(this.codigoAula);
        hash = 71 * hash + Objects.hashCode(this.dia);
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
        final AdmAsignatParalHorarioPk other = (AdmAsignatParalHorarioPk) obj;
        if (!Objects.equals(this.paralelo, other.paralelo)) {
            return false;
        }
        if (!Objects.equals(this.dia, other.dia)) {
            return false;
        }
        if (!Objects.equals(this.codigoAsignatura, other.codigoAsignatura)) {
            return false;
        }
        if (!Objects.equals(this.codigoAula, other.codigoAula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignatParalHorarioPk{" + "codigoAsignatura=" + codigoAsignatura + ", paralelo=" + paralelo + ", codigoAula=" + codigoAula + ", dia=" + dia + '}';
    }
    
    
    
}
