package com.example.shaka.appbibliotecarimac;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.special.ResideMenu.ResideMenu;

public class Usuario extends Fragment {

    private View parentView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        parentView = inflater.inflate(R.layout.activity_usuario, container, false);
        return parentView;
    }
}
