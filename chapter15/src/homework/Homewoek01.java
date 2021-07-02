package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.Test;

@SuppressWarnings({"all"})
public class Homewoek01 {

    @Test
    public void testList() {
        DAO<User> dao = new DAO<>();
        dao.save("1", new User(1, 10, "zs"));
        dao.save("2", new User(2, 17, "ls"));
        dao.save("3", new User(3, 19, "ww"));

        System.out.println(dao.get("1"));

        dao.update("2", new User(2, 18, "zyy"));
        System.out.println(dao.get("2"));

        dao.delete("1");

        System.out.println("=================");
        dao.list().forEach(System.out::println);

    }
}

class DAO<T> {

    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        List<T> list = new ArrayList<>();
        // Iterator<Entry<String, T>> iterator = map.entrySet().iterator();
        // while (iterator.hasNext()) {
        // Entry<String, T> entry = iterator.next();
        // list.add(entry.getValue());
        // }
        Set<String> set = map.keySet();
        for (String key : set) {
            list.add(get(key));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }

}

class User {
    private Integer id;
    private Integer age;
    private String name;

    public User() {
    }

    public User(Integer id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", age='" + getAge() + "'" + ", name='" + getName() + "'" + "}";
    }

}
