package shopsimulation;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private double money;
    private boolean isDrunk;
    private List<Product> wishList;

    public Person() {}

    public Person (String name, int age, double money, boolean isDrunk) {
        this.name = name;
        this.age = age;
        this.money = money;
        this.isDrunk = isDrunk;
        this.wishList = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean isDrunk() {
        return isDrunk;
    }

    public void setDrunk(boolean drunk) {
        isDrunk = drunk;
    }

    public List<Product> getWishList() {
        return wishList;
    }

    public void setWishList(List<Product> wishList) {
        this.wishList = wishList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", isDrunk=" + isDrunk +
                '}';
    }
}
