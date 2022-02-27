package com.example.sharedp;
import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;
import android.widget.EditText;

public class SharedP extends Activity {
	EditText name,pass,phn,age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_p);
        name=(EditText)findViewById(R.id.e1);
        pass=(EditText)findViewById(R.id.e2);
        phn=(EditText)findViewById(R.id.e3);
        age=(EditText)findViewById(R.id.e4);
        
    }
    public void onResume() {
    	super.onResume();
    	
    	  SharedPreferences sh=getSharedPreferences("sp", MODE_PRIVATE);
    		 
	       String s1 = sh.getString("name", "");
	        String s2 = sh.getString("pass", "");
	       int ph = sh.getInt("phn", 0);
	        int a = sh.getInt("age", 0);
	 
	        // Setting the fetched data
	        // in the EditTexts
	        name.setText(s1);
	        pass.setText(s2);
	        phn.setText(String.valueOf(ph));
	        age.setText(String.valueOf(a));
		
	}
    public void onPause() {
		
	
        super.onPause();
 
        // Creating a shared pref object
        // with a file name "sp"
        // in private mode
        SharedPreferences sharedPreferences = getSharedPreferences("sp", MODE_PRIVATE);
        SharedPreferences.Editor sp2 = sharedPreferences.edit();
 
        // write all the data entered by the user in SharedPreference and apply
        sp2.putString("name", name.getText().toString());
        sp2.putString("pass", pass.getText().toString());
        sp2.putInt("phn", Integer.parseInt(phn.getText().toString()));
        sp2.putInt("age", Integer.parseInt(age.getText().toString()));
        sp2.commit();
        sp2.apply();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.shared, menu);
        return true;
    }
    
}
