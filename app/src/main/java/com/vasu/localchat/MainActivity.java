package com.vasu.localchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vasu.localchat.activity.ClientActivity;
import com.vasu.localchat.activity.ServerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Create a server
        Button clientButton = findViewById(R.id.serverButton);
        clientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ServerActivity.class);
                startActivity(intent);
                animate();
            }
        });

//        Join a server
        Button serverButton = findViewById(R.id.clientButton);
        serverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ClientActivity.class);
                startActivity(intent);
                animate();
            }
        });
    }

//    Sliding in/out animation

    void animate(){
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }
}