public class MediatorPatternExecute {


    public static void main(String[] args) {


        ConcreteMediator m = new ConcreteMediator();

        Friend1 Shommo = new Friend1(m , "Shommo");
        Friend2 Mushfiq = new Friend2(m , "Mushfiq");

        Boss Shadman = new Boss(m , "Shadman");

        m.setFriend1(Shommo);
        m.setFriend2(Mushfiq);
        m.setBoss(Shadman);

        Shommo.Send("[Shommo here] Class test cancelled");
        Mushfiq.Send("[Mushfiq here] Ei code e error dae ken?");
        Shadman.Send("[Shadman here] Klk free aso?");

    }
}
