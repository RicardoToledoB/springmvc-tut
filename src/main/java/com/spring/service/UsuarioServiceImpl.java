package com.spring.service;

import com.spring.dao.UsuarioDAO;
import com.spring.model.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService{
    private UsuarioDAO usuarioDAO;
    @Autowired(required=true)
    @Qualifier(value="usuarioDAO")
    @Override
    public void setUsuariosDAO(UsuarioDAO usuarioDAO){
		this.usuarioDAO = usuarioDAO;
    }
    @Override
    public void save(Usuario u) {
        usuarioDAO.save(u);
    }
    @Override
    public List<Usuario> list() {
        return usuarioDAO.list();
    }
    @Override
    public Usuario search(Usuario u) {
        return usuarioDAO.search(u);
    }
    @Override
    public void delete(Usuario u) {
        usuarioDAO.delete(u);
    }
    @Override
    public void edit(Usuario u) {
        usuarioDAO.edit(u);
    }
    
}
