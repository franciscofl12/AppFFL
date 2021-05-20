package me.franciscofl12e.webview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }

    public void onClickMail (View view){

        EditText mail = findViewById(R.id.editMail);
        EditText matter = findViewById(R.id.editMatter);
        EditText msg = findViewById(R.id.editMsg);

        String sendMail = mail.getText().toString();
        String sendMatter = matter.getText().toString();
        String sendMsg = msg.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { sendMail });
        intent.putExtra(Intent.EXTRA_SUBJECT, sendMatter);
        intent.putExtra(Intent.EXTRA_TEXT, sendMsg);

        intent.setType("message/rfc822");
        startActivity( Intent.createChooser(intent,"Enviar:"));
    }
}