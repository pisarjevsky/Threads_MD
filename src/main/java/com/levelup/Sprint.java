package com.levelup;

public class Sprint extends Thread {
    Championship championship = new Championship();

    public Sprint(ThreadGroup group, String name) {
        super(group, name);
    }

    public void run() {
        System.out.println(championship.groupCounter() + "----------groups");
        for (int i = 0; i < championship.runnerAmount; i++) {
            championship.runnerList.get(i).setStatus(RunnerStatus.RUN);
        }
        for (int i = 0; i < championship.groupCounter(); i++) {
            System.out.println(i + 1);

            if (i == championship.groupCounter()) {

                for (int j = (championship.groupCounter() - 1) * 10 - 1; j < (championship.runnerAmount) - 1; j++) {
                    championship.runnerList.get(i * 10 - j).setTimeResult(Math.random() * 100);
                    championship.runnerList.get(i * 10 - j).setStatus(RunnerStatus.ENDRUN);
                    System.out.println(championship.runnerList.get(i * 10 - j).toString());
                }


            } else {
                for (int j = 0; j < 10; j++) {
                    if ((i * 10 + j) == championship.runnerAmount) {
                        break;
                    }
                    championship.runnerList.get(i * 10 + j).setTimeResult(Math.random() * 100);
                    championship.runnerList.get(i * 10 + j).setStatus(RunnerStatus.ENDRUN);
                    System.out.println(championship.runnerList.get(i * 10 + j).toString());
                }
            }
        }
    }
}
