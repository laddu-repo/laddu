package d4;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4119b;

    public f(int i, List list) {
        this.f4118a = i;
        this.f4119b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d4.h0 a(int r6, p7.m r7) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.f.a(int, p7.m):d4.h0");
    }

    public List b(p7.m mVar) {
        String str;
        int i;
        List listSingletonList;
        boolean zC = c(32);
        List list = this.f4119b;
        if (zC) {
            return list;
        }
        w1.t tVar = new w1.t((byte[]) mVar.f10432y);
        while (tVar.a() > 0) {
            int iX = tVar.x();
            int iX2 = tVar.f13739b + tVar.x();
            if (iX == 134) {
                ArrayList arrayList = new ArrayList();
                int iX3 = tVar.x() & 31;
                for (int i10 = 0; i10 < iX3; i10++) {
                    String strV = tVar.v(3, StandardCharsets.UTF_8);
                    int iX4 = tVar.x();
                    boolean z2 = (iX4 & 128) != 0;
                    if (z2) {
                        i = iX4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bX = (byte) tVar.x();
                    tVar.K(1);
                    if (z2) {
                        boolean z10 = (bX & 64) != 0;
                        byte[] bArr = w1.c.f13697a;
                        listSingletonList = Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    t1.n nVar = new t1.n();
                    nVar.f12036m = t1.f0.p(str);
                    nVar.f12029d = strV;
                    nVar.J = i;
                    nVar.f12039p = listSingletonList;
                    arrayList.add(new t1.o(nVar));
                }
                list = arrayList;
            }
            tVar.J(iX2);
        }
        return list;
    }

    public boolean c(int i) {
        return (i & this.f4118a) != 0;
    }

    public f() {
        this.f4118a = 1;
        this.f4119b = Collections.singletonList(null);
    }

    public f(ArrayList arrayList) {
        this.f4118a = 0;
        this.f4119b = arrayList;
    }
}
