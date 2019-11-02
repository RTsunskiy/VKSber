package com.example.vksber.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.vksber.CurrentUser;
import com.example.vksber.view.MainView;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    public void checkAuth() {
        if (!CurrentUser.isAuthorized()) {
            getViewState().startSignIn();
        } else {
            getViewState().signedIn();
        }
    }
}
