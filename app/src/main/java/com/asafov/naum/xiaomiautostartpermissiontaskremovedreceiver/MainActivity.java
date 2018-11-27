package com.asafov.naum.xiaomiautostartpermissiontaskremovedreceiver;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Enable AutoStart in xiaomi
        if (Build.BRAND.equalsIgnoreCase("xiaomi")) {
            Log.i("MYTAG", "xiaomi");
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity"));
            startActivity(intent);
        }

        Intent service = new Intent(this,MyService.class);
        startService(service);
    }
}