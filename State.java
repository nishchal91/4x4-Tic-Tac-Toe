package com.AI.tictactoe;

/**
 * Created by Nishchal on 4/26/2017.
 */
public class State {
    String[][] board = new String[4][4];
    String nextPlayer;
    int heuristicValue;
    int depth;
    State parentState;

    public State(String[][] board,State parentState, String nextPlayer,int heuristicValue, int depth) {
        this.board = board;
        this.nextPlayer = nextPlayer;
        this.heuristicValue = heuristicValue;
        this.depth = depth;
        this.parentState=parentState;
    }

    public State(String[][] board) {
        this(board,null, null, 0, 0);
    }

    public State()
    {

    }

}
