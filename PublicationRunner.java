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
public class PublicationRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book b1 = new Book();
		b1.SetPages(125);
		b1.display();

		Tape t1 = new Tape();
		t1.SetplayTime(10.2f);
		t1.display();
    }
    
}
