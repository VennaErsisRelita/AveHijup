package com.example.avehijup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView btnLogin;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        btnLogin = (TextView)findViewById(R.id.textView);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,KonfirmasiPembayaran.class));
                finish();
            }
        });

        TextView btn = (TextView) findViewById(R.id.daftardisini);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inte = new Intent(MainActivity.this, Buat_akun.class);
                startActivity(inte);
            }
        });
    }
}
