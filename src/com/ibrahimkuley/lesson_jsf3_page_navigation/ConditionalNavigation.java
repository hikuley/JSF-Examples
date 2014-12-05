package com.ibrahimkuley.lesson_jsf3_page_navigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

/**
 * Created by hikuley on 04.12.2014.
 */
@ManagedBean(name = "conditionalNavigation", eager = true)
@RequestScoped
public class ConditionalNavigation implements Serializable {

    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    public String showPage() {
        if (pageId.equals("1")) {
            return "ConditionalPage1";
        }
        else if (pageId.equals("2")){
            return "ConditionalPage2";
        }
        else if (pageId.equals("3")){
            return "ConditionalPage3";
        }
        return "page1";
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
}
