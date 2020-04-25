package Collections1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		// System.out.println(d.getDay());

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

		String yourDate = dateFormat.format(d);// dateFormat.format(d);

		System.out.println(" "+yourDate+"\n");
	}
}
