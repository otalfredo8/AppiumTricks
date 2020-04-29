package api.apps.tdameritrade.landing;

import core.UiObject;
import core.UiSelector;

public class LandingUiObjects {

    private static UiObject
            dashboard,
            watchList,
            markets,
            accounts,
            logInLinkText,
            loginButton,
            settingsButton;

    public UiObject dashboard(){
        if(dashboard == null) dashboard = new UiSelector().text("Dashboard").makeUiObject();
        return dashboard;
    }

    public UiObject watchList(){
        if(watchList == null) watchList = new UiSelector().text("Watch Lists").makeUiObject();
        return watchList;
    }

    public UiObject markets(){
        if(markets == null) markets = new UiSelector().text("Markets").makeUiObject();
        return markets;
    }

    public UiObject accounts(){
        if(accounts == null) accounts = new UiSelector().text("Accounts").makeUiObject();
        return accounts;
    }

    public UiObject loginButton(){
        if(loginButton == null) loginButton = new UiSelector().text("Log in").makeUiObject();
        return loginButton;
    }
    public UiObject logInLinkText(){
        if(logInLinkText == null) logInLinkText = new UiSelector().text("LOG IN").makeUiObject();
        return logInLinkText;
    }
    public UiObject settingsButton(){
        if(settingsButton == null) settingsButton = new UiSelector().
                resourceId("com.tdameritrade.mobile3:id/button_settings").makeUiObject();
        return settingsButton;
    }
}
