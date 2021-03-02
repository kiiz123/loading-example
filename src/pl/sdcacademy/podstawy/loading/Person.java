package pl.sdcacademy.podstawy.loading;

import java.time.LocalDate;
import java.time.Month;

public class Person {
    private final String firstName;
    private final String lastName;
    private LocalDate birthDate;
    private Double weight;
    private Double height;

    public Person(String firstName, String lastName, LocalDate birthDate, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
        this.height = height;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(2000, Month.JANUARY,1);
        this.weight = 0.0;
        this.height = 0.0;
    }

    public Person(LocalDate birthDate, double weight, double height) {
        this.firstName = "";
        this.lastName = "";
        this.birthDate = birthDate;
        this.weight = weight;
        this.height = height;
    }
}
