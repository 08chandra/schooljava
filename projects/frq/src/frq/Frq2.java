package frq;

import java.util.Scanner;

public class Frq2 {

	public void drawSquare(int x, int y, int length) {
		int a;
		int b;
		if (x + length > 10) {
			a = x + length - 10;
		} else if (y - length < 0) {
			b = y;
		}
		if (a > b) {
			length = b;
		} else if (b > a) {
			length = a;
		}
		drawLine(x, y, x + length, y);
		drawLine(x, y, x, y - length);
		drawLine(x + length, y, x + length, y - length);
		drawLine(x, y - length, x + length, y - length);
	}

	p
}
