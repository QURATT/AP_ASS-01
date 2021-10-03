package linkedList;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import linkedList.LinkedList.Node;

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
    public void CreationLinkedList() {
        l = new LinkedList();
        assertNull(l.head);
        Assert.assertEquals(0, l.size);
    }
 
    @Test
    public void AddInitialElement() {
        l = new LinkedList();
        l.pushFront(5);
        assertTrue(l.size == 1);
    }
 
    @Test
    public void RemoveHead() {
    	 l = new LinkedList();
         l.popFront();
         assertTrue(l.size == 0);
    }
    
    @Test
    public void InitialElementatBack() {
        l = new LinkedList();
        l.pushBack(50);
        assertTrue(l.size == 1);
    }
 
    @Test
    public void RemoveTail() {
    	 l = new LinkedList();
         l.popBack();
         assertTrue(l.size == 0);
    }
  
    @Test
	public void TestingLinkedList()  {
    	l = new LinkedList();
		int[] given_array = {1,2,3,4,5};
		int index = 0;
    	System.out.println("vfda");
		l.pushFront(2);
		l.pushFront(1);
		l.pushBack(3);
		l.pushBack(4);
		l.pushBack(5);
		l.display();
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
   	public void PopFront()  {
    	l = new LinkedList();
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
		while(l1 != null)
		{
			assertEquals(l1.key, given_array[index]);
			l1 = l1.next;
			index++;
		}
    }
    
    @Test
   	public void PopBack()  {
    	l = new LinkedList();
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
		while(l1 != null)
		{
			assertEquals(l1.key, given_array[index]);
			l1 = l1.next;
			index++;
		}
    }
    
    @Test
   	public void Pop()  {
    	l = new LinkedList();
		int[] given_array = {2,4,6,8,10};
		int index = 0;
		System.out.println("Q");
		for(int i=0, j=1; i<10; i++)
		{
			l.pushBack(j);
			j++;
		}
		l.display();
		for(int i=0; i<7; i++)
		{
			l.pop(i);
		}
		System.out.println("Q");
		l.display();
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
		l.pop(1);
		l.display();
    }
}