package com.hacktbilisi.facekeeper;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.NoteViewHolder>{

    public static class NoteViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        //TextView personName;
        TextView noteTitle;
        TextView noteText;


        public NoteViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            noteTitle = (TextView)itemView.findViewById(R.id.person_note_title);
            noteText = (TextView)itemView.findViewById(R.id.person_note_text);

        }
    }

    Person person;
    List<Note> notes;

    RVAdapter(Person person) {
        this.person = person;
        this.notes = person.getNotes();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        NoteViewHolder pvh = new NoteViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(NoteViewHolder noteViewHolder, int i) {
        noteViewHolder.noteTitle.setText(notes.get(i).title);
        noteViewHolder.noteText.setText(notes.get(i).text);

    }

}
