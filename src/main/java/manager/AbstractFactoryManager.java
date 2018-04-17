package manager;

import abstractfactory.AbstractBirbFactory;
import concretefactory.BirbFactory;
import domain.Birb;

public class AbstractFactoryManager {
    private static AbstractFactoryManager ourInstance = new AbstractFactoryManager();
    private static AbstractBirbFactory birbFactory;

    public static AbstractFactoryManager getInstance() {
        return ourInstance;
    }

    private AbstractFactoryManager() {
        birbFactory = new BirbFactory();
    }

    public Birb createBirb(){
        return birbFactory.createBirb();
    }
}
