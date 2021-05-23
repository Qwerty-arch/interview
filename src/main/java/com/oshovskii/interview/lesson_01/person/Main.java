package com.oshovskii.interview.lesson_01.person;

public class Main {
    public static void main(String[] args) {
        Person johny = new Person.Builder()
                .setFirstName("Johny")
                .setLastName("Black")
                .setMiddleName("Thomas")
                .setCountry("USA")
                .setAddress("Backer street")
                .setPhone("99 999 999 999")
                .setAge(47)
                .setGender("no info")
                .build();
        System.out.println("Person " + johny);

        Person lily = new Person.Builder()
                .setFirstName("Lily")
                .setAge(21)
                .setPhone("17 777 777 777")
                .build();
        System.out.println("Person " + lily);
    }
}
