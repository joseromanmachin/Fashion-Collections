package com.fashioncollections.fashioncollections.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.fashioncollections.fashioncollections.R;


public class Codigo_De_Internet extends Fragment {

    String[] ubicaciondesensores = {"ALPHA 20", "ALPHA 20 AVERHOL", "ALPHA 30","ALPHA 20 TIER 3","TORNADO","TORNADO OVERHOL","TORNADO S2","CST 8.20","COGUARO 4","MIXKRET 4"};
    ListView lista ;
    View vista;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_codigo__de__internet, container, false);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getContext(), R.layout.listas, ubicaciondesensores);
        lista = vista.findViewById(R.id.lista);
        lista.setAdapter(adaptador);
        return vista;
    }


}
