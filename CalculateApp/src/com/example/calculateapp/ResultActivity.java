package com.example.calculateapp;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.showresult);
		TextView tv_name = (TextView) findViewById(R.id.tv_name);
		TextView tv_result = (TextView) findViewById(R.id.tv_result);
		Intent intent = getIntent();
		String name = intent.getStringExtra("name");
		Boolean gander = intent.getBooleanExtra("gander", true);
		tv_name.setText(name+":性别"+(gander ? "男":"女"));
		Random random = new Random();
		int nextInt = random.nextInt(100);
		tv_result.setText(nextInt);
		
	}

	
}
