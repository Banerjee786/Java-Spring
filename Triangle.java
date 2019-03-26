package org.priyam.sample;
import java.util.*;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements Shape,BeanNameAware,InitializingBean,DisposableBean{

	private String beanName;
	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	@Override
	public void draw() {
		System.out.println("\nBean Name is "+this.beanName);
		System.out.println("Triangle drawn with coordinates as : ");
		for(Point p : points) {
			System.out.println("(x,y) --> ("+p.getX()+","+p.getY()+")");
		}
	}
	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		this.beanName = beanName;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean init method called for Triangle");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean - destroy() method called for Triangle");
	}
}
