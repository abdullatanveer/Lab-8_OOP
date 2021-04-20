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
public class Computer {
    protected String wordsize;
	protected String memorysize;
	protected String storagesize;
	protected String speed;

	public Computer()
	{
		wordsize = "NSize";
		memorysize = "4GB";
		storagesize = "1TB";
		speed = "2.6gHz" ;
	}

	public Computer(String w,String m, String ss, String si)
	{
		this.wordsize = w ;
		this.memorysize = m ;
		this.storagesize = ss ;
		this.speed = si ;
	}

	

	public void display()
	{
		System.out.printf("Word Size : %s \nMemory Size : %s \nStorage Size : %s \nSpeed : %s",wordsize,memorysize,storagesize,speed);

	}
}
