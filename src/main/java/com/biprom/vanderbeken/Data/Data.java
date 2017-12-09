package com.biprom.vanderbeken.Data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sharedData")
@Scope("singleton")

public class Data {

	boolean uitbereiding1 = false;				//uitgang 14
	boolean gebouw1 = false;					//uitgang 13
	boolean uitbereiding2GietMetZand = false;	//uitgang 23
	boolean uitbereiding2StaalOpslTechn = false; //uitgang 24
	boolean garageStockage = false;				 //uitgang 15

	//initialisatie uitgangen Verlichting

	boolean zoneStaal1a = false;				//uitgang 16
	boolean zoneStaal1b = false;				//uitgang 17
	boolean zoneMetaal1 = false;				//uitgang 18
	boolean zoneMetaal2 = false;				//uitgang 19
	boolean zoneGieten = false;					//uitgang 20
	boolean zoneKronen = false;					//uitgang 21
	boolean zoneGarage = false;					//uitgang 22

	boolean bureauAlain = false;				//uitgang 1
	boolean zoneLandscape1a = false;			//uitgang 2
	boolean zoneLandscape1b = false;			//uitgang 3
	boolean zonePorcelein1 = false;				//uitgang 8
	boolean zonePorcelein2 = false;				//uitgang 9
	boolean zoneZirkonium = false;				//uitgang 7
	boolean zoneSpray = false;					//uitgang 6
	boolean zoneMeten = false;					//uitgang 5
	boolean secretZone = false;					//uitgang 4
	boolean zoneInkom = false;					//uitgang 11
	boolean kitchenette = false;				//uitgang 10
	boolean outdoor = false;					//uitgang 12

	boolean statusUitbereiding1 = true;				//uitgang 14
	boolean statusGebouw1 = true;					//uitgang 13
	boolean statusUitbereiding2GietMetZand = true;	//uitgang 23
	boolean statusUitbereiding2StaalOpslTechn = true; //uitgang 24
	boolean statusGarageStockage = true;				 //uitgang 15

	//initialisatie uitgangen Verlichting

	boolean statusZoneStaal1a = true;				//uitgang 16
	boolean statusZoneStaal1b = true;				//uitgang 17
	boolean statusZoneMetaal1 = true;				//uitgang 18
	boolean statusZoneMetaal2 = true;				//uitgang 19
	boolean statusZoneGieten = true;					//uitgang 20
	boolean statusZoneKronen = true;					//uitgang 21
	boolean statusZoneGarage = true;					//uitgang 22

	boolean statusBureauAlain = true;				//uitgang 1
	boolean statusZoneLandscape1a = true;			//uitgang 2
	boolean statusZoneLandscape1b = true;			//uitgang 3
	boolean statusZonePorcelein1 = true;				//uitgang 8
	boolean statusZonePorcelein2 = true;				//uitgang 9
	boolean statusZoneZirkonium = true;				//uitgang 7
	boolean statusZoneSpray = true;					//uitgang 6
	boolean statusZoneMeten = true;					//uitgang 5
	boolean statusSecretZone = true;					//uitgang 4
	boolean statusZoneInkom = true;					//uitgang 11
	boolean statusKitchenette = true;				//uitgang 10
	boolean statusOutdoor = true;					//uitgang 12

	public boolean isUitbereiding1() {
		return uitbereiding1;
	}

	public void setUitbereiding1(boolean uitbereiding1) {
		this.uitbereiding1 = uitbereiding1;
	}

	public boolean isGebouw1() {
		return gebouw1;
	}

	public void setGebouw1(boolean gebouw1) {
		this.gebouw1 = gebouw1;
	}

	public boolean isUitbereiding2GietMetZand() {
		return uitbereiding2GietMetZand;
	}

	public void setUitbereiding2GietMetZand(boolean uitbereiding2GietMetZand) {
		this.uitbereiding2GietMetZand = uitbereiding2GietMetZand;
	}

	public boolean isUitbereiding2StaalOpslTechn() {
		return uitbereiding2StaalOpslTechn;
	}

	public void setUitbereiding2StaalOpslTechn(boolean uitbereiding2StaalOpslTechn) {
		this.uitbereiding2StaalOpslTechn = uitbereiding2StaalOpslTechn;
	}

	public boolean isGarageStockage() {
		return garageStockage;
	}

	public void setGarageStockage(boolean garageStockage) {
		this.garageStockage = garageStockage;
	}

	public boolean isZoneStaal1a() {
		return zoneStaal1a;
	}

	public void setZoneStaal1a(boolean zoneStaal1a) {
		this.zoneStaal1a = zoneStaal1a;
	}

	public boolean isZoneStaal1b() {
		return zoneStaal1b;
	}

	public void setZoneStaal1b(boolean zoneStaal1b) {
		this.zoneStaal1b = zoneStaal1b;
	}

	public boolean isZoneMetaal1() {
		return zoneMetaal1;
	}

	public void setZoneMetaal1(boolean zoneMetaal1) {
		this.zoneMetaal1 = zoneMetaal1;
	}

	public boolean isZoneMetaal2() {
		return zoneMetaal2;
	}

	public void setZoneMetaal2(boolean zoneMetaal2) {
		this.zoneMetaal2 = zoneMetaal2;
	}

	public boolean isZoneGieten() {
		return zoneGieten;
	}

	public void setZoneGieten(boolean zoneGieten) {
		this.zoneGieten = zoneGieten;
	}

	public boolean isZoneKronen() {
		return zoneKronen;
	}

	public void setZoneKronen(boolean zoneKronen) {
		this.zoneKronen = zoneKronen;
	}

	public boolean isZoneGarage() {
		return zoneGarage;
	}

	public void setZoneGarage(boolean zoneGarage) {
		this.zoneGarage = zoneGarage;
	}

	public boolean isBureauAlain() {
		return bureauAlain;
	}

	public void setBureauAlain(boolean bureauAlain) {
		this.bureauAlain = bureauAlain;
	}

	public boolean isZoneLandscape1a() {
		return zoneLandscape1a;
	}

	public void setZoneLandscape1a(boolean zoneLandscape1a) {
		this.zoneLandscape1a = zoneLandscape1a;
	}

	public boolean isZoneLandscape1b() {
		return zoneLandscape1b;
	}

	public void setZoneLandscape1b(boolean zoneLandscape1b) {
		this.zoneLandscape1b = zoneLandscape1b;
	}

	public boolean isZonePorcelein1() {
		return zonePorcelein1;
	}

	public void setZonePorcelein1(boolean zonePorcelein1) {
		this.zonePorcelein1 = zonePorcelein1;
	}

	public boolean isZonePorcelein2() {
		return zonePorcelein2;
	}

	public void setZonePorcelein2(boolean zonePorcelein2) {
		this.zonePorcelein2 = zonePorcelein2;
	}

	public boolean isZoneZirkonium() {
		return zoneZirkonium;
	}

	public void setZoneZirkonium(boolean zoneZirkonium) {
		this.zoneZirkonium = zoneZirkonium;
	}

	public boolean isZoneSpray() {
		return zoneSpray;
	}

	public void setZoneSpray(boolean zoneSpray) {
		this.zoneSpray = zoneSpray;
	}

	public boolean isZoneMeten() {
		return zoneMeten;
	}

	public void setZoneMeten(boolean zoneMeten) {
		this.zoneMeten = zoneMeten;
	}

	public boolean isSecretZone() {
		return secretZone;
	}

	public void setSecretZone(boolean secretZone) {
		this.secretZone = secretZone;
	}

	public boolean isZoneInkom() {
		return zoneInkom;
	}

	public void setZoneInkom(boolean zoneInkom) {
		this.zoneInkom = zoneInkom;
	}

	public boolean isKitchenette() {
		return kitchenette;
	}

	public void setKitchenette(boolean kitchenette) {
		this.kitchenette = kitchenette;
	}

	public boolean isOutdoor() {
		return outdoor;
	}

	public void setOutdoor(boolean outdoor) {
		this.outdoor = outdoor;
	}

	public boolean isStatusZoneStaal1a() {
		return statusZoneStaal1a;
	}

	public void setStatusZoneStaal1a(boolean statusZoneStaal1a) {
		this.statusZoneStaal1a = statusZoneStaal1a;
	}

	public boolean isStatusZoneStaal1b() {
		return statusZoneStaal1b;
	}

	public void setStatusZoneStaal1b(boolean statusZoneStaal1b) {
		this.statusZoneStaal1b = statusZoneStaal1b;
	}

	public boolean isStatusZoneMetaal1() {
		return statusZoneMetaal1;
	}

	public void setStatusZoneMetaal1(boolean statusZoneMetaal1) {
		this.statusZoneMetaal1 = statusZoneMetaal1;
	}

	public boolean isStatusZoneMetaal2() {
		return statusZoneMetaal2;
	}

	public void setStatusZoneMetaal2(boolean statusZoneMetaal2) {
		this.statusZoneMetaal2 = statusZoneMetaal2;
	}

	public boolean isStatusZoneGieten() {
		return statusZoneGieten;
	}

	public void setStatusZoneGieten(boolean statusZoneGieten) {
		this.statusZoneGieten = statusZoneGieten;
	}

	public boolean isStatusZoneKronen() {
		return statusZoneKronen;
	}

	public void setStatusZoneKronen(boolean statusZoneKronen) {
		this.statusZoneKronen = statusZoneKronen;
	}

	public boolean isStatusZoneGarage() {
		return statusZoneGarage;
	}

	public void setStatusZoneGarage(boolean statusZoneGarage) {
		this.statusZoneGarage = statusZoneGarage;
	}

	public boolean isStatusBureauAlain() {
		return statusBureauAlain;
	}

	public void setStatusBureauAlain(boolean statusBureauAlain) {
		this.statusBureauAlain = statusBureauAlain;
	}

	public boolean isStatusZoneLandscape1a() {
		return statusZoneLandscape1a;
	}

	public void setStatusZoneLandscape1a(boolean statusZoneLandscape1a) {
		this.statusZoneLandscape1a = statusZoneLandscape1a;
	}

	public boolean isStatusZoneLandscape1b() {
		return statusZoneLandscape1b;
	}

	public void setStatusZoneLandscape1b(boolean statusZoneLandscape1b) {
		this.statusZoneLandscape1b = statusZoneLandscape1b;
	}

	public boolean isStatusZonePorcelein1() {
		return statusZonePorcelein1;
	}

	public void setStatusZonePorcelein1(boolean statusZonePorcelein1) {
		this.statusZonePorcelein1 = statusZonePorcelein1;
	}

	public boolean isStatusZonePorcelein2() {
		return statusZonePorcelein2;
	}

	public void setStatusZonePorcelein2(boolean statusZonePorcelein2) {
		this.statusZonePorcelein2 = statusZonePorcelein2;
	}

	public boolean isStatusZoneZirkonium() {
		return statusZoneZirkonium;
	}

	public void setStatusZoneZirkonium(boolean statusZoneZirkonium) {
		this.statusZoneZirkonium = statusZoneZirkonium;
	}

	public boolean isStatusZoneSpray() {
		return statusZoneSpray;
	}

	public void setStatusZoneSpray(boolean statusZoneSpray) {
		this.statusZoneSpray = statusZoneSpray;
	}

	public boolean isStatusZoneMeten() {
		return statusZoneMeten;
	}

	public void setStatusZoneMeten(boolean statusZoneMeten) {
		this.statusZoneMeten = statusZoneMeten;
	}

	public boolean isStatusSecretZone() {
		return statusSecretZone;
	}

	public void setStatusSecretZone(boolean statusSecretZone) {
		this.statusSecretZone = statusSecretZone;
	}

	public boolean isStatusZoneInkom() {
		return statusZoneInkom;
	}

	public void setStatusZoneInkom(boolean statusZoneInkom) {
		this.statusZoneInkom = statusZoneInkom;
	}

	public boolean isStatusKitchenette() {
		return statusKitchenette;
	}

	public void setStatusKitchenette(boolean statusKitchenette) {
		this.statusKitchenette = statusKitchenette;
	}

	public boolean isStatusOutdoor() {
		return statusOutdoor;
	}

	public void setStatusOutdoor(boolean statusOutdoor) {
		this.statusOutdoor = statusOutdoor;
	}

	public boolean isStatusUitbereiding1() {
		return statusUitbereiding1;
	}

	public void setStatusUitbereiding1(boolean statusUitbereiding1) {
		this.statusUitbereiding1 = statusUitbereiding1;
	}

	public boolean isStatusGebouw1() {
		return statusGebouw1;
	}

	public void setStatusGebouw1(boolean statusGebouw1) {
		this.statusGebouw1 = statusGebouw1;
	}

	public boolean isStatusUitbereiding2GietMetZand() {
		return statusUitbereiding2GietMetZand;
	}

	public void setStatusUitbereiding2GietMetZand(boolean statusUitbereiding2GietMetZand) {
		this.statusUitbereiding2GietMetZand = statusUitbereiding2GietMetZand;
	}

	public boolean isStatusUitbereiding2StaalOpslTechn() {
		return statusUitbereiding2StaalOpslTechn;
	}

	public void setStatusUitbereiding2StaalOpslTechn(boolean statusUitbereiding2StaalOpslTechn) {
		this.statusUitbereiding2StaalOpslTechn = statusUitbereiding2StaalOpslTechn;
	}

	public boolean isStatusGarageStockage() {
		return statusGarageStockage;
	}

	public void setStatusGarageStockage(boolean statusGarageStockage) {
		this.statusGarageStockage = statusGarageStockage;
	}
}
