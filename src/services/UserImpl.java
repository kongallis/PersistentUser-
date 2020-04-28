/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.User;
import java.util.List;

/**
 *
 * @author macuser
 */
public class UserImpl implements IUser {

    private dao.UserDaoImpl userDao;
    
    @Override
    public User findById(int id) {
        if(id <=  0) {
            return null;
        } else {
            // DAO = Data Access Object
            userDao = new dao.UserDaoImpl();
            return userDao.findById(id);          
        }                
    }

    @Override
    public List<User> findAll() {
        return  userDao.findAll();
    }

    @Override
    public  boolean deleteById(int id) {
        if(id <= 0) {
            return false;
        } else {
            return userDao.deleteById(id);
        }
    }

    @Override
    public void save(User user) {
        userDao.save(user);
        System.out.println("Record successfully inserted.");
    }

    @Override
    public boolean update(int id, User user) {
        if(id <= 0) {
            return false;
        } else {
            return userDao.update(id, user);
        }
    }


  

  
}
