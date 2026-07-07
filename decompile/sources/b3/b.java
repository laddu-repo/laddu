package b3;

import t1.r;
import w2.e;
import w2.g;
import w2.h;
import w2.j;
import w2.p;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f1531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f1533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1534d;

    public b(h hVar, j jVar, long j8, long j9, long j10, long j11, long j12, int i) {
        this.f1532b = jVar;
        this.f1534d = i;
        this.f1531a = new e(hVar, j8, j9, j10, j11, j12);
    }

    public static int a(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int c(p pVar, long j8, r rVar) {
        if (j8 == pVar.getPosition()) {
            return 0;
        }
        rVar.f12092a = j8;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(w2.p r28, t1.r r29) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.b.b(w2.p, t1.r):int");
    }

    public final void d(long j8) {
        g gVar = this.f1533c;
        if (gVar == null || gVar.f13812a != j8) {
            e eVar = this.f1531a;
            this.f1533c = new g(j8, eVar.f13803a.d(j8), eVar.f13805c, eVar.f13806d, eVar.f13807e, eVar.f);
        }
    }
}
