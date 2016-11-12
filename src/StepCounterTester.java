
public class StepCounterTester {
public static void main(String[]args){
	String names="time (ms), accelTime, accel x,  accel y,  accel z, gyroTime, gryo x,  gyro y,  gyro z, gyro z copy";
	String[]nameList=names.split(", ");
	
	CSVData test=new CSVData("data//64StepsInPocketJogging-out.csv",nameList,1);
	System.out.println(StepCounter.countSteps(CSVData.getColumn(test.getData(),0),test.getData()));
}
}
