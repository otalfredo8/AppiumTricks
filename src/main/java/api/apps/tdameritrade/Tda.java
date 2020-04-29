package api.apps.tdameritrade;

import api.android.Android;
import api.apps.tdameritrade.landing.LandingActivity;
import api.apps.tdameritrade.secureLogIn.SecureLogInActivity;
import api.apps.tdameritrade.userLicenseAgreement.UserLicenseAgreementActivity;
import api.interfaces.Application;

public class Tda implements Application {

    public LandingActivity landingActivity = new LandingActivity();
    public UserLicenseAgreementActivity userLicenseAgreementActivity = new UserLicenseAgreementActivity();
    public SecureLogInActivity secureLogInActivity = new SecureLogInActivity();

    @Override
    public void forceStop() {
        Android.adb.forceStopApp(packageID());
    }

    @Override
    public void clearData() {
        Android.adb.clearAppsData(packageID());
    }

    @Override
    public Object open() {
        Android.adb.openAppsActivity(packageID(), activityID());
        return null;
    }

    @Override
    public String packageID() {
        return "com.tdameritrade.mobile3";
    }

    @Override
    public String activityID() {
        return "com.tdameritrade.mobile3.activities.HomeActivity";
    }
}
