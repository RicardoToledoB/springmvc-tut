package com.spring.dao;
import com.spring.model.Usuario;
import java.util.List;
public interface UsuarioDAO {
    public void save(Usuario u);
    public List<Usuario> list();
    public List<Usuario> search(Usuario u);
    public void delete(Usuario u);
    public void edit(Usuario u);
}
