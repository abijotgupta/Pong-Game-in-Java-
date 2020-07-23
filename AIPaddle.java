package com.abi;

import java.awt.Color;
import java.awt.Graphics;

public class AIPaddle implements Paddle {

	double y, yVel;
	boolean upAccel, downAccel;
	final double GRAVITY = 0.94;
	int player, x;
	Ball b1;
	
	public AIPaddle(int player, Ball b) {
		upAccel = false;
		downAccel = false;
		b1 = b;
		y = 210;
		yVel = 0;
		if(player == 1)
			x = 20;
		else
			x = 660;	
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x, (int)y, 20, 80);
	}

	@Override
	public void move() {
		y = b1.getY() - 40;
		if(y < 0)
			y = 0;
		if(y > 420)
			y = 420;
	}
	
	@Override
	public int getY() {
		
		return (int)y;
	}

}
