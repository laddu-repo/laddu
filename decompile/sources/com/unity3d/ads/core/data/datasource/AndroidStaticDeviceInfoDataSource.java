package com.unity3d.ads.core.data.datasource;

import a8.b;
import a8.g;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import cf.n;
import com.unity3d.ads.core.data.model.StorageType;
import com.unity3d.ads.core.utils.GetMemoryValueFromStringKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.MimeTypes;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.unity3d.services.core.properties.SdkProperties;
import df.a;
import df.m;
import df.u;
import gatewayprotocol.v1.StaticDeviceInfoKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import ie.j;
import ie.r;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import lg.c;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidStaticDeviceInfoDataSource implements StaticDeviceInfoDataSource {
    public static final String ALGORITHM_SHA1 = "SHA-1";
    public static final String APP_VERSION_FAKE = "FakeVersionName";
    public static final String BINARY_SU = "su";
    public static final String CERTIFICATE_TYPE_X509 = "X.509";
    public static final Companion Companion = new Companion(null);
    public static final String ENVIRONMENT_VARIABLE_PATH = "PATH";
    public static final String PLATFORM_ANDROID = "android";
    public static final String STORE_GOOGLE = "google";
    private final X500Principal DEBUG_CERT;
    private final AnalyticsDataSource analyticsDataSource;
    private final Context context;
    private final ByteStringDataSource glInfoStore;
    private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo;
    private final StoreDataSource storeDataSource;
    private final UnityBootConfigDataSource unityBootConfigDataSource;

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
            int[] iArr2 = new int[StorageType.values().length];
            try {
                iArr2[StorageType.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[StorageType.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public AndroidStaticDeviceInfoDataSource(Context context, ByteStringDataSource glInfoStore, AnalyticsDataSource analyticsDataSource, StoreDataSource storeDataSource, UnityBootConfigDataSource unityBootConfigDataSource) {
        k.e(context, "context");
        k.e(glInfoStore, "glInfoStore");
        k.e(analyticsDataSource, "analyticsDataSource");
        k.e(storeDataSource, "storeDataSource");
        k.e(unityBootConfigDataSource, "unityBootConfigDataSource");
        this.context = context;
        this.glInfoStore = glInfoStore;
        this.analyticsDataSource = analyticsDataSource;
        this.storeDataSource = storeDataSource;
        this.unityBootConfigDataSource = unityBootConfigDataSource;
        this.DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        k.d(newBuilder, "newBuilder()");
        StaticDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        _create.setBundleId(getAppName());
        _create.setBundleVersion(getAppVersion());
        _create.setAppDebuggable(isAppDebuggable());
        _create.setRooted(isRooted());
        _create.setOsVersion(getOsVersion());
        _create.setDeviceMake(getManufacturer());
        _create.setDeviceModel(getModel());
        _create.setWebviewUa(getWebViewUserAgent());
        _create.setScreenDensity(getScreenDensity());
        _create.setScreenWidth(getScreenWidth());
        _create.setScreenHeight(getScreenHeight());
        _create.setScreenSize(getScreenLayout());
        _create.addAllStores(_create.getStores(), getStores$default(this, null, 1, null));
        _create.setTotalDiskSpace(getTotalSpace(getFileForStorageType(StorageType.EXTERNAL)));
        _create.setTotalRamMemory(getTotalMemory());
        _create.setCpuModel(getCPUModel());
        _create.setCpuCount(getCPUCount());
        _create.setAndroid(fetchAndroidStaticDeviceInfo());
        _create.setMadeWithUnity(MadeWithUnityDetector.isMadeWithUnity());
        this.staticDeviceInfo = _create._build();
    }

    private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android fetchAndroidStaticDeviceInfo() {
        StaticDeviceInfoKt staticDeviceInfoKt = StaticDeviceInfoKt.INSTANCE;
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        k.d(newBuilder, "newBuilder()");
        StaticDeviceInfoKt.AndroidKt.Dsl _create = companion._create(newBuilder);
        _create.setApiLevel(getApiLevel());
        _create.setVersionCode(getVersionCode());
        _create.setAndroidFingerprint(getFingerprint());
        _create.setAppInstaller(getInstallerPackageName());
        _create.setApkDeveloperSigningCertificateHash(getCertificateFingerprint());
        _create.setBuildBoard(getBoard());
        _create.setBuildBrand(getBrand());
        _create.setBuildDevice(getDevice());
        _create.setBuildDisplay(getDisplay());
        _create.setBuildFingerprint(getFingerprint());
        _create.setBuildHardware(getHardware());
        _create.setBuildHost(getHost());
        _create.setBuildBootloader(getBootloader());
        _create.setBuildProduct(getProduct());
        _create.setExtensionVersion(getExtensionVersion());
        String buildId = getBuildId();
        if (buildId != null) {
            _create.setBuildId(buildId);
        }
        _create.setPhoneType(getPhoneType());
        _create.setSimOperator(getSimOperator());
        return _create._build();
    }

    private final int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    private final long getAppStartTime() {
        return SdkProperties.getInitializationTimeEpoch();
    }

    private final String getAppVersion() {
        String str;
        String packageName = this.context.getPackageName();
        PackageManager packageManager = this.context.getPackageManager();
        try {
            if (packageManager.getPackageInfo(packageName, 0).versionName == null) {
                str = APP_VERSION_FAKE;
            } else {
                str = packageManager.getPackageInfo(packageName, 0).versionName;
            }
            k.d(str, "{\n            if (pm.get…e\n            }\n        }");
            return str;
        } catch (PackageManager.NameNotFoundException e10) {
            DeviceLog.exception("Error getting package info", e10);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    private final long getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    private final String getCPUModel() {
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            str = Build.SOC_MODEL;
            k.d(str, "{\n            Build.SOC_MODEL\n        }");
            return str;
        }
        try {
            File file = new File("/proc/cpuinfo");
            Charset charset = a.f4115a;
            k.e(charset, "charset");
            ArrayList arrayList = new ArrayList();
            c.h(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), new n(arrayList, 16));
            return (String) j.M(arrayList);
        } catch (FileNotFoundException e10) {
            DeviceLog.exception("Error reading CPU model", e10);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final String getCertificateFingerprint() {
        boolean z10;
        try {
            Signature[] signatureArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
            if (signatureArr != null) {
                if (signatureArr.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    Certificate generateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
                    k.c(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    String hexString = Utilities.toHexString(MessageDigest.getInstance(ALGORITHM_SHA1).digest(((X509Certificate) generateCertificate).getEncoded()));
                    k.d(hexString, "toHexString(publicKey)");
                    return hexString;
                }
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } catch (Exception e10) {
            DeviceLog.exception("Exception when signing certificate fingerprint", e10);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    private final float getDisplayMetricDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return displayMetrics.density;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private final int getExtensionVersion() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT >= 30) {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            return extensionVersion;
        }
        return -1;
    }

    private final File getFileForStorageType(StorageType storageType) {
        int i6 = WhenMappings.$EnumSwitchMapping$1[storageType.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                DeviceLog.error("Unhandled storagetype: " + storageType);
                return null;
            }
            return this.context.getExternalCacheDir();
        }
        return this.context.getCacheDir();
    }

    private final String getFingerprint() {
        String str = Build.FINGERPRINT;
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getGPUModel(le.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            he.a.f(r5)
            goto L3d
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            he.a.f(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.glInfoStore
            r0.label = r2
            java.lang.Object r5 = r5.get(r0)
            me.a r0 = me.a.f8833x
            if (r5 != r0) goto L3d
            return r0
        L3d:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.nio.charset.Charset r0 = df.a.f4115a
            java.lang.String r5 = r5.toString(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.getGPUModel(le.c):java.lang.Object");
    }

    private final String getGameId() {
        String gameId = ClientProperties.getGameId();
        if (gameId == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return gameId;
    }

    private final String getInstallerPackageName() {
        String installerPackageName = this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        if (installerPackageName == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return installerPackageName;
    }

    private final long getMemoryInfo(Device.MemoryInfoType memoryInfoType) {
        int i6 = WhenMappings.$EnumSwitchMapping$0[memoryInfoType.ordinal()];
        int i10 = 1;
        if (i6 != 1) {
            i10 = 2;
            if (i6 != 2) {
                throw new RuntimeException();
            }
        }
        String str = null;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            for (int i11 = 0; i11 < i10; i11++) {
                try {
                    str = randomAccessFile.readLine();
                } finally {
                }
            }
            randomAccessFile.close();
        } catch (FileNotFoundException e10) {
            DeviceLog.exception("Error reading memory info", e10);
        }
        return GetMemoryValueFromStringKt.getMemoryValueFromString(str);
    }

    @TargetApi(21)
    private final ArrayList<String> getNewAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        k.d(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        arrayList.addAll(ie.k.t(Arrays.copyOf(SUPPORTED_ABIS, SUPPORTED_ABIS.length)));
        return arrayList;
    }

    private final List<String> getOldAbiList() {
        ArrayList arrayList = new ArrayList();
        String CPU_ABI = Build.CPU_ABI;
        k.d(CPU_ABI, "CPU_ABI");
        arrayList.add(CPU_ABI);
        String CPU_ABI2 = Build.CPU_ABI2;
        k.d(CPU_ABI2, "CPU_ABI2");
        arrayList.add(CPU_ABI2);
        return arrayList;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        if (openAdvertisingTrackingId == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return openAdvertisingTrackingId;
    }

    private final int getPhoneType() {
        Object systemService = this.context.getSystemService("phone");
        k.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((TelephonyManager) systemService).getPhoneType();
    }

    private final String getPlatform() {
        return "android";
    }

    private final int getScreenDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return displayMetrics.densityDpi;
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

    private final int getScreenLayout() {
        return this.context.getResources().getConfiguration().screenLayout;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    private final String getSimOperator() {
        Object systemService = this.context.getSystemService("phone");
        k.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String simOperator = ((TelephonyManager) systemService).getSimOperator();
        k.d(simOperator, "telephonyManager.simOperator");
        return simOperator;
    }

    private final List<String> getStores(List<String> list) {
        return this.storeDataSource.fetchStores(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List getStores$default(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            list = r.f6846x;
        }
        return androidStaticDeviceInfoDataSource.getStores(list);
    }

    private final int getVersionCode() {
        return 41605;
    }

    private final String getVersionName() {
        return "4.16.5";
    }

    private final String getWebViewUserAgent() {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.context);
            k.d(defaultUserAgent, "{\n        WebSettings.ge…tUserAgent(context)\n    }");
            return defaultUserAgent;
        } catch (Exception e10) {
            DeviceLog.exception("Exception getting webview user agent", e10);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean isAppDebuggable() {
        /*
            r8 = this;
            java.lang.String r0 = "Could not find name"
            android.content.Context r1 = r8.context
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "context.packageManager"
            kotlin.jvm.internal.k.d(r1, r2)
            android.content.Context r2 = r8.context
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = "context.packageName"
            kotlin.jvm.internal.k.d(r2, r3)
            r3 = 1
            r4 = 0
            android.content.pm.ApplicationInfo r5 = r1.getApplicationInfo(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            java.lang.String r6 = "pm.getApplicationInfo(pkgName, 0)"
            kotlin.jvm.internal.k.d(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            int r6 = r5.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r6 = r6 & 2
            r5.flags = r6     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            r3 = 0
            if (r6 == 0) goto L2e
            r5 = 1
            goto L35
        L2e:
            r5 = 0
            goto L35
        L30:
            r5 = move-exception
            com.unity3d.services.core.log.DeviceLog.exception(r0, r5)
            goto L2e
        L35:
            if (r3 == 0) goto L7f
            r3 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
            android.content.pm.Signature[] r1 = r1.signatures     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
            java.lang.String r2 = "signatures"
            kotlin.jvm.internal.k.d(r1, r2)     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
            int r2 = r1.length     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
        L45:
            if (r4 >= r2) goto L7f
            r3 = r1[r4]     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
            java.lang.String r6 = "X.509"
            java.security.cert.CertificateFactory r6 = java.security.cert.CertificateFactory.getInstance(r6)     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
            byte[] r3 = r3.toByteArray()     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
            r7.<init>(r3)     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
            java.security.cert.Certificate r3 = r6.generateCertificate(r7)     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
            java.lang.String r6 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.k.c(r3, r6)     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
            javax.security.auth.x500.X500Principal r3 = r3.getSubjectX500Principal()     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
            javax.security.auth.x500.X500Principal r6 = r8.DEBUG_CERT     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
            boolean r5 = kotlin.jvm.internal.k.a(r3, r6)     // Catch: java.security.cert.CertificateException -> L72 android.content.pm.PackageManager.NameNotFoundException -> L74
            if (r5 != 0) goto L7f
            int r4 = r4 + 1
            goto L45
        L72:
            r0 = move-exception
            goto L76
        L74:
            r1 = move-exception
            goto L7c
        L76:
            java.lang.String r1 = "Certificate exception"
            com.unity3d.services.core.log.DeviceLog.exception(r1, r0)
            goto L7f
        L7c:
            com.unity3d.services.core.log.DeviceLog.exception(r0, r1)
        L7f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.isAppDebuggable():boolean");
    }

    private final boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo, String str) {
        if (getApiLevel() >= 29) {
            return isHardwareAcceleratedV29(mediaCodecInfo);
        }
        if (!isSoftwareOnly(mediaCodecInfo, str)) {
            return true;
        }
        return false;
    }

    @TargetApi(29)
    private final boolean isHardwareAcceleratedV29(MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    private final boolean isRooted() {
        try {
            return searchPathForBinary(BINARY_SU);
        } catch (Exception e10) {
            DeviceLog.exception("Rooted check failed", e10);
            return false;
        }
    }

    private final boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo, String str) {
        if (getApiLevel() >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        String name = mediaCodecInfo.getName();
        k.d(name, "codecInfo.name");
        Locale ROOT = Locale.ROOT;
        k.d(ROOT, "ROOT");
        String lowerCase = name.toLowerCase(ROOT);
        k.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!u.H(lowerCase, "arc.", false)) {
            if (!u.H(lowerCase, "omx.google.", false) && !u.H(lowerCase, "omx.ffmpeg.", false)) {
                if ((!u.H(lowerCase, "omx.sec.", false) || !m.I(lowerCase, ".sw.", false)) && !lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") && !u.H(lowerCase, "c2.android.", false) && !u.H(lowerCase, "c2.google.", false)) {
                    if (!u.H(lowerCase, "omx.", false) && !u.H(lowerCase, "c2.", false)) {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @TargetApi(29)
    private final boolean isSoftwareOnlyV29(MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    private final boolean isTestMode() {
        return SdkProperties.isTestMode();
    }

    private final boolean searchPathForBinary(String str) {
        List list;
        Collection collection;
        File[] listFiles;
        String str2 = System.getenv(ENVIRONMENT_VARIABLE_PATH);
        if (str2 != null) {
            Pattern compile = Pattern.compile(":");
            k.d(compile, "compile(...)");
            Matcher matcher = compile.matcher(str2);
            if (!matcher.find()) {
                list = g.m(str2.toString());
            } else {
                ArrayList arrayList = new ArrayList(10);
                int i6 = 0;
                do {
                    arrayList.add(str2.subSequence(i6, matcher.start()).toString());
                    i6 = matcher.end();
                } while (matcher.find());
                arrayList.add(str2.subSequence(i6, str2.length()).toString());
                list = arrayList;
            }
            if (!list.isEmpty()) {
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = j.U(listIterator.nextIndex() + 1, list);
                        break;
                    }
                }
            }
            collection = r.f6846x;
            String[] strArr = (String[]) collection.toArray(new String[0]);
            if (strArr != null) {
                for (String str3 : strArr) {
                    File file = new File(str3);
                    if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            if (k.a(file2.getName(), str)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final List<MediaCodecInfo> selectAllDecodeCodecs(String str) {
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i6 = 0; i6 < codecCount; i6++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i6);
            if (!codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (u.A(str2, str, true) && isHardwareAccelerated(codecInfoAt, str)) {
                        arrayList.add(codecInfoAt);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object fetch(java.util.List<java.lang.String> r5, le.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            java.lang.Object r5 = r0.L$1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource) r0
            he.a.f(r6)
            goto L5a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            he.a.f(r6)
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r6 = r4.staticDeviceInfo
            java.lang.String r6 = r6.getGpuModel()
            if (r6 == 0) goto L4a
            int r6 = r6.length()
            if (r6 != 0) goto L47
            goto L4a
        L47:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r5 = r4.staticDeviceInfo
            return r5
        L4a:
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r2
            java.lang.Object r6 = r4.getGPUModel(r0)
            me.a r0 = me.a.f8833x
            if (r6 != r0) goto L59
            return r0
        L59:
            r0 = r4
        L5a:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L94
            int r1 = r6.length()
            if (r1 != 0) goto L65
            goto L94
        L65:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r1 = r0.staticDeviceInfo
            gatewayprotocol.v1.StaticDeviceInfoKt$Dsl$Companion r2 = gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.Companion
            com.google.protobuf.GeneratedMessageLite$Builder r1 = r1.toBuilder()
            java.lang.String r3 = "this.toBuilder()"
            kotlin.jvm.internal.k.d(r1, r3)
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder r1 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) r1
            gatewayprotocol.v1.StaticDeviceInfoKt$Dsl r1 = r2._create(r1)
            r1.setGpuModel(r6)
            com.google.protobuf.kotlin.DslList r6 = r1.getStores()
            r1.clearStores(r6)
            com.google.protobuf.kotlin.DslList r6 = r1.getStores()
            java.util.List r5 = r0.getStores(r5)
            r1.addAllStores(r6, r5)
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r5 = r1._build()
            r0.staticDeviceInfo = r5
            return r5
        L94:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r5 = r0.staticDeviceInfo
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.fetch(java.util.List, le.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached() {
        return this.staticDeviceInfo;
    }

    public final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        if (advertisingTrackingId == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return advertisingTrackingId;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getAnalyticsUserId() {
        return this.analyticsDataSource.getUserId();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getAppName() {
        String packageName = this.context.getPackageName();
        k.d(packageName, "context.packageName");
        return packageName;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getAuid(le.c cVar) {
        String string = AndroidPreferences.getString(UnityAdsConstants.Preferences.PREF_NAME_AUID, "auid");
        if (string == null) {
            return null;
        }
        return string;
    }

    public final String getBoard() {
        String str = Build.BOARD;
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    public final String getBootloader() {
        String str = Build.BOOTLOADER;
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    public final String getBrand() {
        String str = Build.BRAND;
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    public final String getBuildId() {
        return Build.ID;
    }

    public final String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDevice() {
        String str = Build.DEVICE;
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    public final String getDisplay() {
        String str = Build.DISPLAY;
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    public final String getHardware() {
        String str = Build.HARDWARE;
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    public final String getHost() {
        String str = Build.HOST;
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getIdfi(le.c cVar) {
        String string = AndroidPreferences.getString(UnityAdsConstants.Preferences.PREF_NAME_IDFI, UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        if (string == null) {
            string = null;
        }
        if (string == null) {
            String uuid = UUID.randomUUID().toString();
            AndroidPreferences.setString(UnityAdsConstants.Preferences.PREF_NAME_IDFI, UnityAdsConstants.Preferences.PREF_KEY_IDFI, uuid);
            return uuid;
        }
        return string;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getManufacturer() {
        String str = Build.MANUFACTURER;
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getModel() {
        String str = Build.MODEL;
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    public final String getProduct() {
        String str = Build.PRODUCT;
        if (str == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str;
    }

    public final List<Sensor> getSensorList() {
        Object systemService = this.context.getSystemService("sensor");
        k.c(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        List<Sensor> sensorList = ((SensorManager) systemService).getSensorList(-1);
        k.d(sensorList, "sensorManager.getSensorList(Sensor.TYPE_ALL)");
        return sensorList;
    }

    public final List<String> getSupportedAbis() {
        if (getApiLevel() < 21) {
            return getOldAbiList();
        }
        return getNewAbiList();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public long getSystemBootTime() {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    public final long getTotalSpace(File file) {
        if (file != null && file.exists()) {
            return b.l((float) (file.getTotalSpace() / 1024));
        }
        return -1L;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public Object getUnityBuildGuid(le.c cVar) {
        return this.unityBootConfigDataSource.getValue("build-guid");
    }

    public final boolean hasX264Decoder() {
        return !selectAllDecodeCodecs(MimeTypes.VIDEO_H264).isEmpty();
    }

    public final boolean hasX265Decoder() {
        return !selectAllDecodeCodecs(MimeTypes.VIDEO_H265).isEmpty();
    }

    public final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }
}
