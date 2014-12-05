package com.ibrahimkuley.lesson_jsf3_page_navigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

/**
 * Created by hikuley on 04.12.2014.
 */
@ManagedBean(name = "navigationContoller", eager = true)
@RequestScoped
public class NavigationController implements Serializable {

    public String moveToPage() {
        return "page1";
    }

}
