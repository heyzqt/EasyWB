package com.heyzqt.easywb.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by heyzqt on 2018/2/26.
 */

public abstract class BaseAbsListAdapter<T> extends BaseAdapter {

	protected Context context;

	private List<T> mDatas;

	private int itemLayoutId;

	protected BaseAbsListAdapter(Context context, List<T> datas, int itemLayoutId) {
		this.context = context;
		this.mDatas = datas;
		this.itemLayoutId = itemLayoutId;
	}

	@Override
	public int getCount() {
		return mDatas != null ? mDatas.size() : 0;
	}

	@Override
	public Object getItem(int position) {
		return mDatas.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		BaseViewHolder holder = BaseViewHolder.getInstance(position, convertView, parent,
				itemLayoutId);
		convert(holder, (T) getItem(position));
		return holder.getConvertView();
	}

	public abstract void convert(BaseViewHolder holder, T item);
}
