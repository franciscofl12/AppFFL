package me.franciscofl12e.webview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaMaps<GoogleMap> extends AppCompatActivity {

    // implements OnMapReadyCallback
    private MapView mapView;
    private GoogleMap gmap;
    private static final String MAP_VIEW_BUNDLE_KEY = "MapViewBundleKey";
    private Bundle mapBiewBundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
    }

    public void onClickGoogleMaps (View view){
        EditText coordX = findViewById(R.id.editMatter);
        EditText coordY = findViewById(R.id.coordY);
        String x = coordX.getText().toString();
        String y = coordY.getText().toString();
        String url = "https://www.google.com/maps/@"+x+","+y;
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

}