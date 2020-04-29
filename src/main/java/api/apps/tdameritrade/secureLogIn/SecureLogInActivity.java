package api.apps.tdameritrade.secureLogIn;

import api.android.Android;
import api.apps.tdameritrade.landing.LandingActivity;
import api.interfaces.Activity;
import core.MyLogger;

import java.util.NoSuchElementException;

public class SecureLogInActivity implements Activity {

    public SecureLogInUiObjects uiObject = new SecureLogInUiObjects();

    //Rather than only tapping, it will also
    public LandingActivity tapActionBarBack(){
        try{
            MyLogger.log.info("Tapping on the Action Bar Back");
            uiObject.actionBarBack().tap();
            Android.app.tda.landingActivity.uiObject.dashboard().waitToAppear(3);
            return Android.app.tda.landingActivity;
        }catch (NoSuchElementException e){
            throw new AssertionError("Cant tap Action Bar Back, element absent or blocked");
        }catch (AssertionError e){
            throw new AssertionError("Action Bar Back fail to complete in 3 seconds");
        }
    }

    //Raplace Object for SecurityLogInActivity for Compiler to see this method rather than Object
    @Override
    public SecureLogInActivity waitToLoad() {
        try {
            MyLogger.log.info("Waiting for Secure Log-in Activity");
            uiObject.actionBarBack().waitToAppear(3);
            return Android.app.tda.secureLogInActivity;
        }catch (AssertionError e){
            throw new AssertionError("Secure Log-in Activity failed to load/open");
        }
    }
}
