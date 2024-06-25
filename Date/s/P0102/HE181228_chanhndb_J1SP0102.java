
package j2.s.P0102;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;
public class HE181228_chanhndb_J1SP0102 {

    public static void main(String args[]) {
        //1. User enter date
        Scanner sc = new Scanner(System.in);
//        String numberOfDate;// khai báo 
        //dùng để đếm phần tử đặc biệt (/)
        int numberOfTokens = 0;
        // dùng để check valid và tìm ngày 
        int numberOfDays = 0;
        int numberOfMonths = 0;
        int numberOfYears = 0;
        do {
            try {
                String numberOfDate;// khai báo 
                System.out.println("Please enter date with format [dd/mm/yyyy]: ");
                numberOfDate = sc.next();
                StringTokenizer st = new StringTokenizer(numberOfDate, "/");
                numberOfTokens = st.countTokens();
                if (numberOfTokens > 3) {                 //so sanh cac phan tu dac biet
                    throw new Exception("Vui long dien dung ngay thang nam !!!");
                }
                //2.Check valid day
                numberOfDays = Integer.parseInt(st.nextToken()); //dung nextToken de chuyen toi cac ngay thang khac nhau
                numberOfMonths = Integer.parseInt(st.nextToken());
                numberOfYears = Integer.parseInt(st.nextToken());
                if (numberOfDays <= 0 || numberOfDays > 31) {
                    throw new Exception("sai ngay");
                }
                if (numberOfMonths <= 0 || numberOfMonths > 12) {
                    throw new Exception("sai thang");
                }
                if (numberOfYears <= 0) {
                    throw new Exception("sai nam");
                }
                String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday",
                    "Friday", "Saturday", "Sunday"};
                GregorianCalendar d1 = new GregorianCalendar(numberOfYears, numberOfMonths, numberOfDays);
                System.out.println("Your day is: " + days[d1.get(Calendar.DAY_OF_WEEK)]);
            } catch (NumberFormatException e) {
                System.out.println(e);

            } catch (Exception e) {
                System.out.println(e);
            }

        } while (numberOfTokens > 3 || numberOfDays <= 0 || numberOfDays > 31 || numberOfMonths <= 0 || numberOfMonths > 12 || numberOfYears <= 0);

    }
}
