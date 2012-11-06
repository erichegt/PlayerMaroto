package br.com.caelum.sohsom;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;

public class MusicasActivity extends SherlockActivity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musicas);
        
    }

	@Override
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
		return super.onCreateOptionsMenu(menu);
	}
    
}
