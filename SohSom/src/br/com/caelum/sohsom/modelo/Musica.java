package br.com.caelum.sohsom.modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Musica implements Comparable<Musica>{
	
	private Integer numeroFaixa;
	private String nome;
	private String letra;
	private Calendar duracao;
	private Album album;
	
	public Musica(Integer numeroFaixa, String nome, String letra, Calendar duracao, Album album) {
		this.numeroFaixa = numeroFaixa;
		this.nome = nome;
		this.letra = letra;
		this.duracao = duracao;
		this.album = album;
	}
	
	@Override
	public int compareTo(Musica another) {
		return this.getNome().compareTo(another.getNome());
	}
	
	public String getNome() {
		return nome;
	}
	public Integer getNumeroFaixa() {
		return numeroFaixa;
	}
	public String getLetra() {
		return letra;
	}
	public Calendar getDuracao() {
		return duracao;
	}
	public Album getAlbum() {
		return album;
	}
	public String getDuracaoFormatada() {
		return new SimpleDateFormat("mm:ss").format(duracao.getTime());
	}
}
