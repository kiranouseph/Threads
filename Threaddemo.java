/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovaturelabs.threads.threadpool;

import java.util.Scanner;

/**
 *
 * @author kiran
 */
public class Threaddemo {

    public static void main(String[] args) {
        int taskNumber = 1;
        Scanner s = new Scanner(System.in);
        TaskScheduler taskscheduler = new TaskScheduler();
        do {
            Task task = new Task("Task" + taskNumber);
            taskscheduler.addTask(task);
            System.out.println("Press 0 to stop");
            taskNumber = s.nextInt();
        } while (taskNumber != 0);

    }

}
