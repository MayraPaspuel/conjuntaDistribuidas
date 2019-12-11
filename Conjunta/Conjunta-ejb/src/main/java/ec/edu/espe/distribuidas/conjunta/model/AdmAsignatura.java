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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author mayra
 */
@Entity
@Table(name="ADM_ASIGNATURA",catalog="conjunta",schema="")
public class AdmAsignatura implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="COD_ASIGNATURA")
    private Integer codigo;
    
    @Column(name="NOMBRE",nullable = false,length = 100)
    private String nombre;
    
    @Column(name="CREDITOS", nullable = false, length = 2)
    private BigDecimal creditos;
    
    @OneToMany(mappedBy = "codigoAsignatura", fetch = FetchType.LAZY)
    private List<AdmAsignaturaParalelo> listaAsignaturaParalelo;

    public AdmAsignatura() {
    }

    public AdmAsignatura(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getCreditos() {
        return creditos;
    }

    public void setCreditos(BigDecimal creditos) {
        this.creditos = creditos;
    }

    public List<AdmAsignaturaParalelo> getListaAsignaturaParalelo() {
        return listaAsignaturaParalelo;
    }

    public void setListaAsignaturaParalelo(List<AdmAsignaturaParalelo> listaAsignaturaParalelo) {
        this.listaAsignaturaParalelo = listaAsignaturaParalelo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.codigo);
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
        final AdmAsignatura other = (AdmAsignatura) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAsignatura{" + "codigo=" + codigo + '}';
    }
    
    
}
