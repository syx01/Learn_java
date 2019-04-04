package com.learn.designpatten.state;

import com.learn.designpatten.state.BookedState;
import com.learn.designpatten.state.FreeState;
import com.learn.designpatten.state.Home;

public class StateTest {
    public static void main(String[] args) {
        Home home = new Home();
        home.setState(new FreeState());
        home.setState(new BookedState());
    }
}
