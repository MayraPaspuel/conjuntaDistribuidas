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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author mayra
 */
@Entity
@Table(name="ADM_AULA",catalog="conjunta",schema="")
public class AdmAula implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="COD_AULA")
    private Integer codigo;
      
    @JoinColumns({
        @JoinColumn(name="COD_SEDE",referencedColumnName = "COD_SEDE"),
        @JoinColumn(name="COD_EDIFICIO", referencedColumnName = "COD_EDIFICIO")
    })
    @ManyToOne
    private AdmEdificio edificio;
    
    @Column(name="CODIGO_ALTERNO", nullable = false,length = 4)
    private String codigoAlterno;
    
    @Column(name="PISO", nullable = false, length = 2)
    private Integer piso;
    
    @Column(name="TIPO", nullable = false, length = 3)
    private String tipo;
    
    @Column(name="CAPACIDAD", nullable = false, length = 3)
    private BigDecimal capacidad;
    
    @OneToMany(mappedBy = "codigoAula", fetch = FetchType.LAZY)
    private List<AdmAsignatParalHorario> listaHorario;

    public AdmAula() {
    }

    public AdmAula(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public AdmEdificio getEdificio() {
        return edificio;
    }

    public void setEdificio(AdmEdificio edificio) {
        this.edificio = edificio;
    }

    public String getCodigoAlterno() {
        return codigoAlterno;
    }

    public void setCodigoAlterno(String codigoAlterno) {
        this.codigoAlterno = codigoAlterno;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(BigDecimal capacidad) {
        this.capacidad = capacidad;
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
        hash = 29 * hash + Objects.hashCode(this.codigo);
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
        final AdmAula other = (AdmAula) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAula{" + "codigo=" + codigo + '}';
    }
    
   
    
}
