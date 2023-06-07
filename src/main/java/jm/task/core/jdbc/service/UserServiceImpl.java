package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao uDao;

    public UserServiceImpl() {
        uDao = new UserDaoJDBCImpl();
    }

    @Override
    public void createUsersTable() {
        uDao.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        uDao.dropUsersTable();

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        uDao.saveUser(name,lastName,age);

    }

    @Override
    public void removeUserById(long id) {
        uDao.removeUserById(id);

    }

    @Override
    public List<User> getAllUsers() {
        return uDao.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        uDao.cleanUsersTable();

    }

}
