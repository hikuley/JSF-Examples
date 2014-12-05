package com.ibrahimkuley.lesson_jsf1_managed_beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * Created by hikuley on 04.12.2014.
 */
@ManagedBean(name = "manegedBean", eager = true)
@RequestScoped
public class Controller {

    @ManagedProperty(value = "#{message}") // dipency injection = autowired
    private Message messageBean;

    private String message;

    public Controller() {
    }

    public String getMessage() {
        if (messageBean != null) {
            message = messageBean.getMessage();
        }
        return message;
    }

    public void setMessageBean(Message messageBean) {
        this.messageBean = messageBean;
    }

}
