package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final re f3090a;

    static {
        re reVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                Iterator it = Arrays.asList(new re[0]).iterator();
                if (it.hasNext()) {
                    reVar = (re) it.next();
                    p4.v.q("Expected at most one FlagsService", !it.hasNext());
                } else {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    reVar = new re();
                }
                f3090a = reVar;
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
