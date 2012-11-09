package br.com.caelum.sohsom.listeners;

import android.app.Activity;
import android.content.Intent;
import br.com.caelum.sohsom.VitrolaActivity;

public class IrParaVitrola{
	private Activity activity;

	public IrParaVitrola(Activity activity) {
		this.activity = activity;
	}

	public void fazerTransicao() {
		activity.startActivity(new Intent(activity, VitrolaActivity.class));
	}
}
