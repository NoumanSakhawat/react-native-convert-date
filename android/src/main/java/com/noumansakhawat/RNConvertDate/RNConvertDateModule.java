package com.noumansakhawat.RNConvertDate;

import android.graphics.Color;
import android.graphics.Typeface;

import com.facebook.react.bridge.Promise;
import com.google.android.material.snackbar.Snackbar;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RNConvertDateModule extends ReactContextBaseJavaModule {

    private static final String REACT_NAME = "RNConvertDate";


    public RNConvertDateModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return REACT_NAME;
    }


    @ReactMethod
    public String convertToDate(String timeStamp, String dateFormat,
                                Promise promise) {
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);

        String dateString = formatter.format(new Date(Long.parseLong(timeStamp)));

        promise.resolve(dateString);
        return dateString;
    }

}
