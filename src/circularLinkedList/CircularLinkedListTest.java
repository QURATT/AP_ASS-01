package circularLinkedList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import circularLinkedList.CircularLinkedList.Node;

public class CircularLinkedListTest {

	CircularLinkedList l;
	
	@Before
    public void initLinkedList() {
        l = new CircularLinkedList();
    }
	
	@Test      //Exception Class
	public void GettingHead()
	{
		l = new CircularLinkedList();
		int head= l.head.key;
	}
 
    @Test
    public void CreationLinkedList() {
        l = new CircularLinkedList();
        assertNull(l.head);
    }
  
    @Test
	public void TestingLinkedList()  {
    	l = new CircularLinkedList();
		int[] given_array = {1,2,3,4,5};
		int index = 0;
    	System.out.println("vfda");
		l.pushFront(2);
		l.pushFront(1);
		l.pushBack(3);
		l.pushBack(4);
		l.pushBack(5);
		System.out.println("hyyy");
		l.display();
		//System.out.println(l.head.key);
		Node l1= l.head;
		//System.out.println(l1.key);
		while(l1 == l.head)
		{
			assertEquals(l1.key, given_array[index]);
			l1 = l1.next;
			index++;
		}
	}
    
    @Test
   	public void PopFront()  {
    	l = new CircularLinkedList();
		int[] given_array = {3,4,5};
		int index = 0;
		l.pushFront(2);
		l.pushFront(1);
		l.pushBack(3);
		l.pushBack(4);
		l.pushBack(5);
		l.popFront();
		l.popFront();
		l.display();
		//System.out.println(l.head.key);
		Node l1= l.head;
		//System.out.println(l1.key);
		while(l1 == l.head)
		{
			assertEquals(l1.key, given_array[index]);
			l1 = l1.next;
			index++;
		}
    }
    
    @Test
   	public void PopCircularFront()  {
    	l = new CircularLinkedList();
		int[] given_array = {3,4,5};
		int index = 0;
		l.pushFront(2);
		l.pushFront(1);
		l.pushBack(3);
		l.pushBack(4);
		l.pushBack(5);
		l.popFront();
		l.popFront();
		l.display();
		//System.out.println(l.head.key);
		Node l1= l.head;
		//System.out.println(l1.key);
		while(l1 == l.head)
		{
			assertEquals(l1.key, given_array[index]);
			l1 = l1.next;
			index++;
		}
    }
    
    @Test
   	public void PopBack()  {
    	l = new CircularLinkedList();
		int[] given_array = {1,2};
		int index = 0;
		l.pushFront(2);
		l.pushFront(1);
		l.pushBack(3);
		l.pushBack(4);
		l.pushBack(5);
		l.popBack();
		l.popBack();
		l.popBack();
		//System.out.println(l.head.key);
		Node l1= l.head;
		//System.out.println(l1.key);
		while(l1 == l.head)
		{
			assertEquals(l1.key, given_array[index]);
			l1 = l1.next;
			index++;
		}
    }
    
    @Test
   	public void Pop()  {
    	l = new CircularLinkedList();
		int[] given_array = {3,2,1};
		int index = 0;
		for(int i=0, j=1; i<10; i++)
		{
			l.pushFront(j);
			j++;
		}
		l.display();
		for(int i=0; i<7; i++)
		{
			l.popFront();
		}
		System.out.println("hgftyf");
		l.display();
		//System.out.println(l.head.key);
		Node l1= l.head;
		//System.out.println(l1.key);
		while(l1 == l.head)
		{
			assertEquals(l1.key, given_array[index]);
			l1 = l1.next;
			index++;
		}
    }

    @Test
    public void testMain() {
    	l = new CircularLinkedList();
    	l.pushFront(2);
		l.pushFront(1);
		l.popBack();
		l.display();
    	l.main(null);
    }
}
