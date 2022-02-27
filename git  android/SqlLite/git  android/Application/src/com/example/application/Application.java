package com.example.application;

	
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Application extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.application, menu);
        return true;
    }
  
	@Override

	public boolean onOptionsItemSelected(MenuItem item) {

	int id = item.getItemId();
	

	switch (id){

	case R.id.item1:
		Intent i=new Intent(getApplicationContext(),Activity1.class);
		startActivity(i);
		return true;

	case R.id.item2:

		Intent i1=new Intent(getApplicationContext(), Activity2.class);
		startActivity(i1);
	    return true;

	case R.id.item3:

		Intent i2=new Intent(getApplicationContext(),Activity3.class);
		startActivity(i2);

	    return true;
	case R.id.item4:

		Intent i4=new Intent(getApplicationContext(),Activity3.class);
		startActivity(i4);

	    return true;
	
	default:

	return super.onOptionsItemSelected(item);

	}

	}

}
