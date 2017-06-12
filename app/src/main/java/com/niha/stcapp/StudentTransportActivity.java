package com.niha.stcapp;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StudentTransportActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_transport);

		getSupportActionBar().hide();
/*
		ActionBar actionBar = getSupportActionBar();
		actionBar.setTitle("Login to Continue");
		ColorDrawable cd = new ColorDrawable(0xff282726);
		actionBar.setBackgroundDrawable(cd);
*/
	}
}
