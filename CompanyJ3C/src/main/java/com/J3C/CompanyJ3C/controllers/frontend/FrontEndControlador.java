package com.J3C.CompanyJ3C.controllers.frontend;

import com.J3C.CompanyJ3C.Entidades.Empleado;
import com.J3C.CompanyJ3C.services.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FrontEndControlador {

    @Autowired
    EmpleadoServicio empleadoServicio;

    /*@GetMapping("/")
    public String getIndex(){
        return "index";
    }*/
    @GetMapping("/login")
    public  String getlogin(Model model){
        model.addAttribute("formularioLogin",new Empleado());
        return "login";
    }
    @GetMapping("/crearempleado")
    public  String getempleado(Model model){
        model.addAttribute("formularioEmpleado",new Empleado());
        return "empleado";
    }
    @PostMapping("/login")
    public String postlogin(@ModelAttribute("formulariologion")Empleado empleado){
        System.out.println(empleado);
        return "redirect:/welcome";
    }
    @GetMapping("/welcome")
    public String getWelcome(Model model)
    {
        model.addAttribute("empleados",empleadoServicio.getEmpleadoList());
        return "welcome";
    }
}
