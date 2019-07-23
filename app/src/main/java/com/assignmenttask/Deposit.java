package com.assignmenttask;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Deposit extends AppCompatActivity implements View.OnClickListener {
    private TextView proceed;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deposit_layout);
        proceed = (TextView)findViewById(R.id.proceed);
        proceed.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Deposit.this,ConfirmDeposit.class);
        startActivity(intent);
        finish();
    }
}
