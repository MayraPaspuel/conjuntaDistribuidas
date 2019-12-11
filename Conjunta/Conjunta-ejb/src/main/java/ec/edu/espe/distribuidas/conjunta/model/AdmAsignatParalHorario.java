/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.conjunta.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mayra
 */
@Entity
@Table(name="ADM_ASIGNAT_PARAL_HORARIO")
public class AdmAsignatParalHorario implements Serializable{
    @EmbeddedId
    private AdmAsignatParalHorarioPk pk;
    
    @Column(name="HORA_INICIO", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date horaInicio;
    
    @Column(name="HORA_FIN", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date horaFin;
    
    @Column(name="HORAS",nullable = false, length = 1)
    private BigDecimal horas;
    
    @JoinColumns({
        @JoinColumn(name="COD_ASIGNATURA",referencedColumnName = "COD_ASIGNATURA"),
        @JoinColumn(name="PARALELO", referencedColumnName = "PARALELO")
    })
    @ManyToOne
    private AdmAsignaturaParalelo asignaturaParalelo;
    
    @JoinColumn(name="COD_AULA",referencedColumnName = "COD_AULA")
    @ManyToOne
    private AdmAula codigoAula;

    public AdmAsignatParalHorario() {
    }

    public AdmAsignatParalHorario(AdmAsignatParalHorarioPk pk) {
        this.pk = pk;
    }

    public AdmAsignatParalHorarioPk getPk() {
        return pk;
    }

    public void setPk(AdmAsignatParalHorarioPk pk) {
        this.pk = pk;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public BigDecimal getHoras() {
        return horas;
    }

    public void setHoras(BigDecimal horas) {
        this.horas = horas;
    }

    public AdmAsignaturaParalelo getAsignaturaParalelo() {
        return asignaturaParalelo;
    }

    public void setAsignaturaParalelo(AdmAsignaturaParalelo asignaturaParalelo) {
        this.asignaturaParalelo = asignaturaParalelo;
    }

    public AdmAula getCodigoAula() {
        return codigoAula;
    }

    public void setCodigoAula(AdmAula codigoAula) {
        this.codigoAula = codigoAula;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.pk);
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
        final AdmAsignatParalHorario other = (AdmAsignatParalHorario) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignatParalHorario{" + "pk=" + pk + '}';
    }
    
    
}
