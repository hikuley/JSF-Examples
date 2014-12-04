package com.ibrahimkuley;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by hikuley on 04.12.2014.
 */
@ManagedBean(name = "helloworld", eager = true)
@RequestScoped
public class HelloWorld {

    public HelloWorld() {
    }

    public String getMessages() {
        return "Merhaba Dünya";
    }
}
