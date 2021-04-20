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
public class Tape  extends Publication{
    private float playTime;
	
	public void SetplayTime(float t)
	{
		playTime = (float) t; 
	}
	
	public float GetplayTime()
	{
		return playTime;
	}

    @Override
	public void display()
	{
		super.display();
		System.out.print(" Play time : " + playTime);
	}
    
}
