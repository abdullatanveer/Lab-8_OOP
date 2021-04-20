/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicationrunner;

/**
 *
 * @author abdul
 */
public class Publication {
    protected String title;
    protected float price;

//...................Constructors.................
	public Publication()
	{
		title = "introduction to java ";
		price = 1200f;
	}	

	public Publication(String t,float p)
	{
		title = t;
		price = (float) p;
	}	

//..................Setters And Getters...........
	
	public void Settitle(String t)
	{
		title = t ;
	}

	public void Setprice(float t)
	{
		price = (float) t ;
	}

	public String Gettitle()
	{
		return title;
	}
	
	public float Getprice()
	{
		return price;
	}

//................Display.........................

	public void display()
	{
		System.out.println("Title : "+ title + " Price "+ price);	
	}	
}


