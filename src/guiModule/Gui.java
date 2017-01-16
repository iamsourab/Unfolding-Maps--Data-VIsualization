package guiModule;

import processing.core.PApplet;

public class Gui extends PApplet {
	
	public void setup()
	{
		size(400,400);
		this.background(200,100,100);
	}
	
	public void draw()
	{
		int[] color= calcRgb(second());
		fill(color[0],color[1],0);
		ellipse(200,200,390,390);
		fill(0,0,0);
		ellipse(120,120,30,50);
		ellipse(280,120,30,50);
		noFill();
		arc(200,280,150,80, 0, PI);
	}
	public int[] calcRgb(float seconds)
	{
		int[] rgb=new int[3];
		
		float differBy30;
		differBy30=Math.abs(30-seconds);
		float ratio=differBy30/30;
		rgb[0]=(int) (ratio*255);
		rgb[1]=(int) (ratio*255);
		rgb[2]=0;
		System.out.print(rgb[0]);

		return rgb;
	}

}
