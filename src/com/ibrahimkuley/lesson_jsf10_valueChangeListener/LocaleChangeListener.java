package com.ibrahimkuley.lesson_jsf10_valueChangeListener;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

/**
 * Created by hikuley on 08.12.2014.
 */
public class LocaleChangeListener implements ValueChangeListener {

    @Override
    public void processValueChange(ValueChangeEvent valueChangeEvent) throws AbortProcessingException {
        System.out.println("ikinci yöntem çalıştı");
        PersonalData personalData = (PersonalData) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("personalBean");
        personalData.setSelectedCountry(valueChangeEvent.getNewValue().toString());
    }


}
