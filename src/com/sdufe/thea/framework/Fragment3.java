package com.sdufe.thea.framework;

import com.k.app.Log;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author lili.guo
 *
 * 2014-10-22
 */
public class Fragment3 extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.e("onCreateView");
		View view=inflater.inflate(R.layout.fragment_item3, null);
		return view;
	}
}
