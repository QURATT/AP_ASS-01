package stack;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MyStackTest {

	MyStack s;
	
	@Before
    public void setUp() throws Exception {
        s = new MyStack(10);
    }
	
	@SuppressWarnings("null")
	@Test(expected=IllegalArgumentException.class)   //Exception Thrown
	public void stackDoesntAcceptNullAndThrowExcpetion() throws Exception {
	    s.push((Integer) null);
    }
	
	 @Test
    public void NewStackIsEmpty() throws Exception {
	 	s = new MyStack(0);
        assertEquals(0, s.size());
    }

	@Test
    public void pushObjectsToStackToCheckSize() throws Exception {
		int stack_size= 5;
		s= new MyStack(stack_size);
        for(int i=0; i<stack_size; i++)
        {
        	s.push(i);
        }
        s.displayStack();
        assertEquals(stack_size, s.size());
    }
	
	@Test
    public void pushObjectsToFillStack() throws Exception {
		s = new MyStack(10);
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
		s.displayStack();
		Assert.assertNotEquals(0, s.size());
	}

 
	@Test 
	public void PushPopStackandReturningTopElementLeft() throws Exception
	{
		s = new MyStack(6);
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		s.push(0);
		s.displayStack();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		assertEquals(5, s.top());
	}
	
	@Test
	public void CheckStackIsNotEmpty() throws Exception {
	 	s = new MyStack(0);
	    assertNotEquals(0, s.size());
	}
	 
	@Test 
	public void PushThenPopStack() throws Exception
	{
		s = new MyStack(10);
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
		s.displayStack();
		assertEquals(10, s.pop());
		assertEquals(9, s.pop());
		assertEquals(8, s.pop());
		assertEquals(7, s.pop());
		assertEquals(6, s.pop());
		assertEquals(5, s.pop());
		assertEquals(4, s.pop());
		assertEquals(3, s.pop());
		assertEquals(2, s.pop());
		assertEquals(1, s.pop());
	}
	 
	@Test 
	public void CheckingTopPointer() throws Exception
	{
		 Assert.assertEquals(-1, s.topPointer);
	}
	
	@Test
	public void TestingMain() throws Exception    
	{
		StackImplementation s1= new StackImplementation();
		s1.main(null);
		s = new MyStack(5);
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		s.displayStack();
		assertEquals(5, s.size());
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.displayStack();
		assertEquals(0, s.size());
	}
}