package com.cpt202example.ex1.model;
//model是一个可以表达数据库中数据的类


import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author Ricky
 **/

//without database
@Entity  //note that Kid is a entity this could connect with database
public class Kid {
    @Id //as a key该字段是实体类的主键字段。主键是用于唯一标识实体对象的字段，在数据库表中通常对应于表中的主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //@GeneratedValue 注解配合 strategy 属性可以指定主键的生成方式。
    // 在这个例子中，GenerationType.IDENTITY 表示使用数据库的自增长（Auto Increment）方式生成主键值。
    // 这意味着数据库会自动为每次插入的记录分配一个唯一的主键值，并且每个主键值都会比上一个插入记录的主键值大，确保了主键的唯一性
    private int id;
    private String name;
    private int age;

    public Kid(){
    }

    public Kid(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
