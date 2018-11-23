package Server.userAccount;

import User.User;

public class account {
    private User user;
    private boolean checkInfo(User user){
        return true;
    }

    public boolean Confirm(User user){
        if(checkInfo(user)) return true;
        else {
            return false;
        }
    }

}
