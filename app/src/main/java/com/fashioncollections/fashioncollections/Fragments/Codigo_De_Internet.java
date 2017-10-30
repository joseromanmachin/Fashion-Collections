package com.fashioncollections.fashioncollections.Fragments;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.fashioncollections.fashioncollections.Database.Conexion;
import com.fashioncollections.fashioncollections.Database.Consultas;
import com.fashioncollections.fashioncollections.R;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Codigo_De_Internet extends Fragment {

    String[] ubicaciondesensores = {"ALPHA 20", "ALPHA 20 AVERHOL", "ALPHA 30","ALPHA 20 TIER 3","TORNADO","TORNADO OVERHOL","TORNADO S2","CST 8.20","COGUARO 4","MIXKRET 4"};
    ListView lista ;
    View vista;
    Button buscar;
    Conexion con;
    SQLiteDatabase db;
    String consulta;
    EditText codigo;
    Cursor registros;
    ArrayList<String> listas;
    ArrayAdapter adaptador;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_codigo__de__internet, container, false);

        codigo = vista.findViewById(R.id.txtcodigo);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getContext(), R.layout.listas, ubicaciondesensores);
        lista = vista.findViewById(R.id.lista);
        lista.setAdapter(adaptador);
        buscar = vista.findViewById(R.id.btnbuscar);



        con = new Conexion(getContext(), "db_productos", null, 1);
        db = con.getWritableDatabase();




           consulta = Consultas.COLOR+"'52702'"+";";
          codigo.setText(consulta);
        registros = db.rawQuery(consulta, null);
        Toast.makeText(getContext(), "todo bien", Toast.LENGTH_SHORT).show();
       if (registros.moveToFirst()) {
            do {
                listas.add(registros.getString(0));
            } while (registros.moveToNext());
        }
  /*       adaptador = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, listas);
        lista.setAdapter(adaptador);
        db.close();

*/
        buscar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {




                try {
                    Conexion conexion = new Conexion(getContext(),"db_productos",null,1);
                    conexion.getWritableDatabase();
                    Toast.makeText(getContext(), "base de datos creada", Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(getContext(), ""+e, Toast.LENGTH_SHORT).show();
                }
            }
        });

        return vista;
    }


}
