/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.conjunta.service;

import ec.edu.espe.distribuidas.conjunta.dao.AdmAsignaturaDAO;
import ec.edu.espe.distribuidas.conjunta.model.AdmAsignatura;
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
public class AsignaturaService {
    
    @EJB
    private AdmAsignaturaDAO dao;
    
    public List<AdmAsignatura> findAll(){
        return dao.findAll();
    }
    
    public AdmAsignatura findByPk(Integer codigo){
        return dao.find(codigo);
    }
    
    public void insert(AdmAsignatura asignatura){
        dao.create(asignatura);
    } 
    
    public void update(AdmAsignatura asignatura){
        dao.edit(asignatura);
    }
}
