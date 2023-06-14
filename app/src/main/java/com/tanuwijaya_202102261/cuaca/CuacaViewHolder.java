package com.tanuwijaya_202102261.cuaca;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CuacaViewHolder extends RecyclerView.ViewHolder {
    public ImageView cuacaImageView;
    public TextView namaTextView, deskripsiTextView, tglWaktuTextView, suhuTextView;

    public CuacaViewHolder(View itemView){
        super(itemView);

        cuacaImageView = itemView.findViewById(R.id.cuacaImageView);
        namaTextView = itemView.findViewById(R.id.namaTextView);
        deskripsiTextView = itemView.findViewById(R.id.deskripsiTextView);
        tglWaktuTextView = itemView.findViewById(R.id.tglWaktuTextView);
        suhuTextView = itemView.findViewById(R.id.suhuTextView);
    }
}
