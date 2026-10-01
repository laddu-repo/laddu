package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends Writer {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final StringBuilder f974w = new StringBuilder(128);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f973v = "FragmentManager";

    public final void a() {
        StringBuilder sb2 = this.f974w;
        if (sb2.length() > 0) {
            Log.d(this.f973v, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c10 = cArr[i + i11];
            if (c10 == '\n') {
                a();
            } else {
                this.f974w.append(c10);
            }
        }
    }
}
