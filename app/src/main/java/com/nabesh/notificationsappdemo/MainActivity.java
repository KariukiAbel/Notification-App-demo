package com.nabesh.notificationsappdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    NotificationCompat.Builder notification;
    public static final int uniqueid = 4630;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        notification = new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);
        btn.setOnClickListener();
    }
}
