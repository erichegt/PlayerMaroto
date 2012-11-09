package br.com.caelum.sohsom.listeners;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import br.com.caelum.sohsom.PlayerActivity;

public class IrParaPlayer implements OnItemClickListener{
	private Activity activity;

	public IrParaPlayer(Activity activity) {
		this.activity = activity;
	}
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		fazerTransicao();
	}

	private void fazerTransicao() {
		activity.startActivity(new Intent(activity, PlayerActivity.class));
	}
}
