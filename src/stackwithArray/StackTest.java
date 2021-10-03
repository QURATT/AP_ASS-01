package stackwithArray;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import stack.MyStack;
import stack.StackImplementation;
 

public class StackTest {

	Stack s;
	
	@Before
    public void setUp() throws Exception {
        s = new Stack();
    }
	
	@SuppressWarnings("null")
	@Test(expected=IllegalArgumentException.class)
	public void stackDoesntAcceptNullAndThrowExcpetion() throws Exception {
	    s.push((Integer) null);
    }
	
	 @Test
    public void NewStackIsEmpty() throws Exception {
	 	s = new Stack();
	 	s.display();
        assertEquals(s.size, 0);
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
        assertEquals(s.size, stack_size);
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
		Assert.assertNotEquals(0, s.size);
	}
 

	@Test 
	public void StackisFull() throws Exception
	{
		s = new Stack();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		s.push(0);
		s.display();
		if(s.addPointer>=s.array.length){
			System.out.println("Stack is Full!");
			Assert.assertNotNull(s);
		}
		 
	}
	
	@Test
	public void CheckStackEmpty() throws Exception {
	 	s = new Stack();
	    Assert.assertEquals(0, s.size);
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
	public void CheckStackIsEmpty() throws Exception {
		s = new Stack();
		if(s.addPointer==0){
			System.out.println("Stack is Empty!");
			assertEquals(s.size, 0);
		}
	}
	
	@Test 
	public void CheckingTopPointer() throws Exception
	{
		 Assert.assertEquals(s.addPointer, 0);
	}
	
	@Test 
	public void ElementsinStack() throws Exception
	{
		if(s.addPointer==0){
			System.out.println("Empty Stack.");
			assertEquals(s.size, 0);
		}
		System.out.print("Stack : ");
		for(int i=0;i<s.size;i++){
			System.out.print(s.array[i] + " " );
			Assert.assertNotNull(s);
		// Assert.assertEquals(s.addPointer, 0);
	}
	}
	
	@Test
	public void TestingMain() throws Exception    
	{
		s.main(null);
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		s.display();
		Assert.assertEquals(5, s.size);
	}
}