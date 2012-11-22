package br.com.caelum.sohsom.menu;

import android.content.Intent;
import android.util.Log;
import br.com.caelum.sohsom.AlbunsActivity;
import br.com.caelum.sohsom.GaleriaActivity;
import br.com.caelum.sohsom.MusicasActivity;
import br.com.caelum.sohsom.R;
import br.com.caelum.sohsom.listeners.IrParaVitrola;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class MenuPrincipal {
	
	private SherlockActivity activity;

	public MenuPrincipal(SherlockActivity activity) {
		this.activity = activity;
	}
	public void onCreateOptionsMenu(Menu menu) {
		activity.getSupportMenuInflater().inflate(R.menu.menu_principal, menu);
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_shuffle:
			new IrParaVitrola(activity).fazerTransicao();
			activity.finish();
			break;
			
		case R.id.menu_albuns:
			activity.startActivity(new Intent(activity, AlbunsActivity.class));
			activity.finish();
			break;
			
		case R.id.menu_musicas:
			activity.startActivity(new Intent(activity, MusicasActivity.class));
			activity.finish();
			break;
			
		case R.id.menu_galeria:
			activity.startActivity(new Intent(activity, GaleriaActivity.class));
			activity.finish();
			Log.i("sdfgsdfgdfg", "sdfgdsgdfsgsdsdg");
			break;
		}
		
		return false;
	}

}
