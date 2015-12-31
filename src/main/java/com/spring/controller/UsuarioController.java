/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.controller;

import com.spring.model.Usuario;
import com.spring.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
    
    
}
