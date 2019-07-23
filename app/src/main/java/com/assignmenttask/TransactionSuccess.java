package com.assignmenttask;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class TransactionSuccess extends AppCompatActivity implements View.OnClickListener {
    ImageView Close;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deposit_success);
        Close = (ImageView)findViewById(R.id.close);
        Close.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent= new Intent(TransactionSuccess.this,MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
