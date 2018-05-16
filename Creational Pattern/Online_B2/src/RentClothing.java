import java.util.Scanner;

public class RentClothing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 for Formal , 2 for Casual type");

            int type = sc.nextInt();
            int wallet = sc.nextInt();
            int smartwatch = sc.nextInt();

            Director director = new Director();

            DressBuilder dressBuilder = new Dress();

            DressList list = director.Construct(dressBuilder, type, wallet, smartwatch);

            if(list == null){
                break;
            }

            list.show();

        }

    }
}
