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
		
		AssetManager mgr=getAssets();//�õ�AssetManager
		Typeface tf=Typeface.createFromAsset(mgr, "fonts/ziti.ttf");//����·���õ�Typeface
		tv.setTypeface(tf);//�������� 
		
		
		
	}

	

}
