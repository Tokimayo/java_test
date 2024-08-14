package linux_command;
import java.util.Calendar;
import java.util.Collections;

public class cal {
	
	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		
		if(args.length == 1 || args.length > 2) {
			System.out.println("年月を指定する場合は、「8 2024」のように指定してください");
		
		}else if(args.length == 2) {
			int otherMonth = Integer.parseInt(args[0]) -1;
	        int otherYear = Integer.parseInt(args[1]);
			int thisDate = 0;
			outputCalendar(otherYear, otherMonth, thisDate);
		}else if(args.length == 0) {
			int thisYear = cl.get(Calendar.YEAR);
			int thisMonth = cl.get(Calendar.MONTH);
			int thisDate = cl.get(Calendar.DATE);
			outputCalendar(thisYear, thisMonth, thisDate);
		}
	}
	
	public static void outputCalendar(int inputYear, int inputMonth, int thisDate) {
		Calendar cl = Calendar.getInstance();
		
		String[] month = {"1","2","3","4","5","6",
				"7","8","9","10","11","12"};
		String[] week = {"日","月","火","水","木","金","土"};
		
		int firstDay = 1;
		cl.set(inputYear,inputMonth,firstDay);
		int firstDayWeek = cl.get(Calendar.DAY_OF_WEEK) - 1; 
		int lastDay = cl.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.print("      " + month[inputMonth] + "月 " +  inputYear);
		System.out.println(); 

		for (int i = 0; i < week.length; i++) {
			if(i == 0) {
				System.out.printf(week[i]);
			}else {
				System.out.printf("%2s",week[i]);
			}
			
		}
		System.out.println();
		
		System.out.print(String.join("", Collections.nCopies(firstDayWeek, "   ")));
		
		for (int i = firstDay; i <= lastDay; i++) {
			
			if(thisDate != 0 && thisDate == i) {
				System.out.printf("\u001B[47m\u001B[30m" + i +"\u001b[00m");
				System.out.printf(" ");
			}else {
				System.out.printf("%2d ",i);
			}
			if ((firstDayWeek + i) % 7 == 0) {
				System.out.println();
			}			
		}
	}
}
