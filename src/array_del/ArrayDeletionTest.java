package array_del;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ArrayDeletionTest {

	/*@Test
	public void test() {
		Assert.assertEquals(true, true);
	}*/
	
	@Test
	public void test1() {
		int[] array= {5,7,0,2,4};
		int index= 2;
		int[] predicted_arr= ArrayDeletion.delete(array, index);
		int[] expected_arr= {5,7,2,4};
		Assert.assertNotEquals(predicted_arr, expected_arr);
	}
	
	@Test
	public void test2() {
		int[] array= {14,15,23,45,90,80};
		int index= 4;
		int[] actual_arr= ArrayDeletion.delete(array, index);
		int[] expected_arr= {14,15,23,45,80,-1};
		Assert.assertArrayEquals(expected_arr, actual_arr);
	}
	
	@Test      //Will fail due to wrong Assertion
	public void test3() {
		int[] array= {200,300,400,500};
		int index= -3;
		int[] given_arr= ArrayDeletion.delete(array, index);
		int[] expected_arr= {200,300,400};
		Assert.assertArrayEquals(expected_arr, given_arr);
	}
	
	@Test
	public void test4() {
		int[] array= {9,7,2,1,3,4};
		int index= 3;
		int[] given_arr= ArrayDeletion.delete(array, index);
		int[] expected_arr= {9,7,1,3,4};
		Assert.assertNotEquals(expected_arr, given_arr);
	}	
	 
	@Test
	public void test5() {
		int[] array= {9,7,2,1,3,4};
		int index= 4;
		int[] given_arr= ArrayDeletion.delete(array, index);
		int[] expected_arr= {9,7,2,1,4};		
		Assert.assertNotEquals(expected_arr, given_arr);
	}
	
	 
    @Test
    public void test6() {
		int[] array= {1,2,3,4};
		int index= 5;
		int[] given_arr= ArrayDeletion.delete(array, index);
		int[] expected_arr= {1,2,5,6};
		for(int i=0; i<array.length; i++)
		{
			Assert.assertNotEquals(expected_arr, given_arr);
		}
    }
    
    @Test
    public void test7() {
		int[] array= {1,2,3,4};
		ArrayDeletion.display(array);
		Assert.assertNotNull(array);
    }
    
    @Test
    public void test8() {
		String[] array= {"1,2"};
		ArrayDeletion.main(array);
		Assert.assertNotNull(array);
    }
}

