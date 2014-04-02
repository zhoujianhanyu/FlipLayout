/*
 * Created by Storm Zhang, Apr 1, 2014.
 */

package com.storm.fliplayout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.storm.fliplayout.R.id;
import com.storm.fliplayout.R.layout;

public class MainActivity extends Activity {
	private ListView mListView;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(layout.activity_main);
		
		mListView = (ListView) findViewById(id.listView);
		mListView.setAdapter(new FlipAdapter(MainActivity.this));
	}
}
