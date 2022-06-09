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

@Controller
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/listarProducto")
    public String listarProducto(Model model){
        model.addAttribute("tituloProducto","Listado de Productos");
        model.addAttribute("productos",productoService.findAll());

        return "listarProducto";
    }

    @GetMapping("/formProducto")
    public String crearProducto(Map<String,Object>model){

        Producto producto = new Producto();
        model.put("producto", producto);
        model.put("tituloProducto", "Formulario de productos");

        return "formProducto";
    }

    @PostMapping("/formProducto")
    public String guardarProducto(@Valid Producto producto, BindingResult result, Model model){
        
        if(result.hasErrors()){
            model.addAttribute("tituloProducto", "formulario de productos");
            return "formProducto";
        }
        productoService.save(producto);
        return "redirect:listarProducto";
    }


    @GetMapping("/formProducto/{id}")
    public String editar(@PathVariable Long id, Map<String,Object>model){
        Producto producto = null;
        if(id>0){
            producto = productoService.findOne(id);
        }
        else{
            return "redirect:listarProducto";
        }

        model.put("producto", producto);
        model.put("tituloProducto", "Editar Producto");
        return "formProducto";
    }

    @GetMapping("/eliminarProducto/{id}")
    public String eliminar(@PathVariable Long id){
        if(id > 0)
           productoService.delete(id);
        
        return "redirect:/listarProducto";
               
    }





}
