package com.levelup;


//забег, 10 бегунов. 1 группа - результаты - положил. следуюшая 10 - .... . стутус каждого. трисет. очередь. общая таблица.

import java.util.*;

public class Championship {
    public static int groupCount;
    public static int runnerAmount = 35;
    public static List<Runner> runnerList = new ArrayList<Runner>(runnerAmount);


    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        // Sprint sprint = new Sprint(groupA,"JThread ");
        createRunnerList();
        // sprint.run();
        //System.out.println(runnerList.toString());

        /*for (int i = 0; i < 9; i++)
            new Sprint(groupA, "JThread " + i).start();*/

        Thread th1 = new Thread(new Sprint(groupA, "JThread "));
        th1.start();
        try {
            //sprint.run();
            Thread.sleep(0);
        } catch (Exception e) {
            System.out.println(e);
        }


        SortedSet<Integer> resultTable = new TreeSet<Integer>();
    }


    public static List createRunnerList() {
        for (int i = 0; i < runnerAmount; i++) {
            Runner runner = new Runner(i , 0, RunnerStatus.WAITFORRUN);
            runnerList.add(runner);
            //System.out.println(runner.toString());
        }
        return runnerList;
    }

    public static int groupCounter() {
        if (runnerAmount % 10 == 0) {
            groupCount = runnerAmount / 10;
        } else {
            groupCount = runnerAmount / 10 + 1;
        }
        return groupCount;
    }

}
