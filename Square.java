package org.priyam.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

/*import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;*/

public class Square {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	private MessageSource msgSrc;

	@Autowired
	public void setMsgSrc(MessageSource msgSrc) {
		this.msgSrc = msgSrc;
	}
	
	
	public void draw() {
		//System.out.println("Square drawn");
		System.out.println(this.msgSrc.getMessage("square.draw", null,"Default text : Square Drawn",null));
		System.out.println(this.msgSrc.getMessage("square.pt1",new Object[] {getPointA().getX(),getPointA().getY()},"Default pt. 1",null));
		System.out.println(this.msgSrc.getMessage("square.pt2",new Object[] {getPointB().getX(),getPointB().getY()},"Default pt. 2",null));
		System.out.println(this.msgSrc.getMessage("square.pt3",new Object[] {getPointC().getX(),getPointC().getY()},"Default pt. 3",null));
		System.out.println(this.msgSrc.getMessage("square.pt4",new Object[] {getPointD().getX(),getPointD().getY()},"Default pt. 4",null));
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	/*
	 * @Override public void afterPropertiesSet() throws Exception { // TODO
	 * Auto-generated method stub
	 * System.out.println("InitializingBean init method called for Square"); }
	 * 
	 * @Override public void destroy() throws Exception { // TODO Auto-generated
	 * method stub
	 * System.out.println("DisposableBean destroy method called for Square"); }
	 */

	public void myBeanInitialization() {
		System.out.println("InitializingBean - myBeanInitialization() method called for Square"); 
	}
	public void myBeanDestroy() {
		System.out.println("DisposableBean - myBeanDestroy() method called for Square"); 
	}
	
	
}
