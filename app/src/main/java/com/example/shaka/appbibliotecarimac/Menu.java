package com.example.shaka.appbibliotecarimac;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shaka.appbibliotecarimac.Controlador.LibroADM;
import com.example.shaka.appbibliotecarimac.Entidades.Libros;
import com.example.shaka.appbibliotecarimac.SQLiteConexion.SQLiteHelper;
import com.example.shaka.appbibliotecarimac.Utilidades.Utilidades;
import com.special.ResideMenu.ResideMenu;
import com.special.ResideMenu.ResideMenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity implements View.OnClickListener{

    private ResideMenu resideMenu;
    private Context mContext;
    TextView titulo;
    private ResideMenuItem itemUsuario;
    private ResideMenuItem itemCatalago;
    private ResideMenuItem itemPrestamo;

    ArrayList<Libros> Llibros;
    LibroADM libroADM =new LibroADM();
    SQLiteHelper conn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reside_menu);
        titulo=findViewById(R.id.txtTitulo);
        mContext = this;
        setUpMenu();
        if( savedInstanceState == null )
            changeFragment(new Usuario());
            titulo.setText("Perfil Usuario");


        PreLlenarLibros();

    }

    public  void  PreLlenarLibros(){

        conn =new SQLiteHelper(this);
        SQLiteDatabase db=conn.getWritableDatabase();
        Llibros=new ArrayList<>();
        Llibros=libroADM.LLamarListaLibros();
        ContentValues values;
        Long idResultante=null;
        try {
            for (int i=0;i<Llibros.size();i++){
                Libros libro =Llibros.get(i);
                values = new ContentValues();
                values.put(Utilidades.CAMPO_ID_LIBRO,libro.getCAMPO_ID_LIBRO());
                values.put(Utilidades.CAMPO_NOMBRE_LIBRO,libro.getCAMPO_NOMBRE_LIBRO());
                values.put(Utilidades.CAMPO_IMAGEN_LIBRO,libro.getCAMPO_IMAGEN_LIBRO());
                System.out.println(libro.getCAMPO_ID_LIBRO() + libro.getCAMPO_NOMBRE_LIBRO()+libro.getCAMPO_IMAGEN_LIBRO() );
                idResultante = db.insert(Utilidades.TABLA_LIBROS,Utilidades.CAMPO_ID_LIBRO,values);
            }

        }catch (Exception e){

        }
        System.out.println("cantidad de registros en la bd "+idResultante);
        db.close();
    }



    private void setUpMenu() {
        resideMenu = new ResideMenu(this);

        resideMenu.setBackground(R.drawable.azul_fondo);
        resideMenu.attachToActivity(this);

        resideMenu.setScaleValue(0.6f);

        itemUsuario = new ResideMenuItem(this,R.drawable.user,"Usuario");
        itemUsuario.setOnClickListener(this);
        itemCatalago = new ResideMenuItem(this,R.drawable.catalogue,"Catalago");
        itemCatalago.setOnClickListener(this);
        itemPrestamo = new ResideMenuItem(this,R.drawable.booking,"Prestamo");
        itemPrestamo.setOnClickListener(this);

        resideMenu.addMenuItem(itemUsuario,ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemCatalago,ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemPrestamo,ResideMenu.DIRECTION_LEFT);

        resideMenu.setSwipeDirectionDisable(ResideMenu.DIRECTION_RIGHT);


        findViewById(R.id.title_bar_left_menu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resideMenu.openMenu(ResideMenu.DIRECTION_LEFT);
            }
        });

    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return resideMenu.dispatchTouchEvent(ev);
    }

    @Override
    public void onClick(View v) {
        if (v == itemUsuario){
            changeFragment(new Usuario());
            titulo.setText("Perfil Usuario");

        }else if (v == itemCatalago){
            changeFragment(new Catalago());
            titulo.setText("Catalogo");
        }

        resideMenu.closeMenu();
    }

    private void changeFragment(Fragment targetFragment){
        resideMenu.clearIgnoredViewList();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_fragment, targetFragment, "fragment")
                .setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                .commit();
    }
    public ResideMenu getResideMenu(){
        return resideMenu;
    }
}
