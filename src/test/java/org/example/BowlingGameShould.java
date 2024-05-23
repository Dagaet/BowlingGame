package org.example;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class BowlingGameShould {

    // 1.- Que la primera tirada la puntuación sea 10
    // score : [10] = 10;
    // 2.- Primera ronda que sean 2 tiradas, cuando la primera es menor a 10
    // score : [9,0]  = 9;
    // 3.- Que se puedan realizar más de 1 ronda
    // score : [10][9,0] = 19;
    // 4.- Sólo se llega a 10 rondas
    // score : [10][9,0][10][9,0][10][9,0][10][9,0][10][9,0] = 95 ;
    // 5.- Si la décima ronda la puntuación es > 10 se puede hacer una tirada extra.
    // score : [10][9,0][10][9,0][10][9,0][10][9,0][10][9,1,5] = 101 ;



}
