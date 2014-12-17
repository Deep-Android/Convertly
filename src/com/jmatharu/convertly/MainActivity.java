package com.jmatharu.convertly;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView img1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		declaring();
		img1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityIntent = new Intent(MainActivity.this,
						Angle.class);
				MainActivity.this.startActivity(activityIntent);
			}
		});
	}

	private void declaring() {
		// TODO Auto-generated method stub
		img1 = (ImageView) findViewById(R.id.imageView1);
	}

}
