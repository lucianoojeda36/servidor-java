package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;

@Service
public class UsuarioService {

  @Autowired
  UsuarioRepository usuarioRepository;

  public ArrayList<UsuarioModel> ObtenerUsuarios() {
    return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
  }

}
