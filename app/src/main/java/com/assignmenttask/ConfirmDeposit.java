package com.assignmenttask;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ConfirmDeposit extends AppCompatActivity implements View.OnClickListener {
    TextView confirm;
    AlertDialog alertDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confir_deposit);
        confirm = (TextView) findViewById(R.id.confirm);
        confirm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

       /* ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.alertwindows, viewGroup, false);

        final TextView Submit = dialogView.findViewById(R.id.submit);
        final TextView Cancel = dialogView. findViewById(R.id.cancel);
        AlertDialog.Builder builder = new AlertDialog.Builder(ConfirmDeposit.this);
        builder.setView(dialogView);

        // if decline button is clicked, close the custom dialog
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close dialog

              *//*  Intent intent = new Intent(ConfirmDeposit.this,TransactionSuccess.class);
                startActivity(intent);*//*
                alertDialog.cancel();
            }
        });
        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close dialog
               // alertDialog.cancel();
            }
        });

         AlertDialog alertDialog = builder.create();
        alertDialog.show();
*/
        LayoutInflater factory = LayoutInflater.from(ConfirmDeposit.this);
        final View deleteDialogView = factory.inflate(R.layout.alertwindows, null);
        final AlertDialog deleteDialog = new AlertDialog.Builder(this).create();
        deleteDialog.setView(deleteDialogView);
        deleteDialogView.findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //your business logic

                deleteDialog.dismiss();
                Intent intent = new Intent(ConfirmDeposit.this,TransactionSuccess.class);
                startActivity(intent);
            }
        });
        deleteDialog.show();


    }
}
