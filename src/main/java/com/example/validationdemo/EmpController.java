/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.validationdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpController {
    
    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("employee", new Employee());
        return "form";
    }
    @PostMapping("/emp")
    public String submittedForm(Model model, 
            @ModelAttribute Employee emp, BindingResult bR){
        if(bR.hasErrors()){
            return "form" ;
        }
        return "success";
    }
}
