/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.conjunta.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author mayra
 */
@Entity
@Table(name="ADM_ASIGNATURA_PARALELO",catalog="conjunta",schema="")
public class AdmAsignaturaParalelo implements Serializable{
    @EmbeddedId
    private AdmAsignaturaParaleloPk pk;
    
   @Column(name="ALUMNOS",nullable = false, length = 2)
    private BigDecimal alumnos;
    
    @Column(name="ESTADO",nullable = false, length = 3)
    private String estado;
    
    @JoinColumn(name="COD_ASIGNATURA",referencedColumnName = "COD_ASIGNATURA")
    @ManyToOne
    private AdmAsignatura codigoAsignatura;
    
    @OneToMany(mappedBy = "asignaturaParalelo", fetch = FetchType.LAZY)
    private List<AdmAsignatParalHorario> listaHorario;

    public AdmAsignaturaParalelo() {
    }

    public AdmAsignaturaParalelo(AdmAsignaturaParaleloPk pk) {
        this.pk = pk;
    }

    public AdmAsignaturaParaleloPk getPk() {
        return pk;
    }

    public void setPk(AdmAsignaturaParaleloPk pk) {
        this.pk = pk;
    }

    public BigDecimal getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(BigDecimal alumnos) {
        this.alumnos = alumnos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public AdmAsignatura getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(AdmAsignatura codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public List<AdmAsignatParalHorario> getListaHorario() {
        return listaHorario;
    }

    public void setListaHorario(List<AdmAsignatParalHorario> listaHorario) {
        this.listaHorario = listaHorario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.pk);
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
        final AdmAsignaturaParalelo other = (AdmAsignaturaParalelo) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignaturaParalelo{" + "pk=" + pk + '}';
    }
    
    
}
