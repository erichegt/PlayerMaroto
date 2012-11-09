package br.com.caelum.sohsom.listeners;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import br.com.caelum.sohsom.PlayerActivity;

public class IrParaPlayer implements OnItemClickListener, OnChildClickListener{
	private Activity activity;

	public IrParaPlayer(Activity activity) {
		this.activity = activity;
	}
	
	private void fazerTransicao() {
		activity.startActivity(new Intent(activity, PlayerActivity.class));
	}
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		fazerTransicao();
	}

	@Override
	public boolean onChildClick(ExpandableListView arg0, View arg1, int arg2,
			int arg3, long arg4) {
		
		fazerTransicao();
		
		return false;
	}
}
