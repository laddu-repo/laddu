package cg;

import bg.k;
import bg.l0;
import bg.s;
import java.io.IOException;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends s {

    /* renamed from: x, reason: collision with root package name */
    public final long f2097x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f2098y;

    /* renamed from: z, reason: collision with root package name */
    public long f2099z;

    public e(l0 l0Var, long j, boolean z10) {
        super(l0Var);
        this.f2097x = j;
        this.f2098y = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, bg.k] */
    @Override // bg.s, bg.l0
    public final long read(k sink, long j) {
        kotlin.jvm.internal.k.e(sink, "sink");
        long j10 = this.f2099z;
        long j11 = this.f2097x;
        if (j10 > j11) {
            j = 0;
        } else if (this.f2098y) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            j = Math.min(j, j12);
        }
        long read = super.read(sink, j);
        if (read != -1) {
            this.f2099z += read;
        }
        long j13 = this.f2099z;
        if ((j13 < j11 && read == -1) || j13 > j11) {
            if (read > 0 && j13 > j11) {
                long j14 = sink.f1726y - (j13 - j11);
                ?? obj = new Object();
                obj.T(sink);
                sink.write(obj, j14);
                obj.d();
            }
            throw new IOException("expected " + j11 + " bytes but got " + this.f2099z);
        }
        return read;
    }
}
