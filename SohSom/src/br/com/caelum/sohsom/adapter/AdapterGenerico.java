package br.com.caelum.sohsom.adapter;

import java.util.List;

import android.widget.BaseAdapter;

public abstract class AdapterGenerico<T> extends BaseAdapter {
	private List<T> lista;

	public AdapterGenerico(List<T> lista) {
		this.lista = lista;
	}

	@Override
	public int getCount() {
		return lista.size();
	}

	@Override
	public Object getItem(int arg0) {
		return lista.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return lista.get(arg0).hashCode();
	}

}
