/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.service;

import com.spring.dao.CiudadDAO;
import com.spring.model.Ciudad;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface CiudadService {
    public void setCiudadDAO(CiudadDAO ciudadDAO);
    public void save(Ciudad c);
    public List<Ciudad> list();
    public Ciudad search(Ciudad c);
    public void delete(Ciudad c);
    public void edit(Ciudad c);
}
