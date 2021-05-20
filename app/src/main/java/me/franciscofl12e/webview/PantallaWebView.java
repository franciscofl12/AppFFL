package me.franciscofl12e.webview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaWebView extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.MainActivity.MESSAGE";
   //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        Button buttonresultado = findViewById(R.id.buttonEmail);

    }

    public void onClickBtn(View view){
        TextView url = findViewById(R.id.editMatter);
        EditText ed1 = (EditText) findViewById(R.id.editMatter);
        String uri = url.getText().toString();
        Intent i = new Intent(this, PantallaResultado.class);
        i.putExtra(EXTRA_MESSAGE, uri);
        startActivity(i);
    }

}