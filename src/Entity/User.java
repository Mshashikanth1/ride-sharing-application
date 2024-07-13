package Entity;

import java.util.HashMap;
import java.util.Map;

import  Enum.Gender;

public class User {

    private String name;
    private Gender gender;
    private Integer age;
    private Map<String, Vechile>  vechiles;

    public User(Integer age, Gender gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.vechiles= new HashMap<>();

    }

    public void addVechile(Vechile vechile){
        this.vechiles.put(vechile.getNumber(), vechile);
    }

    public Vechile getVechile(final String number){
        return vechiles.get(number);
    }



    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", vechiles=" + vechiles +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
