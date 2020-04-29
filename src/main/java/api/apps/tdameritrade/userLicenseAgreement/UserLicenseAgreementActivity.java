package api.apps.tdameritrade.userLicenseAgreement;

import api.android.Android;
import api.apps.tdameritrade.landing.LandingActivity;
import core.MyLogger;

import java.util.NoSuchElementException;

public class UserLicenseAgreementActivity {

    public UserLincenseAgreementUiObjects uiObject = new UserLincenseAgreementUiObjects();

    public String getTitle() {
        try {
            MyLogger.log.info("Getting the Navigation Bar's Title");
            return uiObject.titleText().getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can get Navigation Bar's Title, element absent of blocked");
        }
    }

    public String optionsTradingDisclosureText() {
        try {
            MyLogger.log.info("Getting the Options Trading Disclosure Text");
            return uiObject.optionsTradingDisclosureText().getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can get Options Trading Disclosure Text, element absent of blocked");
        }
    }

    public String acceptButton() {
        try {
            MyLogger.log.info("Getting the Options Accept Button Text");
            return uiObject.acceptButton().getText();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can get Options Accept Button Text, element absent of blocked");
        }
    }

    public LandingActivity tapAcceptButton() {
        try {
            MyLogger.log.info("Tapping on the AcceptButton");
            uiObject.acceptButton().tap();
            return Android.app.tda.landingActivity;
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can tap Accept Button, element absent or blocked");
        }
    }
}
