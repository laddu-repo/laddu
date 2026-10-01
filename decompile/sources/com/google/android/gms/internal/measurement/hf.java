package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class hf extends kf implements ef {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FileOutputStream f2694v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final File f2695w;

    public hf(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f2694v = fileOutputStream;
        this.f2695w = file;
    }

    @Override // com.google.android.gms.internal.measurement.ef
    public final File a() {
        return this.f2695w;
    }
}
