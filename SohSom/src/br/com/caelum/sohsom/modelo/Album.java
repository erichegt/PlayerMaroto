package br.com.caelum.sohsom.modelo;

import java.util.ArrayList;
import java.util.List;

public class Album implements Comparable<Album>{
	private String nome;
	private Artista artista;
	private List<Musica> musicas = new ArrayList<Musica>();
	
	public Album(String nome, Artista artista) {
		this.nome = nome;
		this.artista = artista;
	}
	
	@Override
	public int compareTo(Album another) {
		return this.getNome().compareTo(another.getNome());
	}
	
	public String getNome() {
		return nome;
	}
	public List<Musica> getMusicas() {
		return musicas;
	}
	public Artista getArtista() {
		return artista;
	}
}
