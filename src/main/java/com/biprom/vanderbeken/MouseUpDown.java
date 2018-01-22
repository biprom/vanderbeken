package com.biprom.vanderbeken;

import com.biprom.vanderbeken.client.MouseUpDownClientRpc;
import com.biprom.vanderbeken.client.MouseUpDownServerRpc;
import com.biprom.vanderbeken.client.MouseUpDownState;
import com.google.gwt.dev.javac.Shared;
import com.vaadin.shared.AbstractComponentState;
import com.vaadin.shared.MouseEventDetails;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.AbstractComponent;
import org.springframework.stereotype.Component;


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

            System.out.println("mousedetails = " + msg +" TRUE");

            switch (msg){
                case "buttonUitbereiding1":     SharedData.data.setUitbereiding1( true);
                    break;
                case "buttonGebouw1":  SharedData.data.setGebouw1( true);
                    break;
                case "buttonGietZand":  SharedData.data.setZoneGieten( true);
                    break;
                case "buttonStaalOpslTechn":  SharedData.data.setUitbereiding2StaalOpslTechn( true);
                    break;
                case "buttonGieten":  SharedData.data.setZoneGieten( true);
                    break;
                case "buttonMetaal1":  SharedData.data.setZoneMetaal1( true);
                    break;
                case "buttonStaal1":  SharedData.data.setZoneStaal1a( true);
                    break;
                case "buttonKronen":  SharedData.data.setZoneKronen( true);
                    break;
                case "buttonMetaal2":  SharedData.data.setZoneMetaal2( true);
                    break;
                case "buttonStaal2":  SharedData.data.setZoneStaal1b( true);
                    break;
                case "buttonStock2":  SharedData.data.setZoneGarage( true);
                    break;
                case "buttonStock1":  SharedData.data.setGarageStockage( true);
                    break;
                case "buttonInkom":  SharedData.data.setZoneInkom( true);
                    break;
                case "buttonKeuken":  SharedData.data.setKitchenette( true);
                    break;
                case "buttonPorcelein2":  SharedData.data.setZonePorcelein2( true);
                    break;
                case "buttonPorcelein1":  SharedData.data.setZonePorcelein1( true);
                    break;
                case "buttonZirconium":  SharedData.data.setZoneZirkonium( true);
                    break;
                case "buttonSecret":  SharedData.data.setSecretZone( true);
                    break;
                case "buttonMeten":  SharedData.data.setZoneMeten( true);
                    break;
                case "buttonSpray":  SharedData.data.setZoneSpray( true);
                    break;
                case "buttonBureauAlain":  SharedData.data.setBureauAlain( true);
                    break;
                case "buttonLandscape1":  SharedData.data.setZoneLandscape1a( true);
                    break;
                case "buttonLandscape2":  SharedData.data.setZoneLandscape1b( true);
                    break;
            }

            }

        @Override
        public void mouseUp(String msg) {

            System.out.println("mousedetails = " + msg +" FALSE");

            switch (msg){
                case "buttonUitbereiding1":  SharedData.data.setUitbereiding1( false);
                    break;
                case "buttonGebouw1":  SharedData.data.setGebouw1( false);
                    break;
                case "buttonGietZand":  SharedData.data.setZoneGieten( false);
                    break;
                case "buttonStaalOpslTechn":  SharedData.data.setUitbereiding2StaalOpslTechn( false);
                    break;
                case "buttonGieten":  SharedData.data.setZoneGieten( false);
                    break;
                case "buttonMetaal1":  SharedData.data.setZoneMetaal1( false);
                    break;
                case "buttonStaal1":  SharedData.data.setZoneStaal1a( false);
                    break;
                case "buttonKronen":  SharedData.data.setZoneKronen( false);
                    break;
                case "buttonMetaal2":  SharedData.data.setZoneMetaal2( false);
                    break;
                case "buttonStaal2":  SharedData.data.setZoneStaal1b( false);
                    break;
                case "buttonStock2":  SharedData.data.setZoneGarage( false);
                    break;
                case "buttonStock1":  SharedData.data.setGarageStockage( false);
                    break;
                case "buttonInkom":  SharedData.data.setZoneInkom( false);
                    break;
                case "buttonKeuken":  SharedData.data.setKitchenette( false);
                    break;
                case "buttonPorcelein2":  SharedData.data.setZonePorcelein2( false);
                    break;
                case "buttonPorcelein1":  SharedData.data.setZonePorcelein1( false);
                    break;
                case "buttonZirconium":  SharedData.data.setZoneZirkonium( false);
                    break;
                case "buttonSecret":  SharedData.data.setSecretZone( false);
                    break;
                case "buttonMeten":  SharedData.data.setZoneMeten( false);
                    break;
                case "buttonSpray":  SharedData.data.setZoneSpray( false);
                    break;
                case "buttonBureauAlain":  SharedData.data.setBureauAlain( false);
                    break;
                case "buttonLandscape1":  SharedData.data.setZoneLandscape1a( false);
                    break;
                case "buttonLandscape2":  SharedData.data.setZoneLandscape1b( false);
                    break;
            }

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
