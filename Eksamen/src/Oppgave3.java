import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class Oppgave3 {
    public List<Ball> printBallsNeedingMoreAir(List<Ball> ballList) {
        for (Ball ball : ballList) {
            if (ball.needMoreAir() == true) {
                System.out.println("Ball med ID " + ball.getId() + "");
            }
        }
    }
}
