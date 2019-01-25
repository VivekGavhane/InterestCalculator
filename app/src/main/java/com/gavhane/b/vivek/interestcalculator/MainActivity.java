package com.gavhane.b.vivek.interestcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView tv1;
    EditText et1,et2,et3;

    String e11,e22,e33,interest1;
    int x,y,z,interest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 =(EditText) findViewById(R.id.et2);
        et2 =(EditText) findViewById(R.id.et4);
        et3 =(EditText) findViewById(R.id.et6);
        tv1 =(TextView) findViewById(R.id.tv1);

        b1 = (Button) findViewById(R.id.b1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                e11  = et1.getText().toString();
                e22  = et2.getText().toString();
                e33  = et3.getText().toString();

                x = Integer.parseInt(e11);
                y = Integer.parseInt(e22);
                z = Integer.parseInt(e33);

                interest = ((x*y*z)/100);
                interest1 = String.valueOf(interest);

                tv1.setText(interest1);
            }
        });

    }
}
