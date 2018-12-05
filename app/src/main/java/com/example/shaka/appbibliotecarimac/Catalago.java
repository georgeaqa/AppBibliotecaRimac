package com.example.shaka.appbibliotecarimac;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shaka.appbibliotecarimac.Adaptador.AdaptadorLibros;
import com.example.shaka.appbibliotecarimac.Entidades.Libros;
import com.example.shaka.appbibliotecarimac.SQLiteConexion.SQLiteHelper;
import com.example.shaka.appbibliotecarimac.Utilidades.Utilidades;
import com.special.ResideMenu.ResideMenu;

import java.util.ArrayList;

public class Catalago extends Fragment {


    ArrayList<Libros> ListaLibros;
    RecyclerView rvlibros;

    SQLiteHelper conn;

    private View parentView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        parentView = inflater.inflate(R.layout.activity_catalago, container, false);


        conn=new SQLiteHelper(parentView.getContext());

        ListaLibros = new ArrayList<>();

        rvlibros=(RecyclerView)parentView.findViewById(R.id.rvCatalogoLibros);
        rvlibros.setLayoutManager(new GridLayoutManager(parentView.getContext(),2));

        ConsultarLibros();

        AdaptadorLibros adapter=new AdaptadorLibros(ListaLibros);
        rvlibros.setAdapter(adapter);
        return parentView;
    }

    private void ConsultarLibros() {

        SQLiteDatabase db=conn.getReadableDatabase();
        Libros libro=null;

        Cursor cursos=db.rawQuery("select * from "+ Utilidades.TABLA_LIBROS,null);

        while (cursos.moveToNext()){
            libro=new Libros();
            libro.setCAMPO_ID_LIBRO(cursos.getString(0));
            libro.setCAMPO_NOMBRE_LIBRO(cursos.getString(1));
            libro.setCAMPO_IMAGEN_LIBRO(cursos.getInt(2));
            ListaLibros.add(libro);
        }
        db.close();
    }
}
