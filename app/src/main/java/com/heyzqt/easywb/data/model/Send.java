package com.heyzqt.easywb.data.model;

/**
 * Created by heyzqt on 2018/2/25.
 *
 * Send is a relationship about blogger and weibo.
 */

public class Send {

	/**
	 * Primary key autoincrement.
	 */
	public int _ID;

	/**
	 * blogger's ID
	 */
	public String bloggerID;

	/**
	 * weibo's ID
	 */
	public String weiboID;
}
