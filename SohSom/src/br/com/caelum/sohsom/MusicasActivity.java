package br.com.caelum.sohsom;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MusicasActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musicas);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.musicas, menu);
        return true;
    }
}
