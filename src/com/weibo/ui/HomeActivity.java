package com.weibo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class HomeActivity  extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		
		TabHost tabHost=(TabHost)findViewById(R.id.home_tabHost);  
		tabHost.setup();  
		  
		TabSpec spec1=tabHost.newTabSpec("Tab 1");  
		spec1.setContent(R.id.tab1);  
		spec1.setIndicator("Tab 1");  
		  
		TabSpec spec2=tabHost.newTabSpec("Tab 2");  
		spec2.setIndicator("Tab 2");  
		spec2.setContent(R.id.tab2);  
		  
		TabSpec spec3=tabHost.newTabSpec("Tab 3");  
		spec3.setIndicator("Tab 3");  
		spec3.setContent(R.id.tab3);  
		  
		tabHost.addTab(spec1);  
		tabHost.addTab(spec2);  
		tabHost.addTab(spec3);  

	}

	
}
