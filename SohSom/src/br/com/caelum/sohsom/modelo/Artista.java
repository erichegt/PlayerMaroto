package br.com.caelum.sohsom.modelo;

import java.util.ArrayList;
import java.util.List;

public class Artista implements Comparable<Artista>{
	private String nome;
	private List<Album> discos = new ArrayList<Album>();
	
	@Override
	public int compareTo(Artista another) {
		return this.getNome().compareTo(another.getNome());
	}
	public Artista(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Album> getDiscos() {
		return discos;
	}
	public void setDiscos(List<Album> discos) {
		this.discos = discos;
	}
}
