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

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Detalle;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Service.IDetalleService;

@Controller
@RequestMapping("/detalle")
public class DetalleController {
     
    @Autowired
    private IDetalleService detalleService;


    @GetMapping("/listar")
    public String listar(Model model){
        model.addAttribute("titulo", "Listado Detalle Pedido");
        model.addAttribute("detalles",detalleService.findAll());
        return "listarEncabezado";
    }
    @GetMapping("/form")
    public String crear(Map<String,Object>model){
        Detalle detalle = new Detalle();
        model.put("detalle",detalle);
        model.put("titulo","Formulario Detalles");
        return "formDetalle";
    }
    @PostMapping("/form")
    public String guardar(@Valid Detalle detalle, BindingResult result,Model model){
        if(result.hasErrors()){
            model.addAttribute("titulo","Formulario de Clientes");
            return "formDetalle";
        }
        detalleService.save(detalle);
        return"redirect:/detalle/listar";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id){
        if (id>0){
            detalleService.delete(id);
        }
        return "redirect:/detalle/listar";
    }





}
