package concretefactory;

import abstractfactory.AbstractBirbFactory;
import domain.Birb;
import domain.StinkyBirb;

public class BirbFactory implements AbstractBirbFactory{

    public Birb createBirb() {
        return new StinkyBirb();
    }

}
