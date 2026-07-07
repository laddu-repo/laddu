package j1;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class y0 extends Writer {

    /* renamed from: y, reason: collision with root package name */
    public final StringBuilder f7045y = new StringBuilder(128);

    /* renamed from: x, reason: collision with root package name */
    public final String f7044x = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d();
    }

    public final void d() {
        StringBuilder sb2 = this.f7045y;
        if (sb2.length() > 0) {
            Log.d(this.f7044x, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        d();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i6, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c10 = cArr[i6 + i11];
            if (c10 == '\n') {
                d();
            } else {
                this.f7045y.append(c10);
            }
        }
    }
}
