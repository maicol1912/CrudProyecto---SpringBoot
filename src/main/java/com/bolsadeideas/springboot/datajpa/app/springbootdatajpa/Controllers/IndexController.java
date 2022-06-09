package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @GetMapping("/index")
    public String mostrarIndex(){
          return "index";
    }

    @GetMapping("/")
    public String mostrarNada(){
        return "indexBlanco";
    }

    
}
