package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ru.netology.domain.Film;

@AllArgsConstructor
@NoArgsConstructor

public class AfishaManager {

    private Film[] films = new Film[0];
    private int CountMovies = 10;

    public AfishaManager() {
    }

    public AfishaManager(Film[] films) {
        this.films = films;
    }
}


