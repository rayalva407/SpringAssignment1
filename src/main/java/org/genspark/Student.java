package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Student {

    private int id;
    private String name;
    @Autowired
    @Qualifier("phone")
    private List<Phone> ph;
    @Autowired
    @Qualifier("address")
    private Address add;

    public void hi() {
        System.out.println("I am in init method");
    }

    public void bye() {
        System.out.println("I am in destroy method");
    }

//    public Student(int id, String name, List<Phone> ph, Address add) {
//        this.id = id;
//        this.name = name;
//        this.ph = ph;
//        this.add = add;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ph=" + ph +
                ", add=" + add +
                '}';
    }
}
