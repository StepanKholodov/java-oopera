package ru.yandex.kholodov.person.roles;

import ru.yandex.kholodov.person.Gender;
import ru.yandex.kholodov.person.Person;

public class Director extends Person {
;
    private final int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }




}
