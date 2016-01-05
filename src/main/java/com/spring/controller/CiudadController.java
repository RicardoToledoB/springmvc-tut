/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.controller;

import com.spring.model.Ciudad;
import com.spring.service.CiudadService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller("ciudadController")
public class CiudadController {
    private CiudadService ciudadService;
    @Autowired(required = true)
    @Qualifier(value = "ciudadService")
    public void setUsuarioService(CiudadService ciudadService) {
        this.ciudadService = ciudadService;
    }
    
    //LISTADO DE USUARIOS
    @RequestMapping(value="/ciudad/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("/ciudad/list");
        List<Ciudad> ciudad = ciudadService.list();
        modelAndView.addObject("ciudad", ciudad);
        return modelAndView;
    }
    
    
    //new.jsp
    @RequestMapping(value="/ciudad/new")
    public ModelAndView newPage() {
        ModelAndView modelAndView = new ModelAndView("/ciudad/new");
        modelAndView.addObject("ciudad", new Ciudad());
        return modelAndView;
    }
    
    //GUARDAR USUARIO
    @RequestMapping(value="/ciudad/save")
    public ModelAndView save(@ModelAttribute Ciudad ciudad) {
        ModelAndView modelAndView = new ModelAndView("/ciudad/home");
        ciudadService.save(ciudad);
        return modelAndView;
    }
    
    @RequestMapping(value="/ciudad/edit/{id}", method=RequestMethod.GET)
    public ModelAndView editPage(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/ciudad/edit");
        Ciudad c=new Ciudad();
        c.setCiudad_id(id);
        Ciudad ciudad = ciudadService.search(c);
        modelAndView.addObject("ciudad",ciudad);
        return modelAndView;
    }
     
    @RequestMapping(value="/ciudad/edit/{id}", method=RequestMethod.POST)
    public ModelAndView edit(@ModelAttribute Ciudad ciudad,@PathVariable int id) {
         Ciudad c=new Ciudad();
         c.setCiudad_id(id);
         c.setNombre(ciudad.getNombre());
         c.setEstado(ciudad.getEstado());
         ModelAndView modelAndView = new ModelAndView("/ciudad/home");
         ciudadService.edit(c);
         return modelAndView;
    }
    
    @RequestMapping(value="/ciudad/delete/{id}",method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable int id){
        Ciudad c=new Ciudad();
        c.setCiudad_id(id);
        
        ModelAndView modelAndView=new ModelAndView("/ciudad/home");
        ciudadService.delete(c);
        return modelAndView;
    }
    
    @RequestMapping(value="/ciudad/detail/{id}",method=RequestMethod.GET)
    public ModelAndView detailPage(@PathVariable int id) {
        System.out.println("Detalle ID:"+id);
        Ciudad  c=new Ciudad();
        c.setCiudad_id(id);
        
        ModelAndView modelAndView = new ModelAndView("/ciudad/detail");
        Ciudad  ciudad = ciudadService.search(c);
        modelAndView.addObject("ciudad",ciudad);
        return modelAndView;
    }
}
