package com.faseuno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.faseuno.interfaceService.INotaService;
import com.faseuno.modelo.Nota;

@RestController
@RequestMapping("/nota")
public class Controller {
	
	@Autowired
	private INotaService serviceNota;
	
	//Crear nota
	@PostMapping("/crearNota")
	public Nota agregarNota(@RequestBody Nota nota) {
		System.out.println("Entra");
		return serviceNota.agregarNota(nota);
	}
	
	//Listar notas
	@GetMapping("/listarNota")
	public List<Nota> listarNotas(){
		System.out.println("Entra");
		return serviceNota.listarNotas();
	}
	
	//Editar valor de nota
	@PutMapping(path = { "/editarNota/{nota}" })
	public Nota editarNota(@RequestBody Nota nota, @PathVariable("nota") Double valor) {
		nota.setNota(valor);
		return serviceNota.editarNota(nota);
	}
	
	//Eliminar nota
	@DeleteMapping(path = { "/eliminarNota/{id}" })
	public Nota eliminarNota(@PathVariable("id") Integer id) {
		return serviceNota.eliminarNota(id);
	}
	
}
