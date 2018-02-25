package com.heyzqt.easywb.data.model;

/**
 * Created by heyzqt on 2018/2/25.
 *
 * Every blogger includes following information.
 */

public class Blogger {

	/**
	 * Primary key autoincrement.
	 */
	public int _ID;

	/**
	 * blogger ID
	 */
	public String bloggerID;

	/**
	 * blogger's name
	 */
	public String name;

	/**
	 * blogger's sex
	 */
	public String sex;

	/**
	 * blogger's home url
	 */
	public String homeUrl;

	/**
	 * blogger's avatar url
	 */
	public String avatarUrl;

	/**
	 * Is blogger's go through the verified.
	 */
	public int isVerified;

	/**
	 * blogger's following count
	 */
	public int following;

	/**
	 * blogger's follower count
	 */
	public int follower;
}
