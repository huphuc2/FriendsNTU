package vn.edu.ntu.huuph.controller;

import java.util.ArrayList;
import android.app.Application;

import vn.edu.ntu.huuph.model.Friends;

public class Controller extends Application implements IController {
    ArrayList<Friends> listFriends = new ArrayList<>();

    public Controller() {
        listFriends.add(new Friends("Thu Cúc", "14/02/1990", "090123456"));
        listFriends.add(new Friends("Thu Đủ", "8/03/1991", "090123456"));
        listFriends.add(new Friends("Thu Tiền", "30/04/1990", "0991231123"));
        listFriends.add(new Friends("Minh Thảo", "28/04/1990", "0988111231"));
    }

    @Override
    public ArrayList<Friends> getListFriends() {
        return listFriends;
    }
}