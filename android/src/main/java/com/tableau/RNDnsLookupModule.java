
package com.tableau;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.WritableArray;

import java.net.InetAddress;

/***
 * Class RNDnsLookup is used to get the ip addresses for a hostname.
 *
 */
public class RNDnsLookupModule extends BaseJavaModule {


    public RNDnsLookupModule(ReactApplicationContext context) {}

    @ReactMethod
    public void getIpAddresses(String hostname, Promise promise) {
        if (hostname == null || promise == null) {
            promise.reject(new Error("Arguments cannot be null"));
        }

        try {
            InetAddress[] rawAddresses = InetAddress.getAllByName(hostname);
            WritableArray addresses = Arguments.createArray();
            for (int i = 0; i < rawAddresses.length; i++) {
                addresses.pushString(rawAddresses[i].getHostAddress());
            }
            promise.resolve(addresses);
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @Override
    public String getName() {
        return "RNDnsLookup";
    }
}
