package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Controllers;

import java.util.Map;

import javax.validation.Valid;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Cliente;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Service.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ClienteController {
    
    @Autowired
    //@Qualifier("ClienteDaoJPA")
    //private IClienteDao clienteDao;
    private IClienteService clienteService;


    @GetMapping("/listar")
    public String listar(Model model){
        
        model.addAttribute("titulo","Listado de clientes");
        model.addAttribute("clientes", clienteService.findAll());

        return "listar";
    }

    @GetMapping("/form")
    public String crear(Map<String,Object>model){

        Cliente cliente = new Cliente();
        model.put("cliente",cliente);
        model.put("titulo", "Formulario de cliente");
        return "form";
    }

    @PostMapping("/form")
    public String guardar(@Valid Cliente cliente, BindingResult result, Model model){


        if (result.hasErrors()) {
            model.addAttribute("titulo","formulario de clientes");
            return "form";
        }

        clienteService.save(cliente);

        return "redirect:listar";
    }
 

    @GetMapping("/form/{id}")
    public String editar(@PathVariable Long id,Map<String,Object>model){
        Cliente cliente = null;
        if (id >0){
            cliente = clienteService.findOne(id);
        }
        else{
            return "redirect:listar";
        }
        model.put("cliente",cliente);
        model.put("titulo", "Editar cliente");
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id){

        if (id > 0)
            clienteService.delete(id);
        
        return "redirect:/listar";
    }



}
