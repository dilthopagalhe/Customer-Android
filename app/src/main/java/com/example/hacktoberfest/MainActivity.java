package com.example.hacktoberfest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    
    EditText editText1;
    EditText editText2;
    EditText editText3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        editText1=(EditText)findViewById(R.id.username);
        editText2=(EditText)findViewById(R.id.email);
        editText3=(EditText)findViewById(R.id.password);
        button=(Button) findViewById(R.id.login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                   if(editText1.getText().toString().isEmpty() ||
                        editText2.getText().toString().isEmpty() ||
                        editText3.getText().toString().isEmpty()){

                    Toast.makeText(MainActivity.this, "Feilds cant be empty", Toast.LENGTH_SHORT).show();

                }
                
                if(editText1.getText().toString().equals("Shan Athukoreala") &&
                        editText2.getText().toString().equals("Shan@gmail.com") &&
                        editText3.getText().toString().equals("Shan1@") ){
                    
                     Intent intent = new Intent(MainActivity.this, Dashboard.class);
                    startActivity(intent);

                }
            }
        });
    }
}
