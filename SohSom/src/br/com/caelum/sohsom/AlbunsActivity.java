package br.com.caelum.sohsom;

import java.util.List;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.ExpandableListView;
import android.widget.Toast;
import br.com.caelum.sohsom.adapter.AlbunsAdapter;
import br.com.caelum.sohsom.database.Repositorio;
import br.com.caelum.sohsom.listeners.IrParaPlayer;
import br.com.caelum.sohsom.menu.MenuPrincipal;
import br.com.caelum.sohsom.modelo.Album;

import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class AlbunsActivity extends SherlockActivity implements TabListener {

	private MenuPrincipal menuPrincipal;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.albuns);

		ExpandableListView listagemAlbuns = (ExpandableListView) findViewById(R.id.listagem_albuns);

		List<Album> albuns = new Repositorio().listaTodosAlbuns();

		AlbunsAdapter adapter = new AlbunsAdapter(albuns, this);

		listagemAlbuns.setAdapter(adapter);
		listagemAlbuns.setOnChildClickListener(new IrParaPlayer(this));
		
		menuPrincipal = new MenuPrincipal(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menuPrincipal.onCreateOptionsMenu(menu);
		
		return super.onCreateOptionsMenu(menu);
	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		return menuPrincipal.onOptionsItemSelected(item);
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
