package com.santal.fuego.ss_ssl_cs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

//import android.view.Menu;
//import android.view.MenuItem;

public class MainActivity extends Activity {

	Button btnConnect;
	EditText editURL;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Button btnConnect = (Button) findViewById(R.id.button1);
		EditText editURL = (EditText) findViewById(R.id.editText1);
		
		OnClickListener oclBtnConnect = new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		};
	}
}
