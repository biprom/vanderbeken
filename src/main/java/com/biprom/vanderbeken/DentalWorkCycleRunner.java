package com.biprom.vanderbeken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DentalWorkCycleRunner {
	
	DentalWorkCycle dwc;
	SocketWorkCycle swc;
	
	@Autowired
	public DentalWorkCycleRunner(DentalWorkCycle dentalWorkCycle, SocketWorkCycle socketWorkCycle) {
		this.dwc = dentalWorkCycle;
		this.swc = socketWorkCycle;
		
	}

	//DentalWorkCycle wc = new DentalWorkCycle(null);

	@PostConstruct
	public void init() {
		Thread thread1= new Thread(dwc);
		System.out.println("start thread dentalWorkcycle");
		thread1.start();

		Thread thread2 = new Thread( swc );
		System.out.println("start thread socketWorkCycle");
		thread2.start();


	}
	
	@SuppressWarnings("deprecation")
	@PreDestroy
	public void destroy() {
		if (dwc != null) {
			dwc.stop();
		}
		if (swc != null) {
			swc.stop();
		}
	}

}