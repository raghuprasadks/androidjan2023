package com.reva.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity_MediaPlayer_8 extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_media_player8);
        mediaPlayer=null;
    }

    public void music(View view) {

        switch(view.getId()){

            case R.id.btnplay:
                if(mediaPlayer==null) {
                    mediaPlayer=mediaPlayer.create(this,R.raw.mediaplayeraudio);
                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        stopMusic();
                    }
                });
                mediaPlayer.start();
                break;
            case R.id.btnpause:
                if(mediaPlayer != null){
                    mediaPlayer.pause();
                }
                break;
            case R.id.btnstop:
                if(mediaPlayer!=null){
                    mediaPlayer.stop();
                    stopMusic();
                }

        }
    }

    private void stopMusic(){
        mediaPlayer.release();
        mediaPlayer=null;
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopMusic();
    }
}