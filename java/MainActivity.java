package com.example.your.package;

import android.support.v7.app.AppCompatActivity;
import com.example.your.package.push_notification.GcmRegistrationAsyncTask;
/**
 * Created on 2015/11/24
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Register GCM
        new GcmRegistrationAsyncTask(this).execute();
    }
}
