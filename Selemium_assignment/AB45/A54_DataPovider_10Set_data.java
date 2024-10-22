package ab45_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A54_DataPovider_10Set_data {
	@Test(dataProvider ="test1")
	public void Data_Set(String fn, String ln, String dob, String gen, String mail) {
		
		System.out.println(fn);
		System.out.println(ln);
		System.out.println(dob);
		System.out.println(gen);
		System.out.println(mail);

	}

	@DataProvider(name = "test1")
	public Object[][] methodName() {
		Object[][] d1 = new Object[10][5];
		// 1St set
		d1[0][0] = "Raju";
		d1[0][1] = "Das";
		d1[0][2] = "05-08-1992";
		d1[0][3] = "Male";
		d1[0][4] = "rahu@gmail.com";

		// 2nd set
		d1[1][0] = "Ramu";
		d1[1][1] = "Pal";
		d1[1][2] = "07-01-1995";
		d1[1][3] = "Male";
		d1[1][4] = "ramu@gmail.com";
		// 3rd set
		d1[2][0] = "Rajesh";
		d1[2][1] = "Sarkar";
		d1[2][2] = "08-07-1994";
		d1[2][3] = "Male";
		d1[2][4] = "rajesh@gmail.com";

		// 4th set
		d1[3][0] = "Mukesh";
		d1[3][1] = "Debnath";
		d1[3][2] = "12-01-1990";
		d1[3][3] = "Male";
		d1[3][4] = "mukesh@gmail.com";

		// 5th set
		d1[4][0] = "Tunna";
		d1[4][1] = "Palit";
		d1[4][2] = "12-06-1991";
		d1[4][3] = "Male";
		d1[4][4] = "tunna@gmail.com";

		// 6th set
		d1[5][0] = "Hari";
		d1[5][1] = "Prasad";
		d1[5][2] = "16-08-1997";
		d1[5][3] = "Male";
		d1[5][4] = "hari@gmail.com";

		// 7th set
		d1[6][0] = "Madhav";
		d1[6][1] = "Mukherjee";
		d1[6][2] = "16-0-1996";
		d1[6][3] = "Male";
		d1[6][4] = "madhav@gmail.com";

		// 8th set
		d1[7][0] = "Bapi";
		d1[7][1] = "Lahiri";
		d1[7][2] = "15-04-1996";
		d1[7][3] = "Male";
		d1[7][4] = "bapi@gmail.com";

		// 9th set
		d1[8][0] = "Suresh";
		d1[8][1] = "Shaoo";
		d1[8][2] = "10-08-1998";
		d1[8][3] = "Male";
		d1[8][4] = "suresh@gmail.com";

		// 10th set
		d1[9][0] = "Bipin";
		d1[9][1] = "Deshmukh";
		d1[9][2] = "12-05-1991";
		d1[9][3] = "Male";
		d1[9][4] = "bipin@gmail.com";

		return d1;
	}

}
