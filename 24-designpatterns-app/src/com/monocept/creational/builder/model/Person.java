package com.monocept.creational.builder.model;

public class Person {
    private String name;
    private int age;
    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    public static class PersonBuilder {
        private String name;
        private int age;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this; 
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this; 
        }

        public Person build() {
            return new Person(name, age);
        }
    }
}
