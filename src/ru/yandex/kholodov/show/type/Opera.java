package ru.yandex.kholodov.show.type;

import ru.yandex.kholodov.person.roles.Actor;
import ru.yandex.kholodov.person.roles.Director;
import ru.yandex.kholodov.person.roles.MusicAuthor;

import java.util.List;

public class Opera extends MusicalShow {
    private final int choirSize;

    public Opera(String title, int duration, Director director,
                 List<Actor> listOfActors, MusicAuthor musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
