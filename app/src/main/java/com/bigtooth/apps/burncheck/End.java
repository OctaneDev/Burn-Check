package com.bigtooth.apps.burncheck;

import android.content.*;
import android.app.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.view.*;

public class End extends AppCompatActivity
{
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end);
    }
	public void end(View view) {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
}
