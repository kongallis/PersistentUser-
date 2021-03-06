/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistentuser;

import entities.User;
import java.util.List;

/**
 *
 * @author macuser
 */
public class PersistentUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
            findById(int id)
            findAll()
            save(User user) --> INSERT INTO
            update(int id, User user)
         */
        //Δημιουργούμε αντικείμενο userImpl
        services.UserImpl userService = new services.UserImpl();
        User user = userService.findById(1);
        if (user == null) {
            System.out.println("Something is not found");
        } else {
            System.out.println(user);
        }
        List<User> users = userService.findAll();
        for (User user1 : users) {
            System.out.println(user1);
        }

        boolean delete = userService.deleteById(1);
        if (delete) {
            System.out.println("User id: " + 1 + " deleted successfully");
        }
        //O bject user with the new data 
        // If the Id is valid then update, otherwise not
        //userService.updateById(id, user);        
    }

}
