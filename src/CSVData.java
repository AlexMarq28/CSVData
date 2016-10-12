
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

	public double[] getColumn(int colIndex) {
		return null;
	}

	public double[] getColumn(String colName) {
		return null;
	}

	public double[] getRow(int rowIndex) {
		return null;
	}

	public double[][] getRows(int startRow, int endRow) {
		return null;
	}

	public double[][] getRows(int[] indexes) {
		return null;
	}

	public double[][] getColumns(int startColumn, int endColumn) {
		return null;
	}

	public double[][] getColumns(int[] indexes) {
		return null;
	}

	public void setColumn(int colIndex, double[] values) {

	}

	public void setValue(int rowIndex, int colIndex, double value) {

	}
}
