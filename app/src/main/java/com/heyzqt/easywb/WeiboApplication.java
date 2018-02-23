package com.heyzqt.easywb;

import android.app.Application;
import android.content.Context;

import com.heyzqt.easywb.data.local.db.WeiboDBHelper;

/**
 * Created by heyzqt on 2018/2/23.
 */

public class WeiboApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		Context context = getApplicationContext();
		WeiboDBHelper dbHelper = WeiboDBHelper.getInstance(context);
		dbHelper.getWritableDatabase();
	}
}
