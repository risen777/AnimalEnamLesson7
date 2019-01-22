/**
 * Created by Sergey
 */
public abstract class Animal {
    private String name;
    private String breed;


    public abstract String toString(String breed, String name);

    abstract void talk(String breed, String name);

    final void sleep() {

    }

    final void awake() {

    }

    final void die() {

    }


}
