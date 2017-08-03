package com.example.hotfix;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * android/support/multidex/MultiDex.class
android/support/multidex/MultiDexApplication.class
android/support/multidex/MultiDexExtractor.class
android/support/multidex/MultiDexExtractor$1.class
android/support/multidex/MultiDex$V4.class
android/support/multidex/MultiDex$V14.class
android/support/multidex/MultiDex$V19.class
android/support/multidex/ZipUtil.class
android/support/multidex/ZipUtil$CentralDirectory.class
 * */
public class MyApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
	}
	
	@Override
	protected void attachBaseContext(Context base) {
		// TODO Auto-generated method stub
		super.attachBaseContext(base);
		MultiDex.install(base);
		FixDexUtils.loadFixDex(base);
	}
	
}
