package com.example.andrew.lab30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText1 = (EditText)findViewById(R.id.edit_text1);
        final EditText editText2 = (EditText)findViewById(R.id.edit_text2);
        final TextView textView = (TextView)findViewById(R.id.tv1);
        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                int sum = sum(num1, num2);
                textView.setText(""+sum);
                editText1.setText("");
                editText2.setText("");
            }
        });
    }

    public int sum(int one, int two){
        return one + two;
    }
}
