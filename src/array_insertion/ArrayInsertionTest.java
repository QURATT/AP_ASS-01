package array_insertion;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
 

public class ArrayInsertionTest {

	private static final String[] array = null;
	private ArrayInsertion arr;
	@Test
	public void test1() {
		int[] array= {5,7,0,2,4};
		int index= 2;
		int[] predicted_arr= ArrayInsertion.insert(array, 3, index);
		int[] expected_arr= {5,7,3,2,4};
		Assert.assertNotEquals(predicted_arr, expected_arr);
	}
	
	@Test
	public void test2() {      //Will fail due to wrong Assertion
		int[] array= {14,15,23,45,90,80};
		int index= 4;
		int[] actual_arr= ArrayInsertion.insert(array, 60, index);
		int[] expected_arr= {14,15,23,45,60, 90, 80};
		Assert.assertArrayEquals(expected_arr, actual_arr);
	}
	
	@Test
	public void test3() {
		int[] array= {200,300,400,500};
		int index= 3;
		int[] given_arr= ArrayInsertion.insert(array, 600, index);
		int[] expected_arr= {200,300,400,600};
		Assert.assertArrayEquals(expected_arr, given_arr);
	}
	
	@Test
	public void test4() {
		int[] array= {9,7,2,1,3,4};
		int index= 3;
		int[] given_arr= ArrayInsertion.insert(array, 9, index);
		int[] expected_arr= {9,7,2,9,1,3,4};
		Assert.assertNotEquals(expected_arr, given_arr);
	}
	
	@Test
	public void test5() {
		int[] array= {9,7,2,1,3,4};
		int index= 5;
		int[] given_arr= ArrayInsertion.insert(array, 4, index);
		int[] expected_arr= {9,7,2,1,4};
			
		Assert.assertNotEquals(expected_arr, given_arr);
	}
  
	@Test
	public void test6() {
		int[] array= {1,2,3,4};
		int index=4;
		int[] given_arr= ArrayInsertion.insert(array, 5, index);
		if(index>=array.length)
		{
			System.out.println("Array Full!");
			Assert.assertNotEquals(new int[] {1,2,3,4,5}, array);
		}
	}
	
	@Test
	public void test7() {   //FAils because Array is not NULL
		int[] array= new int[5];
		arr.main(null);
		arr.insert(array,1,0);
		arr.insert(array,2,1);
		arr.insert(array,3,2);
		arr.insert(array,4,3);
		arr.insert(array,5,4);
		Assert.assertNull(array);
	}
	
}
