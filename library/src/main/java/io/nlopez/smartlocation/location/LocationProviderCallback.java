package io.nlopez.smartlocation.location;

/**
 * Created by mrm on 20/12/14.
 */
public interface LocationProviderCallback {
    public void onProviderReady();
    public void onProviderError();
}
