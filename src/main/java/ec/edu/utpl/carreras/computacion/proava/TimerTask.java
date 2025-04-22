package ec.edu.utpl.carreras.computacion.proava;

public class TimerTask {
    private final String name;
    private int seconds;

    public TimerTask(String name, int seconds) {
        this.name = name;
        this.seconds = seconds;
    }

    public void run() {
        while(seconds > 0) {
            System.out.printf("%s: %d segundos restantes%n", name, seconds);
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                System.out.printf("%s interrumpido", name);
            }
            seconds --;
        }
    }
}