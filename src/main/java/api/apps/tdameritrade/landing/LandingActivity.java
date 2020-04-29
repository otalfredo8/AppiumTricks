package api.apps.tdameritrade.landing;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

public class LandingActivity implements Activity {

    public LandingUiObjects uiObject = new LandingUiObjects();

    public void tapDashboard(){
        try{
            MyLogger.log.info("Tapping on the Dashboard tab");
            uiObject.dashboard().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap Dashboard tab, element absent or blocked");
        }
    }

    public void tapWatchList(){
        try{
            MyLogger.log.info("Tapping on the Watch List tab");
            uiObject.watchList().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap Watch List tab, element absent or blocked");
        }
    }

    public void tapMarkets(){
        try{
            MyLogger.log.info("Tapping on the Markets tab");
            uiObject.markets().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap Markets tab, element absent or blocked");
        }
    }

    public void tapAccounts(){
        try{
            MyLogger.log.info("Tapping on the Accounts tab");
            uiObject.accounts().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap Accounts tab, element absent or blocked");
        }
    }

    public void tapSettingsButon(){
        try{
            MyLogger.log.info("Tapping on the Settings button");
            uiObject.settingsButton().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap Settings button, element absent or blocked");
        }
    }

    public void tapLoginButton(){
        try{
            MyLogger.log.info("Tapping on the Login button");
            uiObject.loginButton().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap Login button, element absent or blocked");
        }
    }public void tapLogInLinkText(){
        try{
            MyLogger.log.info("Tapping on the LOG IN link text");
            uiObject.logInLinkText().tap();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't tap LOG IN link text, element absent or blocked");
        }
    }

    public String getLogInLinkText(){
        try{
            MyLogger.log.info("Getting LOG IN link text");
            return uiObject.logInLinkText().getText();
        }catch (NoSuchElementException e){
            throw new AssertionError("Can't get LOG IN link text, element absent or blocked");
        }
    }


    @Override
    public LandingActivity waitToLoad() {
        try {
            uiObject.dashboard().waitToAppear(3);
            return Android.app.tda.landingActivity;
        }catch (AssertionError e){
            throw new AssertionError("Landing Activity failed to load/open");
        }
    }
}
