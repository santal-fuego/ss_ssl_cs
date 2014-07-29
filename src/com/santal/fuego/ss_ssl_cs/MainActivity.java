package com.santal.fuego.ss_ssl_cs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.net.MalformedURLException;

public class MainActivity extends Activity {

	Button btnConnect;
	EditText editURL;
	TextView txtUsrMsg;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		btnConnect = (Button) findViewById(R.id.button1);
		editURL = (EditText) findViewById(R.id.editText1);
		txtUsrMsg = (TextView) findViewById(R.id.textView2);
		
		OnClickListener oclBtnConnect = new OnClickListener() {
			@Override
			public void onClick(View v) {
				txtUsrMsg.setText("You enter " + editURL.getText());
				
				new GetSSLContent().execute(editURL.getText().toString());

				//System.out.println("Error: " + e.getMessage());
		        //e.printStackTrace();

			}
		};
		
		btnConnect.setOnClickListener(oclBtnConnect);
	}
}