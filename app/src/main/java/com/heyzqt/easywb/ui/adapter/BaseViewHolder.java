package com.heyzqt.easywb.ui.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by heyzqt on 2018/2/27.
 */

public class BaseViewHolder {

	private Context context;

	private int position;

	private View convertView;

	private ViewGroup parent;

	private int layoutId;

	private SparseArray<View> mViews;

	private BaseViewHolder(Context context, int position, View convertView, ViewGroup parent, int
			layoutId) {
		this.context = context;
		this.position = position;
		this.convertView = convertView;
		this.parent = parent;
		this.layoutId = layoutId;
		this.mViews = new SparseArray<>();
		convertView.setTag(this);
	}

	public static BaseViewHolder getInstance(int position, View convertView,
			ViewGroup parent, int layoutId) {
		if (convertView == null) {
			convertView = LayoutInflater.from(parent.getContext()).inflate(layoutId, parent,
					false);
			return new BaseViewHolder(parent.getContext(), position, convertView, parent,
					layoutId);
		}
		return (BaseViewHolder) convertView.getTag();
	}

	public <T extends View> T getView(int viewId) {
		View child = mViews.get(viewId);
		if (child == null) {
			child = convertView.findViewById(viewId);
			mViews.put(viewId, child);
		}
		return (T) mViews.get(viewId);
	}

	public View getConvertView() {
		return convertView;
	}
}
