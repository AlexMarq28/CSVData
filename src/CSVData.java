import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CSVData {
	private double[][] data;
	private String[] columnNames;
	String filePathToCSV;
	int numRows;

	public CSVData(String filepath, String[] columnNames, int startRow) {
		this.filePathToCSV = filepath;

		String dataString = readFileAsString(filepath);
		String[] lines = dataString.split("\n");

		// number of data points
		int n = lines.length - startRow;
		this.numRows = n;
		int numColumns = columnNames.length;

		// create storage for column names
		this.columnNames = columnNames;

		// create storage for data
		this.data = new double[n][numColumns];
		for (int i = 0; i < lines.length - startRow; i++) {
			String line = lines[startRow + i];
			String[] coords = line.split(",");
			for (int j = 0; j < numColumns; j++) {
				if (coords[j].endsWith("#"))
					coords[j] = coords[j].substring(0, coords[j].length() - 1);
				double val = Double.parseDouble(coords[j]);
				data[i][j] = val;
			}
		}
	}
	

	public double[][] getData() {
		return data;
	}


	private String readFileAsString(String filepath) {
		StringBuilder output = new StringBuilder();
		try (Scanner scanner = new Scanner(new File(filepath))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				output.append(line + System.getProperty("line.separator"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output.toString();
	}

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
	 * 
	 * @param colIndex
	 *            index of column to access
	 * @return returns a double array containing the column
	 */
	public static double[] getColumn(double[][]data,int colIndex) {
		double[] result = new double[data.length];
		for (int i = 0; i < data.length; i++) {
			result[i] = data[i][colIndex];
		}
		return result;
	}

	/***
	 * returns a column from the CSVData 2d array
	 * 
	 * @param colName
	 *            name of column to access
	 * @return returns a double array containing the column
	 */
	public double[] getColumn(String colName) {
		return null;
	}

	/***
	 * returns a row from the CSVData 2d array
	 * 
	 * @param rowIndex
	 *            index of row to access
	 * @return returns a double array containing the row
	 */
	public static double[] getRow(double[][]data,int rowIndex) {

		return data[rowIndex];
	}

	/***
	 * returns a set of consecutive rows in the CSVData 2d array
	 * 
	 * @param startRow
	 *            first row in the consecutive set of rows
	 * @param endRow
	 *            last row in the consecutive set of rows
	 * @return returns a 2d double array containing the specified rows
	 */
	public static double[][] getRows(double[][]data,int startRow, int endRow) {
		double[][] result = new double[endRow - startRow][data[0].length];
		for (int i = startRow; i < endRow; i++) {
			result[i - startRow] = data[i];
		}
		return result;
	}

	/***
	 * returns a specified set of rows from the CSVData 2d array
	 * 
	 * @param indexes
	 *            array containing the indexes of the desired rows
	 * @return returns a 2d double array containing the specified rows
	 */
	public double[][] getRows(int[] indexes) {
		double[][] result = new double[data.length][data[0].length];
		for (int i = 0; i < indexes.length; i++) {
			result[i] = data[indexes[i]];
		}
		return result;
	}

	/***
	 * returns a set of consecutive columns in the CSVData 2d array
	 * 
	 * @param startColumn
	 *            first column in the consecutive set of rows
	 * @param endColumn
	 *            last column in the consecutive set of rows
	 * @return returns a 2d double array containing the specified columns
	 */
	public static double[][] getColumns(double[][]data,int startColumn, int endColumn) {
		double[][] result = new double[endColumn - startColumn][data.length];
		for (int i = startColumn; i < endColumn; i++) {
			result[i - startColumn] = getColumn(data,i);
		}
		return result;
	}

	/***
	 * returns a specified set of columns from the CSVData 2d array
	 * 
	 * @param indexes
	 *            array containing the indexes of the desired columns
	 * @return returns a 2d double array containing the specified columns
	 */
	public static double[][] getColumns(double[][]data,int[] indexes) {
		double[][] result = new double[indexes.length][data.length];
		for (int i = 0; i < indexes.length; i++) {
			result[i] = getColumn(data,indexes[i]);
		}
		return result;
	}

	/***
	 * sets a column in the CSVData 2d array
	 * 
	 * @param colIndex
	 *            which column to set
	 * @param values
	 *            what to put inside the column
	 */
	public static void setColumn(double[][]data,int colIndex, double[] values) {

		for (int i = 0; i < data.length; i++) {
			data[i][colIndex] = values[i];
		}
	}

	/***
	 * sets a row in the CSVData 2d array
	 * 
	 * @param rowIndex
	 *            which row to set
	 * @param values
	 *            what to put inside the row
	 */
	public void setRow(int rowIndex, double[] values) {
		data[rowIndex] = values;
	}

	/***
	 * sets a value in the CSVData 2d array
	 * 
	 * @param rowIndex
	 *            what row we want to put the value in
	 * @param colIndex
	 *            what column we want to put the value in
	 * @param value
	 *            what value to put in the indicated location
	 */
	public void setValue(int rowIndex, int colIndex, double value) {
		data[rowIndex][colIndex] = value;
	}
}
