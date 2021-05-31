package com.oshovskii.interview.lesson_03.ping_pong;

public class PingPongApp {
    private static final Object monitor = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (monitor) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("ping");
                    monitor.notify();
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                monitor.notify();
            }
        }).start();

        new Thread(() -> {
            synchronized (monitor) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("pong");
                    monitor.notify();
                    try {
                        monitor.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                monitor.notify();
            }
        }).start();
    }
}
