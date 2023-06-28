package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.registro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
 private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initListeners();
    }

    private void initListeners(){
        binding.btnSaveData.setOnClickListener(view -> {
            if(binding.etvFirstName.getText().toString().isEmpty() ||
               binding.etvLastName.getText().toString().isEmpty() ||
               binding.etvEmail.getText().toString().isEmpty() ||
               binding.etvPassword.getText().toString().isEmpty()){

                Toast.makeText(getBaseContext(), "Favor llenar todos los campos", Toast.LENGTH_SHORT).show();

            }else if(!binding.etvEmail.getText().toString().contains("@") ||!binding.etvEmail.getText().toString().contains(".")) {
                Toast.makeText(getBaseContext(), "Ingrese Email válido", Toast.LENGTH_SHORT).show();

            }else{
                String mensaje = "Hi "+ binding.etvFirstName.getText().toString() + " " +binding.etvLastName.getText().toString()+
                        ". Tu correo es "+ binding.etvEmail.getText().toString() +
                        " y tu contraseña 'secreta' es "+binding.etvPassword.getText().toString();

                Toast.makeText(getBaseContext(), mensaje , Toast.LENGTH_SHORT).show();

                binding.etvFirstName.setText("");
                binding.etvLastName.setText("");
                binding.etvEmail.setText("");
                binding.etvPassword.setText("");
            }
        });
    }
}