package com.example.jamesz.wired10;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class forHR extends Fragment {

  public forHR(){

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View fragmentview = inflater.inflate(R.layout.activity_for_hr, container, false);

        return fragmentview;

    }

}
