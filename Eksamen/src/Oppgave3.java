import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class Oppgave3 {

    public void printBallsNeedingMoreAir(List<Ball> ballList) {
        System.out.println("Oppgave 3 del 1");
        // method that print out which balls needs more air
        for (Ball ball : ballList) {
            if (ball.needMoreAir() == true) {
                System.out.println("Ball med ID: " + "" + ball.getId() + " Trenger mer luft");
            }
        }
    }

    // method that goes through both list to check/print out which balls needs replacement and which rackets needs replacement
    public void printEquipmentNeedingToBeReplaced(List<Ball> ballList, List<Racket> racketList) {
        System.out.println();
        System.out.println("Oppgave 3 del 2");
        for (Ball ball : ballList) {
            if (ball.replaceBall() == true) {
                System.out.println("Ball med ID: " + "" + ball.getId() + " Trenger å bli erstattet");
            }
        }
        for (Racket racket : racketList) {
            if (racket.replaceRacket() == true) {
                System.out.println("Racket med ID: " + "" + racket.getId() + " Trenger å bli erstattet");
            }
        }
    }

    // skriver ut rackets som trenger aa skifte belegg
    public void printTableTennisRacketsNeedingNewPad(List<Racket> racketList) {
        System.out.println();
        System.out.println("Oppgave 3 del 3");
        for (Racket racket : racketList) {
            if (racket.changeCoating() == true) {
                System.out.println("Racket med ID: " + "" + racket.getId() + " Trenger å få skiftet belegg");
            }
        }
    }
}
