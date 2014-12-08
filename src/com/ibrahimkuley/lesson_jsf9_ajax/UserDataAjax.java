package com.ibrahimkuley.lesson_jsf9_ajax;

import javax.faces.bean.ManagedBean;

/**
 * Created by hikuley on 08.12.2014.
 */
@ManagedBean(name = "userDataAjax", eager = true)
public class UserDataAjax {

    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWelcomeMessage(){
        return "Hello "+name;
    }

}
