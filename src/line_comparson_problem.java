import java.lang.Double;
public class line_comparson_problem {
    public static double calculate_length(int x1, int y1, int x2, int y2){
        double length=Math.sqrt((x2-x1)^2 + (y2-y2)^2);
        return length;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        int x1=7, y1=5, x2=10, y2=5;
        int a1=3, b1=4;
        int a2 = 5;
        int b2=6;
        Double length1= calculate_length(x1,y1,x2,y2);
        Double length2= calculate_length(a1,b1,a2,b2);
        System.out.println(length1);
        System.out.println(length2);

        if(length1.equals(length2)){
            System.out.println("Two lines are equals");
        }
        else{
            System.out.println("Lines are not equals");
        }
//
        int compare=length1.compareTo(length2);
        //System.out.println(compare);
        if(compare==0){
            System.out.println("Lines are equal");
        }else if(compare>0){
            System.out.println("line 1 > line 2");
        }
        else{
            System.out.println("line 2 > line 1");
        }
    }
}
