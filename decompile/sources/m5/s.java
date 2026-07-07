package m5;

import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class s extends e {
    public final Object i;

    public s(Object obj, p2.c cVar) {
        super(Collections.EMPTY_LIST);
        j(cVar);
        this.i = obj;
    }

    @Override // m5.e
    public final float b() {
        return 1.0f;
    }

    @Override // m5.e
    public final Object e() {
        p2.c cVar = this.f8459e;
        Object obj = this.i;
        float f = this.f8458d;
        return cVar.m(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // m5.e
    public final Object f(w5.a aVar, float f) {
        return e();
    }

    @Override // m5.e
    public final void h() {
        if (this.f8459e != null) {
            super.h();
        }
    }

    @Override // m5.e
    public final void i(float f) {
        this.f8458d = f;
    }
}
