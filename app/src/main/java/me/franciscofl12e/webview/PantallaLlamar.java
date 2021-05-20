package me.franciscofl12e.webview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaLlamar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamar);
    }

    // Utilizaremos este metodo para recoger el tlf y llamar
    public void onClickCall (View view){
        EditText phone = findViewById(R.id.editMatter);
        String num =  phone.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", num, null));
        startActivity(intent);
    }

    public void Contacts (View view){
        Intent intentContactos = new Intent(Intent.ACTION_DIAL);
        startActivity(intentContactos);
    }

}