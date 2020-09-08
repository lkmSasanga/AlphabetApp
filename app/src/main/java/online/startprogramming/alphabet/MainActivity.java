package online.startprogramming.alphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

//import static online.startprogramming.alphabet.R.raw.music;

//import android.media.AudioManager;

import android.media.MediaPlayer;
import android.view.View;

public class MainActivity extends AppCompatActivity {


//    MediaPlayer mediaPlayer= MediaPlayer.create(MainActivity.this, music);
//    mediaPlayer.start();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void nextActivity(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
