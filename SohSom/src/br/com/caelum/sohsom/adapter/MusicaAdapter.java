package br.com.caelum.sohsom.adapter;

import java.util.List;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.com.caelum.sohsom.R;
import br.com.caelum.sohsom.modelo.Musica;

public class MusicaAdapter extends AdapterGenerico<Musica> {
	private Activity activity;

	public MusicaAdapter(List<Musica> lista, Activity activity) {
		super(lista);
		this.activity = activity;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View linhaDaListagem = activity.getLayoutInflater().inflate(R.layout.item_lista, null);
		
		TextView nomeDoArtista = (TextView) linhaDaListagem.findViewById(R.id.artista);
		TextView duracao = (TextView) linhaDaListagem.findViewById(R.id.duracao);
		TextView nomeDaMusica = (TextView) linhaDaListagem.findViewById(R.id.musica);
		TextView nomeDoAlbum = (TextView) linhaDaListagem.findViewById(R.id.album);
		TextView numeroFaixa = (TextView) linhaDaListagem.findViewById(R.id.numero_faixa);
		
		Musica musica = (Musica) getItem(position);
		
		nomeDaMusica.setText(musica.getNome());
		nomeDoAlbum.setText(musica.getAlbum().getNome());
		nomeDoArtista.setText(musica.getAlbum().getArtista().getNome());
		numeroFaixa.setText(musica.getNumeroFaixa().toString());
		duracao.setText(musica.getDuracaoFormatada());
		
		return linhaDaListagem;
	}

}
