package com.biprom.vanderbeken.client;

import com.vaadin.shared.MouseEventDetails;
import com.vaadin.shared.communication.ServerRpc;

public interface MouseUpDownServerRpc extends ServerRpc {

    public void clicked(MouseEventDetails mouseDetails);
    public void mouseDown(String msg);
    public void mouseUp(String msg);

}
