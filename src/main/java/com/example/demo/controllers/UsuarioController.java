package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.UsuarioModel;
import com.example.demo.services.UsuarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
  @Autowired
  UsuarioService usuarioService;

  @GetMapping(value = "/all")
  public ArrayList<UsuarioModel> obtenerUsuarios() {
    return (ArrayList<UsuarioModel>) usuarioService.ObtenerUsuarios();
  }

}
