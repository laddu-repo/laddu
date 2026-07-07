package i5;

import android.content.Context;
import he.m;
import he.v;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements h5.d {
    public final boolean A;
    public final m B;
    public boolean C;

    /* renamed from: x, reason: collision with root package name */
    public final Context f6620x;

    /* renamed from: y, reason: collision with root package name */
    public final String f6621y;

    /* renamed from: z, reason: collision with root package name */
    public final ca.e f6622z;

    public h(Context context, String str, ca.e callback, boolean z10) {
        k.e(context, "context");
        k.e(callback, "callback");
        this.f6620x = context;
        this.f6621y = str;
        this.f6622z = callback;
        this.A = z10;
        this.B = he.a.d(new androidx.lifecycle.i(this, 6));
    }

    @Override // h5.d
    public final h5.b G() {
        return ((g) this.B.getValue()).d(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.B.f6084y != v.f6098a) {
            ((g) this.B.getValue()).close();
        }
    }

    @Override // h5.d
    public final String getDatabaseName() {
        return this.f6621y;
    }

    @Override // h5.d
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.B.f6084y != v.f6098a) {
            ((g) this.B.getValue()).setWriteAheadLoggingEnabled(z10);
        }
        this.C = z10;
    }
}
