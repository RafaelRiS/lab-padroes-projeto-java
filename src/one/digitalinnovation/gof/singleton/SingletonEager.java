package one.digitalinnovation.gof.singleton;

    /**
     * Singleton "apressado"
     *
     * @author rafaelris
     */

    public class SingletonEager {

        private static SingletonEager instancia = new SingletonEager();

        private SingletonEager() {
            super();
        }

        public static SingletonEager getInstance() {
            return instancia;
        }
    }
