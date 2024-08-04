package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;

public class TesteFacade {

    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Facade:

        Facade facade = new Facade();
        facade.migrarCliente("Rafael", "22897-382");

    }
}
