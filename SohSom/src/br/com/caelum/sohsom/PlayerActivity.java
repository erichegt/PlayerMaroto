package br.com.caelum.sohsom;

import android.os.Bundle;
import android.view.View;
import br.com.caelum.sohsom.menu.MenuPrincipal;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class PlayerActivity extends SherlockActivity {
	private MenuPrincipal menuPrincipal;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.player);
		
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
	
	public void play(View view) {
		
	}
}
