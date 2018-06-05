package com.example.calculateapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends Activity implements OnClickListener{ 

	private EditText et_name;
	private RadioGroup rg;
	private Button submit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et_name = (EditText) findViewById(R.id.et_name);
		rg = (RadioGroup) findViewById(R.id.rg_gender);
		submit = (Button) findViewById(R.id.submit);
		submit.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String name = et_name.getText().toString();
		int checkedRadioButtonId = rg.getCheckedRadioButtonId();
		Boolean ismale = true;
		switch (checkedRadioButtonId) {
		case R.id.rb_male:
			ismale = true;
			break;
		case R.id.rb_female:
			ismale = false;
			break;
		}
		Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
		intent.putExtra("name", name);
		intent.putExtra("gander", ismale);
		startActivity(intent);
	}

	
}
