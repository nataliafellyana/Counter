package com.example.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView counter_text;
    private Button btn_min;
    private Button btn_reset;
    private Button btn_plus;
    private int counter;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btn_plus:
                    Plus();
                    break;
                case R.id.btn_min:
                    Min();
                    break;
                case R.id.btn_reset:
                    Count();
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter_text =  (TextView)findViewById(R.id.counter_text);
        btn_min = (Button)findViewById(R.id.btn_min);
        btn_min.setOnClickListener(clickListener);
        btn_reset = (Button)findViewById(R.id.btn_reset);
        btn_reset.setOnClickListener(clickListener);
        btn_plus = (Button)findViewById(R.id.btn_plus);
        btn_plus.setOnClickListener(clickListener);

        Count();
    }

    private void Count(){
        counter=0;
        counter_text.setText(counter + "");
    }

    private void Plus(){
        counter++;
        counter_text.setText(counter + "");
    }

    private void Min(){
        counter--;
        if(counter<=0)
        {
            counter=0;
        }
        counter_text.setText(counter + "");
    }
}
