package com.example.rxjavaretrofit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rxjavaretrofit.R;
import com.example.rxjavaretrofit.databinding.NoteListRowBinding;
import com.example.rxjavaretrofit.network.model.Note;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NotesViewHolder> {
    private Context context;
    private List<Note> notes;


    public NotesAdapter(Context context, List<Note> notes) {
        this.context = context;
        this.notes = notes;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        NoteListRowBinding noteListRowBinding = DataBindingUtil.inflate(LayoutInflater.from(context),
                R.layout.note_list_row, parent, false);
        return new NotesViewHolder(noteListRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public class NotesViewHolder extends RecyclerView.ViewHolder {


        public NotesViewHolder(@NonNull NoteListRowBinding itemView) {
            super(itemView.getRoot());
        }

    }
}
