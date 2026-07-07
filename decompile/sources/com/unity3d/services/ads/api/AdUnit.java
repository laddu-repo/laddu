package com.unity3d.services.ads.api;

import android.content.Intent;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.WindowInsets;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.ads.adunit.AdUnitError;
import com.unity3d.services.ads.adunit.AdUnitMotionEvent;
import com.unity3d.services.ads.adunit.AdUnitSoftwareActivity;
import com.unity3d.services.ads.adunit.AdUnitTransparentActivity;
import com.unity3d.services.ads.adunit.AdUnitTransparentSoftwareActivity;
import com.unity3d.services.ads.adunit.IAdUnitActivity;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class AdUnit {
    private static IAdUnitActivity _adUnitActivity = null;
    private static int _currentActivityId = -1;

    private AdUnit() {
    }

    @WebViewExposed
    public static void clearMotionEventCapture(WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                getAdUnitActivity().getLayout().clearCapture();
                webViewCallback.invoke(new Object[0]);
                return;
            } else {
                webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
                return;
            }
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void close(WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            getAdUnitActivity().finish();
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void endMotionEventCapture(WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                getAdUnitActivity().getLayout().endCapture();
                webViewCallback.invoke(new Object[0]);
                return;
            } else {
                webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
                return;
            }
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    public static IAdUnitActivity getAdUnitActivity() {
        return _adUnitActivity;
    }

    public static int getCurrentAdUnitActivityId() {
        return _currentActivityId;
    }

    @WebViewExposed
    public static void getCurrentMotionEventCount(WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                webViewCallback.invoke(Integer.valueOf(getAdUnitActivity().getLayout().getCurrentEventCount()));
                return;
            } else {
                webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
                return;
            }
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    private static ArrayList<Integer> getKeyEventList(JSONArray jSONArray) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i6 = 0;
        while (true) {
            Integer valueOf = Integer.valueOf(i6);
            if (valueOf.intValue() < jSONArray.length()) {
                arrayList.add(Integer.valueOf(jSONArray.getInt(valueOf.intValue())));
                i6 = valueOf.intValue() + 1;
            } else {
                return arrayList;
            }
        }
    }

    @WebViewExposed
    public static void getMotionEventCount(JSONArray jSONArray, WebViewCallback webViewCallback) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            try {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i6)));
            } catch (Exception e10) {
                DeviceLog.exception("Error retrieving int from eventTypes", e10);
            }
        }
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                if (getAdUnitActivity().getLayout().getCurrentEventCount() >= getAdUnitActivity().getLayout().getMaxEventCount()) {
                    webViewCallback.error(AdUnitError.MAX_MOTION_EVENT_COUNT_REACHED, new Object[0]);
                    return;
                }
                SparseIntArray eventCount = getAdUnitActivity().getLayout().getEventCount(arrayList);
                JSONObject jSONObject = new JSONObject();
                for (int i10 = 0; i10 < eventCount.size(); i10++) {
                    int keyAt = eventCount.keyAt(i10);
                    try {
                        jSONObject.put(Integer.toString(keyAt), eventCount.get(keyAt));
                    } catch (Exception e11) {
                        DeviceLog.exception("Error building response JSON", e11);
                    }
                }
                webViewCallback.invoke(jSONObject);
                return;
            }
            webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
            return;
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getMotionEventData(JSONObject jSONObject, WebViewCallback webViewCallback) {
        JSONArray jSONArray;
        Iterator<String> keys = jSONObject.keys();
        SparseArray<ArrayList<Integer>> sparseArray = new SparseArray<>();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            String next = keys.next();
            int parseInt = Integer.parseInt(next);
            if (sparseArray.get(parseInt) == null) {
                sparseArray.put(parseInt, new ArrayList<>());
            }
            try {
                jSONArray = jSONObject.getJSONArray(next);
            } catch (Exception e10) {
                DeviceLog.exception("Couldn't fetch keyIndices", e10);
                jSONArray = null;
            }
            if (jSONArray != null) {
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    try {
                        sparseArray.get(parseInt).add(Integer.valueOf(jSONArray.getInt(i6)));
                    } catch (Exception e11) {
                        DeviceLog.exception("Couldn't add value to requested infos", e11);
                    }
                }
            }
        }
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                if (getAdUnitActivity().getLayout().getCurrentEventCount() >= getAdUnitActivity().getLayout().getMaxEventCount()) {
                    webViewCallback.error(AdUnitError.MAX_MOTION_EVENT_COUNT_REACHED, new Object[0]);
                    return;
                }
                SparseArray<SparseArray<AdUnitMotionEvent>> events = getAdUnitActivity().getLayout().getEvents(sparseArray);
                JSONObject jSONObject2 = new JSONObject();
                for (int i10 = 0; i10 < events.size(); i10++) {
                    int keyAt = events.keyAt(i10);
                    SparseArray<AdUnitMotionEvent> sparseArray2 = events.get(keyAt);
                    JSONObject jSONObject3 = new JSONObject();
                    for (int i11 = 0; i11 < sparseArray2.size(); i11++) {
                        JSONObject jSONObject4 = new JSONObject();
                        int keyAt2 = sparseArray2.keyAt(i11);
                        AdUnitMotionEvent adUnitMotionEvent = sparseArray2.get(keyAt2);
                        try {
                            jSONObject4.put(HandleInvocationsFromAdViewer.KEY_ACTION, adUnitMotionEvent.getAction());
                            jSONObject4.put("isObscured", adUnitMotionEvent.isObscured());
                            jSONObject4.put("toolType", adUnitMotionEvent.getToolType());
                            jSONObject4.put("source", adUnitMotionEvent.getSource());
                            jSONObject4.put("deviceId", adUnitMotionEvent.getDeviceId());
                            jSONObject4.put("x", adUnitMotionEvent.getX());
                            jSONObject4.put("y", adUnitMotionEvent.getY());
                            jSONObject4.put("eventTime", adUnitMotionEvent.getEventTime());
                            jSONObject4.put("pressure", adUnitMotionEvent.getPressure());
                            jSONObject4.put("size", adUnitMotionEvent.getSize());
                            jSONObject3.put(Integer.toString(keyAt2), jSONObject4);
                        } catch (Exception e12) {
                            DeviceLog.debug("Couldn't construct event info", e12);
                        }
                    }
                    try {
                        jSONObject2.put(Integer.toString(keyAt), jSONObject3);
                    } catch (Exception e13) {
                        DeviceLog.debug("Couldn't construct info object", e13);
                    }
                }
                webViewCallback.invoke(jSONObject2);
                return;
            }
            webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
            return;
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getOrientation(WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(Integer.valueOf(getAdUnitActivity().getRequestedOrientation()));
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getSafeAreaInsets(WebViewCallback webViewCallback) {
        WindowInsets rootWindowInsets;
        if (getAdUnitActivity() != null && getAdUnitActivity().getLayout() != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                rootWindowInsets = getAdUnitActivity().getLayout().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        Object invoke = rootWindowInsets.getClass().getMethod("getDisplayCutout", null).invoke(rootWindowInsets, null);
                        if (invoke != null) {
                            Object invoke2 = invoke.getClass().getMethod("getSafeInsetTop", null).invoke(invoke, null);
                            Object invoke3 = invoke.getClass().getMethod("getSafeInsetRight", null).invoke(invoke, null);
                            Object invoke4 = invoke.getClass().getMethod("getSafeInsetBottom", null).invoke(invoke, null);
                            Object invoke5 = invoke.getClass().getMethod("getSafeInsetLeft", null).invoke(invoke, null);
                            jSONObject.put("top", invoke2);
                            jSONObject.put("right", invoke3);
                            jSONObject.put("bottom", invoke4);
                            jSONObject.put("left", invoke5);
                            webViewCallback.invoke(jSONObject);
                        } else {
                            webViewCallback.error(AdUnitError.NO_DISPLAY_CUTOUT_AVAILABLE, new Object[0]);
                        }
                        return;
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        webViewCallback.error(AdUnitError.DISPLAY_CUTOUT_INVOKE_FAILED, new Object[0]);
                        DeviceLog.debug("Error while calling displayCutout getter", e);
                        return;
                    } catch (NoSuchMethodException e11) {
                        webViewCallback.error(AdUnitError.DISPLAY_CUTOUT_METHOD_NOT_AVAILABLE, new Object[0]);
                        DeviceLog.debug("Method getDisplayCutout not found", e11);
                        return;
                    } catch (InvocationTargetException e12) {
                        e = e12;
                        webViewCallback.error(AdUnitError.DISPLAY_CUTOUT_INVOKE_FAILED, new Object[0]);
                        DeviceLog.debug("Error while calling displayCutout getter", e);
                        return;
                    } catch (JSONException e13) {
                        webViewCallback.error(AdUnitError.DISPLAY_CUTOUT_JSON_ERROR, new Object[0]);
                        DeviceLog.debug("JSON error while constructing display cutout object", e13);
                        return;
                    }
                }
                webViewCallback.error(AdUnitError.NO_DISPLAY_CUTOUT_AVAILABLE, new Object[0]);
                return;
            }
            webViewCallback.error(AdUnitError.API_LEVEL_ERROR, new Object[0]);
            return;
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getViewFrame(String str, WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getViewFrame(str) != null) {
                Map<String, Integer> viewFrame = getAdUnitActivity().getViewFrame(str);
                webViewCallback.invoke(viewFrame.get("x"), viewFrame.get("y"), viewFrame.get("width"), viewFrame.get("height"));
                return;
            } else {
                webViewCallback.error(AdUnitError.UNKNOWN_VIEW, new Object[0]);
                return;
            }
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] getViewList(JSONArray jSONArray) {
        String[] strArr = new String[jSONArray.length()];
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            strArr[i6] = jSONArray.getString(i6);
        }
        return strArr;
    }

    @WebViewExposed
    public static void getViews(WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(new JSONArray((Collection) Arrays.asList(getAdUnitActivity().getViews())));
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, WebViewCallback webViewCallback) {
        open(num, jSONArray, num2, null, webViewCallback);
    }

    public static void setAdUnitActivity(IAdUnitActivity iAdUnitActivity) {
        _adUnitActivity = iAdUnitActivity;
    }

    public static void setCurrentAdUnitActivityId(int i6) {
        _currentActivityId = i6;
    }

    @WebViewExposed
    public static void setKeepScreenOn(final Boolean bool, WebViewCallback webViewCallback) {
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.3
            @Override // java.lang.Runnable
            public void run() {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setKeepScreenOn(bool.booleanValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setKeyEventList(JSONArray jSONArray, WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            try {
                getAdUnitActivity().setKeyEventList(getKeyEventList(jSONArray));
                webViewCallback.invoke(jSONArray);
                return;
            } catch (Exception e10) {
                DeviceLog.exception("Error parsing views from viewList", e10);
                webViewCallback.error(AdUnitError.CORRUPTED_KEYEVENTLIST, jSONArray, e10.getMessage());
                return;
            }
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setLayoutInDisplayCutoutMode(final Integer num, WebViewCallback webViewCallback) {
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.6
            @Override // java.lang.Runnable
            public void run() {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setLayoutInDisplayCutoutMode(num.intValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(num);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setOrientation(final Integer num, WebViewCallback webViewCallback) {
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.2
            @Override // java.lang.Runnable
            public void run() {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setOrientation(num.intValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(num);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setSystemUiVisibility(final Integer num, WebViewCallback webViewCallback) {
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.4
            @Override // java.lang.Runnable
            public void run() {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setSystemUiVisibility(num.intValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(num);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setViewFrame(final String str, final Integer num, final Integer num2, final Integer num3, final Integer num4, WebViewCallback webViewCallback) {
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.5
            @Override // java.lang.Runnable
            public void run() {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().setViewFrame(str, num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                }
            }
        });
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setViews(final JSONArray jSONArray, WebViewCallback webViewCallback) {
        try {
            getViewList(jSONArray);
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.api.AdUnit.1
                @Override // java.lang.Runnable
                public void run() {
                    if (AdUnit.getAdUnitActivity() != null) {
                        try {
                            AdUnit.getAdUnitActivity().setViews(AdUnit.getViewList(jSONArray));
                        } catch (Exception e10) {
                            DeviceLog.exception("Corrupted viewlist", e10);
                        }
                    }
                }
            });
        } catch (JSONException unused) {
            webViewCallback.error(AdUnitError.CORRUPTED_VIEWLIST, jSONArray);
        }
        if (getAdUnitActivity() != null) {
            webViewCallback.invoke(jSONArray);
        } else {
            webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void startMotionEventCapture(Integer num, WebViewCallback webViewCallback) {
        if (getAdUnitActivity() != null) {
            if (getAdUnitActivity().getLayout() != null) {
                getAdUnitActivity().getLayout().startCapture(num.intValue());
                webViewCallback.invoke(new Object[0]);
                return;
            } else {
                webViewCallback.error(AdUnitError.LAYOUT_NULL, new Object[0]);
                return;
            }
        }
        webViewCallback.error(AdUnitError.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, WebViewCallback webViewCallback) {
        open(num, jSONArray, num2, jSONArray2, 0, Boolean.TRUE, webViewCallback);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, WebViewCallback webViewCallback) {
        open(num, jSONArray, num2, jSONArray2, num3, bool, Boolean.FALSE, webViewCallback);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, Boolean bool2, WebViewCallback webViewCallback) {
        open(num, jSONArray, num2, jSONArray2, num3, bool, bool2, 0, webViewCallback);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, Boolean bool2, Integer num4, WebViewCallback webViewCallback) {
        Intent intent;
        if (!bool.booleanValue() && bool2.booleanValue()) {
            DeviceLog.debug("Unity Ads opening new transparent ad unit activity, hardware acceleration disabled");
            intent = new Intent(ClientProperties.getActivity(), (Class<?>) AdUnitTransparentSoftwareActivity.class);
        } else if (bool.booleanValue() && !bool2.booleanValue()) {
            DeviceLog.debug("Unity Ads opening new hardware accelerated ad unit activity");
            intent = new Intent(ClientProperties.getActivity(), (Class<?>) AdUnitActivity.class);
        } else if (bool.booleanValue() && bool2.booleanValue()) {
            DeviceLog.debug("Unity Ads opening new hardware accelerated transparent ad unit activity");
            intent = new Intent(ClientProperties.getActivity(), (Class<?>) AdUnitTransparentActivity.class);
        } else {
            DeviceLog.debug("Unity Ads opening new ad unit activity, hardware acceleration disabled");
            intent = new Intent(ClientProperties.getActivity(), (Class<?>) AdUnitSoftwareActivity.class);
        }
        intent.addFlags(268500992);
        if (num != null) {
            try {
                intent.putExtra(AdUnitActivity.EXTRA_ACTIVITY_ID, num.intValue());
                setCurrentAdUnitActivityId(num.intValue());
                try {
                    intent.putExtra(AdUnitActivity.EXTRA_VIEWS, getViewList(jSONArray));
                    if (jSONArray2 != null) {
                        try {
                            intent.putExtra(AdUnitActivity.EXTRA_KEY_EVENT_LIST, getKeyEventList(jSONArray2));
                        } catch (Exception e10) {
                            DeviceLog.exception("Error parsing views from viewList", e10);
                            webViewCallback.error(AdUnitError.CORRUPTED_KEYEVENTLIST, jSONArray2, e10.getMessage());
                            return;
                        }
                    }
                    intent.putExtra(AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY, num3);
                    intent.putExtra(AdUnitActivity.EXTRA_ORIENTATION, num2);
                    intent.putExtra(AdUnitActivity.EXTRA_DISPLAY_CUTOUT_MODE, num4);
                    ClientProperties.getActivity().startActivity(intent);
                    DeviceLog.debug("Opened AdUnitActivity with: " + jSONArray.toString());
                    webViewCallback.invoke(new Object[0]);
                    return;
                } catch (Exception e11) {
                    DeviceLog.exception("Error parsing views from viewList", e11);
                    webViewCallback.error(AdUnitError.CORRUPTED_VIEWLIST, jSONArray, e11.getMessage());
                    return;
                }
            } catch (Exception e12) {
                DeviceLog.exception("Could not set activityId for intent", e12);
                webViewCallback.error(AdUnitError.ACTIVITY_ID, num, e12.getMessage());
                return;
            }
        }
        DeviceLog.error("Activity ID is NULL");
        webViewCallback.error(AdUnitError.ACTIVITY_ID, "Activity ID NULL");
    }
}
