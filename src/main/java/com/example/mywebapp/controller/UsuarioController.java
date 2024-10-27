package com.example.mywebapp.controller;

import com.example.mywebapp.model.Usuario;
import com.example.mywebapp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("usuario", new Usuario());
        return "usuarios"; // Nombre de la vista
    }
    @PostMapping("/usuarios")
    public String guardarUsuario(@ModelAttribute Usuario usuario) {
        usuarioService.guardarUsuario(usuario);
        return "redirect:/usuarios";
    }

}
