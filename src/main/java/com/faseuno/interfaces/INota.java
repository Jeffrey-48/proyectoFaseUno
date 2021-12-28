package com.faseuno.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faseuno.modelo.Nota;

@Repository
public interface INota extends CrudRepository<Nota, Integer>{

}
