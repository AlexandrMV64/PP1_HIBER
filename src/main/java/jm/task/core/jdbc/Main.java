package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService us = new UserServiceImpl();
        us.createUsersTable();
        us.saveUser("Oleg","Ibragimov",(byte) 21);
        us.saveUser("Jack","Ibrav",(byte) 23);
        us.saveUser("Sany","gimov",(byte) 25);
        us.saveUser("Ivan","ragimov",(byte) 41);
        us.getAllUsers().forEach(System.out::println);
        us.cleanUsersTable();
        us.dropUsersTable();
    }
}
