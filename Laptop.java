/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptoprunner;


/**
 *
 * @author abdul
 */
public class Laptop extends Computer {
    private String length;
	private String width;
	private String height;
	private String weight;

// First Constructor

	public Laptop() 
	{
		super();
		length = "X inches";
		width = "Y inches";
		height = "Z inches";
		weight = "N gms";
	}

// Argumented Constructor 

	public Laptop(String a,String b,String c,String d,String e,String f,String g,String h)
	{
		super(a,b,c,d);		
		this.length = "X inches";
		this.width = "Y inches";
		this.height = "Z inches";
		this.weight = "N gms";
	}
// Display Method to Display
    @Override
	public void display()
	{
         System.out.printf("Word Size : %s \nMemory Size : %s \nStorage Size : %s \nSpeed : %s\nLength : %s \nWidth : %s \nHeight : %s \nWeight : %s"
                ,wordsize,memorysize,storagesize,speed,length,width,height,weight);

	}
    
    
}
