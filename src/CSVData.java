
public class CSVData {
	private double[][] data;
	private String[] columnNames;

	/***
	 * takes a file and turns it into a CSVData object
	 * 
	 * @param filename
	 *            the file to read
	 * @param numLinesToIgnore
	 *            How many lines at top to ignore
	 * @param columnNames
	 *            names of each column
	 * @return a CSVData object for that file
	 */
	public static CSVData readCSVFile(String filename, int numLinesToIgnore, String[] columnNames) {
		CSVData result = null;

		return result;
	}

	/***
	 * returns a CSVData object for a file
	 * 
	 * @param filename
	 *            file to convert to CSVData object
	 * @param numLinesToIgnore
	 *            how many lines at the top to ignore
	 * @return a CSVData object representing the file
	 */
	public static CSVData readCSVFile(String filename, int numLinesToIgnore) {
		CSVData result = null;

		return result;
	}
	/***
	 * returns a column from the CSVData 2d array
	 * @param colIndex index of column to access
	 * @return returns a double array containing the column
	 */
	public double[] getColumn(int colIndex) {
		return null;
	}
	/***
	 * returns a column from the CSVData 2d array
	 * @param colName name of column to access
	 * @return	returns a double array containing the column
	 */
	public double[] getColumn(String colName) {
		return null;
	}
	/***
	 * returns a row from the CSVData 2d array
	 * @param rowIndex index of row to access
	 * @return returns a double array containing the row
	 */
	public double[] getRow(int rowIndex) {
		
		return null;
	}
	/***
	 * returns a set of consecutive rows in the CSVData 2d array
	 * @param startRow first row in the consecutive set of rows
	 * @param endRow	last row in the consecutive set of rows
	 * @return returns a 2d double array containing the specified rows
	 */
	public double[][] getRows(int startRow, int endRow) {
		return null;
	}
	/***
	 * returns a specified set of rows from the CSVData 2d array
	 * @param indexes array containing the indexes of the desired rows
	 * @return returns a 2d double array containing the specified rows
	 */
	public double[][] getRows(int[] indexes) {
		return null;
	}
	/***
	 * returns a set of consecutive columns in the CSVData 2d array
	 * @param startRow first column in the consecutive set of rows
	 * @param endRow	last column in the consecutive set of rows
	 * @return returns a 2d double array containing the specified columns
	 */
	public double[][] getColumns(int startColumn, int endColumn) {
		return null;
	}
	/***
	 * returns a specified set of columns from the CSVData 2d array
	 * @param indexes array containing the indexes of the desired columns
	 * @return returns a 2d double array containing the specified columns
	 */
	public double[][] getColumns(int[] indexes) {
		return null;
	}
	/***
	 * sets a column in the CSVData 2d array
	 * @param colIndex which column to set
	 * @param values what to put inside the column
	 */
	public void setColumn(int colIndex, double[] values) {

	}
	/***
	 * sets a row in the CSVData 2d array
	 * @param rowIndex which row to set
	 * @param values what to put inside the row
	 */
	public void setRow(int rowIndex, double[] values) {

	}
	/***
	 * sets a value in the CSVData 2d array
	 * @param rowIndex what row we want to put the value in
	 * @param colIndex what column we want to put the value in
	 * @param value what value to put in the indicated location
	 */
	public void setValue(int rowIndex, int colIndex, double value) {

	}
}
