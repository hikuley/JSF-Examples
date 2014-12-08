package com.ibrahimkuley.lesson_jsf10_valueChangeListener;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by hikuley on 08.12.2014.
 */

@ManagedBean(name = "personalBean", eager = true)
@SessionScoped
public class PersonalData {

    private static final long serialVersionUID = 1L;

    private String selectedCountry = "United Kingdom";//default value

    private static LinkedHashMap<String, String> countryMap;

    static {
        countryMap = new LinkedHashMap<String, String>();
        countryMap.put("en", "United Kingdom");
        countryMap.put("tr", "Türkiye");
        countryMap.put("fr", "Franca");
        countryMap.put("de", "German");
    }

    public String getSelectedCountry() {
        return selectedCountry;
    }

    public void setSelectedCountry(String selectedCountry) {
        this.selectedCountry = selectedCountry;
    }

    public Map<String, String> getContries() {
        return countryMap;
    }

    public void localeChanged(ValueChangeEvent event) {
        System.out.println("LocaleChanged runing ");
        selectedCountry = event.getNewValue().toString();
    }

}
