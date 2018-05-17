package com.example.mohamedg.loginactivity_mvp.Login;

import com.example.mohamedg.loginactivity_mvp.model.IUser;
import com.example.mohamedg.loginactivity_mvp.model.User;

public class LoginPresenter implements ILoginPresenter {
   ILoginView view;

    public LoginPresenter(ILoginView view) {
        this.view = view;
    }

    public void CheckIsUserValided(String mail, String password) {
        IUser user = new User( password,mail);
        if(user.isValidData())
        {
            view.ReturnResult(true);
        }else {
            view.ReturnResult(false);
        }
    }
}
