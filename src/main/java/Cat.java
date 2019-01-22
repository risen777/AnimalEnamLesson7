/**
 * Created by Sergey
 */
@Domesticated(name = "Кот")
public class Cat extends Animal {
    private String breed;
    private String name;


    public Cat(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public String setBreed(String breed) {
        this.breed = breed;
        return breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(String breed,String name) {
        return "Кот{" +
                "порода='" + breed + '\'' +
                ", зовут='" + name + '\'' +
                '}';
    }



    void talk(String breed, String name) {
        System.out.println(breed + " " + name + " говорит мяу-мяу");
    }


}
