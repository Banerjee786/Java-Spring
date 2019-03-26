package org.priyam.sample;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent{
	
	public DrawEvent(Object obj) {
		super(obj);
	}
	
	public String toString() {
			return "DrawEvent occurred "; 
	}
}
