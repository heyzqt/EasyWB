package com.heyzqt.easywb.data.local.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

/**
 * Created by heyzqt on 2018/2/23.
 */

public class WeiboDBHelper extends SQLiteOpenHelper {

	private static final int DATABASE_VERSION = 1;

	private static final String DATABASE_NAME = "weibo.db";

	private interface Tables {
		public static final String Blogger = "blogger";
		public static final String Weibo = "weibo";
		public static final String Send = "send";
	}

	private interface BloggerColumns {
		public static final String _ID = BaseColumns._ID;
		public static final String BLOGGERID = "bloggerId";
		public static final String NAME = "name";
		public static final String SEX = "sex";
		public static final String HOMEURL = "homeurl";
		public static final String AVATARURL = "avatarurl";
		public static final String ISVERIFIED = "isverified";
		public static final String FOLLOWING = "following";
		public static final String FOLLOWER = "follower";
	}

	private interface WeiboColumns {
		public static final String _ID = BaseColumns._ID;
		public static final String BLOGGERID = "bloggerId";
		public static final String WEIBOADDRESS = "weiboaddress";
		public static final String SENDINGTIME = "sendingtime";
		public static final String SENDINGCONTENT = "sendingcontent";
		public static final String LIKES = "likes";
		public static final String COMMENTS = "comments";
		public static final String FORWARDS = "forwards";
	}

	private interface SendColumns {
		public static final String _ID = BaseColumns._ID;
		public static final String BLOGGERID = "bloggerId";
		public static final String WEIBOID = "weiboId";
	}

	private static WeiboDBHelper singleInstance = null;

	private WeiboDBHelper(Context context, String name,
			SQLiteDatabase.CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	public static synchronized WeiboDBHelper getInstance(Context context) {
		if (singleInstance == null) {
			Log.i("heyzqt", "getInstance: ");
			singleInstance = new WeiboDBHelper(context, DATABASE_NAME, null, DATABASE_VERSION);
		}
		return singleInstance;
	}

	@Override
	public void onCreate(SQLiteDatabase db) {

		//create table weibo
		db.execSQL("CREATE TABLE " + Tables.Weibo + "(" + BloggerColumns._ID +
				" INTEGER PRIMARY KEY AUTOINCREMENT," +
				WeiboColumns.BLOGGERID + " TEXT," +
				WeiboColumns.WEIBOADDRESS + " TEXT," +
				WeiboColumns.SENDINGTIME + " TEXT," +
				WeiboColumns.SENDINGCONTENT + " TEXT," +
				WeiboColumns.LIKES + " INTEGER," +
				WeiboColumns.COMMENTS + " INTEGER," +
				WeiboColumns.FORWARDS + " INTEGER);");

		//create table blogger
		db.execSQL("CREATE TABLE " + Tables.Blogger + "(" + BloggerColumns._ID +
				" INTEGER PRIMARY KEY AUTOINCREMENT," +
				BloggerColumns.BLOGGERID + " TEXT," +
				BloggerColumns.NAME + " TEXT," +
				BloggerColumns.SEX + " TEXT," +
				BloggerColumns.HOMEURL + " TEXT," +
				BloggerColumns.AVATARURL + " TEXT," +
				BloggerColumns.ISVERIFIED + " INTEGER," +
				BloggerColumns.FOLLOWER + " INTEGER," +
				BloggerColumns.FOLLOWING + " INTEGER);");

		//creat4e table send
		db.execSQL("CREATE TABLE " + Tables.Send + "(" + BloggerColumns._ID +
				" INTEGER PRIMARY KEY AUTOINCREMENT," +
				SendColumns.BLOGGERID + " TEXT," +
				SendColumns.WEIBOID + " TEXT);");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}
}
