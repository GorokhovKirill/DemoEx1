package com.example.demoex;

import  android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;

public class StartScreens extends AppCompatActivity {
    private GoogleMap mMap;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startscreen);

        SupportMapFragment mapFragment=(SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync((OnMapReadyCallback) this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap=googleMap;
            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            mMap.getUiSettings().setZoomControlsEnabled(true);
            mMap.getUiSettings().setZoomGesturesEnabled(true);
            mMap.getUiSettings().setCompassEnabled(true);

            mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
                @Override
                public void onMapClick(LatLng point) {
                    MarkerOptions marker = new MarkerOptions()
                    .position(new LatLng(point.latitude,
                            point.longitude))
                    .title("Координаты:"+point.latitude+" "+point.latitude);
                    mMap.addMarker(marker);
                    System.out.println(point.latitude + "---" + point.longitude);
                }
            });
    }
    public  void ChangeType(View view){
        if(mMap.getMapType()==GoogleMap.MAP_TYPE_NORMAL){
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        }
        else if(mMap.getMapType()==GoogleMap.MAP_TYPE_SATELLITE){
            mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        }
        else if(mMap.getMapType()==GoogleMap.MAP_TYPE_HYBRID) {
            mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        }
        else if(mMap.getMapType()==GoogleMap.MAP_TYPE_TERRAIN) {
            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        }
    }

    public  void onClickMenu(View v) {
        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);
        Intent o = new Intent(StartScreens.this, menus.class);
        startActivity(o);
        finish();

    }
}

