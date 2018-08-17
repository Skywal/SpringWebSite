package com.bloom.springwebpage.Entity;

public class User {
    //region Fields
    /**
     * Ім'я користувача
     */
    private String name; //Ім'я користувача
    /**
     * Електронна пошта користувача
     */
    private String email; //Електронна пошта користувача
    /**
     * Вік користувача
     */
    private int age; //Вік користувача
    /**
     * ідентифікаційний номер користувача
     */
    private int id; //ідентифікаційний номер користувача
    //endregion

    //region Construct
    public User() {
    }

    public User(String name, String email, int age, int id) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.id = id;
    }
    //endregion

    //region get/set
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(int id) {
        this.id = id;
    }
    //endregion
}
