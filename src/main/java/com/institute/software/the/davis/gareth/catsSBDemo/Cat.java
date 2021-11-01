package com.institute.software.the.davis.gareth.catsSBDemo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cat {

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    private int id;

    private String name;
    private int age;
    private String breed;

    public Cat(String name,int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Cat(){

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

   /* public String getJsonObjectOfCat(){
        return "{"+
                "\"name\" : \" " + name + "\"," +
                "\" age\" : \" " + age + "\"" +
                "}";
    }  */
}
