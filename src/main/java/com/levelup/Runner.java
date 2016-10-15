package com.levelup;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Runner implements IRunner {
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private double timeResult;
    @Getter
    @Setter
    private Enum status;

    public Enum status() {
        return null;
    }

    public boolean run() {
        return true;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "id=" + id +
                ", timeResult=" + timeResult +
                ", status=" + status +
                '}';
    }
}
