package br.com.nava.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nava.entities.UsuarioEntity;

@RestController
@RequestMapping ("usuarios")
public class UsuarioController {
	
	private ArrayList<UsuarioEntity> listaUsuario 
					= new ArrayList<UsuarioEntity>();
	//private UsuarioEntity[] array = new UsuarioEntity[3];
	
	private int contador = 1;
	
	@GetMapping("")
	public ArrayList<UsuarioEntity>  getUsuarios() {
		/*
		 * UsuarioEntity e = new UsuarioEntity(
				contador, 
				"Fabrizio" + contador, 
				"fabrizio@grandeporte.com.br"
				);
		
		listaUsuario.add(e);
		
		contador++;
		*/
		
		return listaUsuario;
	}
	@GetMapping("{id}")//ao setar a variável entre {}, torno variável
	public UsuarioEntity getOne(@PathVariable Integer id) {
		System.out.println(id);
		
		for(int i = 0; i<listaUsuario.size(); i++) {
			if (listaUsuario.get(i).getId() == id){
				return listaUsuario.get(i);
			}
		}
		return null;
	}
	
	@PostMapping("")
	public UsuarioEntity save(@RequestBody UsuarioEntity usuario) {
		System.out.println(usuario);
		
		usuario.setId(contador);
		listaUsuario.add(usuario);
		contador++;
		
		return usuario;
	}
	
	@PatchMapping("{id}")
	public UsuarioEntity update(
						@PathVariable Integer id, 
						@RequestBody UsuarioEntity usuario
						) {
		System.out.println(id);
		System.out.println(usuario);
		
			
		for(int i = 0; i< listaUsuario.size(); i++) {
			if(listaUsuario.get(i).getId() == id) {
				listaUsuario.get(i).setNome(usuario.getNome());
				listaUsuario.get(i).setEmail(usuario.getEmail());
			
				return listaUsuario.get(i);
			}
		}
		return null;
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable Integer id) {
		
		for (int i =0; i<listaUsuario.size(); i++) {
			if(listaUsuario.get(i).getId() == id) {
				listaUsuario.remove(i);
			}
		}
		
	}
}

