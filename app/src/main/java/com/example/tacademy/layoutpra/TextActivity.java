package com.example.tacademy.layoutpra;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        t = (TextView)findViewById(R.id.text_message);

        t.setText(Html.fromHtml(getResources().getString(R.string.link2)));
        t.setMovementMethod(LinkMovementMethod.getInstance());

//
//        Button b = (Button)findViewById(R.id.btn_select);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                t.setSelected(!t.isSelected());
//            }
//        });
//        b=(Button)findViewById(R.id.btn_html);
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String htmltext = getResources().getString(R.string.html_text);
//                t.setText(Html.fromHtml(htmltext));
//            }
//        });
    }
}
