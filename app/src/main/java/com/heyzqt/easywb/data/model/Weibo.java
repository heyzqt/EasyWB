package com.heyzqt.easywb.data.model;

/**
 * Created by heyzqt on 2018/2/25.
 *
 * Every weibo includes following information.
 */

public class Weibo {

	/**
	 * Primary key autoincrement.
	 */
	public int _ID;

	/**
	 * Record the blogger ID which this weibo was sent.
	 */
	public String bloggerID;

	/**
	 * Record the weibo's address.
	 */
	public String weiboAddress;

	/**
	 * Record the weibo's sent time.
	 */
	public String sendingTime;

	/**
	 * Record the weibo's sent content.
	 */
	public String sendingContent;

	/**
	 * Record the weibo likes count.
	 */
	public int likes;

	/**
	 * Record the weibo comments count.
	 */
	public int comments;

	/**
	 * Record the weibo forwards count.
	 */
	public int forwards;
}
