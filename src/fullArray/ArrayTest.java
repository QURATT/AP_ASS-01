package fullArray;
 
import static org.junit.Assert.*;

import org.junit.Assert;
//import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
	Array arr= new Array();
	
	@Test
	public void test1() {
		int[] expectd_array= {9,8,7,6,5};
		arr.insert(9, 0);
		arr.insert(8, 1);
		arr.insert(7, 2);
		arr.insert(6, 3);
		arr.insert(5, 4);
		for(int i=0; i<5; i++)
		{
			Assert.assertEquals(expectd_array[i], arr.array[i]);
		}
	}
 
	@Test
	public void test2() {
		int[] predicted_arr= {1,2,4,5,7,8};
		for(int i=0; i<8; i++)
		{
			arr.insert(i+1, i);
		}
		arr.delete(2);
		arr.delete(4);
		arr.display();
		for(int i=0; i<6; i++)
		{
			Assert.assertEquals(predicted_arr[i], arr.array[i]);
		}
	}
	
	@Test
	public void test3() {
		for(int i=0; i<10; i++)
		{
			arr.insert(i+1, i);
		}
		Assert.assertEquals(true, arr.linearSearch(5));
	}
	
	@Test
	public void test4() {
		int[] predicted_arr= {1,2,3,4,5};
		arr.insert(4, 0);
		arr.insert(5, 1);
		arr.insert(1, 2);
		arr.insert(2, 3);
		arr.insert(3, 4);
		arr.bubbleSort();
		for(int i=0; i<5; i++)
			Assert.assertEquals(predicted_arr[i], arr.array[i]);
	}
	
	@Test
	public void test5() {   //FAils because Array is not NULL
		arr= new Array();
		arr.insert(1,0);
		arr.insert(2,1);
		arr.insert(3,2);
		arr.display();
		Assert.assertEquals(true, arr.binarySearch(2, 0, 3));
	}
	
	@Test
	public void test6() {   //FAils because Array is not NULL
		arr= new Array();
		arr.insert(5,0);
		arr.insert(10,1);
		arr.insert(2,2);
		arr.insert(8,3);
		arr.insert(1,4);
		arr.insert(7,5);
		arr.display();
		Assert.assertNotEquals(true, arr.binarySearch(1, 0, 6));
	}
	
	@Test
	public void test7() {   
		arr= new Array();
		arr.insert(1,0);
		arr.insert(2,1);
		arr.insert(3,2);
		arr.insert(4,3);
		arr.insert(5,4);
		arr.display();
		Assert.assertEquals(false, arr.binarySearch(7, 0, 3));
	}
	
	/*@Test
    public void test8() {    //InputValues
		arr= new Array();
			 arr.getValues();
		 Assert.assertNotNull(arr);
    }*/
	
}

