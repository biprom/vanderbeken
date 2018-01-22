package com.biprom.vanderbeken;

import com.biprom.vanderbeken.Data.Data;
import com.biprom.vanderbeken.IO.DigOutput_PCF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component("dentalWorkCycle")
@Scope("prototype")
public class DentalWorkCycle extends Thread {

	Data sharedData1;

	//get shared data from Bean


	@Autowired
	public DentalWorkCycle(Data dt){
		this.sharedData1 = dt;
	}

	//initialisatie outputs
	DigOutput_PCF digital_output_card_1 = new DigOutput_PCF(1, 0X27);
	DigOutput_PCF digital_output_card_2 = new DigOutput_PCF(1, 0X26);
	DigOutput_PCF digital_output_card_3 = new DigOutput_PCF(1, 0X25);


	private void setOutputsToVariables() {

		try{
			digital_output_card_1.d1.setState(!sharedData1.isBureauAlain());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_1.d2.setState(!sharedData1.isZoneLandscape1a());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_1.d3.setState(!sharedData1.isZoneLandscape1b());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_1.d4.setState(!sharedData1.isSecretZone());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_1.d5.setState(!sharedData1.isZoneStaal1a());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_1.d6.setState(!sharedData1.isGarageStockage());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_1.d7.setState(!sharedData1.isUitbereiding1());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_1.d8.setState(!sharedData1.isGebouw1());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_2.d1.setState(!sharedData1.isZoneMeten());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_2.d2.setState(!sharedData1.isZoneSpray());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_2.d3.setState(!sharedData1.isZoneZirkonium());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_2.d4.setState(!sharedData1.isZonePorcelein1());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_2.d5.setState(!sharedData1.isZoneGieten());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_2.d6.setState(!sharedData1.isZoneMetaal2());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_2.d7.setState(!sharedData1.isZoneMetaal1());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_2.d8.setState(!sharedData1.isZoneStaal1b());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_3.d1.setState(!sharedData1.isZonePorcelein2());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_3.d2.setState(!sharedData1.isKitchenette());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_3.d3.setState(!sharedData1.isZoneInkom());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_3.d4.setState(!sharedData1.isOutdoor());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_3.d5.setState(!sharedData1.isUitbereiding2StaalOpslTechn());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_3.d6.setState(!sharedData1.isUitbereiding2GietMetZand());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_3.d7.setState(!sharedData1.isZoneGarage());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			digital_output_card_3.d8.setState(!sharedData1.isZoneKronen());
		}
		catch (Exception e) {
		}
		try {
			TimeUnit.MILLISECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}




	public void run(){
		while(true){




			setOutputsToVariables();

			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}


	}


}
