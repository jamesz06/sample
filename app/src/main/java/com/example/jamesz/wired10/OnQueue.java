package com.example.jamesz.wired10;


import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;
import android.widget.Toolbar;

public class OnQueue extends Fragment {


    public OnQueue (){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toolbar toolbar = null;


        View fragmentview = inflater.inflate(R.layout.activity_on_queue, container, false);
//
//            getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//            toolbar.setPadding(0,getStatusBarHeight(),0,0);



        return fragmentview;
    }

//
//    private int getStatusBarHeight() {
//        int height;
//
//        Resources myResources = getResources();
//        int idStatusBarHeight = myResources.getIdentifier(
//                "status_bar_height", "dimen", "android");
//
//        if (idStatusBarHeight > 0) {
//            height = getResources().getDimensionPixelSize(idStatusBarHeight);
//            Toast.makeText(getContext(),
//                    "Status Bar Height = " + height,
//                    Toast.LENGTH_LONG).show();
//        }else{
//            height = 0;
//            Toast.makeText(getContext(),
//                    "Resources NOT found",
//                    Toast.LENGTH_LONG).show();
//        }
//
//        return height;
//    }



}
