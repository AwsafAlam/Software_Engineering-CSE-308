import java.util.ArrayList;
import java.util.List;

public class DressList {

    List<Item> dresslistt = new ArrayList<>();

    public void add(Item d){
        dresslistt.add(d);
    }

    public void show(){
        int price = 0;

        for (Item item: dresslistt) {
            System.out.println(item.Name() +"  "+ item.Price());
            price += item.Price();
        }

        System.out.println("Total Price : "+price);
    }

}
