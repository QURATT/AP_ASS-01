package queuewithArray;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueueTest {

Queue q= new Queue(0);
	
	@BeforeClass
    public static void setUpClass() {}
    
    @AfterClass
    public static void tearDownClass() {}
    
	 @Test
	    public void NewQueueIsEmpty() {
		 	assertEquals(0, q.size);
	    }
 

        @Test
		public void ElementsofQueue() throws Exception
		{
	    	q= new Queue(5);
	    	//int[] expected_arr= {1,2,3,4,5};
			q.enqueue(1);
			q.enqueue(2);
			q.enqueue(3);
			q.enqueue(4);
			q.enqueue(5);
			 for(int i=0; i<5; i++)
			 {
				 //System.out.println("Array" + q.array[i]);
					 //System.out.println("Yoooooooooooo");
					 assertEquals(i+1, q.array[i]); 
			 }
			q.display();
		}

		@Test
	    public void EnqueueThenDequeue() throws Exception {
	    	q = new Queue(5);
	    	q.enqueue(1);
			q.enqueue(2);
			q.enqueue(3);
			q.enqueue(4);
			q.enqueue(5);
			assertEquals(1,q.dequeue());
			assertEquals(2,q.dequeue());
			assertEquals(3,q.dequeue());
			assertEquals(4,q.dequeue());
			assertEquals(5,q.dequeue());
	    }
	    
	    @Test
	    public void EmptyQueue() throws Exception {
	    	int insert_no = 20;
	    	q = new Queue(insert_no);
	        for (int i = 0; i < insert_no; i++) {
	            q.enqueue(i);
	            System.out.println("Queue Inserted");
	        }
	        for (int i = 0; i < insert_no; i++) {
	            q.dequeue();
	            System.out.println("Queue Deleted");
	        }
	        assertEquals(0, q.size);
	    }
	    
	    @Test
	    public void EnueuePointer() throws Exception {
	    	int element= 5;
	    	q = new Queue(element);
	    	for(int i=0; i<5; i++)
	    	{
	    		q.enqueue(i);
	    	}
	    	System.out.println("P" + q.addPointer);
	    	System.out.println("Q" + q.removePointer);
	    	for(int i=0; i<5; i++)
	    	{
	    		assertEquals(0, q.removePointer);
	    	}

	    }
	    
	    @Test
	    public void QueueIsFull() throws Exception {
	    	int element= 5;
	    	q = new Queue(element);
	    	for(int i=0; i<5; i++)
	    	{
	    		q.enqueue(i);
	    		q.size++;
	    	}
	    	System.out.println("P" + q.addPointer);
	    	System.out.println("Q" + q.removePointer);
	    	q.enqueue(6);
	    	int len= q.array.length-1;
	    	assertEquals(len,  q.addPointer);
	    }

	    @Test
	    public void testSizeOfEnqueue() throws Exception {
	        q= new Queue(10);
	        for(int i=20; i<40; i+=2)
	        {
	        	q.enqueue(i);
	        	q.size++;
	        }
	        int size = q.size;
	        assertEquals(size, q.size);
	    }
	    
	   @Test
	    public void SizeofQueue() {
	    	 q= new Queue(0);
	    	 assertEquals(0, q.size);
	    }

	    @Test
	    public void ValuesInValuesOut() throws Exception {
	    	q= new Queue(100);
	        for (int i = 0; i < 100; i++) {
	            q.enqueue(i);
	        }
	        for (int i = 0; i < 100; i++) {
	            assertEquals(i, ((Integer) q.dequeue()).intValue());
	        }
	    }   
	    
	    @Test
	    public void DeqeuePointer() throws Exception {
	    	int element= 5;
	    	q = new Queue(element);
	    	for(int i=0; i<5; i++)
	    	{
	    		q.dequeue();
	    		q.size--;
	    	}
	    	System.out.println("P" + q.addPointer);
	    	System.out.println("Q" + q.removePointer);
	    	for(int i=0; i<5; i++)
	    	{
	    		assertEquals(0, q.addPointer);
	    	}

	    }
	    
	    @Test
	    public void QueueIsEmpty() throws Exception {
	    	int element= 5;
	    	q = new Queue(element);
	    	for(int i=0; i<5; i++)
	    	{
	    		q.dequeue();
	    		q.size--;
	    	}
	    	System.out.println("P" + q.addPointer);
	    	System.out.println("Q" + q.removePointer);
	    	int len= q.array.length-1;
	    	assertEquals(0,  q.removePointer);
	    }
	    
	    @SuppressWarnings("null")
		@Test
	    public void ValuesInQueue() throws Exception {
	    	q= new Queue(2);
	    	//int[] predicted_arr= null;
	            q.enqueue(1);
	            q.enqueue(2);
	            for(int i=0; i<2; i++)
	            {
	            	assertEquals(i+1, q.array[i]);
	            }
	            //q.display();
	   }
	   
	    @Test
	    public void testEneque() {
	        assertNotNull(q);
	    }
	
	@Test
    public void wrongtestQueueisNULL() {
		q= new Queue(10);
        assertNotNull(q);
    }
	
	@Test     //Catches Exception
    public void testingmain() throws Exception {
        q.main(null);
        q.enqueue(5);
        q.enqueue(1);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(2);
        q.display();
        assertEquals(5, q.size);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();
        assertEquals(0, q.size);
    }

}