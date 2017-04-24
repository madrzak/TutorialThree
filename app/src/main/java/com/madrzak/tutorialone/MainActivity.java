package com.madrzak.tutorialone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etMessage;
    private Button btnSend;
    private TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMessage = (EditText) findViewById(R.id.etMessage);
        btnSend = (Button) findViewById(R.id.btnSend);
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = etMessage.getText().toString();

                if (message.length() == 0) {
                    Toast.makeText(MainActivity.this, "Please enter a message first...", Toast.LENGTH_SHORT).show();
                    return;
                }

                tvDisplay.setText(message);

                etMessage.setText("");
            }
        });

    }
}
