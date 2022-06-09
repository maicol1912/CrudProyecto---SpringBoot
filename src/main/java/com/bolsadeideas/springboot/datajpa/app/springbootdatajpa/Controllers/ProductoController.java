package com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Controllers;

import java.util.Map;

import javax.validation.Valid;

import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Entity.Producto;
import com.bolsadeideas.springboot.datajpa.app.springbootdatajpa.Models.Service.IProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/listar")
    public String listarProducto(Model model){
        model.addAttribute("tituloProducto","Listado de Productos");
        model.addAttribute("productos",productoService.findAll());

        return "listarProducto";
    }

    @GetMapping("/form")
    public String crearProducto(Map<String,Object>model){

        Producto producto = new Producto();
        model.put("producto", producto);
        model.put("tituloProducto", "Formulario de productos");

        return "formProducto";
    }

    @PostMapping("/form")
    public String guardarProducto(@Valid Producto producto, BindingResult result, Model model){
        
        if(result.hasErrors()){
            model.addAttribute("tituloProducto", "formulario de productos");
            return "formProducto";
        }
        productoService.save(producto);
        return "redirect:/producto/listar";
    }


    @GetMapping("/form/{id}")
    public String editar(@PathVariable Long id, Map<String,Object>model){
        Producto producto = null;
        if(id>0){
            producto = productoService.findOne(id);
        }
        else{
            return "redirect:/producto/listar";
        }

        model.put("producto", producto);
        model.put("tituloProducto", "Editar Producto");
        return "formProducto";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id){
        if(id > 0)
           productoService.delete(id);
        
        return "redirect:/producto/listar";
               
    }





}
