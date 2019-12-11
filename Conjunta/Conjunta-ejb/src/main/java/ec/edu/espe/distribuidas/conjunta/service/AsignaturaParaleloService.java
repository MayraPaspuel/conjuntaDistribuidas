/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.conjunta.service;

import ec.edu.espe.distribuidas.conjunta.dao.AdmAsignaturaParaleloDAO;
import ec.edu.espe.distribuidas.conjunta.model.AdmAsignaturaParalelo;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author mayra
 */
@Stateless
@LocalBean
public class AsignaturaParaleloService {
    @EJB
    private AdmAsignaturaParaleloDAO dao;
    
    public List<AdmAsignaturaParalelo> findAll(){
        return dao.findAll();
    }
    
    public AdmAsignaturaParalelo findByPk(Integer codigo){
        return dao.find(codigo);
    }
    
    public void insert(AdmAsignaturaParalelo asignatura){
        dao.create(asignatura);
    } 
    
    public void update(AdmAsignaturaParalelo asignatura){
        dao.edit(asignatura);
    }
    
    
}
