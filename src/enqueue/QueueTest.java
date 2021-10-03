package enqueue;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
 

public class QueueTest {

	Queue q;
	QueueImplementation q1= new QueueImplementation();
	
	@BeforeClass
    public static void setUpClass() {}
    
    @AfterClass
    public static void tearDownClass() {}
    
	 @Test
	    public void NewQueueIsEmpty() {
		 	q = new Queue(0);
	        assertTrue(q.empty());
	    }

	    @Test
	    public void InsertsToNewQueue() throws Exception {
	    	int numberOfInserts = 7;
	    	q = new Queue(numberOfInserts);
	        for (int i = 0; i < numberOfInserts; i++) {
	            q.enqueue(i);
	            System.out.println("Queue Inserted");
	        }
	        assertEquals(numberOfInserts, q.size());
	    }
	    
	    @Test
		public void ElementsofQueue() throws Exception
		{
	    	q= new Queue(5);
	    	int[] expected_arr= {1,2,3,4,5};
			q.enqueue(1);
			q.enqueue(2);
			q.enqueue(3);
			q.enqueue(4);
			q.enqueue(5);
			 for(int i=0; i<5; i++)
			 {
				 //System.out.println("Array" + q.array[i]);
					 //System.out.println("Yoooooooooooo");
					 assertEquals(i+1, q.getArray()[i]); 
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
			q.display();
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
	        q.display();
	        for (int i = 0; i < insert_no; i++) {
	            q.dequeue();
	            System.out.println("Queue Deleted");
	        }
	        q.display();
	        assertTrue(q.empty());
	        assertEquals(0, q.size());
	    }

	    @Test
	    public void testSizeOfEnqueue() throws Exception {
	        q= new Queue(10);
	        for(int i=20; i<40; i+=2)
	        {
	        	q.enqueue(i);
	        }
	        q.display();
	        int size = q.size();
	        assertEquals(size, q.size());
	    }
	    
	   @Test
	    public void SizeofQueue() {
	    	 q= new Queue(0);
	    	 assertEquals(0, q.size());
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
	    public void testEnqueisNULL() {
			//q= new Dequeue(10);
	        assertNull(q);
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
	            	assertEquals(i+1, q.getArray()[i]);
	            }
	            q.display();
	   }
	   
	    @Test
	    public void testEneque() {
	        assertNull(q);
	    }
	
	@Test
    public void wrongtestQueueisNULL() {
		q= new Queue(10);
        assertNotNull(q);
    }
	
	    @Test     //Catches Exception
	    public void testingmain() throws Exception {
			q= new Queue(10);
	        q1.main(null);
	        q.enqueue(5);
	        q.enqueue(1);
	        q.enqueue(4);
	        q.enqueue(3);
	        q.enqueue(2);
	        q.display();
	        assertEquals(5, q.size());
	        q.dequeue();
	        q.dequeue();
	        q.dequeue();
	        q.dequeue();
	        q.dequeue();
	        q.display();
	        assertEquals(0, q.size());
	    }
}