package generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericExercise {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("jack", 18));
        set.add(new Student("tom", 18));
        set.add(new Student("marry", 18));

        for (Student student : set) {
            System.out.println(student);
        }

        Map<String,Student> map = new HashMap<>();
        map.put("jack", new Student("jack",18));
        map.put("tom", new Student("tom",18));
        map.put("marry", new Student("marry",18));

        // 迭代器遍历
        Set<Map.Entry<String,Student>> entries = map.entrySet();
        Iterator<Map.Entry<String,Student>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String,Student> next = iterator.next();
            System.out.println(next.getKey() + "->" + next.getValue());
        }
        
    }
}

class Student {
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
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

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", age='" + getAge() + "'" + "}";
    }

}