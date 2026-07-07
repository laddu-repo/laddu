package com.google.android.gms.internal.measurement;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class nh extends oh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2936b;

    @Override // com.google.android.gms.internal.measurement.oh
    public final String a() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }

    @Override // com.google.android.gms.internal.measurement.oh
    public final String b() {
        return "logInternal";
    }

    @Override // com.google.android.gms.internal.measurement.oh
    public final int c() {
        return 44;
    }

    @Override // com.google.android.gms.internal.measurement.oh
    public final String d() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // com.google.android.gms.internal.measurement.oh
    public final String e() {
        return "Phlogger.java";
    }

    public final boolean equals(Object obj) {
        return obj instanceof nh;
    }

    public final int hashCode() {
        int i = this.f2936b;
        if (i != 0) {
            return i;
        }
        this.f2936b = -1391114360;
        return -1391114360;
    }
}
