package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends Activity {
	Button button0, button1, button2, button3, button4, button5, button6,
    button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
    buttonMul, button10, buttonC, buttonEqual;
     EditText Answer;

    float mValueOne, mValueTwo;

     boolean Addition, Subtract, Multiplication, Division;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
		button0 = (Button)findViewById(R.id.b1);
		button1=(Button)findViewById(R.id.b2);
		button2 = (Button) findViewById(R.id.b3);
        button3 = (Button) findViewById(R.id.b4);
        button4 = (Button) findViewById(R.id.b5);
        button5 = (Button) findViewById(R.id.b6);
        button6 = (Button) findViewById(R.id.b7);
        button7 = (Button) findViewById(R.id.b8);
        button8 = (Button) findViewById(R.id.b9);
        button9 = (Button) findViewById(R.id.b10);
        buttonAdd = (Button) findViewById(R.id.b11);
        buttonSub = (Button) findViewById(R.id.b12);
        buttonMul = (Button) findViewById(R.id.b13);
        buttonDivision = (Button) findViewById(R.id.b14);
        buttonEqual = (Button) findViewById(R.id.b17);
        button10=(Button)findViewById(R.id.b15);
        buttonC=(Button)findViewById(R.id.b16);
        Answer = (EditText) findViewById(R.id.e1);
        button0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Answer.setText(Answer.getText() + "1");
				
			}
		});
      button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Answer.setText(Answer.getText() + "2");
				
			}
		});
      button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Answer.setText(Answer.getText() + "3");
				
			}
		});
      button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Answer.setText(Answer.getText() + "4");
				
			}
		});
      button4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Answer.setText(Answer.getText() + "5");
				
			}
		});
      button5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Answer.setText(Answer.getText() + "6");
				
			}
		});
      button6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Answer.setText(Answer.getText() + "7");
				
			}
		});
      button7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Answer.setText(Answer.getText() + "8");
				
			}
		});
      button8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Answer.setText(Answer.getText() + "9");
				
			}
		});
      button9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Answer.setText(Answer.getText() + "0");
				
			}
		});
      buttonAdd.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              if (Answer == null) {
                  Answer.setText("");
              } else {
                  mValueOne = Float.parseFloat(Answer.getText() + "");
                 Addition = true;
                 Answer.setText(null);
              }
          }
      });
      buttonSub.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              mValueOne = Float.parseFloat(Answer.getText() + "");
              Subtract = true;
              Answer.setText(null);
          }
      });

      buttonMul.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              mValueOne = Float.parseFloat(Answer.getText() + "");
              Multiplication = true;
              Answer.setText(null);
          }
      });

      buttonDivision.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              mValueOne = Float.parseFloat(Answer.getText() + "");
              Division = true;
             Answer.setText(null);
          }
      });

      buttonEqual.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              mValueTwo = Float.parseFloat(Answer.getText() + "");

              if (Addition == true) {
                  Answer.setText(mValueOne + mValueTwo + "");
                 Addition = false;
              }

              if (Subtract == true) {
                 Answer.setText(mValueOne - mValueTwo + "");
                  Subtract = false;
              }

              if (Multiplication == true) {
                 Answer.setText(mValueOne * mValueTwo + "");
                  Multiplication = false;
              }

              if (Division == true) {
                  Answer.setText(mValueOne / mValueTwo + "");
                  Division = false;
              }
          }
      });

      buttonC.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
             Answer.setText("");
          }
      });

      button10.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
             Answer.setText(Answer.getText() + ".");
          }
      });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculator, menu);
		return true;
	}

}
