package com.akpanda.behavioural.chainofresponsibility;

class GoblinKing extends Goblin
{
    public GoblinKing(Game game)
    {
        super(game, 3, 3);
    }

    @Override
    public void query(Object source, StatQuery sq)
    {
        if (source != this && sq.statistic == Statistic.ATTACK)
        {
            sq.result++; // every goblin gets +1 attack
        }
        else super.query(source, sq);
    }
}