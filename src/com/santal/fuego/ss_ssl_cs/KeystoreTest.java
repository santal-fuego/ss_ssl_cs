package com.santal.fuego.ss_ssl_cs;

import android.app.Activity;
import android.security.KeyChain;
import android.security.KeyChainAliasCallback;
import android.view.View;
import android.view.View.OnClickListener;
import android.util.Log;

public class KeystoreTest extends Activity implements OnClickListener, KeyChainAliasCallback {
	private static final String TAG = "ss_ssl_cs";
	
	@Override
	public void onClick(View v) {
		KeyChain.choosePrivateKeyAlias(this, this, new String[] { "RSA" }, null, null, -1, null);
	}
	
	@Override
	public void alias(final String alias) {
		Log.d(TAG, "Thread: " + Thread.currentThread().getName());
		Log.d(TAG, "selected alias: " + alias);
	}
}
