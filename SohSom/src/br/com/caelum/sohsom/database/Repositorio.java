package br.com.caelum.sohsom.database;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.caelum.sohsom.modelo.Album;
import br.com.caelum.sohsom.modelo.Artista;
import br.com.caelum.sohsom.modelo.Musica;

public class Repositorio {

	private static List<Artista> artistas = new ArrayList<Artista>();
	
	static {
		Artista pixies = new Artista("Pixies");
		Album bossanova = new Album("Bossanova", pixies);
		
		List<Musica> musicas = bossanova.getMusicas();
		musicas.add(new Musica(1, "Cecilia Ann", "", new GregorianCalendar(0, 0, 0, 0, 2, 5), bossanova));
		musicas.add(new Musica(2, "Rock Music", "", new GregorianCalendar(0, 0, 0, 0, 1, 52), bossanova));
		musicas.add(new Musica(3, "Allison", "", new GregorianCalendar(0, 0, 0, 0, 1, 17), bossanova));
		musicas.add(new Musica(4, "Is She Weird", "", new GregorianCalendar(0, 0, 0, 0, 3, 1), bossanova));
		musicas.add(new Musica(5, "Ana", "", new GregorianCalendar(0, 0, 0, 0, 2, 9), bossanova));
		
		pixies.getDiscos().add(bossanova);
		
		artistas.add(pixies);
		
		Artista robsonMiguel = new Artista("Robson Miguel");
		Album aoVivo = new Album("Ao vivo em Cordoba", robsonMiguel);
		
		List<Musica> musicas2 = aoVivo.getMusicas();
		musicas2.add(new Musica(1, "Astronauta", "", new GregorianCalendar(0, 0, 0, 0, 2, 5), aoVivo));
		musicas2.add(new Musica(2, "Wave", "", new GregorianCalendar(0, 0, 0, 0, 1, 52), aoVivo));
		musicas2.add(new Musica(3, "Som Brasil", "", new GregorianCalendar(0, 0, 0, 0, 1, 35), aoVivo));
		musicas2.add(new Musica(4, "Aquarela do Brasil", "", new GregorianCalendar(0, 0, 0, 0, 1, 17), aoVivo));
		musicas2.add(new Musica(5, "Se acontecer", "", new GregorianCalendar(0, 0, 0, 0, 2, 11), aoVivo));
		
		robsonMiguel.getDiscos().add(aoVivo);
		
		artistas.add(robsonMiguel);
		
		
	}
	
	public List<Musica> listaTodasMusicas() {
		List<Musica> musicas = new ArrayList<Musica>();
		
		for (Artista a : artistas) {
			for (Album album : a.getDiscos()) {
				musicas.addAll(album.getMusicas());
			}
		}
		
		return musicas;
	}
	
}
