package l4q4;

import java.util.Scanner;

public class L4Q4 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year, input = 0;
        String str_day;
        
        System.out.print("Enter the year: ");
        year = s.nextInt();
        
        System.out.print("Enter the first day of year(Monday - Friday): ");
        str_day = s.next();
        
        //System.out.print("Enter the month to view(1 - 12): ");
        //input = s.nextInt();
        
        System.out.println();
        
        input = 5;
        print_cal(input, year, str_day);
        input = 8;
        print_cal(input, year, str_day);
    }
    
    public static void print_cal(int input, int year, String str_day){
        int month, empty_space, initial_space = 0, initial_days = 0;
        int[] month_space = new int[12];
        
        switch (str_day){
            case "Sunday":
                initial_space += 0;
                break;
                
            case "Monday":
                initial_space += 1;
                break;
                
            case "Tuesday":
                initial_space += 2;
                break;
                
            case "Wednesday":
                initial_space += 3;
                break;
                
            case "Thursday":
                initial_space += 4;
                break;
                
            case "Friday":
                initial_space += 5;
                break;
                
            case "Saturday":
                initial_space += 6;
                break;
        }
        
        //month
        month = input - 1;
        
        //no. of days in each month       
        month_space[0] = 31;
        month_space[2] = 31;
        month_space[3] = 30;
        month_space[4] = 31;
        month_space[5] = 30;
        month_space[6] = 31;
        month_space[7] = 31;
        month_space[8] = 30;
        month_space[9] = 31;
        month_space[10] = 30;
        month_space[11] = 31;
        if (year % 4 == 0){
            month_space[1] = 29;
        } else {
            month_space[1] = 28;
        }
        
        //total no. of days in the months skipped
        for (int i = 0; i < month; i++){
            initial_days += month_space[i];
        }
        
        //no. of empty space at the start of each month
        empty_space = (initial_space + initial_days) % 7;
        
        //prints calendar header
        System.out.print("      ");
        
        switch(input){
            case 1:
                System.out.print("Jan");
                break;
            case 2:
                System.out.print("Feb");
                break;
            case 3:
                System.out.print("Mac");
                break;
            case 4:
                System.out.print("Apr");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("Jun");
                break;
            case 7:
                System.out.print("Jul");
                break;
            case 8:
                System.out.print("Aug");
                break;
            case 9:
                System.out.print("Sep");
                break;
            case 10:
                System.out.print("Oct");
                break;
            case 11:
                System.out.print("Nov");
                break;
            case 12:
                System.out.print("Dec");
                break;
        }
        
        System.out.print(" " + year);
        System.out.println();
        System.out.println("S  M  T  W  T  F  S");

        //prints empty space
        for (int i = 1 ; i <= empty_space ; i++){
            System.out.print("   ");
        }

        //prints following dates
        for (int i = 1 ; i <= month_space[input - 1] ; i++){
            System.out.printf("%-3d", i);

            if((i + empty_space) % 7 == 0){
                System.out.println();
            }
        }
        
        System.out.println("\n");
    }
    
    
    
}
