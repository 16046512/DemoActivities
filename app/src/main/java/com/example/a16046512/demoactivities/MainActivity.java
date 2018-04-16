package com.example.a16046512.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
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
        Button btnDone = (Button)findViewById(R.id.btnDone);
        EditText name = (EditText)findViewById(R.id.etName);
        EditText age = (EditText)findViewById(R.id.etage);

        if(name.getText().toString() != "" && age.getText().toString() != "") {
            btnDone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    EditText name = (EditText) findViewById(R.id.etName);
                    EditText age = (EditText) findViewById(R.id.etage);
                    String[] info = {name.getText().toString(), age.getText().toString()};

                    Intent i = new Intent(MainActivity.this, DemoActivities2.class);

                    i.putExtra("info", info);
                    startActivity(i);

                }
            });
        }else{
            Toast.makeText(MainActivity.this, "Please fill in name and age!",
                    Toast.LENGTH_LONG).show();
        }


    }
}
