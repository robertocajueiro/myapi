package com.roberto.api;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.roberto.api.domain.Usuario;
import com.roberto.api.repository.UsuarioRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario(null, "Roberto Dantas", "roberto", "123");
		Usuario u2 = new Usuario(null, "Lucas Cajueiro", "lucas", "myfriend123");
		
		usuarioRepository.saveAll(Arrays.asList(u1, u2));

	}

}
