package com.example.simplecalcuator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Simplecalculator extends Activity {
	EditText number1;
    EditText number2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    float sol=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplecalculator);
        number1=(EditText)findViewById(R.id.n1);
        number2=(EditText)findViewById(R.id.n2);
        b1=(Button)findViewById(R.id.add);
        b2=(Button)findViewById(R.id.subtract);
        b3=(Button)findViewById(R.id.multiply);
        b4=(Button)findViewById(R.id.divide);
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				float a = Float.parseFloat(number1.getText().toString());
                float b = Float.parseFloat(number2.getText().toString());
                sol=a+b;
                Toast.makeText(Simplecalculator.this,"The sum is " +sol ,Toast.LENGTH_SHORT).show();
				
			}
		});
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(number1.getText().toString());
                float b = Float.parseFloat(number2.getText().toString());
                sol=a-b;
                Toast.makeText(Simplecalculator.this,"The difference is " +sol,Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a =Float.parseFloat(number1.getText().toString());
                float b =Float.parseFloat(number2.getText().toString());
                sol=a*b;
                Toast.makeText(Simplecalculator.this,"The product is " +sol,Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = Float.parseFloat(number1.getText().toString());
                float b = Float.parseFloat(number2.getText().toString());
                sol=a/b;
                Toast.makeText(Simplecalculator.this,"The division is " +sol,Toast.LENGTH_SHORT).show();

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.simplecalculator, menu);
        return true;
    }
    
}
