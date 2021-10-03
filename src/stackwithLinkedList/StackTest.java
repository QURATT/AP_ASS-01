package stackwithLinkedList;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import stackwithLinkedList.Stack.Node;

public class StackTest {

Stack s;
	
	@Before
    public void setUp() throws Exception {
        s = new Stack();
    }
	
	@SuppressWarnings("null")     //Exception Thrown
	@Test(expected=IllegalArgumentException.class)
	public void stackDoesntAcceptNullAndThrowExcpetion() throws Exception {
	    s.push((Integer) null);
    }
	
	 @Test
    public void NewStackIsEmpty() throws Exception {
	 	s = new Stack();
        assertEquals(s.getSize(), 0);
    }

	@Test
    public void pushObjectsToStackToCheckSize() throws Exception {
		int stack_size= 5;
		s= new Stack();
        for(int i=0; i<stack_size; i++)
        {
        	s.push(i);
        }
        s.display();
        assertEquals(s.getSize(), stack_size);
    }
	
	@Test
    public void pushObjectsToFillStack() throws Exception {
		s = new Stack();
		s.push(9);
		s.push(8);
		s.push(7);
		s.push(6);
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		s.push(0);
		s.display();
		Assert.assertNotEquals(0, s.getSize());
	}
 

/*	@Test 
	public void StackisFull() throws Exception
	{
		s = new Stack();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		s.push(0);
		if(s.>=s.array.length){
			System.out.println("Stack is Full!");
			Assert.assertNotNull(s);
		}
		 
	}*/
	
	@Test
	public void CheckStackIsNotEmpty() throws Exception {
	 	s = new Stack();
	    assertEquals(s.getSize(), 0);
	}
	 
	@Test 
	public void PushThenPopStack() throws Exception
	{
		s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		s.push(9);
		s.push(10);
		s.display();
		assertEquals(s.pop(), 10);
		assertEquals(s.pop(), 9);
		assertEquals(s.pop(), 8);
		assertEquals(s.pop(), 7);
		assertEquals(s.pop(), 6);
		assertEquals(s.pop(), 5);
		assertEquals(s.pop(), 4);
		assertEquals(s.pop(), 3);
		assertEquals(s.pop(), 2);
		assertEquals(s.pop(), 1);
	}
 
	
	@Test 
	public void EmptyStack() throws Exception
	{
		s= new Stack();
		if(s.head==null){
			System.out.println("Stack is empty.");
			assertEquals(s.size, 0);
		}
	}

	@Test 
	public void ElementsInStack() throws Exception
	{
		s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println("Stack ");
		Node temp=s.head;
		while(temp!=null){
			System.out.println("----------");
			System.out.println("|   " + temp.key + "   |");
			temp=temp.next;
		}
		Assert.assertNotNull(s);
	}
	
	@Test 
	public void ElementsatTopInStack() throws Exception
	{
		s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.display();
		assertEquals(4, s.top());
	}
	
	@Test
	public void TestingMain() throws Exception    
	{
		s.main(null);
		s.push(5);
		s.push(4);
		s.push(3);
		s.top();
		s.display();
		s.push(2);
		s.push(1);
		s.top();
		s.display();
		Assert.assertEquals(5, s.size);
	}
}