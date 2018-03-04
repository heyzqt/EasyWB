package com.heyzqt.easywb.util;

import android.content.Context;
import android.util.Log;

import com.heyzqt.easywb.data.model.Blogger;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by heyzqt on 2018/3/4.
 */

public class FileUtil {

	private static final String TAG = "FileUtil";

	public static Blogger getJSONFile(Context context, String filename) {

		try {
			InputStream in = context.getResources().getAssets().open(filename);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(in));
			String read;
			while ((read = reader.readLine()) != null) {
				JSONObject jsonObject = new JSONObject(read);
				JSONObject data = jsonObject.getJSONObject("data");
				Blogger blogger = new Blogger();
				blogger.name = (String) data.getJSONObject("userInfo").get("screen_name");
				blogger.following = Integer.parseInt(data.getJSONObject("userInfo").getString
						("follow_count"));
				blogger.follower = Integer.parseInt(data.getJSONObject("userInfo").getString
						("followers_count"));
				System.out.println(blogger.toString());
				return blogger;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			Log.e(TAG, "getJSONFile: file not founded");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}
}
