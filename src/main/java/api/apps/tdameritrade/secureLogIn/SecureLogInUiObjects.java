package api.apps.tdameritrade.secureLogIn;

import core.UiObject;
import core.UiSelector;

public class SecureLogInUiObjects {

    private static UiObject
    actionBarBack,
    userId,
    logInpassword,
    showPasswordEye,
    rememberUserId,
    loginButton,
    cancel,
    forgotUserId,
    forgotPassword,
    openNewAccount,
    loginHelp,
    contactUs;

    public UiObject actionBarBack(){
        if (actionBarBack == null)
            actionBarBack = new UiSelector().resourceId("com.tdameritrade.mobile3:id/actionbar_back").makeUiObject();
        return actionBarBack;
    }public UiObject userId(){
        if (userId == null)
            userId = new UiSelector().resourceId("username").makeUiObject();
        return userId;
    }public UiObject logInpassword(){
        if (logInpassword == null)
            logInpassword = new UiSelector().resourceId("password").makeUiObject();
        return logInpassword;
    }public UiObject showPasswordEye(){
        if (showPasswordEye == null)
            showPasswordEye = new UiSelector().text("Show password").makeUiObject();
        return showPasswordEye;
    }public UiObject rememberUserId(){
        if (rememberUserId == null)
            rememberUserId = new UiSelector().resourceId("rememberuserid").makeUiObject();
        return rememberUserId;
    }public UiObject loginButton(){
        if (loginButton == null)
            loginButton = new UiSelector().resourceId("accept").makeUiObject();
        return loginButton;
    }public UiObject cancel(){
        if (cancel == null)
            cancel = new UiSelector().resourceId("decline").makeUiObject();
        return cancel;
    }public UiObject forgotUserId(){
        if (forgotUserId == null)
            forgotUserId = new UiSelector().text("Forgot user ID?").makeUiObject();
        return forgotUserId;
    }public UiObject forgotPassword(){
        if (forgotPassword == null)
            forgotPassword = new UiSelector().text("Forgot password?").makeUiObject();
        return forgotPassword;
    }public UiObject openNewAccount(){
        if (openNewAccount == null)
            openNewAccount = new UiSelector().text("Open a new account").makeUiObject();
        return openNewAccount;
    }public UiObject loginHelp(){
        if (loginHelp == null)
            loginHelp = new UiSelector().text("Log-in help").makeUiObject();
        return loginHelp;
    }public UiObject contactUs(){
        if (contactUs == null)
            contactUs = new UiSelector().text("Contact us").makeUiObject();
        return contactUs;
    }






}
