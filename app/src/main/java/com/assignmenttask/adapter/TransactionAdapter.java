package com.assignmenttask.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.assignmenttask.Deposit;
import com.assignmenttask.MainActivity;
import com.assignmenttask.R;
import com.assignmenttask.model.DetailsModel;

import java.util.ArrayList;
import java.util.List;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionModel>{
    private Context context;
    List<DetailsModel> detailsModels = new ArrayList<>();
    public TransactionAdapter(Context context, List<DetailsModel> detailsModels) {
        this.context = context;
        this.detailsModels =detailsModels;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TransactionModel onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_details, viewGroup, false);
        return new TransactionAdapter.TransactionModel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionModel holder, int position) {

        holder.transDateTime.setText(detailsModels.get(position).getDateTime());
        holder.transType.setText(detailsModels.get(position).getTransactionType());
        holder.transID.setText(detailsModels.get(position).getTransactionID());
        holder.transAmount.setText(detailsModels.get(position).getAmount());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Deposit.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return detailsModels.size();
    }

    public class TransactionModel extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView transType,transID,transAmount,transDateTime;
        public TransactionModel(@NonNull View itemView) {
            super(itemView);
            transDateTime =(TextView)itemView.findViewById(R.id.datetime);
            transType =(TextView)itemView.findViewById(R.id.transtype);
            transID =(TextView)itemView.findViewById(R.id.transid);
            transAmount =(TextView)itemView.findViewById(R.id.transamount);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

        }
    }
}
