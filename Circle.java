package org.priyam.sample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@SuppressWarnings("deprecation")
@Component
public class Circle implements Shape,BeanNameAware {
	
	private Point center;
	private String beanName;

	public Point getCenter() {
		return center;
	}

	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("\nBean Name is "+this.beanName);
		System.out.println("Center of circle : ("+center.getX()+","+center.getY()+")");
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	@PostConstruct
	public void InitializeCircle() {
		System.out.println("Init of Circle");
	}
	@PreDestroy
	public void DestroyCircle() {
		System.out.println("Destroy of Circle");
	}

}
