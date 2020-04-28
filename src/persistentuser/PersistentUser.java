package persistentuser;

import entities.User;
import java.util.List;

public class PersistentUser {

    public static void main(String[] args) {

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
 
        User usr = new User();
        usr.setFirstName("John");
        usr.setLastName("Adams");
        usr.setEmail("jadams@gmail.com");
        usr.setTel("0123456789");
        userService.save(usr);

      

        User upUsr = new User();
        upUsr.setFirstName("John");
        upUsr.setLastName("Smith");
        upUsr.setEmail("jadams@gmail.com");
        upUsr.setTel("0101010203");
        userService.update(3, upUsr);

    }

}
