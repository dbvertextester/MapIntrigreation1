package com.dbvertex.mapintegration

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dbvertex.mapintrigreation.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map1) as SupportMapFragment?
        mapFragment?.getMapAsync(this)
    }

     /* fun onMapReady(googleMap: GoogleMap?) {
        val myPos = LatLng(37.7749, -122.4194) // Replace with your actual latitude and longitude
        googleMap?.addMarker(MarkerOptions().position(myPos).title("My Location"))
        googleMap?.moveCamera(CameraUpdateFactory.newLatLng(myPos))
    }*/

    override fun onMapReady(p0: GoogleMap) {
        val myPos = LatLng(37.7749, -122.4194) // Replace with your actual latitude and longitude
        p0?.addMarker(MarkerOptions().position(myPos).title("My Location"))
        p0?.moveCamera(CameraUpdateFactory.newLatLng(myPos))


    }
}
