package com.aruvansh.findyourimage;

import java.io.Serializable;

/**
 * Created by Aruvansh on 14/01 /18.
 */

public class Photo implements Serializable{

    private static final long serialVersionUID=1l;    //this is needed when we update java versions then the serializability be maintained as programmed
    private String mTitle;
    private String mAuthor;
    private String mAuthorid;
    private String mlink;
    private String mTags;
    private String mImage;

    public Photo(String title, String author, String authorid, String mlink, String tags, String image) {
        mTitle = title;
        mAuthor = author;
        mAuthorid = authorid;
        this.mlink = mlink;
        mTags = tags;
        mImage = image;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getAuthorid() {
        return mAuthorid;
    }

    public String getMlink() {
        return mlink;
    }

    public String getTags() {
        return mTags;
    }

    public String getImage() {
        return mImage;
    }
}