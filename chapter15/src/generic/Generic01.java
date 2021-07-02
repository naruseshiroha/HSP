package generic;
import java.util.ArrayList;

public class Generic01 {
    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("a", 1));
        arrayList.add(new Dog("b", 2));
        arrayList.add(new Dog("c", 3));

        // arrayList.add(new Cat("cat", 8));

        for (Object o : arrayList) {
            // 向下转型 Object -> Dog
            Dog dog = (Dog) o;
            System.out.println(dog.getName() + "," + dog.getAge());
        }
    }

}

class Dog {
    private String name;
    private Integer age;

    public Dog() {
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}

class Cat {
    private String name;
    private Integer age;

    public Cat() {
    }

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}