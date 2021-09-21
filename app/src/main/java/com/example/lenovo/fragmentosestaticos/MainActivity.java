package com.example.lenovo.fragmentosestaticos;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity implements Fragmento3.OnFragmentInteractionListener, Fragmento1.OnFragmentInteractionListener, Fragmento2.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
