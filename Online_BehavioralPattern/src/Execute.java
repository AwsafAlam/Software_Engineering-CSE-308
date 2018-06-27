import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){

        System.out.println("Please Enter d , n and t\n" +
                            "--------------------------");
        int d = sc.nextInt();
        int n = sc.nextInt();
        int t = sc.nextInt();

        Context context = new Context(new Uber_Car());
        System.out.println("Cost for Uber Car: "+context.calculateCost(d , n , t));

        Context context2 = new Context(new Pathao_Car());
        System.out.println("Cost for Pathao Car: "+context2.calculateCost(d , n , t));

        Context context3 = new Context(new Uber_Moto());
        System.out.println("Cost for Uber Moto: "+context3.calculateCost(d , n , t));

        Context context4 = new Context(new Pathao_Moto());
        System.out.println("Cost for Pathao Moto: "+context4.calculateCost(d , n , t));

        System.out.println("-----------------------\n\n");

        }

    }
}
