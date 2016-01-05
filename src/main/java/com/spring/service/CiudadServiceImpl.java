package com.spring.service;

import com.spring.dao.CiudadDAO;
import com.spring.model.Ciudad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service("ciudadService")
public class CiudadServiceImpl implements CiudadService{
    private CiudadDAO ciudadDAO;
    @Autowired(required=true)
    @Qualifier(value="ciudadDAO")
    @Override
    public void setCiudadDAO(CiudadDAO ciudadDAO) {
        this.ciudadDAO = ciudadDAO;
    }

    @Override
    public void save(Ciudad c) {
        this.ciudadDAO.save(c);
    }
    
    @Override
    public List<Ciudad> list() {
         return ciudadDAO.list();
    }

    @Override
    public Ciudad search(Ciudad c) {
       return ciudadDAO.search(c);
    }

    @Override
    public void delete(Ciudad c) {
        this.ciudadDAO.delete(c);
    }

    @Override
    public void edit(Ciudad c) {
        this.ciudadDAO.edit(c);
    }
    
}
