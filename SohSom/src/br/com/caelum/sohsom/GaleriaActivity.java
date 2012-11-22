package br.com.caelum.sohsom;

import java.util.Arrays;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import br.com.caelum.sohsom.menu.MenuPrincipal;

import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.slidingmenu.lib.SlidingMenu;
import com.slidingmenu.lib.app.SlidingActivity;

public class GaleriaActivity extends SlidingActivity{
	
	private MenuPrincipal menuPrincipal;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.galeria);
		setBehindContentView(R.layout.categorias);
		
		ListView listaDeCategorias = (ListView) findViewById(R.id.todas_categorias);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.categorias_item, 
				Arrays.asList("Alternativo", "Classico", "Sertanejo", "Rock", "Pop"));
		listaDeCategorias.setAdapter(adapter);
		
		listaDeCategorias.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				getSlidingMenu().showAbove();
			}
		});
		
		
		SlidingMenu sm = getSlidingMenu();
		sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);
		sm.setShadowWidthRes(R.dimen.shadow_width);
		sm.setShadowDrawable(R.drawable.shadow);
		sm.setBehindScrollScale(0.25f);
		sm.setFadeDegree(0.25f);
		sm.setAboveOffset(20);
		
		sm.setSlidingEnabled(true);
		sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
//		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		
		menuPrincipal = new MenuPrincipal(this);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menuPrincipal.onCreateOptionsMenu(menu);
		
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		menuPrincipal.onOptionsItemSelected(item);
		
		return super.onOptionsItemSelected(item);
	}
}
