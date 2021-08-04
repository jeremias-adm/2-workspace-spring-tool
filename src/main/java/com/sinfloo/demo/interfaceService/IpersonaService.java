package com.sinfloo.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.sinfloo.demo.model.persona;

public interface IpersonaService {
   public List<persona>listar();
   public Optional<persona>listarId(int id);
   public int save(persona p);
   public void delete(int id);
}
