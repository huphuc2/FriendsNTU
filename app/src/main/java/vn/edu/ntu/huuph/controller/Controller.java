package vn.edu.ntu.huuph.controller;

import java.util.ArrayList;
import android.app.Application;

import vn.edu.ntu.huuph.model.Friends;

public class Controller extends Application implements IController {
    ArrayList<Friends> listFriends = new ArrayList<>();

    public Controller() {
        listFriends.add(new Friends("Thu Cúc", 14/02/1990, 090123456));
        listFriends.add(new Friends("Thu Đủ", 8/3/1991, 090123456));
        listFriends.add(new Friends("Thu Tiền", 30/4/1990, "Le chau Phi"));
        listFriends.add(new Friends("Minh Thảo", 80000, "Le chau Phi"));
    }

    @Override
    public ArrayList<Friends> getListFriends() {
        return listFriends;
    }
}