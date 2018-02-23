package com.heyzqt.easywb.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.heyzqt.easywb.WeiboApplication;

/**
 * Created by heyzqt on 2018/2/23.
 */

public abstract class BaseActivity extends Activity {

	protected WeiboApplication mApplication;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mApplication = (WeiboApplication) getApplication();
	}
}
