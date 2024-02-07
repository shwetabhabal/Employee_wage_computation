import java.util.Random;
public class Main {
    public static int check_Emp(){
        Random rand= new Random();
        return rand.nextInt(3)  ;
    }
    public static int daily_wages(int wageperhour, int hoursworked){
        return wageperhour* hoursworked;
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        int wage_per_hour= 20;
        int full_day_hour= 8;
        int part_time_hour= 4;
        int maxworking_hours=100;
        int maxworking_days= 20;
        int attendence= check_Emp();
        int totalworkingdays=0;
        int totalworkinghours=0;
        int empwages=0;
        while(totalworkingdays<maxworking_days && totalworkinghours<maxworking_hours) {
            switch (attendence) {
                case 0:
                    System.out.println("employee is absent");
                    break;
                case 1:
                    if (totalworkinghours + full_day_hour <= maxworking_hours) {
                        empwages = daily_wages(wage_per_hour, full_day_hour);
                        totalworkinghours = totalworkinghours + full_day_hour;
                        totalworkingdays++;
                    }
                    break;
                case 2:
                    if (totalworkinghours + part_time_hour <= maxworking_hours) {
                        empwages = daily_wages(wage_per_hour, part_time_hour);
                        totalworkinghours = totalworkinghours + part_time_hour;
                        totalworkingdays++;
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println("total working hours: "+totalworkinghours);
        System.out.println("total working days: "+totalworkingdays);
        System.out.println("Employee wages: "+empwages);
    }
}