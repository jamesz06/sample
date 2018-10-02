package com.example.jamesz.wired10;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    EditText username, password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login_screen);

        username = findViewById(R.id.etusername);
        password = findViewById(R.id.etpassword);




    }


    public void loginbtn(View view) {

        String uname,pword;
        uname = username.getText().toString();
        pword = password.getText().toString();

//        NAA KOY GIEDIT ANI PARA SAMPLE KUNOHAY NI MISSION! KALAGOTA JUD ANI! HAHAHAHAHAHHAHA
        Toast.makeText(this, "MISSION USERNAME: " + username.getText().toString() + " " + "Password: " + password.getText().toString(), Toast.LENGTH_SHORT).show();

         if(uname.equals("D123456") && pword.equals("helloworld")){

          Intent intent = new Intent(LoginScreen.this,MainActivity.class);
          startActivity(intent);

         }
        else{
             Toast.makeText(this, "failed", Toast.LENGTH_SHORT).show();
         }

    }
}
