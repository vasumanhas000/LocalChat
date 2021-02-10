package com.vasu.localchat.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.vasu.localchat.R;
import com.vasu.localchat.fragment.ClientChatFragment;
import com.vasu.localchat.fragment.ClientInputFragment;

public class ClientActivity extends AppCompatActivity {

    ClientInputFragment clientInputFragment;
    ClientChatFragment clientChatFragment;
    public String name="hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        initialize();
        getSupportFragmentManager().beginTransaction().replace(R.id.acFragment,clientInputFragment).commit();

    }

    void initialize(){
        clientInputFragment = new ClientInputFragment();
    }
}