package com.example.tabuada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById(R.id.numer);
        Button button = findViewById(R.id.enter);

        final ListView lista =  findViewById(R.id.Resultado);
        editText.setText("");
        View.OnClickListener listenerButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = Integer.valueOf(editText.getText().toString());
                ArrayList<Integer> array = new ArrayList<>();
                for(int i= 0; i<=10;i++){
                    array.add(numero*i);
                }
                ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<>(
                MainActivity.this, R.layout.list_item, array
            );
            lista.setAdapter(arrayAdapter);
            }
        };

        button.setOnClickListener(listenerButton);
    }
}
