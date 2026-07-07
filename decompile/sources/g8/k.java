package g8;

import a2.a2;
import java.io.Closeable;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements Closeable {
    public a2 A;
    public ge.a B;
    public ge.a C;

    /* renamed from: x, reason: collision with root package name */
    public ge.a f5543x;

    /* renamed from: y, reason: collision with root package name */
    public lc.c f5544y;

    /* renamed from: z, reason: collision with root package name */
    public ge.a f5545z;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((n8.g) ((n8.d) this.B.get())).close();
    }
}
