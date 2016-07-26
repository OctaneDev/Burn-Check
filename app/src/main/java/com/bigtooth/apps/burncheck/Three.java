package com.bigtooth.apps.burncheck;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.Intent;

public class Three extends Activity
{
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);

		getWindow().getDecorView().setSystemUiVisibility(
			View.SYSTEM_UI_FLAG_LAYOUT_STABLE
			| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
			| View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
			| View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
			| View.SYSTEM_UI_FLAG_FULLSCREEN
			| View.SYSTEM_UI_FLAG_IMMERSIVE);
    }
	public void next(View view) {
		Intent intent = new Intent(this, Four.class);
		startActivity(intent);
	}
}
