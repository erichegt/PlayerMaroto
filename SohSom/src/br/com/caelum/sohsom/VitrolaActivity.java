package br.com.caelum.sohsom;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;

public class VitrolaActivity extends SherlockActivity{
	private ImageView disco;
	private boolean tocando;
	private Animation animation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vitrola);
		
		disco = (ImageView) findViewById(R.id.disco);
		
		animation = AnimationUtils.loadAnimation(this, R.anim.anim_botao_central);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.menu_principal, menu);
		return super.onCreateOptionsMenu(menu);
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
