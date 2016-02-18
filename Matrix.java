import java.util.Arrays;

class Matrix {
	private int rows, columns;
	private int[][] matrix;
	Matrix(int noOfRows, int noOfColumns) {
		rows = noOfRows;
		columns = noOfColumns;
		matrix = new int[rows][columns];
	}

	public void insert(int row, int column, int value){
		this.matrix[row][column] = value;
	}

	public boolean isAnElement(int row, int column, int value) {
		return this.matrix[row][column] == value;
	}

	public Matrix add(Matrix other) {
		if(this.rows!=other.rows || this.columns!=other.columns)
			return new Matrix(0,0);
		else{
			Matrix sumMatrix = new Matrix(this.rows,this.columns);
			for (int i = 0; i < this.rows; i++) {
				for (int j=0; j < this.columns ; j++) {
					sumMatrix.matrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
				}
			}
			return sumMatrix;
		}
	}

	public boolean isEmpty(){
		return this.rows==0;
	}
}
