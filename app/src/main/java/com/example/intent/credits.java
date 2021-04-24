package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class credits extends AppCompatActivity {
    double result;
    Intent gi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        TextView text = findViewById(R.id.textView2);
        gi = getIntent();
        result = gi.getDoubleExtra("result", 1);
        text.setText("the last result is " + result + "        huge thanks to albert levi, etay sabag, ilai shimoni, paz malul, and yuval navon, who have all helped me, the one and only harel navon,with this task");
    }

    public void goback(View view) {
        Intent si = new Intent(this,MainActivity.class);
        si.putExtra("result",result);
        startActivity(si);

    }
}