package com.example.kmn.android01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText mEdit1;
    private EditText mEdit2;
    private EditText mEdit3;
    private TextView mText;
    String f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdit1 = (EditText) findViewById(R.id.editText1);
        mEdit2 = (EditText) findViewById(R.id.editText2);
        mEdit3 = (EditText) findViewById(R.id.editText3);
        mText = (TextView)findViewById(R.id.textView);
        Button button = (Button)findViewById(R.id.button);
        //タップイベントの取得
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        //EditTextからテキストを読み出しTextViewに書き込み
        f = mEdit1.getText().toString()+mEdit2.getText().toString()+mEdit3.getText().toString();
        mText.setText(f);
    }
}
