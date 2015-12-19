package com.hacktbilisi.facekeeper;

import java.util.List;

/**
 * Created by bluebirrrrd on 12/19/15.
 */
public class Person {
    private String name;
    private long fb_id;
   // int photoId;

    private List<Note> notes;

    Person(String name, long fb_id) {
        this.setName(name);
        this.setFb_id(fb_id);
       // this.photoId = photoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getFb_id() {
        return fb_id;
    }

    public void setFb_id(long fb_id) {
        this.fb_id = fb_id;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void setNotes(List<Note> notes) {
        this.notes = notes;
    }
}

