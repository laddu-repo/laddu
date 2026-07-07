package e7;

import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: x, reason: collision with root package name */
    public final o7.a f4402x;

    /* renamed from: y, reason: collision with root package name */
    public float f4403y = -1.0f;

    public d(List list) {
        this.f4402x = (o7.a) list.get(0);
    }

    @Override // e7.b
    public final boolean d(float f3) {
        if (this.f4403y == f3) {
            return true;
        }
        this.f4403y = f3;
        return false;
    }

    @Override // e7.b
    public final o7.a e() {
        return this.f4402x;
    }

    @Override // e7.b
    public final boolean f(float f3) {
        return !this.f4402x.c();
    }

    @Override // e7.b
    public final boolean isEmpty() {
        return false;
    }

    @Override // e7.b
    public final float j() {
        return this.f4402x.a();
    }

    @Override // e7.b
    public final float n() {
        return this.f4402x.b();
    }
}
