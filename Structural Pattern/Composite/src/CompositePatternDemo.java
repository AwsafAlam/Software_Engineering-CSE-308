public class CompositePatternDemo {

    public static void main(String[] args) {

        Employee CEO = new Employee("John","CEO",30000);
        Employee headSales = new Employee("Robert","Head Sales",20000);
        Employee headMarketing = new Employee("Micheal","Head Marketing",20000);

        Employee clerk1 = new Employee("Laura","Marketing CLerk",1000);
        Employee clerk2 = new Employee("Bob","Marketing CLerk",1200);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(clerk1);
        headSales.add(clerk2);


        System.out.println(CEO);
        System.out.println("Has SubOrdinates :-");

        for (Employee e: CEO.getSubOrdinates()) {
            System.out.println(e);
            System.out.println(" Has SubOrdinates :-");
            for (Employee employee: e.getSubOrdinates()) {
                System.out.println(employee);
            }
            System.out.println("-----------------------");
        }
    }
}
