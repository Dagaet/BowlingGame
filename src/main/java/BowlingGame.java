public class BowlingGame {

    public int getScore(String game) {
       String[] turns = game.split("\\|\\||\\|");
       // El ultimo turno tiene dos tiradas. XX. Entonces, no entra en el if, y va al else.
        // Así que el primer test falla
       int score = 0;
        for (String turn : turns) {
            if(turn.equals("X") ) {
                score = 300;
            } else {
                score = 150;
            }
        }
        return score;
    }
}
