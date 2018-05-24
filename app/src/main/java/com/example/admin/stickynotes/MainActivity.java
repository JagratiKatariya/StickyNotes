package com.example.admin.stickynotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1;
    Button but1;
    EditText edit1;
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        but1 = findViewById(R.id.but1);
        edit1 = findViewById(R.id.edit1);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edit1.getText().toString();
                count++;
                if(!name.matches(""))
                    //Log.d("DEBUG","name:"+name+"::");
                    text1.append(count+". "+name+"\n");
            }
        });

    }
}
