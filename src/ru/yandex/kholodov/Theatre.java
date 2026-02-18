package ru.yandex.kholodov;

import ru.yandex.kholodov.person.roles.Actor;
import ru.yandex.kholodov.person.roles.Choreographer;
import ru.yandex.kholodov.person.roles.Director;
import ru.yandex.kholodov.person.roles.MusicAuthor;
import ru.yandex.kholodov.show.Show;
import ru.yandex.kholodov.show.type.Ballet;
import ru.yandex.kholodov.show.type.Opera;
import java.util.ArrayList;

import static ru.yandex.kholodov.person.Gender.MALE;
import static ru.yandex.kholodov.person.Gender.FEMALE;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Андрей", "Орлов", MALE, 85);
        Actor actor2 = new Actor("Алина", "Ломоносова", FEMALE, 62);
        Actor actor3 = new Actor("Артем", "Бозванов", MALE, 73);

        Director director1 = new Director("Антон", "Малинов", MALE, 10);
        Director director2 = new Director("Алена", "Цветкова", FEMALE, 10);

        MusicAuthor musicAuthor = new MusicAuthor("Иван", "Андреев", MALE);

        Choreographer choreographer = new Choreographer("Анна", "Морозова", FEMALE);

        Show show = new Show("Директор на час", 120, director1, new ArrayList<>());

        Opera opera = new Opera("Стеклянный голос", 180, director2,
                new ArrayList<>(), musicAuthor, "Певица потеряла голос и уговаривает ученицу спеть под фонограмму." +
                " Та срывает маски, выходя на свет своим живым голосом, и получает благословение уходящей звезды.", 10);

        Ballet ballet = new Ballet("Последняя роль куклы", 200, director1, new ArrayList<>(), musicAuthor, "Ожившая" +
                " кукла устала от нитей кукольника. Изобретатель дарит ей свободу ценой потери идеальной механики —" +
                " и она делает первый живой, неуклюжий шаг.", choreographer);

        show.addActor(actor2);
        show.addActor(actor3);

        opera.addActor(actor1);
        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        System.out.println("Спектакль:\n" + show.getListOfActors());
        System.out.println("Опера:\n" + opera.getListOfActors());
        System.out.println("Балет:\n" + ballet.getListOfActors() + "\n");

        ballet.replaceActor(actor2, "Бозванов");
        System.out.println("Балет:\n" + ballet.getListOfActors() + "\n");


        opera.replaceActor(actor1, "Шульгинова");
        System.out.println();

        System.out.println(opera.getLibrettoText() + "\n");
        System.out.println(ballet.getLibrettoText());
    }
}
