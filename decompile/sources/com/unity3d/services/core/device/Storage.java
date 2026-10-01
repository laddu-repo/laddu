package com.unity3d.services.core.device;

import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import df.a;
import ie.j;
import ie.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.f1;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import org.json.JSONObject;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class Storage extends JsonStorage {
    public static final Companion Companion = new Companion(null);
    private static final r0 onStorageEventCallbacks = y0.c(r.f6846x);
    private final String _targetFileName;
    private final StorageManager.StorageType type;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final void addStorageEventCallback(l callback) {
            f1 f1Var;
            Object value;
            k.e(callback, "callback");
            r0 r0Var = Storage.onStorageEventCallbacks;
            do {
                f1Var = (f1) r0Var;
                value = f1Var.getValue();
            } while (!f1Var.f(value, j.Q((List) value, callback)));
        }

        public final void removeStorageEventCallback(l callback) {
            f1 f1Var;
            Object value;
            ArrayList arrayList;
            k.e(callback, "callback");
            r0 r0Var = Storage.onStorageEventCallbacks;
            do {
                f1Var = (f1) r0Var;
                value = f1Var.getValue();
                List list = (List) value;
                k.e(list, "<this>");
                arrayList = new ArrayList(ie.l.x(list, 10));
                boolean z10 = false;
                for (Object obj : list) {
                    boolean z11 = true;
                    if (!z10 && k.a(obj, callback)) {
                        z10 = true;
                        z11 = false;
                    }
                    if (z11) {
                        arrayList.add(obj);
                    }
                }
            } while (!f1Var.f(value, arrayList));
        }

        private Companion() {
        }
    }

    public Storage(String _targetFileName, StorageManager.StorageType type) {
        k.e(_targetFileName, "_targetFileName");
        k.e(type, "type");
        this._targetFileName = _targetFileName;
        this.type = type;
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean readStorage() {
        byte[] readFileBytes;
        boolean z10 = true;
        try {
            try {
                readFileBytes = Utilities.readFileBytes(new File(this._targetFileName));
            } catch (Exception e10) {
                DeviceLog.debug("Failed to read storage JSON file:", e10);
                z10 = false;
                return z10;
            }
        } catch (FileNotFoundException e11) {
            DeviceLog.debug("Storage JSON file not found in local cache:", e11);
            z10 = false;
            return z10;
        }
        if (readFileBytes == null) {
            return false;
        }
        setData(new JSONObject(new String(readFileBytes, a.f4115a)));
        return z10;
    }

    public final synchronized void sendEvent(StorageEvent storageEvent, Object obj) {
        List list = (List) ((f1) onStorageEventCallbacks).getValue();
        if (!list.isEmpty()) {
            k.b(storageEvent);
            StorageEventInfo storageEventInfo = new StorageEventInfo(storageEvent, this.type, obj);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((l) it.next()).invoke(storageEventInfo);
            }
            return;
        }
        boolean z10 = false;
        if (WebViewApp.getCurrentApp() != null) {
            z10 = WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, storageEvent, this.type.name(), obj);
        }
        if (!z10) {
            DeviceLog.debug("Couldn't send storage event to WebApp");
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() != null) {
            return Utilities.writeFile(file, getData().toString());
        }
        return false;
    }
}
