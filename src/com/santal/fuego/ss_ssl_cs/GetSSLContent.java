package com.santal.fuego.ss_ssl_cs;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import android.os.AsyncTask;

public class GetSSLContent extends AsyncTask <String, Void, InputStream> {
	private Exception exception;

	@Override
	protected InputStream doInBackground(String... urls) {
		URL url;
		URLConnection urlConnection;
		InputStream in;
		
		try {
			url = new URL(urls[0]);
			
			urlConnection = url.openConnection();
			in = urlConnection.getInputStream();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
	        e.printStackTrace();
			this.exception = e;
			return null;
		} //catch
		
		return in; 
	}
	
	@Override
	protected void onPostExecute(InputStream is) {
        // TODO: check this.exception 
        // TODO: do something with the feed
    }
}