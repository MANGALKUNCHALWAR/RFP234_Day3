public class UC2_Calculate_Daily_Emp_Wage {
    public static void main(String[] args) {

        //  Variables
        int Is_Present = 1;
        int EmpRatePerHour = 20;
        int empHrs;
        int empWage;


        // int max = 1, min = 0;
        //int empCheck = (int) (Math.random() * (max - min + 1) + min);
        //Computation
        double empCheck=Math.floor(Math.random() * 10 ) % 2;

        // checking conditions
        if (empCheck == Is_Present) {
            System.out.println("Employee is Present");
            empHrs = 8;
        } else {
            System.out.println("Employee is Absent");
            empHrs = 0;
        }
        //Computation
        empWage = empHrs * EmpRatePerHour;
        System.out.println("Employee Wage = " + empWage);

    }

}
