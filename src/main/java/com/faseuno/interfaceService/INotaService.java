package com.faseuno.interfaceService;

import java.util.List;

import com.faseuno.modelo.Nota;

public interface INotaService {

	public Nota agregarNota(Nota nota);

	public List<Nota> listarNotas();

	public Nota editarNota(Nota nota);

	public Nota eliminarNota(Integer id);

}
