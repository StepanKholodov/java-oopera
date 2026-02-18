package ru.yandex.kholodov.show.type;

import ru.yandex.kholodov.person.roles.Actor;
import ru.yandex.kholodov.person.roles.Choreographer;
import ru.yandex.kholodov.person.roles.Director;
import ru.yandex.kholodov.person.roles.MusicAuthor;

import java.util.List;

public class Ballet extends MusicalShow{
    private final Choreographer choreographer;

    public Ballet(String title, int duration, Director director,
                  List<Actor> listOfActors, MusicAuthor musicAuthor, String librettoText, Choreographer choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Choreographer getChoreographer() {
        return choreographer;
    }
}
