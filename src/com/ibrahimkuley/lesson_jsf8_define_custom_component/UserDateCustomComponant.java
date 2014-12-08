package com.ibrahimkuley.lesson_jsf8_define_custom_component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by hikuley on 08.12.2014.
 */

@ManagedBean(name = "usetDataCC", eager = true)
@SessionScoped
public class UserDateCustomComponant {

    private static final long serialVersionUID = 1L;
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String login(){
        return "result";
    }
}
