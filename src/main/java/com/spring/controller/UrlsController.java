package com.spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UrlsController {
    @RequestMapping(value="/usuario")
    public ModelAndView mainPage() {
        return new ModelAndView("usuario/home");
    }
     
    @RequestMapping(value="/usuario/home")
    public ModelAndView homePage() {
        return new ModelAndView("usuario/home");
    }
}
