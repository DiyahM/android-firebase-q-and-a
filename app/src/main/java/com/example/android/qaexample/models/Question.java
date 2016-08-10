package com.example.android.qaexample.models;

import java.io.Serializable;

/**
 * Created by diyahm-pl on 8/3/16.
 */
public class Question implements Serializable {
    private static final long serialVersionUID = -56543230L;
    private String title;
    private String content;
    private String uuid;

    public Question(){

    }

    public Question(String title, String content, String uuid){
        this.title = title;
        this.content = content;
        this.uuid = uuid;
    }
    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }

    public String getUuid(){
        return uuid;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void setUser(String uuid){
        this.uuid = uuid;
    }
}
