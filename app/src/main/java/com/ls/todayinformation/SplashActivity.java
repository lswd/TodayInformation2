package com.ls.todayinformation;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

public class SplashActivity extends AppCompatActivity {
    VideoView mVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.e("MainActivity", "onCreate: 测试2");

        mVideoView = (VideoView) findViewById(R.id.vv_play);
        mVideoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+ File.separator+R.raw.splash));
        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });
        mVideoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.start();
            }
        });

    }
}
