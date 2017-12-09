package com.biprom.vanderbeken.client;

import com.biprom.vanderbeken.MouseUpDown;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.client.MouseEventDetailsBuilder;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.ui.Connect;

@Connect(MouseUpDown.class)
public class MouseUpDownConnector extends AbstractComponentConnector {
    private final MouseUpDownServerRpc serverRpc = RpcProxy.create( MouseUpDownServerRpc.class, this );

    public MouseUpDownConnector() {
        registerRpc( MouseUpDownClientRpc.class, new MouseUpDownClientRpc() {
            @Override
            public void alert() {
                // TODO Do something useful
                Window.alert("");
            }
        } );

        getWidget().addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                final MouseEventDetails mouseDetails = MouseEventDetailsBuilder
                        .buildMouseEventDetails(event.getNativeEvent(),
                                getWidget().getElement());
                serverRpc.clicked(mouseDetails);
            }
        });



        getWidget().addMouseDownHandler(new MouseDownHandler() {

            @Override
            public void onMouseDown(MouseDownEvent event) {
                final MouseEventDetails mouseDetails = MouseEventDetailsBuilder
                        .buildMouseEventDetails(event.getNativeEvent(),
                                getWidget().getElement());


                serverRpc.mouseDown(getWidget().getStylePrimaryName());
            }
        });

        getWidget().addMouseUpHandler(new MouseUpHandler() {

            @Override
            public void onMouseUp(MouseUpEvent event) {
                final MouseEventDetails mouseDetails = MouseEventDetailsBuilder
                        .buildMouseEventDetails(event.getNativeEvent(),
                                getWidget().getElement());
                serverRpc.mouseUp(getWidget().getStylePrimaryName());
            }
        });
    }

    @Override
    protected Widget createWidget() {
        return GWT.create( MouseUpDownWidget.class );
    }

    @Override
    public MouseUpDownWidget getWidget() {
        return (MouseUpDownWidget) super.getWidget();
    }

    @Override
    public MouseUpDownState getState() {
        return (MouseUpDownState) super.getState();
    }
}
