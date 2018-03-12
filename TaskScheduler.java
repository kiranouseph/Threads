/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovaturelabs.threads.threadpool;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kiran
 */
public class TaskScheduler {

    private static int count = 0;
    List<Task> waitingTask = new LinkedList<>();

    public void addTask(Task task) {

        if (count < 5) {
            new Thread() {
                @Override
                public void run() {
                    task.run();

                    count--;
                    if (waitingTask.size() > 0) {

                        Task waitTask = waitingTask.get(0);
                        waitingTask.remove(waitTask);
                        addTask(waitTask);

                    }
                }
            }.start();
            count++;
        } else {
            waitingTask.add(task);
        }

    }

}
