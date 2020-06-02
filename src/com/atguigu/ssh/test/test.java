package com.atguigu.ssh.test;

import java.util.Scanner;

import org.junit.Test;

public class test {

	
	public static void main(String[] args) {
	
		System.err.println("111");
	
}
	@Test
	public void user() {
		int i =122;
		System.err.println(i);
		System.out.println("test.user()");
	}
	@Test
	public void test1() {
		 Scanner scanner = new Scanner(System.in);
	        int sum = 0;
	        for (int i = 0; i < 10; i++) {
	            System.out.print("请输入第" + (i + 1) + "个整数：");
	            int num = scanner.nextInt();
	            sum += num;
	        } 
	        System.out.println("总和为：权" + sum + "，平均值为：" + sum / 10.0);
	    }
	@Test
	public void name() {
		
	
		
			Scanner in=new Scanner(System.in);
			Fan f1=new Fan();
			Fan f2=new Fan();
			int on;
			on=in.nextInt();
			f2.setOn(on==1);
			f2.setSpeed(in.nextInt());
			f2.setColor(in.next());
			f2.setRadius(in.nextDouble());
			System.out.println(f1.toString());
			System.out.println(f2.toString());
			}
			}
	class Fan
	{
		static final int SLOW=1;
		static final int MEDIUM=2;
		static final int FAST=3;
		private int speed=SLOW;
		private boolean on=false;
		private double radius=5;
		String color="blue";
		public Fan()
		{
			
		}
		public int setSpeed()
		{
			return speed;
		}
		public void setSpeed(int speed)
		{
			if(on)
				this.speed=speed;
		}
		public boolean getOn()
		{
			return on;
		}
		public void setOn(boolean on)
		{
			this.on=on;
		}
		public void setRadius(double radius)
		{
			if(on)
				this.radius=radius;
		}
		public String getColor()
		{
			return color;
		}
		public void setColor(String color)
		{
			if(on)
				this.color=color;
		}
		public String toString()
		{
			if(on)
			{
				return speed+":"+color+":"+radius;
			}
			else
				return "Fan if off"+":"+color+":"+radius;
		}
	}


