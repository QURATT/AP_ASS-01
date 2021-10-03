package linkedListImplementation;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	
	LinkedList l;
	
	@Before
	public void setUp() throws Exception {
		l=new LinkedList();
	}
	
	@Test
    public void Checkhead() {
		l= new LinkedList();
		l.pushFront(15);
		l.display();
		assertEquals(15, l.headPointer.data);
	}
	
	@Test
    public void InsertioninStartofLinkedList() {
		//l= new LinkedList();
		l.pushFront(20);
		assertEquals(2, l.size());
		l.display();
	}
	
	@Test
	public void AddingElements() {
		l= new LinkedList();
		//l.add(5);
		for(int i=1; i<=5; i++)
		{
			l.add(i);
		}
		System.out.println("E : " );
		l.display();
	    assertEquals(14, l.size());
	  }
	
	@Test
    public void InsertionatBackofLinkedList() {
		l= new LinkedList();
		l.pushBack(50);
		//System.out.println("B : " );
		l.display();
		assertEquals(3, l.size());
	}
 
	@Test
	public void GettingElementsFromFront() throws Exception {
		//l= new LinkedList();
		//l.display();
			System.out.println("F : " );
			l.popFront();
			l.display();
		assertEquals(3, l.size());
	}
	
	@Test
	public void GettingElementFromBack() throws Exception {
		l= new LinkedList();
		l.display();
			l.topBack();
			System.out.println("B : " );
			l.display();
		assertEquals(3, l.size());
	}
	
	@Test
	public void AddingElementsatBack() {
		l= new LinkedList();
		//System.out.println("E : " );
		//l.display();
			l.pushBack(100);
		l.display();
	    Assert.assertEquals(4, l.size());
	  }
	
	@Test
	public void GettingChangedHead() throws Exception {
		l= new LinkedList();
		System.out.println("T : " );
		System.out.println(l.headPointer.data);
		l.display();
		assertEquals(20,  l.topFront());
	}
	
	@Test
	public void GettingTail() throws Exception {
		l= new LinkedList();
		//System.out.println("Y : " );
		//System.out.println(l.tailPointer.data);
		//l.display();
		assertEquals(5, l.topBack());
	}
	
	@Test
	public void testingMain() throws Exception {
		LinkedListImplementation l1= new LinkedListImplementation();
		l1.main(null);
	}		 
}