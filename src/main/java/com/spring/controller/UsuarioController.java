package com.spring.controller;
import com.spring.model.Usuario;
import com.spring.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller("usuarioController")
public class UsuarioController {
    private UsuarioService usuarioService;
    @Autowired(required = true)
    @Qualifier(value = "usuarioService")
    public void setUsuarioService(UsuarioService usuariosService) {
        this.usuarioService = usuariosService;
    }
    
    //LISTADO DE USUARIOS
    @RequestMapping(value="/usuario/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("usuario/list");
        List<Usuario> usuarios = usuarioService.list();
        modelAndView.addObject("usuarios", usuarios);
        return modelAndView;
    }
    //new.jsp
    @RequestMapping(value="/usuario/new")
    public ModelAndView newPage() {
        ModelAndView modelAndView = new ModelAndView("usuario/new");
        modelAndView.addObject("usuario", new Usuario());
        return modelAndView;
    }
    
    //GUARDAR USUARIO
    @RequestMapping(value="/usuario/save")
    public ModelAndView save(@ModelAttribute Usuario usuario) {
        ModelAndView modelAndView = new ModelAndView("usuario/home");
        usuarioService.save(usuario);
        return modelAndView;
    }
    
    @RequestMapping(value="/usuario/edit/{id}", method=RequestMethod.GET)
    public ModelAndView editPage(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("usuario/edit");
        Usuario u=new Usuario();
        u.setUsuario_id(id);
        Usuario user = usuarioService.search(u);
        modelAndView.addObject("usuario",user);
        return modelAndView;
    }
     
    @RequestMapping(value="/usuario/edit/{id}", method=RequestMethod.POST)
    public ModelAndView edit(@ModelAttribute Usuario usuario,@PathVariable int id) {
         Usuario u=new Usuario();
         u.setUsuario_id(id);
         u.setNombre(usuario.getNombre());
         u.setApepat(usuario.getApepat());
         u.setApemat(usuario.getApemat());
         ModelAndView modelAndView = new ModelAndView("usuario/home");
         usuarioService.edit(u);
        return modelAndView;
    }
    
    
}
