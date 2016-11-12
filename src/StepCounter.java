
public class StepCounter {
	static int countSteps(double[] times, double[][] sensorData) {
		int stepSpacing=2;
		int thresholdWindow=100;
		double threshold=0.40;
		
		double[][] accelData = CSVData.getColumns(sensorData, 1, 4);
		
		System.out.println();
		double[] accelMags = calculateMagnitudesFor(accelData);
		int stepCounter = 0;
		for (int i = 1; i < accelMags.length - 1; i++) {

			int start = i - thresholdWindow;
			int end = i + thresholdWindow;
			if (start < 0)
				start = 0;
			if (end > accelMags.length)
				end = accelMags.length;
			double[] accelMagsWindow = new double[(end - start)];
			for (int i1 = start; i1 < end; i1++) {
				accelMagsWindow[i1 - start] = accelMags[i1];
			}
			double accelMagMean = calculateMean(accelMagsWindow);
			double accelStanDev = calculateStandardDeviation(accelMagsWindow, accelMagMean);

			if (accelMags[i] > accelMags[i - 1] && accelMags[i] > accelMags[i + 1]) {
				if (accelMags[i] > accelMagMean + accelStanDev * threshold)

					stepCounter++;
				i += stepSpacing;
			}
		}
		return (stepCounter);

	}

	private static double calculateStandardDeviation(double[] arr, double mean) {
		double totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			double x = (arr[i] - mean) * (arr[i] - mean);
			totalSum += x;
		}
		totalSum /= arr.length - 1;
		totalSum = Math.sqrt(totalSum);
		return totalSum;

	}

	private static double calculateMean(double[] arr) {
		double totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
		}
		totalSum /= arr.length;
		return totalSum;
	}

	private static double calculateMagnitude(double x, double y, double z) {
		return (Math.sqrt((x * x) + (y * y) + (z * z)));
	}

	private static double[] calculateMagnitudesFor(double[][] sensorData) {
		double[] result = new double[sensorData.length];
		for (int i = 0; i < sensorData.length; i++) {
			result[i] = calculateMagnitude(sensorData[i][0], sensorData[i][1], sensorData[i][2]);
		}
		return result;
	}
}
