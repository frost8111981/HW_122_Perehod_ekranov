package com.example.myapplication122beskonechniyperehodmegduekranami;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
    final String TAG = "MyLog";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                                                                                                    // Log.d(TAG, "onCreate загрузка экрана");
        TextView txtVie = findViewById(R.id.txtVie);
        String rand = String.valueOf(new Random().nextInt(10));
        String text = "http://myfile.org/" + rand;
                                                                                                    // Log.d(TAG, text);
        txtVie.setText(text);
        forwardClick();
        backClick();
    }

    private void forwardClick() {
        Button butFor = findViewById(R.id.buttonFor);
                                                                                                    // Log.d(TAG, "Метод кнопки");
        butFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                                                                                                    // Log.d(TAG, " нажата кнопка");
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void backClick() {
        Button butBac = findViewById(R.id.buttonBac);
        butBac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}