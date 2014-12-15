package com.weibo.ui;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.RadioGroup.OnCheckedChangeListener;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
	public View msgTitle;//信息头部按钮
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		msgTitle=this.findViewById(R.id.msg_title);
		
		//完成各子页集成
		final TabHost th=this.getTabHost();
		th.addTab(th.newTabSpec("TAB_HOME")
		   .setIndicator("TAB_HOME")
		   .setContent(new Intent(this,HomeActivity.class))
		  );
		th.addTab(th.newTabSpec("TAB_MSG")
				   .setIndicator("TAB_MSG")
				   .setContent(new Intent(this,MSGActivity.class))
				  );
//		th.addTab(th.newTabSpec("TAB_USER_INFO")
//				   .setIndicator("TAB_USER_INFO")
//				   .setContent(new Intent(this,UserInfoActivity.class))
//				  );
//		th.addTab(th.newTabSpec("TAB_SEARCH")
//				   .setIndicator("TAB_SEARCH")
//				   .setContent(new Intent(this,SearchActivity.class))
//				  );
//		th.addTab(th.newTabSpec("TAB_MORE")
//				   .setIndicator("TAB_MORE")
//				   .setContent(new Intent(this,MoreActivity.class))
//				  );
		
		
		RadioGroup mainGroup=(RadioGroup)this.findViewById(R.id.main_radio);
		mainGroup.setOnCheckedChangeListener(new OnCheckedChangeListener()
		{
 	       @Override
			public void onCheckedChanged(RadioGroup arg0, int rid) {
				// TODO Auto-generated method stub
			 Log.d("radiou group", "you selected="+rid);
			 switch(rid)
			 {
			 case R.id.radio_button0://首页
				 th.setCurrentTabByTag("TAB_HOME");
				 msgTitle.setVisibility(View.GONE);
				 break;
			 case R.id.radio_button1://信息
				 th.setCurrentTabByTag("TAB_MSG");
				 msgTitle.setVisibility(View.VISIBLE);
				 break;
			 case R.id.radio_button2://资料
				 th.setCurrentTabByTag("TAB_USER_INFO");
//				 msgTitle.setVisibility(View.GONE);
				 break;
			 case R.id.radio_button3://搜索
				 th.setCurrentTabByTag("TAB_SEARCH");
//				 msgTitle.setVisibility(View.GONE);
				 break;
			 case R.id.radio_button4://更多	
//				 msgTitle.setVisibility(View.GONE);
				 th.setCurrentTabByTag("TAB_MORE");
				 
			 }
			}
			
		}
		);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
