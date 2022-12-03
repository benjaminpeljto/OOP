package tut_week6;

import java.util.Random;

public class NightSky {
	private double density;
	private int width;
	private int height;
	private int starsInLastPrint;
	public NightSky(double density) {
		this.density = density;
		this.width = 20;
		this.height = 10;
		this.starsInLastPrint = 0;
	}
	
	public NightSky(int width, int height) {
		this(0.1);
		this.height = height;
		this.width = width;
		this.starsInLastPrint = 0;
	}
	
	public NightSky(double density, int width, int height) {
		this(width,height);
		this.density = density;
		this.starsInLastPrint = 0;
	}
	
	//PRINTS ONLY ONE LINE
	public void printLine() {
		Random random = new Random();
		for(int i=0; i<width; i++) {
			if(random.nextDouble() <= this.density) {
				System.out.print("*");
				this.starsInLastPrint++;
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	//PRINTS WHOLE STAR SYSTEM
	public void print() {
		this.starsInLastPrint = 0;
		for(int i = 0; i<this.height ; i++) {
			printLine();
		}
	}
	
	//RETURNS NUMBER OF STARS
	public int starsInLastPrint() {
		return this.starsInLastPrint;
	}
	
	
}
