public class UC1_CheckEmpAttendance {
    public static void main(String[] args) {

        //  Declaration
        int Is_Present = 1;

        // Random number between 0 and 1
        // int empCheck=(int)(Math.floor(Math.random() * 10 ) % 2)

        // int max=1 , min=0 ;
        // int empCheck = (int)(Math.random()*(max-min+1)+min);
        //Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;

        // checking conditions
        if (empCheck == Is_Present)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

    }
}
