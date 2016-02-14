package com.zhy.sample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhy.autolayout.attr.MarginLeftAttr;
import com.zhy.autolayout.utils.AutoLayoutHelper;
import com.zhy.sample.R;

public class RegisterFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		ViewGroup view = ((ViewGroup) inflater.inflate(R.layout.fragment_register, container, false));

		// 动态修改布局属性
		View viewById = view.findViewById(R.id.img_mima);
		AutoLayoutHelper.AutoLayoutParams params = (AutoLayoutHelper.AutoLayoutParams) viewById.getLayoutParams();
		params.getAutoLayoutInfo().addAttr(new MarginLeftAttr(50, 0, 0));
		viewById.setLayoutParams((ViewGroup.LayoutParams)params);
		return view;
	}

}
