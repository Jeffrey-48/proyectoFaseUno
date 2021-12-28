package com.faseuno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faseuno.interfaceService.INotaService;
import com.faseuno.interfaces.INota;
import com.faseuno.modelo.Nota;

@Service
public class NotaService implements INotaService{
	
	@Autowired
	private INota data;

	@Override
	public Nota agregarNota(Nota nota) {
		return data.save(nota);
	}

	@Override
	public List<Nota> listarNotas() {
		return (List<Nota>) data.findAll();
	}

	@Override
	public Nota editarNota(Nota nota) {
		return data.save(nota);
	}

	@Override
	public Nota eliminarNota(Integer id) {
		Nota nota = data.findById(id).get();
		if (nota!=null) {
			data.delete(nota);
		}
		return nota;
	}
}	
