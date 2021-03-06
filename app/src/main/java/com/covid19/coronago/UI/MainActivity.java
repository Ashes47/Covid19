package com.covid19.coronago.UI;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;
import com.covid19.coronago.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView lottieAnimationView = findViewById(R.id.anim);
        long time = lottieAnimationView.getDuration();

        if(!haveNetworkConnection()){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Please connect to the internet and restart the application.")
                    .setCancelable(false)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(Intent.ACTION_MAIN);
                            intent.addCategory(Intent.CATEGORY_HOME);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);
                        }
                    });
            AlertDialog alert = builder.create();
            alert.show();
        }
        if(haveNetworkConnection()) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(MainActivity.this, HomeActivity.class),
                            ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());

                }
            }, 4330);
        }
    }

    @Override
    public void onBackPressed() {
        return;
    }

    public boolean haveNetworkConnection() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        // FIX THIS
        if (cm.getActiveNetwork() != null) {
            // connected to the internet
            return true;
        } else {
            // not connected to the internet
            return false;
        }
    }
}
