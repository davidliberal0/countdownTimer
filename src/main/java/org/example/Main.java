package org.example;

import java.util.Timer;
import java.util.TimerTask;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // Java Countdown Timer Program

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 5;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count < 0) {
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }
            }
        }; 
    }
}
