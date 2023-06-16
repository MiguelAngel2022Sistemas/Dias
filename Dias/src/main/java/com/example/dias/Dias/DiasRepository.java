package com.example.dias.Dias;

import jakarta.annotation.PostConstruct;


import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Dia;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public  class DiasRepository  {
	private static final Map<String,Dia> dias = new HashMap<>();

	@PostConstruct
	public void initData() {
		Dia monday = new Dia();
		monday.setName("monday");
		monday.setTraduccion("lunes");
	

		dias.put(monday.getName(), monday);

		Dia tuesday = new Dia();
		tuesday.setName("tuesday");
		tuesday.setTraduccion("martes");
		
		

		dias.put(tuesday.getName(), tuesday);

		dias.put(monday.getName(), monday);

		Dia wednesday = new Dia();
		wednesday.setName("wednesday");
		wednesday.setTraduccion("miercoles");
		
		

		dias.put(wednesday.getName(), wednesday);
	}

	public Dia findCountry(String name) {
		Assert.notNull(name, "The WEEK's name must not be null");
		return dias.get(name);
	}
}