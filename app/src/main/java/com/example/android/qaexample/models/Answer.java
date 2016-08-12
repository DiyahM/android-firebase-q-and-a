package com.example.android.qaexample.models;

import java.io.Serializable;

/**
 * Created by diyahm-pl on 8/11/16.
 */
public class Answer implements Serializable {
    private static final long serialVersionUID = -56543888L;
    private String text;
    private String uuid;

    public Answer(){

    }

    public Answer(String text, String uuid){
        this.text = text;
        this.uuid = uuid;
    }
    public String getText(){
        return text;
    }

    public String getUuid(){
        return uuid;
    }

    public void setText(String text){
        this.text = text;
    }

    public void setUuid(String uuid){
        this.uuid = uuid;
    }

}
