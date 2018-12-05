package com.example.shaka.appbibliotecarimac.Controlador;

import com.example.shaka.appbibliotecarimac.Entidades.Libros;
import com.example.shaka.appbibliotecarimac.R;

import java.security.PublicKey;
import java.util.ArrayList;

public class LibroADM {

    public static ArrayList<Libros> listaLibros =new ArrayList<>();


    public LibroADM(){
        Libros L1=new Libros();
        L1.setCAMPO_ID_LIBRO("1");
        L1.setCAMPO_NOMBRE_LIBRO("Tradiciones Peruanas");
        L1.setCAMPO_IMAGEN_LIBRO(R.drawable.tradicionesperuanas);
        Libros L2=new Libros();
        L2.setCAMPO_ID_LIBRO("2");
        L2.setCAMPO_NOMBRE_LIBRO("La Ciudad y Los Perros");
        L2.setCAMPO_IMAGEN_LIBRO(R.drawable.laciudadylosperros);
        Libros L3=new Libros();
        L3.setCAMPO_ID_LIBRO("3");
        L3.setCAMPO_NOMBRE_LIBRO("Caballero Carmelo");
        L3.setCAMPO_IMAGEN_LIBRO(R.drawable.caballerocarmelo);
        Libros L4=new Libros();
        L4.setCAMPO_ID_LIBRO("4");
        L4.setCAMPO_NOMBRE_LIBRO("Harry Potter y La Piedra Filosofal");
        L4.setCAMPO_IMAGEN_LIBRO(R.drawable.hp_piedrafilosal);
        Libros L5=new Libros();
        L5.setCAMPO_ID_LIBRO("5");
        L5.setCAMPO_NOMBRE_LIBRO("Harry Potter y La Camara Secreta");
        L5.setCAMPO_IMAGEN_LIBRO(R.drawable.hp_ylacamarasecreta);
        Libros L6=new Libros();
        listaLibros.add(L1);
        listaLibros.add(L2);
        listaLibros.add(L3);
        listaLibros.add(L4);
        listaLibros.add(L5);

    }

    public ArrayList<Libros> LLamarListaLibros(){
        return  listaLibros;
    }


}
