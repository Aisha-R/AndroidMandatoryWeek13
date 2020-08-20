package com.aisharooble.recyclerviewmandatory.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aisharooble.recyclerviewmandatory.R;
import com.aisharooble.recyclerviewmandatory.storage.NoteStorage;
import com.aisharooble.recyclerviewmandatory.view.MyViewHolder;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private NoteStorage noteStorage;

    public MyAdapter(NoteStorage noteStorage) {
        this.noteStorage = noteStorage;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {//parent is "this" of MainActivity

        LinearLayout ll = (LinearLayout) LayoutInflater.from(parent.getContext())
                            .inflate(R.layout.mylayout, parent, false);

        return new MyViewHolder(ll); //pass the linearLayout as constructor arg. to MyViewHolder
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int imageId;
        if (position % 2 == 0) {
            imageId = R.drawable.ic_launcher_background;
        } else {
            imageId = R.drawable.ic_launcher_foreground;
        }
        holder.setData(noteStorage.list.get(position), imageId);
    }

    @Override
    public int getItemCount() {
        return noteStorage.list.size();
    }
}
