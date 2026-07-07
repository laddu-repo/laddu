package y9;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class h0 extends z {
    @Override // y9.z
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public h0 c(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public i0 h() {
        int i = this.f14635b;
        if (i == 0) {
            int i10 = i0.f14562x;
            return f1.E;
        }
        if (i != 1) {
            i0 i0VarJ = i0.j(i, this.f14634a);
            this.f14635b = i0VarJ.size();
            this.f14636c = true;
            return i0VarJ;
        }
        Object obj = this.f14634a[0];
        Objects.requireNonNull(obj);
        int i11 = i0.f14562x;
        return new m1(obj);
    }
}
