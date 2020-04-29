package api.interfaces;

/**
 * Created by Artur on 5/25/2016.
 */
public interface Application {

    //Actions to do with the app
    void forceStop();
    void clearData();
    Object open();
    String packageID();
    String activityID();
}
