package api.apps.tdameritrade.userLicenseAgreement;

import api.android.Android;
import core.UiObject;
import core.UiSelector;

public class UserLincenseAgreementUiObjects {

    private static UiObject
            titleText,
            optionsTradingDisclosureText,
            acceptButton;

    public UiObject titleText(){
        if (titleText == null)
            titleText = new UiSelector().resourceId("android:id/title").makeUiObject();
            return titleText;
    }
    public UiObject optionsTradingDisclosureText(){
        if (optionsTradingDisclosureText == null)
            optionsTradingDisclosureText = new UiSelector().resourceId("android:id/text1").makeUiObject();
        return optionsTradingDisclosureText;
    }
    public UiObject acceptButton(){
        if (acceptButton == null)
            acceptButton = new UiSelector().resourceId(Android.app.tda.packageID()+":id/button_accept").makeUiObject();
        return acceptButton;
    }




}
