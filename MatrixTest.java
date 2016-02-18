
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import java.util.Arrays;

public class MatrixTest {
	@Test
	public void InsertForOneByOne(){
		Matrix matrix_1 = new Matrix(1,1);
		assertTrue(matrix_1.isAnElement(0,0,0));
		matrix_1.insert(0,0,5);
		assertTrue(matrix_1.isAnElement(0,0,5));
	}
	@Test
	public void InsertForOneByThree(){
		Matrix matrix_1 = new Matrix(1,3);
		matrix_1.insert(0,0,5);
		matrix_1.insert(0,1,8);
		matrix_1.insert(0,2,3);
		assertTrue(matrix_1.isAnElement(0,0,5));
		assertTrue(matrix_1.isAnElement(0,1,8));
		assertTrue(matrix_1.isAnElement(0,2,3));
	}
	@Test
	public void AddTwoByTwo(){
		Matrix matrix_1 = new Matrix(2,2);
		Matrix matrix_2 = new Matrix(2,2);
		matrix_1.insert(0,0,5);
		matrix_1.insert(0,1,8);
		matrix_2.insert(0,0,2);
		matrix_2.insert(0,1,6);

		Matrix matrix_3 = matrix_1.add(matrix_2);
		assertTrue(matrix_3.isAnElement(0,0,7));
		assertTrue(matrix_3.isAnElement(0,1,14));
	}
	@Test
	public void AddDistinctMatrices(){
		Matrix matrix_1 = new Matrix(2,3);
		Matrix matrix_2 = new Matrix(3,2);
		matrix_1.insert(0,0,1);
		matrix_1.insert(0,1,2);
		matrix_1.insert(0,2,3);
		matrix_1.insert(1,0,4);
		matrix_1.insert(1,1,5);
		matrix_1.insert(1,2,6);

		matrix_2.insert(0,0,2);
		matrix_2.insert(0,1,4);
		matrix_2.insert(1,0,6);
		matrix_2.insert(1,1,8);
		matrix_2.insert(2,0,10);
		matrix_2.insert(2,1,12);

		Matrix matrix_3 = matrix_1.add(matrix_2);
		assertTrue(matrix_3.isEmpty());
	}
}
