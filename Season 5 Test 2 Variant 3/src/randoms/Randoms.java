package randoms;

import java.util.Random;

public class Randoms {
	public static final String WORK_TIME_1 = "from 05:00 to 13:30";
	public static final String WORK_TIME_2 = "from 05:00 to 17:30";
	public static final String WORK_TIME_3 = "from 05:00 to 20:30";
	public static final String WORK_TIME_4 = "from 08:00 to 22:30";
	private static final String[] WORK_TIMES = {WORK_TIME_1,WORK_TIME_2,WORK_TIME_3,WORK_TIME_4};

	public static String RandomAdress() {
		return ("Sofia " + new Random().nextInt(10000));
	}
	public static String RandomNames(String typeOfName) {
		return (typeOfName + new Random().nextInt(1000));
	}
	public static String RandomWorkTime() {
		return WORK_TIMES[new Random().nextInt(WORK_TIMES.length)];
	}
	
	
}
