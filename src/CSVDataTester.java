
public class CSVDataTester {
	public static void main(String[] args) {
		String[] colNames = { "loggingTime", "loggingSample", "accelerometerTimestamp_sinceReboot",
				"accelerometerAccelerationX", "accelerometerAccelerationY", "accelerometerAccelerationZ",
				"gyroTimestamp_sinceReboot", "gyroRotationX", "gyroRotationY", "gyroRotationZ" };
		CSVData test = new CSVData("/Users/alemarquezvera/Documents/workspace/2016-10-14_10-50-58.csv", colNames, 1);
		double[] t = test.getRow(1);
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}
}
