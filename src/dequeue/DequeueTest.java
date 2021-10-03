package dequeue;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DequeueTest {

	Dequeue d= new Dequeue(0);
	DequeueImplementation d1= new DequeueImplementation();
	
	  @Before
	    public void setUp() throws Exception {
	        d = new Dequeue(0);
	    }

	    @After
	    public void tearDown() throws Exception {
	       d = null;
	    }
	
	  @Test
	  public void Emptyqueue() {
	    assertEquals(0, d.size);
	    assertEquals(0, d.capacity);
	  }
	
	  @Test
	  public void SizeDequeue() {
		  assertEquals(0, d.size);
	  }
	  
	  @Test
	  public void AddonLeft() {
		d= new Dequeue(5);
	    for(int i = 0; i < 5; i++) {
	    	d.addLeft(i);
	    	//System.out.println("SXdc" + d.array[i]);
	        assertEquals(i, d.array[i]);
	    }
	  }
	  
	  @Test
	  public void AddingonLeft() {
		d= new Dequeue(6);
	    for(int i = 0; i < 5; i++) {
	    	d.addLeft(i);
	    }
	    d.addLeft(6);
	    d.display();
	    assertEquals(6, d.capacity);
	  }
	  
	  @Test
	  public void AddingonLeftMost() {
		d= new Dequeue(1);
	    d.addLeft(6);
	    d.display();
	    assertEquals(1, d.capacity);
	  }
	 

	@Test
	  public void AddonRight() {
		d= new Dequeue(7);
		d.addRight(1);
		d.addRight(2);
		d.addRight(3);
		d.addRight(4);
		d.addRight(5);
		d.addRight(6);
		d.addRight(7);
	    for(int i = 0, j= 7;  i < 7;  i++, j--) {
	    	//d.addLeft(i);
	    	System.out.println(d.array[i] + " ");
	        assertEquals(j, d.array[i]);
	    }
	  }
	
	  @Test
	  public void AddingonRight() {
		d= new Dequeue(4);
	    for(int i = 4; i > 1; i--) {
	    	d.addRight(i);
	    }
	    d.addRight(1);
	    d.display();
	    assertEquals(4, d.capacity);
	  }
	  
	  @Test
	  public void AddingonRightMost() {
		d= new Dequeue(1);
	    d.addRight(1);
	    d.display();
	    assertEquals(1, d.capacity);
	  }
	
	  @Test
	  public void CapacityExceeds() {
		d= new Dequeue(4);
	    for(int i = 0; i < 4; i++) {
	    	d.addRight(i);
	    }
	    d.addRight(5);
	    assertEquals(5, d.capacity);
	  }

	@Test
	    public void testDeque() {
	        assertNotNull(d);
	    }
	
	@Test
    public void wrongtestDequeisNULL() {
		d= new Dequeue(10);
        assertNull(d);
    }

	    @Test
	    public void ValuesInDeueue() {
            for(int i=0; i<7 ; i++)
            {
            	//System.out.println("heyy" ); 
            	d.display();
            }
	        Assert.assertTrue(true);
	   }
	    
	    @Test
	    public void testingmain() {
			Dequeue d= new Dequeue(10);
	        d1.main(null);
	        d.addRight(5);
	        d.addLeft(1);
	        d.addRight(4);
	        d.addLeft(3);
	        d.addRight(2);
	        d.addLeft(0);
	        d.addRight(9);
	        d.addLeft(7);
	        d.addRight(11);
	        d.addLeft(17);
	        assertEquals(10, d.capacity);
	    }
}