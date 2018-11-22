package com.example.dayvison.projetoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class telalogin extends AppCompatActivity {

    Intent intenttelaprincipal;
    Button jbtnlogar;
    EditText jedtlogin, jedtsenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telalogin);
        iniciar();
        botao();

    }

    private void iniciar (){
        jbtnlogar = (Button)findViewById(R.id.btnlogar);
        jedtlogin = (EditText)findViewById(R.id.edtlogin);
        jedtsenha = (EditText)findViewById(R.id.edtsenha);

    }
    private void botao (){
        jbtnlogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intenttelaprincipal = new Intent(getApplicationContext(),telaprincipal.class);
                startActivity(intenttelaprincipal);
            }
        });
    }
}
