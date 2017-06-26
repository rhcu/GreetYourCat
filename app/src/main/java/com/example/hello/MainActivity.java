package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.hello.R.styleable.View;

public class MainActivity extends AppCompatActivity {
    private TextView mHelloTextView;
    private EditText mNameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = (TextView)findViewById(R.id.greet);
        mNameEditText = (EditText) findViewById(R.id.catName);

    }
    public void onClick(View view) {
        if (mNameEditText.getText().length() == 0) {
            mHelloTextView.setText("Hello, powerful and awesome creature!");
        } else {
            mHelloTextView.setText("Hello, dear " + mNameEditText.getText());
        }
    }
}
