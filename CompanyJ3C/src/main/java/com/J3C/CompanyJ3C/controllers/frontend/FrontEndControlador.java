package com.J3C.CompanyJ3C.controllers.frontend;

import com.J3C.CompanyJ3C.Entidades.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontEndControlador {
    /*@GetMapping("/")
    public String getIndex(){
        return "index";
    }*/
    @GetMapping("/login")
    public  String getlogin(Model model){
        model.addAttribute("formularioEmpleado",new Empleado());
        return "login";
    }
}
