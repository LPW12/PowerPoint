// Lab15st.java
// This is the student, starting file for Lab 15.
// This file is identical to Java1521.java.
// This slide show is about Mr. Leon Schram.
// Each student needs to alter this presentation,
// add pictures, add pages, add graphics and make it about him/herself.


import java.awt.*;


public class Lab15st extends java.applet.Applet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int numClicks;
	Image picture1, picture2, picture3, picture4, picture5, picture6, picture7,picture8, picture9;

	public void init()
	{
		numClicks = 0;
		picture1 = getImage(getDocumentBase(),"Me.jpg");
		picture2 = getImage(getDocumentBase(),"racecar.jpg");
		picture3 = getImage(getDocumentBase(),"map.gif");
		picture4 = getImage(getDocumentBase(),"leon&isolde.jpg");
		picture5 = getImage(getDocumentBase(),"soccer.png");
		picture6 = getImage(getDocumentBase(),"UAH.png");
		picture7 = getImage(getDocumentBase(),"UAH_primary.png");
		picture8 = getImage(getDocumentBase(),"wind.jpg");
		picture9 = getImage(getDocumentBase(),"");
		// The following MediaTracker/try/catch code ensures that
		// all images are loaded before the program continues.
		MediaTracker tracker = new MediaTracker(this);
		tracker.addImage(picture1,1);
		tracker.addImage(picture2,1);
		tracker.addImage(picture3,1);
		tracker.addImage(picture4,1);
		tracker.addImage(picture5,1);
		try
		{
			tracker.waitForAll();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public void paint(Graphics g)
	{
		switch (numClicks)
		{
			case 0 : page1(g); break;
			case 1 : page2(g); break;
			case 2 : page3(g); break;
			case 3 : page4(g); break;
			case 4 : page5(g); break;
		}
	}

	public boolean mouseDown(Event e, int x, int y)
	{
		numClicks++;
		repaint();
		return true;
	}

	public void page1(Graphics g)
	{
		Expo.setBackground(g, Expo.darkRed);
		Expo.setFont(g,"Arial",Font.BOLD,75);
		Expo.drawString(g,"The Life of Liam Wynne",65,75);
		Expo.setColor(g,Expo.black);
		Expo.drawThickPreciseSpiral(g,510,370,275,50,15);
		Expo.setColor(g,Expo.green);
		Expo.fillStar(g,510,370,175,8);
		Expo.setColor(g,Expo.blue);
		Expo.drawThickStar(g,510,370,225,8,25);
		Expo.setColor(g,Expo.green);
		Expo.drawThickStar(g,510,370,275,8,25);
		g.drawImage(picture1,385,200,250,375,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"My name is Liam Wynne.",30,300);
		Expo.drawString(g,"Click once to continue.",760,550);
	}

	public void page2(Graphics g)
	{
		Expo.setBackground(g, Expo.blue);
		Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"Family?",250,100);
		Expo.setColor(g,Expo.yellow);
		Expo.fillRectangle(g,100,235,900,625);
		Expo.setColor(g,Expo.chartreuse);
		g.drawImage(picture3,150,250,this);
		g.drawImage(picture4,500,280,this);
		Expo.setColor(g,Expo.red);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I was born in the New Jersey in 1798",100,200);
		Expo.drawString(g,"I am the youngest of 3 children", 100, 225);
		Expo.drawString(g,"Click once to continue.",600,600);
	}

	public void page3(Graphics g) //complete
	{
		Expo.setBackground(g, Expo.darkerGreen);
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"I have a life?",200,100);
		Expo.setColor(g,Expo.red);
		Expo.fillRoundedRectangle(g,460,170,960,515,50);
		g.drawImage(picture5,75,200,374,374,this);
		g.drawImage(picture2,560,260,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I enjoy to racing and playing soccer.",100,150);
		Expo.drawString(g, "My dream job was to race professionaly", 100, 175);
		Expo.drawString(g,"Click once to continue.",750,550);
	}
	
	public void page4(Graphics g) //complete
	{
		Expo.setBackground(g, Expo.white);
		Expo.setColor(g,Expo.blue);
		Expo.setFont(g,"Impact",Font.BOLD,75);
		Expo.drawString(g, "My life after HighSchool", 80, 100);
		Expo.setFont(g,"Times Roman",Font.PLAIN,30);
		Expo.drawString(g, "I plan on attending the University of Alabama in Huntsville", 50, 200);
		Expo.drawString(g, "I am going to study Aerospace Engineering", 50, 250);
		g.drawImage(picture6, 25, 500,this);
		g.drawImage(picture7,300,220,678,360,this);
	}
	
	public void page5(Graphics g) //complete
	{
		Expo.setBackground(g, Expo.plum);
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g, "My Career", 300, 100);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g, "My planned career is to work in a wind tunnel", 100, 150);
		Expo.drawString(g, "I want to work on the aerodynamic proparties of cars", 100, 175);
		g.drawImage(picture8,225,220,600,400,this);
	}
}

