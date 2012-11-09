package br.com.caelum.sohsom.adapter;

import java.util.List;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import br.com.caelum.sohsom.R;
import br.com.caelum.sohsom.modelo.Album;
import br.com.caelum.sohsom.modelo.Musica;

public class AlbunsAdapter extends BaseExpandableListAdapter {
	private List<Album> albuns;
	private Activity activity;

	public AlbunsAdapter(List<Album> albuns, Activity activity) {
		this.albuns = albuns;
		this.activity = activity;
	}
	
	@Override
	public View getChildView(int arg0, int arg1, boolean arg2, View arg3,
			ViewGroup arg4) {
		
		Musica musica = (Musica) this.getChild(arg0, arg1);
		View linhaItem = activity.getLayoutInflater().inflate(R.layout.albuns_sub_item, null);
		
		
		TextView duracao = (TextView) linhaItem.findViewById(R.id.duracao);
		TextView nomeDaMusica = (TextView) linhaItem.findViewById(R.id.musica);
		TextView numeroFaixa = (TextView) linhaItem.findViewById(R.id.numero_faixa);
		
		nomeDaMusica.setText(musica.getNome());
		numeroFaixa.setText(musica.getNumeroFaixa().toString());
		duracao.setText(musica.getDuracaoFormatada());
		
		return linhaItem;
	}
	
	@Override
	public View getGroupView(int arg0, boolean arg1, View arg2, ViewGroup arg3) {
		View linhaSubItem = activity.getLayoutInflater().inflate(R.layout.albuns_item, null);
		
		Album album = (Album) getGroup(arg0);
		
		TextView nomeDoArtista = (TextView) linhaSubItem.findViewById(R.id.artista);
		TextView nomeDoAlbum = (TextView) linhaSubItem.findViewById(R.id.album);
		
		nomeDoAlbum.setText(album.getNome());
		nomeDoArtista.setText(album.getArtista().getNome());
		
		return linhaSubItem;
	}
	
	
	@Override
	public Object getChild(int arg0, int arg1) {
		return albuns.get(arg0).getMusicas().get(arg1);
	}

	@Override
	public long getChildId(int arg0, int arg1) {
		return albuns.get(arg0).getMusicas().get(arg1).hashCode();
	}

	@Override
	public int getChildrenCount(int arg0) {
		return albuns.get(arg0).getMusicas().size();
	}

	@Override
	public Object getGroup(int arg0) {
		return albuns.get(arg0);
	}

	@Override
	public int getGroupCount() {
		return albuns.size();
	}

	@Override
	public long getGroupId(int arg0) {
		return albuns.get(arg0).hashCode();
	}

	@Override
	public boolean hasStableIds() {
		return false;
	}

	@Override
	public boolean isChildSelectable(int arg0, int arg1) {
		return false;
	}

}
