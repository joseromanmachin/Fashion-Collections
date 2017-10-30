package com.fashioncollections.fashioncollections.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by jose on 30/10/17.
 */

public class Conexion extends SQLiteOpenHelper {

    public Conexion(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Consultas.CREAR_TABLA_PRODUCTOS);
        Log.i("Creando","nueva");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(Consultas.EXISTE_PRODUCTOS);
        Log.i("Data","Ya Existe");
     onCreate(sqLiteDatabase);

    }
}
