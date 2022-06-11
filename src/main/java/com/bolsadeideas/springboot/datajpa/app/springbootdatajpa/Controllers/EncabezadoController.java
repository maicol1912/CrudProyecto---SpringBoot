package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Encabezado;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Service.IEncabezadoService;



@Controller
@RequestMapping("/encabezado")
public class EncabezadoController {
    
    @Autowired
    private IEncabezadoService encabezadoService;

    @GetMapping("/listar")
    public String listar(Model model){
        model.addAttribute("titulo", "Listado de Encabezado");
        model.addAttribute("encabezados", encabezadoService.findAll());
        return "listarEncabezado";
    }
    @GetMapping("/form")
    public String crear(Map<String,Object>model){
        Encabezado encabezado = new Encabezado();
        model.put("encabezado",encabezado);
        model.put("titulo", "Formulario Encabezado");
        return "formEncabezado";
    }
    
    @PostMapping("/form")
    public String guardar(@Valid Encabezado encabezado, BindingResult result,Model model){
        if(result.hasErrors()){
            model.addAttribute("titulo", "Formulario encabezados");
            return "formEncabezado";
        }
        encabezadoService.save(encabezado);
        return "redirect:/encabezado/listar";
    }
    @GetMapping("/form/{id}")
    public String editar(@PathVariable Long id, Map<String,Object>model){
        Encabezado encabezado = null;
        if(id>0){
            encabezado = encabezadoService.findOne(id);
        }
        else{
            return "redirect:/encabezado/listar";
        }
        model.put("encabezado", encabezado);
        model.put("titulo", "Editar Encabezado");
        return "formEncabezado";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id){
        if(id>0){
            encabezadoService.delete(id);
        }
        return "redirect:/encabezado/listar";
    }
}
