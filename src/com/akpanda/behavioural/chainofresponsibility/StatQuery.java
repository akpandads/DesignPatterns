package com.akpanda.behavioural.chainofresponsibility;

class StatQuery {
    public Statistic statistic;
    public int result;

    public StatQuery(Statistic statistic) {
        this.statistic = statistic;
    }
}
