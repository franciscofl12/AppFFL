package me.franciscofl12e.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.MainActivity.MESSAGE";
   //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonresultado = findViewById(R.id.buttonEmail);
        Button buttonresultado2 = findViewById(R.id.buttonllamar);
        Button buttonresultado3 = findViewById(R.id.buttonmaps);
        Button buttonresultado4 = findViewById(R.id.buttonemail);


    }

    public void onClickWebView(View view){
        Intent i = new Intent(this, PantallaWebView.class);
        startActivity(i);
    }

    public void onClickLlamar(View view){
        Intent i = new Intent(this, PantallaLlamar.class);
        startActivity(i);
    }

    public void onClickEmail(View view){
        Intent i = new Intent(this, PantallaEmail.class);
        startActivity(i);
    }

    public void onClickMaps(View view){
        Intent i = new Intent(this, PantallaMaps.class);
        startActivity(i);
    }

}