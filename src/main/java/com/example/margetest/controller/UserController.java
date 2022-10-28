package com.example.margetest.controller;

import com.example.margetest.database.User;
import com.example.margetest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping("/")
    public String getAllUsers(Model model){
        model.addAttribute("page", service.selectAll());
        return "list";
    }

    @GetMapping("/add")
    public String addUser(@ModelAttribute User user){
        return "form";
    }


    @PostMapping("/process")
    public String process(@Validated @ModelAttribute User user, BindingResult result){
        if (result.hasErrors()){
            return "form";
        }
        service.save(user);
        return "redirect:/";
    }


    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable Integer id, Model model){
        model.addAttribute("user", service.selectByPrimaryKey(id));
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id){
        service.deleteByPrimaryKey(id);
        return "redirect:/";
    }
}

