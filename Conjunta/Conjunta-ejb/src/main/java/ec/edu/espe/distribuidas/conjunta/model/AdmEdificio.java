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
@Table(name="ADM_EDIFICIO",catalog="conjunta",schema="")
public class AdmEdificio implements Serializable{
    @EmbeddedId
    private AdmEdificioPk pk;
    
    @Column(name="NOMBRE", nullable = false, length = 100)
    private String nombre;
    
    @Column(name="LATITUD", nullable = false,length = 10)
    private BigDecimal latitud;
    
    @Column(name="LONGITUD", nullable = false, length = 10)
    private BigDecimal longitud;
    
    @JoinColumn(name="COD_SEDE",referencedColumnName = "COD_SEDE")
    @ManyToOne
    private AdmSede codigoSede;
    
    @OneToMany(mappedBy = "edificio", fetch = FetchType.LAZY)
    private List<AdmAula> listaAula;

    public AdmEdificio() {
    }

    public AdmEdificio(AdmEdificioPk pk) {
        this.pk = pk;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.pk);
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
        final AdmEdificio other = (AdmEdificio) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmEdificio{" + "pk=" + pk + '}';
    }
    
    
    
}
