package queuewithLinkedList;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
 
public class QueueTest {

	Queue q;
	
	@BeforeClass
    public static void setUpClass() {}
    
    @AfterClass
    public static void tearDownClass() {}
    
	 @Test
	    public void NewQueueIsEmpty() {
		 	assertNull(q);
	    }
 

        @Test
		public void ElemnetsinEnqueuetheDequeue() throws Exception
		{
	    	q= new Queue();
	    	 
			q.enqueue(1);
			q.enqueue(2);
			q.enqueue(3);
			q.enqueue(4);
			q.enqueue(5);
			q.display(); 
			Assert.assertNotNull(q); 
		}

		@Test
	    public void EnqueueThenDequeue() throws Exception {
	    	q = new Queue();
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
	    public void Dequeue() throws Exception {
			int[] expected_arr= {1,2,3,4,5};
			int index= 0;
		//System.out.println(l.head.key);
				queuewithLinkedList.Queue.Node l1= q.head;
				//System.out.println(l1.key);
				while(l1 != null)
				{
					assertEquals(l1.key, expected_arr[index]);
					l1 = l1.next;
					index++;
				}
		}
	    
	    
	    public void testSizeOfEnqueue() throws Exception {
	        q= new Queue();
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
	    	 q= new Queue();
	    	 assertEquals(0, q.size);
	    }
	   
	    @Test
	    public void testEneque() {
	        assertNull(q);
	    }
	
	@Test
    public void wrongtestQueueisNULL() {
		q= new Queue();
        Assert.assertNotNull(q);
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
