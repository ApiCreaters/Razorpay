package com.example.razorpay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.customtoastcre.Toastc;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toastc.SimplerToast(this,"ApiCreate");

        

    }
}