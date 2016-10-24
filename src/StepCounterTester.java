
public class StepCounterTester {
public static void main(String[]args){
	String names="time (ms),  accel x,  accel y,  accel z,  gryo x,  gyro y,  gyro z,  linear accel x,  linear accel y,  linear accel z,  orientation x,  orientation y,  orientation z";
	String[]nameList=names.split(", ");
	
	CSVData test=new CSVData("data//walkingSampleData-out.csv",nameList,1);
	System.out.println(StepCounter.countSteps(CSVData.getColumn(test.getData(),0),CSVData.getColumns(test.getData(),1,7)));
}
}
