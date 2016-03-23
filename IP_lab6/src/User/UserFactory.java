package User;

import java.util.HashMap;

/**
 * Created by alber_000 on 3/23/2016.
 */

public class UserFactory
{
    public UserProt create(String typeOfUsers){
        if(typeOfUsers.equals("admin")){
            return new Admin();
        }
        if(typeOfUsers.equals("user")){
            return new User();
        }
        if(typeOfUsers.equals("guest")){
            return new Guest();
        }
        //etc
        return null;
    }
}
