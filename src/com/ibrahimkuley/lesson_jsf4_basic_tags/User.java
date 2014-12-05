package com.ibrahimkuley.lesson_jsf4_basic_tags;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;

/**
 * Created by hikuley on 04.12.2014.
 */
@ManagedBean(name = "userData", eager = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    public String[] data = {"1", "2", "3", "4", "5"};

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
}
