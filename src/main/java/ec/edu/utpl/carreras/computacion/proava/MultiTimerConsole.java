package ec.edu.utpl.carreras.computacion.proava;

/**
 * Hello world!
 */
public class MultiTimerConsole {
    public static void main(String[] args) {
        TimerTask timerA = new TimerTask("Temporizador A", 8);
        timerA.run();
        System.out.println();
        TimerTask timerB = new TimerTask("Temporizador B", 5);
        timerB.run();
        System.out.println();
        TimerTask timerC = new TimerTask("Temporizador C", 6);
        timerC.run();
    }
}
