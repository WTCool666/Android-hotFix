package com.example.hotfix;

import java.io.File;
import java.io.IOException;
import com.example.util.SecondActivity;
import com.example.util.Test;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void inject(View view) {
		
		String sourceFile = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator
				+ "classes2.dex";

		
		String targetFile = this.getDir("odex", Context.MODE_PRIVATE).getAbsolutePath() + File.separator
				+ "classes2.dex";

		try {
			
			FileUtils.copyFile(sourceFile, targetFile);
			
			
			FixDexUtils.loadFixDex(this);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void test(View view) {
		Test.show(this);
	}
	
	public void btn_two(View view){
		Intent intent=new Intent(this,SecondActivity.class);
		startActivity(intent);
	}

}
