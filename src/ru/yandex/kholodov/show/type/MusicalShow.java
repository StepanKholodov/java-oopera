package ru.yandex.kholodov.show.type;

import ru.yandex.kholodov.person.roles.Actor;
import ru.yandex.kholodov.person.roles.Director;
import ru.yandex.kholodov.person.roles.MusicAuthor;
import ru.yandex.kholodov.show.Show;

import java.util.List;

public class MusicalShow extends Show {
    private final MusicAuthor musicAuthor;
    private final String librettoText;

    public MusicalShow(String title, int duration, Director director, List<Actor> listOfActors, MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getLibrettoText() {
        return librettoText;
    }
}
