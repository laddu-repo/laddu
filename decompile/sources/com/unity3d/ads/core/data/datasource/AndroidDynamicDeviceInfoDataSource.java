package com.unity3d.ads.core.data.datasource;

import a8.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.unity3d.ads.core.utils.GetMemoryValueFromStringKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DynamicDeviceInfoKt;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import ie.s;
import ie.w;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import jf.a;
import kf.c;
import kf.f1;
import kf.h;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import le.i;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidDynamicDeviceInfoDataSource implements DynamicDeviceInfoDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String DIRECTORY_MEM_INFO = "/proc/meminfo";
    public static final String DIRECTORY_MODE_READ = "r";
    public static final String DIRECTORY_PROCESS_INFO = "/proc/self/stat";
    public static final String INTENT_USB_STATE = "android.hardware.usb.action.USB_STATE";
    public static final String KEY_STAT_CONTENT = "stat";
    public static final String USB_EXTRA_CONNECTED = "connected";
    private final Context context;
    private final LifecycleDataSource lifecycleDataSource;
    private final r0 reportedWarning;
    private final h volumeSettingsChange;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DynamicDeviceInfoOuterClass.ConnectionType.values().length];
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidDynamicDeviceInfoDataSource(Context context, LifecycleDataSource lifecycleDataSource) {
        k.e(context, "context");
        k.e(lifecycleDataSource, "lifecycleDataSource");
        this.context = context;
        this.lifecycleDataSource = lifecycleDataSource;
        this.reportedWarning = y0.c(s.f6847x);
        this.volumeSettingsChange = new c(new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this, null), i.f8353x, -2, a.f7436x);
    }

    private final boolean adbStatus() {
        Boolean bool;
        try {
            boolean z10 = true;
            if (1 != Settings.Global.getInt(this.context.getContentResolver(), "adb_enabled", 0)) {
                z10 = false;
            }
            bool = Boolean.valueOf(z10);
        } catch (Exception e10) {
            DeviceLog.exception("Problems fetching adb enabled status", e10);
            bool = null;
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android fetchAndroidDynamicDeviceInfo() {
        DynamicDeviceInfoKt dynamicDeviceInfoKt = DynamicDeviceInfoKt.INSTANCE;
        DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = DynamicDeviceInfoKt.AndroidKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.newBuilder();
        k.d(newBuilder, "newBuilder()");
        DynamicDeviceInfoKt.AndroidKt.Dsl _create = companion._create(newBuilder);
        _create.setNetworkConnected(isActiveNetworkConnected());
        _create.setNetworkType(getNetworkType());
        _create.setNetworkMetered(getNetworkMetered());
        _create.setTelephonyManagerNetworkType(getNetworkType());
        _create.setAdbEnabled(isAdbEnabled());
        _create.setUsbConnected(isUSBConnected());
        _create.setVolume(getStreamVolume(3));
        _create.setMaxVolume(getStreamMaxVolume(3));
        _create.setDeviceElapsedRealtime(getElapsedRealtime());
        _create.setDeviceUpTime(getUptime());
        _create.setAirplaneMode(getAirplaneMode());
        _create.setChargingType(getChargingType());
        _create.setStayOnWhilePluggedIn(getStayOnWhilePluggedIn());
        _create.setSdCardPresent(getIsSdCardPresent());
        _create.setNetworkCapabilityTransports(getNetworkCapabilityTransports());
        return _create._build();
    }

    private final boolean getAirplaneMode() {
        try {
            if (Settings.Global.getInt(this.context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            DeviceLog.error("Problems fetching airplane mode status", th.getMessage());
            return false;
        }
    }

    private final AudioManager getAudioManager() {
        Object systemService = this.context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (systemService instanceof AudioManager) {
            return (AudioManager) systemService;
        }
        return null;
    }

    private final double getBatteryLevel() {
        if (this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")) != null) {
            return r0.getIntExtra("level", 0) / r0.getIntExtra("scale", 0);
        }
        return -1.0d;
    }

    private final int getBatteryStatus() {
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("status", 0);
        }
        return -1;
    }

    private final DynamicDeviceInfoOuterClass.ConnectionType getConnectionType() {
        if (isUsingWifi()) {
            return DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_WIFI;
        }
        if (isActiveNetworkConnected()) {
            return DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_CELLULAR;
        }
        return DynamicDeviceInfoOuterClass.ConnectionType.CONNECTION_TYPE_UNSPECIFIED;
    }

    private final ConnectivityManager getConnectivityManager() {
        Object systemService = this.context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    private final long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    private final long getEventTimeStamp() {
        return System.currentTimeMillis() / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
    }

    private final long getFreeSpace(File file) {
        if (file != null && file.exists()) {
            return b.l((float) (file.getFreeSpace() / 1024));
        }
        return -1L;
    }

    private final String getLanguage() {
        String locale = Locale.getDefault().toString();
        k.d(locale, "getDefault().toString()");
        return locale;
    }

    private final long getMemoryInfo(Device.MemoryInfoType memoryInfoType) {
        int i6 = WhenMappings.$EnumSwitchMapping$0[memoryInfoType.ordinal()];
        int i10 = 1;
        if (i6 != 1) {
            i10 = 2;
            if (i6 != 2) {
                i10 = -1;
            }
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(DIRECTORY_MEM_INFO, DIRECTORY_MODE_READ);
        String str = null;
        for (int i11 = 0; i11 < i10; i11++) {
            try {
                str = randomAccessFile.readLine();
            } finally {
            }
        }
        randomAccessFile.close();
        return GetMemoryValueFromStringKt.getMemoryValueFromString(str);
    }

    private final boolean getNetworkMetered() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null || !connectivityManager.isActiveNetworkMetered()) {
            return false;
        }
        return true;
    }

    private final String getNetworkOperator() {
        String str;
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkOperator();
        } else {
            str = null;
        }
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    private final String getNetworkOperatorName() {
        String str;
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkOperatorName();
        } else {
            str = null;
        }
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    @SuppressLint({"MissingPermission"})
    private final int getNetworkType() {
        f1 f1Var;
        Object value;
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager != null) {
            try {
                return telephonyManager.getNetworkType();
            } catch (SecurityException unused) {
                if (!k.a(((Map) ((f1) this.reportedWarning).getValue()).get("getNetworkType"), Boolean.TRUE)) {
                    r0 r0Var = this.reportedWarning;
                    do {
                        f1Var = (f1) r0Var;
                        value = f1Var.getValue();
                    } while (!f1Var.f(value, w.A((Map) value, new he.i("getNetworkType", Boolean.TRUE))));
                    DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
                }
            }
        }
        return -1;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return displayMetrics.heightPixels;
        }
        return -1;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getStreamVolume(int i6) {
        int i10;
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            i10 = audioManager.getStreamVolume(i6);
        } else {
            i10 = -2;
        }
        return i10;
    }

    private final TelephonyManager getTelephonyManager() {
        Object systemService = this.context.getSystemService("phone");
        if (systemService instanceof TelephonyManager) {
            return (TelephonyManager) systemService;
        }
        return null;
    }

    private final String getTimeZone() {
        try {
            String displayName = TimeZone.getDefault().getDisplayName(false, 0, Locale.US);
            k.d(displayName, "{\n            TimeZone.g…ORT, Locale.US)\n        }");
            return displayName;
        } catch (AssertionError e10) {
            DeviceLog.error("Could not read timeZone information: %s", e10.getMessage());
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    private final long getTimeZoneOffset() {
        return TimeZone.getDefault().getOffset(System.currentTimeMillis()) / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
    }

    private final long getUptime() {
        return SystemClock.uptimeMillis();
    }

    private final long getUsableSpace(File file) {
        if (file != null && file.exists()) {
            return b.l((float) (file.getUsableSpace() / 1024));
        }
        return -1L;
    }

    private final boolean hasInternetConnection() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    private final boolean hasInternetConnectionM() {
        Network activeNetwork;
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager != null) {
            activeNetwork = connectivityManager.getActiveNetwork();
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final boolean isActiveNetworkConnected() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    private final boolean isAdbEnabled() {
        return adbStatus();
    }

    private final boolean isAppActive() {
        return this.lifecycleDataSource.appIsForeground();
    }

    private final boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    private final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    private final boolean isUSBConnected() {
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter(INTENT_USB_STATE));
        if (registerReceiver == null) {
            return false;
        }
        return registerReceiver.getBooleanExtra(USB_EXTRA_CONNECTED, false);
    }

    private final boolean isUsingWifi() {
        ConnectivityManager connectivityManager = getConnectivityManager();
        if (connectivityManager == null) {
            return false;
        }
        TelephonyManager telephonyManager = getTelephonyManager();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !connectivityManager.getBackgroundDataSetting() || !activeNetworkInfo.isConnected() || telephonyManager == null || activeNetworkInfo.getType() != 1 || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    private final boolean isWiredHeadsetOn() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null || !audioManager.isWiredHeadsetOn()) {
            return false;
        }
        return true;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch() {
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        k.d(newBuilder, "newBuilder()");
        DynamicDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        _create.setLanguage(getLanguage());
        _create.setNetworkOperator(getNetworkOperator());
        _create.setNetworkOperatorName(getNetworkOperatorName());
        _create.setFreeDiskSpace(getUsableSpace(this.context.getExternalFilesDir(null)));
        _create.setFreeRamMemory(getFreeMemory());
        _create.setWiredHeadset(isWiredHeadsetOn());
        _create.setTimeZone(getTimeZone());
        _create.setTimeZoneOffset(getTimeZoneOffset());
        _create.setLimitedTracking(isLimitAdTrackingEnabled());
        _create.setLimitedOpenAdTracking(isLimitOpenAdTrackingEnabled());
        _create.setBatteryLevel(getBatteryLevel());
        _create.setBatteryStatus(getBatteryStatus());
        _create.setConnectionType(getConnectionType());
        _create.setAndroid(fetchAndroidDynamicDeviceInfo());
        _create.setAppActive(isAppActive());
        _create.setScreenWidth(getScreenWidth());
        _create.setScreenHeight(getScreenHeight());
        return _create._build();
    }

    public final int getChargingType() {
        Intent registerReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return -1;
        }
        return registerReceiver.getIntExtra("plugged", -1);
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public String getConnectionTypeStr() {
        int i6 = WhenMappings.$EnumSwitchMapping$1[getConnectionType().ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                return "none";
            }
            return "cellular";
        }
        return "wifi";
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getCurrentUiTheme() {
        return this.context.getResources().getConfiguration().uiMode;
    }

    public final long getFreeMemory() {
        return getMemoryInfo(Device.MemoryInfoType.FREE_MEMORY);
    }

    public final boolean getIsSdCardPresent() {
        return k.a(Environment.getExternalStorageState(), "mounted");
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public List<String> getLocaleList() {
        LocaleList locales;
        int size;
        Locale locale;
        int i6 = 0;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = this.context.getResources().getConfiguration().getLocales();
            k.d(locales, "context.resources.configuration.locales");
            size = locales.size();
            ArrayList arrayList = new ArrayList(size);
            while (i6 < size) {
                locale = locales.get(i6);
                String locale2 = locale.toString();
                k.d(locale2, "locales[it].toString()");
                arrayList.add(locale2);
                i6++;
            }
            return arrayList;
        }
        Locale[] availableLocales = Locale.getAvailableLocales();
        k.d(availableLocales, "getAvailableLocales()");
        ArrayList arrayList2 = new ArrayList(availableLocales.length);
        int length = availableLocales.length;
        while (i6 < length) {
            arrayList2.add(availableLocales[i6].toString());
            i6++;
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r2 = r1.getActiveNetwork();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransports() {
        /*
            r5 = this;
            gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports$Builder r0 = gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports.newBuilder()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            java.lang.String r3 = "result.build()"
            if (r1 >= r2) goto L16
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            kotlin.jvm.internal.k.d(r0, r3)
            gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports r0 = (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) r0
            return r0
        L16:
            android.content.Context r1 = r5.context
            java.lang.String r2 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r2)
            boolean r2 = r1 instanceof android.net.ConnectivityManager
            if (r2 == 0) goto L25
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            goto L26
        L25:
            r1 = 0
        L26:
            if (r1 == 0) goto L86
            android.net.Network r2 = android.support.v4.media.c.q(r1)
            if (r2 != 0) goto L2f
            goto L86
        L2f:
            android.net.NetworkCapabilities r1 = r1.getNetworkCapabilities(r2)
            if (r1 != 0) goto L3f
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            kotlin.jvm.internal.k.d(r0, r3)
            gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports r0 = (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) r0
            return r0
        L3f:
            r2 = 1
            boolean r2 = r1.hasTransport(r2)
            java.lang.String r4 = "result"
            kotlin.jvm.internal.k.d(r0, r4)
            r0.setWifi(r2)
            r2 = 0
            boolean r2 = r1.hasTransport(r2)
            r0.setCellular(r2)
            r2 = 4
            boolean r2 = r1.hasTransport(r2)
            r0.setVpn(r2)
            r2 = 3
            boolean r2 = r1.hasTransport(r2)
            r0.setEthernet(r2)
            r2 = 5
            boolean r2 = r1.hasTransport(r2)
            r0.setWifiAware(r2)
            r2 = 6
            boolean r2 = r1.hasTransport(r2)
            r0.setLowpan(r2)
            r2 = 2
            boolean r1 = r1.hasTransport(r2)
            r0.setBluetooth(r1)
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            kotlin.jvm.internal.k.d(r0, r3)
            gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports r0 = (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) r0
            return r0
        L86:
            com.google.protobuf.GeneratedMessageLite r0 = r0.build()
            kotlin.jvm.internal.k.d(r0, r3)
            gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports r0 = (gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.getNetworkCapabilityTransports():gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass$NetworkCapabilityTransports");
    }

    public final String getNetworkCountryISO() {
        String str;
        TelephonyManager telephonyManager = getTelephonyManager();
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkCountryIso();
        } else {
            str = null;
        }
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public String getOrientation() {
        if (getScreenHeight() > getScreenWidth()) {
            return "portrait";
        }
        return "landscape";
    }

    public final Map<String, String> getProcessInfo() {
        HashMap hashMap = new HashMap();
        RandomAccessFile randomAccessFile = new RandomAccessFile(DIRECTORY_PROCESS_INFO, DIRECTORY_MODE_READ);
        try {
            String statContent = randomAccessFile.readLine();
            k.d(statContent, "statContent");
            hashMap.put(KEY_STAT_CONTENT, statContent);
            randomAccessFile.close();
            return hashMap;
        } finally {
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public int getRingerMode() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            return audioManager.getRingerMode();
        }
        return -2;
    }

    public final int getScreenBrightness() {
        return Settings.System.getInt(this.context.getContentResolver(), "screen_brightness", -1);
    }

    public final boolean getStayOnWhilePluggedIn() {
        try {
            if (Settings.Global.getInt(this.context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            DeviceLog.error("Problems fetching stay on while plugged in status", th.getMessage());
            return false;
        }
    }

    public final double getStreamMaxVolume(int i6) {
        int i10;
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            i10 = audioManager.getStreamMaxVolume(i6);
        } else {
            i10 = -2;
        }
        return i10;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public h getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    @Override // com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource
    public boolean hasInternet() {
        if (Build.VERSION.SDK_INT >= 23) {
            return hasInternetConnectionM();
        }
        return hasInternetConnection();
    }
}
