package com.example.tacademy.layoutpra;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }
    public void onclickBtn(View view){
        Toast.makeText(ButtonActivity.this,"click",Toast.LENGTH_SHORT).show();
    }
}
