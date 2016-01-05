package com.spring.controller;
import com.spring.model.Ciudad;
import com.spring.model.Usuario;
import com.spring.service.CiudadService;
import com.spring.service.UsuarioService;
import java.util.ArrayList;
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
    private CiudadService ciudadService;
    private UsuarioService usuarioService;
    @Autowired(required = true)
    @Qualifier(value = "usuarioService")
    public void setUsuarioService(UsuarioService usuariosService) {
        this.usuarioService = usuariosService;
    }
    @Autowired(required = true) 
    @Qualifier(value = "ciudadService")
    public void setCiudadService(CiudadService ciudadService) {
        this.ciudadService = ciudadService;
    }
    
    //LISTADO DE USUARIOS
    @RequestMapping(value="/usuario/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("/usuario/list");
        List<Usuario> usuarios = usuarioService.list();
        modelAndView.addObject("usuarios", usuarios);
        return modelAndView;
    }
    //new.jsp
    @RequestMapping(value="/usuario/new")
    public ModelAndView newPage() {
        ModelAndView modelAndView = new ModelAndView("/usuario/new");
        modelAndView.addObject("usuario", new Usuario());
        List<Ciudad> ciudadList = ciudadService.list();
        modelAndView.addObject("ciudadList", ciudadList);
        return modelAndView;
    }
    
    //GUARDAR USUARIO
    @RequestMapping(value="/usuario/save")
    public ModelAndView save(@ModelAttribute Usuario usuario) {
        ModelAndView modelAndView = new ModelAndView("/usuario/home");
        usuarioService.save(usuario);
        return modelAndView;
    }
    
    @RequestMapping(value="/usuario/edit/{id}", method=RequestMethod.GET)
    public ModelAndView editPage(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/usuario/edit");
        Usuario u=new Usuario();
        u.setUsuario_id(id);
        Usuario user = usuarioService.search(u);
        List<Ciudad> ciudad = ciudadService.list();
        modelAndView.addObject("ciudad", ciudad);
        modelAndView.addObject("usuario",user);
        return modelAndView;
    }
     
    @RequestMapping(value="/usuario/edit/{id}", method=RequestMethod.POST)
    public ModelAndView edit(@ModelAttribute Usuario usuario,@PathVariable int id) {
        usuario.setUsuario_id(id);
        ModelAndView modelAndView = new ModelAndView("/usuario/home");
        usuarioService.edit(usuario);
        return modelAndView;
    }
    
    @RequestMapping(value="/usuario/delete/{id}",method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable int id){
        Usuario u=new Usuario();
        u.setUsuario_id(id);
        ModelAndView modelAndView=new ModelAndView("/usuario/home");
        usuarioService.delete(u);
        return modelAndView;
    }
    
    @RequestMapping(value="/usuario/detail/{id}",method=RequestMethod.GET)
    public ModelAndView detailPage(@PathVariable int id) {
        System.out.println("Detalle ID:"+id);
        Usuario u=new Usuario();
        u.setUsuario_id(id);
        ModelAndView modelAndView = new ModelAndView("/usuario/detail");
        Usuario user = usuarioService.search(u);
        modelAndView.addObject("usuario",user);
        return modelAndView;
    }
}
