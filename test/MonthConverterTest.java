package monthconverter.test;

import monthconverter.base.MonthConverter;
public class MonthConverterTest {

    public static void main(String[] args) {

        MonthConverter test = new MonthConverter();

        int month = Integer.parseInt(args[0]);
        test.printMonthConverter(month);



    }


}
