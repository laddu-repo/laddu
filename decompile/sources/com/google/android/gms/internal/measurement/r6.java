package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r6 implements Iterator {
    public Iterator A;
    public final /* synthetic */ AbstractMap B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2405x;

    /* renamed from: y, reason: collision with root package name */
    public int f2406y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2407z;

    public /* synthetic */ r6(p6 p6Var) {
        this.f2405x = 0;
        Objects.requireNonNull(p6Var);
        this.B = p6Var;
        this.f2406y = -1;
    }

    public Iterator a() {
        if (this.A == null) {
            this.A = ((com.google.protobuf.s3) this.B).f3045z.entrySet().iterator();
        }
        return this.A;
    }

    public Iterator b() {
        if (this.A == null) {
            this.A = ((p6) this.B).f2392z.entrySet().iterator();
        }
        return this.A;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2405x) {
            case 0:
                int i6 = this.f2406y + 1;
                p6 p6Var = (p6) this.B;
                if (i6 < p6Var.f2391y) {
                    return true;
                }
                if (!p6Var.f2392z.isEmpty() && b().hasNext()) {
                    return true;
                }
                return false;
            default:
                int i10 = this.f2406y + 1;
                com.google.protobuf.s3 s3Var = (com.google.protobuf.s3) this.B;
                if (i10 < s3Var.f3044y.size()) {
                    return true;
                }
                if (!s3Var.f3045z.isEmpty() && a().hasNext()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2405x) {
            case 0:
                this.f2407z = true;
                int i6 = this.f2406y + 1;
                this.f2406y = i6;
                p6 p6Var = (p6) this.B;
                if (i6 < p6Var.f2391y) {
                    return (q6) p6Var.f2390x[i6];
                }
                return (Map.Entry) b().next();
            default:
                this.f2407z = true;
                int i10 = this.f2406y + 1;
                this.f2406y = i10;
                com.google.protobuf.s3 s3Var = (com.google.protobuf.s3) this.B;
                if (i10 < s3Var.f3044y.size()) {
                    return (Map.Entry) s3Var.f3044y.get(this.f2406y);
                }
                return (Map.Entry) a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i6 = this.f2405x;
        AbstractMap abstractMap = this.B;
        switch (i6) {
            case 0:
                if (this.f2407z) {
                    this.f2407z = false;
                    p6 p6Var = (p6) abstractMap;
                    p6Var.f();
                    int i10 = this.f2406y;
                    if (i10 < p6Var.f2391y) {
                        this.f2406y = i10 - 1;
                        p6Var.d(i10);
                        return;
                    } else {
                        b().remove();
                        return;
                    }
                }
                throw new IllegalStateException("remove() was called before next()");
            default:
                com.google.protobuf.s3 s3Var = (com.google.protobuf.s3) abstractMap;
                if (this.f2407z) {
                    this.f2407z = false;
                    int i11 = com.google.protobuf.s3.E;
                    s3Var.b();
                    if (this.f2406y < s3Var.f3044y.size()) {
                        int i12 = this.f2406y;
                        this.f2406y = i12 - 1;
                        s3Var.g(i12);
                        return;
                    }
                    a().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
        }
    }

    public r6(com.google.protobuf.s3 s3Var) {
        this.f2405x = 1;
        this.B = s3Var;
        this.f2406y = -1;
    }
}
