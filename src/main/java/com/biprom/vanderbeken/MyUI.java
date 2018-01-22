package com.biprom.vanderbeken;

import com.biprom.vanderbeken.Data.Data;
import com.biprom.vanderbeken.View.MainView;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Widgetset;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

@UIScope
@SpringUI
//@Theme("mytheme")
@Widgetset("com.biprom.vanderbeken.WidgetSet")

public class MyUI extends UI {

    @Autowired
    SpringViewProvider viewProvider;

    @Autowired
    Data data;


    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Navigator navigator = new Navigator(this, this);
        navigator.addProvider( viewProvider );
        navigator.navigateTo( MainView.VIEW_NAME);

        SharedData sharedData = new SharedData(data);
    }
}

class SharedData{
    static Data data;
    public SharedData(Data dt){
        this.data = dt;
    }
}