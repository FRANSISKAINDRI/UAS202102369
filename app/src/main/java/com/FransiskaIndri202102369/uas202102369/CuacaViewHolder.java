package com.FransiskaIndri202102369.uas202102369;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CuacaViewHolder extends RecyclerView.ViewHolder{

    public TextView namaTextView, deskripsiTextView, tglWaktuTextView, suhuTextView;
    public CuacaViewHolder(@NonNull View itemView) {
        super(itemView);


        namaTextView = (TextView) itemView.findViewById(R.id.namaTextView);
        deskripsiTextView = (TextView) itemView.findViewById(R.id.deskripsiTextView);
        tglWaktuTextView = (TextView) itemView.findViewById(R.id.tglWaktuTextView);
        suhuTextView = (TextView) itemView.findViewById(R.id.tglWaktuTextView);
    }
}
