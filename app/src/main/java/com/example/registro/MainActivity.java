package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListeners();
    }

    private void initListeners(){

        EditText nombre = findViewById(R.id.etv_first_name);
        EditText apellido = findViewById(R.id.etv_last_name);
        EditText email = findViewById(R.id.etv_email);
        EditText pass = findViewById(R.id.etv_password);

        Button guardar = findViewById(R.id.btn_save_data);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nombre.getText().toString().isEmpty() ||
                   apellido.getText().toString().isEmpty() ||
                   email.getText().toString().isEmpty() ||
                   pass.getText().toString().isEmpty()){

                    Toast.makeText(getBaseContext(), "Favor llenar todos los campos", Toast.LENGTH_SHORT).show();
                }else if(!email.getText().toString().contains("@") ||!email.getText().toString().contains(".")) {
                    Toast.makeText(getBaseContext(), "Ingrese Email válido", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getBaseContext(), "Helouuuu "+ nombre.getText().toString() + " " +apellido.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

}