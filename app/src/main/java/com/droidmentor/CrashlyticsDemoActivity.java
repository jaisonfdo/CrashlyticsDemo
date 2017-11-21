package com.droidmentor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.crashlytics.android.Crashlytics;

public class CrashlyticsDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crashlytics_demo);

        if (BuildConfig.enableCrashlytics)
        {
            Crashlytics.setUserIdentifier("12345");
            Crashlytics.setUserEmail("jaisonfdo@gmail.com");
            Crashlytics.setUserName("Jaison");
        }


        try {
            String value = null;
            int x = Integer.parseInt(value);

        } catch (Exception e) {
            e.printStackTrace();
            Log.d("demo", "onCreate: updated");

            if (BuildConfig.enableCrashlytics) {
                Crashlytics.log("Test from sample activity");
                Crashlytics.logException(e);
            }
        }
    }
}
