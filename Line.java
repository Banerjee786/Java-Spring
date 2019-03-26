package org.priyam.sample;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;

public class Line implements ApplicationContextAware,BeanNameAware,ApplicationEventPublisherAware {

	private Point p1;
	private Point p2;
	private ApplicationContext context;
	private String beanName;
	private ApplicationEventPublisher publisher;
	
	@Autowired
	private MessageSource msgSource;
	
	public Point getP1() {
		return p1;
	}
	
	public void setMsgSource(MessageSource msgSource) {
		this.msgSource = msgSource;
	}
	@Autowired
	@Qualifier("linePt1")
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	
	@Autowired
	@Qualifier("linePt2")
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
	@Override
	public void setBeanName(String beanName) {
		this.beanName=beanName;
		
	}
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;		
	}	
	public void draw() {
		System.out.println();
		System.out.println("Bean Name is "+this.beanName);
		System.out.println(this.msgSource.getMessage("lineval", null,"DEfault Line", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
		System.out.println("Line end 1 : ("+getP1().getX()+","+getP1().getY()+")");
		System.out.println("Line end 2 : ("+getP2().getX()+","+getP2().getY()+")");
		
	}

	
}
