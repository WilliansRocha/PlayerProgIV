package br.com.progiv.playermusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play(View v) {
        if(player == null) {
            player = MediaPlayer.create( context:this, R.raw.song);
            player.setOnCompletionListener(new MediaPlayer,OnCompletionListener()){
                @Override
                public void onCompletion(MediaPlayer mp){
                    stopPlayer();s
                }
            }
        }
        player.start();
    }
    public void pause(View v) {
        if(player != null){
            player.pause();
        }
    }
    public void stop(View v) {
        stopPlayer().
    }
    private void stopPlayer(){
        if(player!=null){
            player.release();
            player = null;
            Toast.makeText(context:this, text "MediaPlayer released", Toast.LENGTH_SHORT.SHOW)();
        }
    }
    @Override
    protected void onStop(){
        super.onStop();
        stopPlayer();
    }
}