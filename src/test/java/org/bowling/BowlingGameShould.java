package org.bowling;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

class BowlingGameShould {


  private BowlingGame bowling = new BowlingGame();

  // Cuando hay strike se suma 10 más las dos bolas siguientes
  // Cuando la segunda bola de un cuadro derriba los diez bolos
  //      se denomina spare y se suma 10 más el numero de bolos derribados
  //

  @Test
  void countScoreWithoutSpareOrStrike() {
    int result = bowling.score("9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||");
    assertThat(result).isEqualTo(90);
  }

}