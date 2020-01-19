package com.ewch.springboot.backend.chat.documents;

import java.io.Serializable;

public class Message implements Serializable {

    private static final long serialVersionUID = -572639856239852L;

    private String text;
    private Long date;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }
}
