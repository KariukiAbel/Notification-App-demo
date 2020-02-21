package com.nabesh.notificationsappdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Building the notification
                notification.setContentTitle("New notification");
                notification.setContentText("Simple notification demo");
                notification.setTicker("This is ticker");
                notification.setWhen(System.currentTimeMillis());
                Log.d("notification","Success");

                Intent intent = new Intent(this,MainActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
                notification.setContentIntent(pendingIntent);

                //Builds notification and issues it
                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notificationManager.notify(uniqueid, notification.build());


            }
        });
    }
}
