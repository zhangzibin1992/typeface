package com.example.ziti;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView tv = (TextView) findViewById(R.id.tv);
		
		AssetManager mgr=getAssets();//得到AssetManager
		Typeface tf=Typeface.createFromAsset(mgr, "fonts/ziti.ttf");//根据路径得到Typeface
		tv.setTypeface(tf);//设置字体 
		
		
		
	}

	

}
