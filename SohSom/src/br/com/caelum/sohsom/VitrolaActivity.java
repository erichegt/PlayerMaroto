package br.com.caelum.sohsom;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import br.com.caelum.sohsom.menu.MenuPrincipal;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class VitrolaActivity extends SherlockActivity{
	private ImageView disco;
	private boolean tocando;
	private Animation animation;
	private MenuPrincipal menuPrincipal;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vitrola);
		
		disco = (ImageView) findViewById(R.id.disco);
		
		animation = AnimationUtils.loadAnimation(this, R.anim.anim_botao_central);
	
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
		if (tocando) {
			disco.clearAnimation();
			
			tocando = false;
		} else {
			disco.startAnimation(animation);
			
			this.tocando = true;
		}
		
	}
}
