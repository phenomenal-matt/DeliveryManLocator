package com.test.delivery.food.fooddelivery;

/**
 * Created by Matthew Akhaze on 30-Oct-17.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton =  (Button) findViewById(R.id.btn_login);
        LinearLayout view = (LinearLayout) findViewById(R.id.linear_layout);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();

    }
}
