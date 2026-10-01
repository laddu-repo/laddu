package com.google.android.gms.internal.measurement;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ue extends jf {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f3140w = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f3141v;

    public ue(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.f3141v = arrayList;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f3141v;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (obj != null) {
                throw new ClassCastException();
            }
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            Iterator it = this.f3141v.iterator();
            if (it.hasNext()) {
                throw d0.d.g(it);
            }
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.jf, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = ((FilterInputStream) this).in.read(bArr);
        if (i != -1) {
            Iterator it = this.f3141v.iterator();
            if (it.hasNext()) {
                throw d0.d.g(it);
            }
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11 = ((FilterInputStream) this).in.read(bArr, i, i10);
        if (i11 != -1) {
            Iterator it = this.f3141v.iterator();
            if (it.hasNext()) {
                throw d0.d.g(it);
            }
        }
        return i11;
    }
}
