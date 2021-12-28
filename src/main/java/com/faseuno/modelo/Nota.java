package com.faseuno.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nota")
public class Nota {
	
	@Id
	@Column(name = "nota")
	private Double nota;
	@Column(name = "id")
	private Integer id;
	
	public Nota(Double nota, Integer id) {
		super();
		this.nota = nota;
		this.id = id;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
