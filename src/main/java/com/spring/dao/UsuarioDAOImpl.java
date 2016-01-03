package com.spring.dao;
import com.spring.config.mybatis.MyBatisUtil;
import com.spring.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
@Repository("usuarioDAO")
public class UsuarioDAOImpl implements UsuarioDAO{
    @Override
    public void save(Usuario user) {
        SqlSession session = new MyBatisUtil().getSession();
            try {
                session.insert("Usuario.save", user);
            } finally {
                session.commit();
                session.close();
            }
    }
    @Override
    public List<Usuario> list() {
        List<Usuario> list = new ArrayList<Usuario>();
        SqlSession session = new MyBatisUtil().getSession();
        try {
            list = session.selectList("Usuario.list");
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public Usuario search(Usuario u) {
        Usuario list = new Usuario();
        SqlSession session = new MyBatisUtil().getSession();
        try {
            list = session.selectOne("Usuario.search", u);
        } finally {
            session.close();
        }
        return list;
    }

    @Override
    public void delete(Usuario user) {
        SqlSession session = new MyBatisUtil().getSession();
        try {
            session.update("Usuario.delete", user);
        } finally {
            session.commit();
            session.close();
        }
    }
    @Override
    public void edit(Usuario user) {
        SqlSession session = new MyBatisUtil().getSession();
        try {
            session.update("Usuario.edit", user);
        } finally {
            session.commit();
            session.close();
        }
    }
    
}
