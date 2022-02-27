package com.example.form;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.os.Bundle;
import android.app.Activity;
import android.util.Patterns;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Validation extends Activity {
	EditText name;
	EditText email;
	EditText phn;
	EditText age;
	EditText password;
	Button submit;
	 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);
        
         name = (EditText)findViewById(R.id.n1);
         password = (EditText) findViewById(R.id.pass);
       
        phn = (EditText) findViewById(R.id.phone);
        age = (EditText) findViewById(R.id.age);
        submit = (Button) findViewById(R.id.submit);
         final Pattern pattern=Pattern.compile("^" +
                "(?=.*[@#$%^&+=])" +     // at least 1 special character
                "(?=\\S+$)" +            // no white spaces
                ".{4,}" +                // at least 4 characters
                "$");
          final   String phnpattern = ("^(0|91)?[7-9][0-9]{9}$");
        
          final Pattern AGE_PATTERN=Pattern.compile("^(.*[0-9].*)$");
         

        submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			  
				 String Name=name.getText().toString();  
		         String passwd=password.getText().toString(); 
		         String number=phn.getText().toString();  
		         String inpAge=age.getText().toString();
		        if(Name.length()==0)  
		        {  
		           
		         name.setError("FIELD CANNOT BE EMPTY");  
		        }  
		        else if(!Name.matches("[a-zA-Z ]+"))  
		        {  
		               
		            name.setError("ENTER ONLY ALPHABETICAL CHARACTER");  
		        }  
		        else{
		        	Toast.makeText(Validation.this,"Name entered successfully", Toast.LENGTH_LONG).show();
		        }
		        
		       if(passwd.length()==0)  
		        {  
		            password.setError("FIELD CANNOT BE EMPTY");  
		        }  
		        else if(password.length()>10)  
		        {  
		            password.setError("password is long");  
		        }  
		        else if (!pattern.matcher(passwd).matches()){
                    password.setError("Password is too weak");
                }
		        else{
		        	Toast.makeText(Validation.this,"password entered successfully", Toast.LENGTH_LONG).show();
		        }
			
		         if(phn.getText().toString().length()<10)
		        {
		        	phn.setError("INVALID PHONE NUMBER ");
		        }
		        else if(number.matches(phnpattern)==false  ) {
		        	phn.setError("PHONE NUMBER CONTAIN NUMBERS ONLY");
		        	
		             
		         }
		        else{
		        	Toast.makeText(Validation.this,"phone number entered successfully", Toast.LENGTH_LONG).show();
		        }
	           if (!AGE_PATTERN.matcher(inpAge).matches()){
                age.setError("Enter only digits");
                 }
		        else  if(age.getText().toString().length()==0 )
		        {
		        	age.setError("ENTER AGE ");
		        }
		        else  if(age.getText().toString().length()>2 )
		        {
		        	age.setError(" AGE is not more than 2 digit ");
		        }
		        else{
		        	Toast.makeText(Validation.this,"Age entered successfully", Toast.LENGTH_LONG).show();
		        }
		       
		        
		 }  
			
		});
        
        
    }
    	 
  

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.validation, menu);
        return true;
    }
    
}
