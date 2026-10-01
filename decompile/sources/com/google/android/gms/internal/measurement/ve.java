package com.google.android.gms.internal.measurement;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ve extends kf {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f3166w = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f3167v;

    public ve(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.f3167v = arrayList;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f3167v;
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

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        Iterator it = this.f3167v.iterator();
        if (it.hasNext()) {
            throw d0.d.g(it);
        }
    }

    @Override // com.google.android.gms.internal.measurement.kf, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.f3167v.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                int length = bArr.length;
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.internal.measurement.kf, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i10);
        Iterator it = this.f3167v.iterator();
        if (it.hasNext()) {
            throw d0.d.g(it);
        }
    }
}
