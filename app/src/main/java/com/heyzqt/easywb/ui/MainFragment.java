package com.heyzqt.easywb.ui;


import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.heyzqt.easywb.R;
import com.heyzqt.easywb.data.model.Temp;
import com.heyzqt.easywb.ui.adapter.BaseAbsListAdapter;
import com.heyzqt.easywb.ui.adapter.BaseViewHolder;
import com.heyzqt.easywb.widget.ExpandListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heyzqt on 2018/2/26.
 */

public class MainFragment extends Fragment implements AdapterView.OnItemClickListener {

	public static MainFragment mMainFragment = null;

	private ExpandListView mListView;

	private Context mContext;

	public static MainFragment newInstance() {
		if (mMainFragment == null) {
			mMainFragment = new MainFragment();
		}
		return mMainFragment;
	}

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
			@Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_main, container, false);
		mContext = view.getContext();
		initView(view);
		return view;
	}

	private void initView(View view) {
		mListView = view.findViewById(R.id.listview_main_content);
		mListView.setFocusable(false);
		mListView.setFocusableInTouchMode(false);

		List<Temp> datas = new ArrayList();
		Temp temp = new Temp();
		temp.avatar = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round);
		temp.name = "蛙鹅子";
		temp.time = "1-31";
		temp.content = "所以说你在将文本转化为轮廓是要格外谨慎。其实无需矢量化，文本也可以直接应用渐变效果。"
				+ "但如果你执意要将文本转化为轮廓，那记得现将每个字母都单独放在一个图层当中。";
		datas.add(temp);
		temp = new Temp();
		temp.avatar = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round);
		temp.name = "蛙鹅子";
		temp.time = "2-1";
		temp.content = "Sketch 的性能可以轻松的支持相当复杂的设计，但如果你创作出了一个很大的文件，"
				+ "你可能会想知道有哪些因素影响着 sketch 的性能。";
		datas.add(temp);
		temp = new Temp();
		temp.avatar = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round);
		temp.name = "蛙鹅子";
		temp.time = "2-3";
		temp.content = "自动参考线在Sketch的默认设置中是被打"
				+ "开的，你可以同时按住 control 键和 L 键"
				+ "来关闭它。当你在调节一个图层的大小或"
				+ "者移动一个图层的位置时，Sketch会自动。";
		datas.add(temp);
		temp = new Temp();
		temp.avatar = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round);
		temp.name = "蛙鹅子";
		temp.time = "2-5";
		temp.content = "自动参考线在Sketch的默认设置中是被打"
				+ "开的，你可以同时按住 control 键和 L 键"
				+ "来关闭它。当你在调节一个图层的大小或"
				+ "者移动一个图层的位置时，Sketch会自动。";
		datas.add(temp);
		mListView.setAdapter(new BaseAbsListAdapter<Temp>(view.getContext(), datas,
				R.layout.item_main_listview_content) {
			@Override
			public void convert(BaseViewHolder holder, Temp item) {
				ImageView head = holder.getView(R.id.user_head_img);
				TextView name = holder.getView(R.id.user_name);
				TextView time = holder.getView(R.id.send_time);
				TextView content = holder.getView(R.id.send_content);
				head.setImageBitmap(item.avatar);
				name.setText(item.name);
				time.setText(item.time);
				content.setText(item.content);
			}
		});

		mListView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Toast.makeText(mContext, "item = " + position, Toast.LENGTH_SHORT).show();
	}
}
