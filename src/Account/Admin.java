package Account;

import Handler.UpdateHandler;

public class Admin {
    public boolean disabledUser(int userID, boolean isDisabled) {
        return UpdateHandler.updateUserStatus(userID, isDisabled);
    }
}
