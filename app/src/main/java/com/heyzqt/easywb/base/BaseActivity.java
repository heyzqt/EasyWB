package com.heyzqt.easywb.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.heyzqt.easywb.WeiboApplication;

/**
 * Created by heyzqt on 2018/2/23.
 */

public abstract class BaseActivity extends AppCompatActivity {

	protected WeiboApplication mApplication;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mApplication = (WeiboApplication) getApplication();
	}
}
