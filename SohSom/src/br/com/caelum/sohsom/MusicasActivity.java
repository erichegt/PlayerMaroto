package br.com.caelum.sohsom;

import java.util.List;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.ListView;
import android.widget.Toast;
import br.com.caelum.sohsom.adapter.MusicaAdapter;
import br.com.caelum.sohsom.database.Repositorio;
import br.com.caelum.sohsom.listeners.IrParaPlayer;
import br.com.caelum.sohsom.listeners.IrParaVitrola;
import br.com.caelum.sohsom.modelo.Musica;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class MusicasActivity extends SherlockActivity implements TabListener{
	private ActionBar actionBar;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musicas);
        
        ListView listagemMusicas = (ListView) findViewById(R.id.listagem_musicas);
        
        List<Musica> musicas = new Repositorio().listaTodasMusicas();
        MusicaAdapter adapter = new MusicaAdapter(musicas, this);
        
        listagemMusicas.setOnItemClickListener(new IrParaPlayer(this));
        
        listagemMusicas.setAdapter(adapter);
        
        actionBar = getSupportActionBar();
        
        Tab todas = actionBar.newTab();
        todas.setTabListener(this);
        todas.setText("Todas");
        
        Tab favoritos = actionBar.newTab();
        favoritos.setTabListener(this);
        favoritos.setText("Favoritas");
        
        actionBar.addTab(favoritos);
        actionBar.addTab(todas, true);
        
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
    }

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.menu_principal, menu);
		
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_shuffle:
			new IrParaVitrola(this).fazerTransicao();
			break;

		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
	}


	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		Toast.makeText(this, "Aba clicada!", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}
}
