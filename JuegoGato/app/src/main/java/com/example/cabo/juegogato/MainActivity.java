package com.example.cabo.juegogato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  public Button fila1izq, fila1medio,fila1der,fila2izq,fila2med,fila2der,fila3izq,fila3med,fila3der;
  public int bandera=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    public void botonfila1izq(){
        if(bandera == 0){
            fila1izq.setText("O");
            bandera = 1;
        }
        if(bandera == 1){
            fila1izq.setText("X");
            bandera = 0;
        }
    }

    public void botonfila1med(){
        if(bandera == 0){
            fila1medio.setText("O");
            bandera = 1;
        }
        if(bandera == 1){
            fila1medio.setText("X");
            bandera = 0;
        }
    }

    public void botonfila1der(){
        if(bandera == 0){
            fila1der.setText("O");
            bandera = 1;
        }
        if(bandera == 1){
            fila1der.setText("X");
            bandera = 0;
        }
    }

    public void botonfi2izq(){
        if(bandera == 0){
            fila2izq.setText("O");
            bandera = 1;
        }
        if(bandera == 1){
            fila2izq.setText("X");
            bandera = 0;
        }
    }

    public void botonfila2med(){
        if(bandera == 0){
            fila2med.setText("O");
            bandera = 1;
        }
        if(bandera == 1){
            fila2med.setText("X");
            bandera = 0;
        }
    }

    public void botonfila2der(){
        if(bandera == 0){
            fila2der.setText("O");
            bandera = 1;
        }
        if(bandera == 1){
            fila2der.setText("X");
            bandera = 0;
        }
    }

    public void botonfila3izq(){
        if(bandera == 0){
            fila3izq.setText("O");
            bandera = 1;
        }
        if(bandera == 1){
            fila3izq.setText("X");
            bandera = 0;
        }
    }

    public void botonfila3med(){
        if(bandera == 0){
            fila3med.setText("O");
            bandera = 1;
        }
        if(bandera == 1){
            fila3med.setText("X");
            bandera = 0;
        }
    }

    public void botonfila3der(){
        if(bandera == 0){
            fila3der.setText("O");
            bandera = 1;
        }
        if(bandera == 1){
            fila3der.setText("X");
            bandera = 0;
        }
    }

}
