package com.unity3d.services.core.misc;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.services.core.di.IServicesRegistry;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.log.DeviceLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.x;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import w8.k;
import y.e;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class Utilities {
    public static String Sha256(String str) {
        return Sha256(str.getBytes());
    }

    public static Map<String, Object> combineJsonIntoMap(Map<String, Object> map, JSONObject jSONObject, String str) {
        HashMap hashMap = new HashMap(map);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(k.c(str, next), jSONObject.opt(next));
        }
        return hashMap;
    }

    public static Map<String, Object> convertJsonToMap(JSONObject jSONObject) {
        return combineJsonIntoMap(new HashMap(), jSONObject);
    }

    public static <T> T getService(String str, Class cls) {
        IServicesRegistry registry = ServiceProvider.INSTANCE.getRegistry();
        kotlin.jvm.internal.k.e(cls, "<this>");
        return (T) registry.getService(str, x.a(cls));
    }

    public static JSONObject mergeJsonObjects(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return jSONObject2;
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject3.put(next, jSONObject2.get(next));
        }
        Iterator<String> keys2 = jSONObject.keys();
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            if (jSONObject3.has(next2) && (jSONObject3.get(next2) instanceof JSONObject) && (jSONObject.get(next2) instanceof JSONObject)) {
                jSONObject3.put(next2, mergeJsonObjects(jSONObject.getJSONObject(next2), jSONObject3.getJSONObject(next2)));
            } else {
                jSONObject3.put(next2, jSONObject.get(next2));
            }
        }
        return jSONObject3;
    }

    public static byte[] readFileBytes(File file) {
        FileInputStream fileInputStream;
        Path path;
        byte[] readAllBytes;
        FileInputStream fileInputStream2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            path = file.toPath();
            readAllBytes = Files.readAllBytes(path);
            return readAllBytes;
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            if (fileInputStream.read(bArr) == length) {
                fileInputStream.close();
                return bArr;
            }
            throw new IOException("Failed to read all bytes from input file path: " + file.getPath());
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(runnable, 0L);
    }

    public static String toHexString(byte[] bArr) {
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        for (byte b10 : bArr) {
            int i6 = b10 & 255;
            if (i6 <= 15) {
                str = k.c(str, "0");
            }
            StringBuilder b11 = e.b(str);
            b11.append(Integer.toHexString(i6));
            str = b11.toString();
        }
        return str;
    }

    public static void wrapCustomerListener(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e10) {
            DeviceLog.error("An uncaught exception has occurred in the client application.  Exception: %s", e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean writeFile(java.io.File r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "Error closing FileOutputStream"
            r1 = 0
            if (r4 != 0) goto L6
            return r1
        L6:
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r3.write(r5)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r3.flush()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L23
            r3.close()     // Catch: java.lang.Exception -> L1a
            goto L1e
        L1a:
            r5 = move-exception
            com.unity3d.services.core.log.DeviceLog.exception(r0, r5)
        L1e:
            r1 = 1
            goto L38
        L20:
            r4 = move-exception
            r2 = r3
            goto L50
        L23:
            r5 = move-exception
            r2 = r3
            goto L29
        L26:
            r4 = move-exception
            goto L50
        L28:
            r5 = move-exception
        L29:
            java.lang.String r3 = "Could not write file"
            com.unity3d.services.core.log.DeviceLog.exception(r3, r5)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L38
            r2.close()     // Catch: java.lang.Exception -> L34
            goto L38
        L34:
            r5 = move-exception
            com.unity3d.services.core.log.DeviceLog.exception(r0, r5)
        L38:
            if (r1 == 0) goto L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Wrote file: "
            r5.<init>(r0)
            java.lang.String r4 = r4.getAbsolutePath()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r4)
        L4f:
            return r1
        L50:
            if (r2 == 0) goto L5a
            r2.close()     // Catch: java.lang.Exception -> L56
            goto L5a
        L56:
            r5 = move-exception
            com.unity3d.services.core.log.DeviceLog.exception(r0, r5)
        L5a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.misc.Utilities.writeFile(java.io.File, java.lang.String):boolean");
    }

    public static String Sha256(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr, 0, bArr.length);
            return toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            DeviceLog.exception("SHA-256 algorithm not found", e10);
            return null;
        }
    }

    public static void runOnUiThread(Runnable runnable, long j) {
        Handler handler = new Handler(Looper.getMainLooper());
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else {
            handler.post(runnable);
        }
    }

    public static <T> T getService(Class cls) {
        return (T) getService(HttpUrl.FRAGMENT_ENCODE_SET, cls);
    }

    public static String Sha256(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    return toHexString(messageDigest.digest());
                }
            }
        } catch (NoSuchAlgorithmException e10) {
            DeviceLog.exception("SHA-256 algorithm not found", e10);
            return null;
        }
    }

    public static Map<String, Object> combineJsonIntoMap(Map<String, Object> map, JSONObject jSONObject) {
        return combineJsonIntoMap(map, jSONObject, HttpUrl.FRAGMENT_ENCODE_SET);
    }
}
