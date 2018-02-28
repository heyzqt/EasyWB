package com.heyzqt.easywb.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by heyzqt on 2018/2/28.
 */

public class ExpandListView extends ListView {

	public ExpandListView(Context context) {
		super(context);
	}

	public ExpandListView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public ExpandListView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}
}
