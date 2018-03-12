/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovaturelabs.threads.threadpool;


import java.util.Random;


/**
 *
 * @author kiran
 */
public class Task implements Runnable {

    private final String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Random random = new Random();

        System.out.println(name + "started");
        for (int i = 1; i <= 100; i++) {

            try {
                int randomNum = random.nextInt((1000 - 100) + 1) + 100;
                Thread.sleep(randomNum);
            } catch (InterruptedException ex) {
            }
            System.out.println(name + "running " + i + " th time");
        }
        System.out.println(name + "stopped");

    }

}
