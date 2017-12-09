package com.biprom.vanderbeken;

import com.biprom.vanderbeken.client.MouseUpDownClientRpc;
import com.biprom.vanderbeken.client.MouseUpDownServerRpc;
import com.biprom.vanderbeken.client.MouseUpDownState;
import com.vaadin.shared.AbstractComponentState;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.ui.AbstractComponent;
import org.springframework.stereotype.Component;

@Component
public class MouseUpDown extends AbstractComponent {
    public MouseUpDown() {
        registerRpc(rpc);
        getState().text = "";
    }

    private MouseUpDownServerRpc rpc = new MouseUpDownServerRpc() {
        @Override
        public void clicked(MouseEventDetails mouseDetails) {

        }

        @Override
        public void mouseDown(String msg) {

            System.out.println("mousedetails = " + msg +" FALSE");

            }

        @Override
        public void mouseUp(String msg) {






        }
    };

    public void setButtonName(String msg){
        getState().text = msg;
    }

    @Override
    public MouseUpDownState getState() {
        return (MouseUpDownState) super.getState();
    }


}
