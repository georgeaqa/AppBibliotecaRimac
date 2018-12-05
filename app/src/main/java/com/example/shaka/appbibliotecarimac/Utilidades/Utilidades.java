package com.example.shaka.appbibliotecarimac.Utilidades;

public class Utilidades {
    //LIBROS
    public static final String TABLA_LIBROS="LIBROS";
    public static final String CAMPO_ID_LIBRO="IdLibro";
    public static final String CAMPO_NOMBRE_LIBRO="NombreLibro";
    public static final String CAMPO_IMAGEN_LIBRO="ImagenLibro";

    public static final String CREAR_TABLA_LIBROS="CREATE TABLE "+ TABLA_LIBROS+ "("+CAMPO_ID_LIBRO+" INTEGER PRIMARY KEY,"
    + CAMPO_NOMBRE_LIBRO+" TEXT,"+CAMPO_IMAGEN_LIBRO+" INTEGER)";


}
