package com.fabio.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TesteDao {

	
	public List<String> listar(){
		List<String> sumulacaoResultado = new ArrayList<>();
		sumulacaoResultado.add("Primeiro Resultado");
		sumulacaoResultado.add("Segundo Resultado");
		
		System.out.println("TesteDao.listar()");
	
		return sumulacaoResultado;
	}
	
}
