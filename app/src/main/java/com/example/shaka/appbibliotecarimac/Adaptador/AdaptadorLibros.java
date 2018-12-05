package com.example.shaka.appbibliotecarimac.Adaptador;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shaka.appbibliotecarimac.R;
import com.example.shaka.appbibliotecarimac.Entidades.Libros;

import java.util.ArrayList;

public class AdaptadorLibros extends RecyclerView.Adapter<AdaptadorLibros.ViewHolderLibros> {

    ArrayList<Libros> ListaLibros;

    public AdaptadorLibros(ArrayList<Libros> listaLibros) {
        ListaLibros = listaLibros;
    }

    @NonNull
    @Override
    public ViewHolderLibros onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listalibro,null,false);
        return new ViewHolderLibros(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorLibros.ViewHolderLibros viewHolderLibros, int i) {
        viewHolderLibros.imagen.setImageResource(ListaLibros.get(i).getCAMPO_IMAGEN_LIBRO());
    }

    @Override
    public int getItemCount() {
        return ListaLibros.size();
    }

    public class ViewHolderLibros extends RecyclerView.ViewHolder {

        TextView id,nombre;
        ImageView imagen;
        public ViewHolderLibros(@NonNull View itemView) {
            super(itemView);
            imagen=(ImageView)itemView.findViewById(R.id.imagenlibro);
        }
    }
}
