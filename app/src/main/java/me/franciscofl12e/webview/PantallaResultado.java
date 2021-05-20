package me.franciscofl12e.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class PantallaResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_resultado);

        Intent intent = getIntent();
        String url = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        WebView wv1 = findViewById(R.id.webview);

        WebSettings webSettings = wv1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wv1.setWebViewClient(new WebViewClient());

        wv1.loadUrl(url);

    }
}