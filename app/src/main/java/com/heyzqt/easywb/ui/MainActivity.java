package com.heyzqt.easywb.ui;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.heyzqt.easywb.R;

public class MainActivity extends AppCompatActivity {

	private MainFragment mMainFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mMainFragment = MainFragment.newInstance();
		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.add(R.id.frame_content, mMainFragment);
		transaction.commit();
	}
}
