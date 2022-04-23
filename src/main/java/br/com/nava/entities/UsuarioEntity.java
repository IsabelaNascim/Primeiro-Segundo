package br.com.nava.entities;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data //-->gera os métodos getters e setters
@AllArgsConstructor //-->cria construtor com todos os parâmetros, sendo que o vazio é o default
public class UsuarioEntity {
	
	//ATRIBUTOS
	private int id;
	private String nome;
	private String email;	
	
	//CONSTRUTOR
	/* 
	 *  @AllArgsConstructor - ao utilizar esse @ 
	 * os construtores são gerados automaticamente
	 *  (vazio e default)
	 *  */
	
	
	
}
