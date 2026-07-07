package d6;

import android.graphics.Bitmap;
import v6.m;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f4355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap.Config f4357c;

    public j(e eVar) {
        this.f4355a = eVar;
    }

    @Override // d6.h
    public final void a() {
        this.f4355a.r(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f4356b == jVar.f4356b && m.b(this.f4357c, jVar.f4357c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f4356b * 31;
        Bitmap.Config config = this.f4357c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return k.c(this.f4356b, this.f4357c);
    }
}
