package com.hacktbilisi.facekeeper;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ShowNotesActivity extends Activity {

    private RecyclerView rv;
    private List<Note> notes;
    private Person person;


    private void initializeData(){
        person = new Person("Emma Wilson", 1245678983);
        notes = new ArrayList<>();
        notes.add(new Note("Note 1", "Text of Note 1"));
        notes.add(new Note("Note 2", "Text of Note 2"));
        person.setNotes(notes);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_notes);
//        getActionBar().setDisplayHomeAsUpEnabled(true);

        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager sglm = new LinearLayoutManager(this);
        rv.setLayoutManager(sglm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();

        TextView personName = (TextView)findViewById(R.id.person_name);
        personName.setText(person.getName());
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(person);
        rv.setAdapter(adapter);
    }

}
