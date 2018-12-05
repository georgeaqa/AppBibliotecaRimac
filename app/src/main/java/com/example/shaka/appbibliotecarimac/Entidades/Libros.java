package com.example.shaka.appbibliotecarimac.Entidades;

public class Libros {

    private String  CAMPO_ID_LIBRO;
    private String CAMPO_NOMBRE_LIBRO;
    private int CAMPO_IMAGEN_LIBRO;


    public Libros(){}

    public Libros(String CAMPO_ID_LIBRO, String CAMPO_NOMBRE_LIBRO, int CAMPO_IMAGEN_LIBRO) {
        this.CAMPO_ID_LIBRO = CAMPO_ID_LIBRO;
        this.CAMPO_NOMBRE_LIBRO = CAMPO_NOMBRE_LIBRO;
        this.CAMPO_IMAGEN_LIBRO = CAMPO_IMAGEN_LIBRO;
    }

    public String getCAMPO_ID_LIBRO() {
        return CAMPO_ID_LIBRO;
    }

    public void setCAMPO_ID_LIBRO(String CAMPO_ID_LIBRO) {
        this.CAMPO_ID_LIBRO = CAMPO_ID_LIBRO;
    }

    public String getCAMPO_NOMBRE_LIBRO() {
        return CAMPO_NOMBRE_LIBRO;
    }

    public void setCAMPO_NOMBRE_LIBRO(String CAMPO_NOMBRE_LIBRO) {
        this.CAMPO_NOMBRE_LIBRO = CAMPO_NOMBRE_LIBRO;
    }

    public int getCAMPO_IMAGEN_LIBRO() {
        return CAMPO_IMAGEN_LIBRO;
    }

    public void setCAMPO_IMAGEN_LIBRO(int CAMPO_IMAGEN_LIBRO) {
        this.CAMPO_IMAGEN_LIBRO = CAMPO_IMAGEN_LIBRO;
    }
}
