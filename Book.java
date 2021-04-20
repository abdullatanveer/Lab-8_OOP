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
public class Book extends Publication {
   

private int pageCount;

 public Book()
    {
		super();
		 
    }


	public Book(String x , float f ,int pg)
	{
		super(x,f);
		pageCount = pg ;
	}

	public void SetPages(int pg)
	{
		pageCount = pg ;

	}

	public int GetPages()
	{
		return pageCount;
	}

        @Override
	public void display()
	{	super.display();
		System.out.println("Page Count : "+ pageCount);
	}
}
    

    

