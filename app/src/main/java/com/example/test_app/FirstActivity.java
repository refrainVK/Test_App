package com.example.test_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends Activity {
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        // method 1
        textView = findViewById(R.id.text1);
        // method 2
        textView.setText(getIntent().getStringExtra("txt"));
        // method 3
        Bundle data = getIntent().getExtras();
        String val = data.getString("key1");
        textView.setText(val);

        //
        button = findViewById(R.id.closeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.putExtra("result", "result from Su");
                setResult(0, intent);

                finish();
            }
        });
    }
}
