package com.example.countrysearch;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    /*　作成者　長倉　*/

    private GoogleMap mMap;
    /* 国名、緯度、経度の変数 */
    String idoo,keidoo,namee;
    double val1, val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        // 受け取った値を代入
        Intent intent = getIntent();
        namee = intent.getStringExtra("name");
        idoo = intent.getStringExtra("ido");
        keidoo = intent.getStringExtra("keido");

        // 受け取った値をDouble型に変換
        val1 = Double.parseDouble(idoo);
        val2 = Double.parseDouble(keidoo);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(val1, val2);
        mMap.addMarker(new MarkerOptions().position(sydney).title(namee));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,5));
        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        UiSettings settings = mMap.getUiSettings();
        // ズームイン・アウトボタンの有効化
        settings.setZoomControlsEnabled(true);
    }
}
