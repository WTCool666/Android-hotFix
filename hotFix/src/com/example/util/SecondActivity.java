package com.example.util;

import com.example.hotfix.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_layout);
	}
	
	public void btn_thrid(View view){
		Intent intent=new Intent(this,ThridActivity.class);
		startActivity(intent);
	}
}
