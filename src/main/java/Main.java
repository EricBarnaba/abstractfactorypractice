import domain.Birb;
import manager.AbstractFactoryManager;

public class Main {

    public static void main(String[] args) {
        Birb stinky = AbstractFactoryManager.getInstance().createBirb();
        System.out.println(stinky.squawk());
    }

}
