package linkedListSwapNodes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import linkedListSwapNodes.LinkedList.Node;

public class LinkedListTest {

	LinkedList l;
	
	@Before
    public void initLinkedList() {
        l = new LinkedList();
    }
	
	@Test      //Exception Class
	public void GettingHead()
	{
		l = new LinkedList();
		int head= l.head.key;
	}
 
    @Test
    public void NewLinkedList() {
        l = new LinkedList();
        assertNull(l.head);
        //Assert.assertEquals(0, l.size);
    }
 
    @Test
    public void AddingElements() {
        l = new LinkedList();
        l.pushFront(5);
        System.out.println("Q");
        //System.out.println(l.size);
        l.display();
        assertEquals(14, l.size);
    }
 
    @Test
    public void InitialElementatBack() {
        l = new LinkedList();
        l.pushBack(50);
        assertTrue(l.size == 1);
    }
  
    @Test
	public void TestingLinkedList()  {
    	l = new LinkedList();
		int[] given_array = {5,2,3,4,1};
		int index = 0;
    	System.out.println("vfda");
		l.pushFront(2);
		l.pushFront(1);
		l.pushBack(3);
		l.pushBack(4);
		l.pushBack(5);
		l.display();
		l.swap();
		//System.out.println(l.head.key);
		Node l1= l.head;
		//System.out.println(l1.key);
		while(l1 != null)
		{
			assertEquals(l1.key, given_array[index]);
			l1 = l1.next;
			index++;
		}
	}

    @Test
    public void testMain() {
    	l = new LinkedList();
    	l.main(null);
    	l.pushFront(2);
		l.pushFront(1);
		l.pushBack(7);
		l.display();
		l.swap();
    }
}