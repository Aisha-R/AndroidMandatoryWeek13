package com.aisharooble.recyclerviewmandatory.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aisharooble.recyclerviewmandatory.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;
    private ImageView imageView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        LinearLayout ll = (LinearLayout)itemView;

        textView = ll.findViewById(R.id.textView);
        imageView = ll.findViewById(R.id.imageView);

    }

    public void setData(String text, int imageId) {
        textView.setText(text);
        imageView.setImageResource(imageId);
    }
}
