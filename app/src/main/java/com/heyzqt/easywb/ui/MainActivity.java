package com.heyzqt.easywb.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.heyzqt.easywb.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	private MainFragment mMainFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mMainFragment = MainFragment.newInstance();
		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.add(R.id.frame_content, mMainFragment);
		transaction.commit();

		initView();
	}

	private void initView() {
		TextView settingTextView = findViewById(R.id.textview_drawer_settings);
		TextView aboutTextView = findViewById(R.id.textview_drawer_about);
		TextView opinionTextView = findViewById(R.id.textview_drawer_opinion);
		TextView rewardTextView = findViewById(R.id.textview_drawer_reward);
		settingTextView.setOnClickListener(this);
		aboutTextView.setOnClickListener(this);
		opinionTextView.setOnClickListener(this);
		rewardTextView.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		switch (id) {
			case R.id.textview_drawer_settings:
				Toast.makeText(this, "settings", Toast.LENGTH_SHORT).show();
				break;
			case R.id.textview_drawer_about:
				Toast.makeText(this, "about", Toast.LENGTH_SHORT).show();
				break;
			case R.id.textview_drawer_opinion:
				Toast.makeText(this, "opinion", Toast.LENGTH_SHORT).show();
				break;
			case R.id.textview_drawer_reward:
				Toast.makeText(this, "reward", Toast.LENGTH_SHORT).show();
				break;
		}
	}
}
