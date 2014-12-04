package com.ibrahimkuley.lesson_jsf_managed_beans_1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by hikuley on 04.12.2014.
 */
@ManagedBean(name = "message", eager = true)
@RequestScoped
public class Message {
    private String message = "Mesaj İçeriği";

    public Message() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
