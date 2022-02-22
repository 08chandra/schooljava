package com.cart.io;
//Copyright 2020
//Owner:Cart.io
//Will engage in legal action if copied.


import java.awt.Robot;

public class AutoClicker {
	private Robot robot;
	private int delay;

	public AutoClicker() {
		try {
			robot = new Robot();
		} catch (Exception e) {

			e.printStackTrace();
		}
		delay = 100;
	}

	public void ClickMouse(int button) {
		try {
			robot.mousePress(button);
			robot.delay(100);
			robot.mouseRelease(button);
			robot.delay(delay);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setDelay(int ms) {
		this.delay = ms;

	}

}
