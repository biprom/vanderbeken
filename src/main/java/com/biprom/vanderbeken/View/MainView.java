package com.biprom.vanderbeken.View;

import com.biprom.vanderbeken.Design.MainDesign;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.navigator.SpringViewProvider;
import org.springframework.beans.factory.annotation.Autowired;

import static com.biprom.vanderbeken.View.MainView.VIEW_NAME;

@SpringComponent
@SpringView(name = VIEW_NAME)
public class MainView extends MainDesign implements View{

    public static final String VIEW_NAME = "MAIN_VIEW";
    private final SpringViewProvider viewProvider;

    @Autowired
    public MainView(SpringViewProvider viewProvider) {
        this.viewProvider = viewProvider;

    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        
    }
}
