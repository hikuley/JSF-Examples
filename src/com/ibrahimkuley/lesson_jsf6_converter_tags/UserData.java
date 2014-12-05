package com.ibrahimkuley.lesson_jsf6_converter_tags;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by hikuley on 05.12.2014.
 */

@ManagedBean(name = "userDataConvertTags", eager = true)
@SessionScoped
public class UserData implements Serializable {

    public static final long serialVersionUID = 1L;

    public Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
