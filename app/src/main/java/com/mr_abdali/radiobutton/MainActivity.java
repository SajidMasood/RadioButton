package com.mr_abdali.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatRadioButton;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // AppCompatRadioButton radioButton;

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reference
        /*radioButton = (AppCompatRadioButton) findViewById(R.id.RadioButton1_id);
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                // code
                //System.out.println(b);
                if (b){
                    // <code></code>
                    Toast.makeText(getApplicationContext(), "Radio Button checked", Toast.LENGTH_SHORT).show();
                } else {
                    // <code></code>
                    Toast.makeText(getApplicationContext(),"Radio Button Unchecked ",Toast.LENGTH_LONG).show();
                }
            }
        });*/

        // radio group
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup_id);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                // code here
                switch (i){
                    case R.id.RadioButton1_id:
                        // code here
                        Toast.makeText(getApplicationContext(),"Radio button 1",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.RadioButton2_id:
                        // code here
                        Toast.makeText(getApplicationContext(),"Radio button 2",Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
    }
}
