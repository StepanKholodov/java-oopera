package ru.yandex.kholodov.show;
import ru.yandex.kholodov.person.roles.Actor;
import ru.yandex.kholodov.person.roles.Director;
import java.util.List;


public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final List<Actor> listOfActors;

    public Show(String title, int duration, Director director, List<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void addActor(Actor actor) {

        if (listOfActors.contains(actor)) {
            System.out.println("Актер уже участвует в спектакле");
            return;
        }

        listOfActors.add(actor);
        System.out.println("Актер успешно добавлен");
    }

    public void replaceActor(Actor artist, String surname) {

        for (int i = 0; i < listOfActors.size(); i++) {

            Actor actor = listOfActors.get(i);
            if (actor.getSurname().equals(surname)) {
                listOfActors.set(i, artist);
                System.out.println("Актер успешно заменен");
                return;
            }
        }
        System.out.println("Данный актер не участвует в представлении ");

    }


}
