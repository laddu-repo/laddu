package af;

import ac.j0;
import ac.t;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import pd.q;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class m implements ye.d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f520d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f521e;
    public final List[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f523h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f525k;

    public m(String str, e eVar, int i) {
        this.f517a = str;
        this.f518b = eVar;
        this.f519c = i;
        String[] strArr = new String[i];
        for (int i10 = 0; i10 < i; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f521e = strArr;
        int i11 = this.f519c;
        this.f = new List[i11];
        this.f522g = new boolean[i11];
        this.f523h = q.f10552v;
        final int i12 = 0;
        this.i = com.bumptech.glide.f.B(new ce.a(this) { // from class: af.l

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ m f516w;

            {
                this.f516w = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, od.c] */
            @Override // ce.a
            public final Object b() {
                switch (i12) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        return this.f516w.f518b.a();
                    default:
                        m mVar = this.f516w;
                        ye.d[] dVarArr = (ye.d[]) mVar.f524j.getValue();
                        de.i.e(dVarArr, "typeParams");
                        int iHashCode = (mVar.b().hashCode() * 31) + Arrays.hashCode(dVarArr);
                        int iD = mVar.d();
                        int i13 = 1;
                        while (true) {
                            int iHashCode2 = 0;
                            if (iD > 0) {
                                int i14 = iD - 1;
                                int i15 = i13 * 31;
                                String strB = mVar.j(mVar.d() - iD).b();
                                if (strB != null) {
                                    iHashCode2 = strB.hashCode();
                                }
                                i13 = i15 + iHashCode2;
                                iD = i14;
                            } else {
                                int iD2 = mVar.d();
                                int iHashCode3 = 1;
                                while (true) {
                                    if (!(iD2 > 0)) {
                                        return Integer.valueOf((((iHashCode * 31) + i13) * 31) + iHashCode3);
                                    }
                                    int i16 = iD2 - 1;
                                    int i17 = iHashCode3 * 31;
                                    com.bumptech.glide.e eVarC = mVar.j(mVar.d() - iD2).c();
                                    iHashCode3 = i17 + (eVarC != null ? eVarC.hashCode() : 0);
                                    iD2 = i16;
                                }
                            }
                        }
                        break;
                }
            }
        });
        this.f524j = com.bumptech.glide.f.B(new j0(this));
        final int i13 = 1;
        this.f525k = com.bumptech.glide.f.B(new ce.a(this) { // from class: af.l

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ m f516w;

            {
                this.f516w = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, od.c] */
            @Override // ce.a
            public final Object b() {
                switch (i13) {
                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                        return this.f516w.f518b.a();
                    default:
                        m mVar = this.f516w;
                        ye.d[] dVarArr = (ye.d[]) mVar.f524j.getValue();
                        de.i.e(dVarArr, "typeParams");
                        int iHashCode = (mVar.b().hashCode() * 31) + Arrays.hashCode(dVarArr);
                        int iD = mVar.d();
                        int i132 = 1;
                        while (true) {
                            int iHashCode2 = 0;
                            if (iD > 0) {
                                int i14 = iD - 1;
                                int i15 = i132 * 31;
                                String strB = mVar.j(mVar.d() - iD).b();
                                if (strB != null) {
                                    iHashCode2 = strB.hashCode();
                                }
                                i132 = i15 + iHashCode2;
                                iD = i14;
                            } else {
                                int iD2 = mVar.d();
                                int iHashCode3 = 1;
                                while (true) {
                                    if (!(iD2 > 0)) {
                                        return Integer.valueOf((((iHashCode * 31) + i132) * 31) + iHashCode3);
                                    }
                                    int i16 = iD2 - 1;
                                    int i17 = iHashCode3 * 31;
                                    com.bumptech.glide.e eVarC = mVar.j(mVar.d() - iD2).c();
                                    iHashCode3 = i17 + (eVarC != null ? eVarC.hashCode() : 0);
                                    iD2 = i16;
                                }
                            }
                        }
                        break;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // ye.d
    public final int a(String str) {
        de.i.e(str, "name");
        Integer num = (Integer) this.f523h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // ye.d
    public final String b() {
        return this.f517a;
    }

    @Override // ye.d
    public final com.bumptech.glide.e c() {
        return ye.f.f14660b;
    }

    @Override // ye.d
    public final int d() {
        return this.f519c;
    }

    @Override // ye.d
    public final String e(int i) {
        return this.f521e[i];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, od.c] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, od.c] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            ye.d dVar = (ye.d) obj;
            if (this.f517a.equals(dVar.b()) && Arrays.equals((ye.d[]) this.f524j.getValue(), (ye.d[]) ((m) obj).f524j.getValue())) {
                int iD = dVar.d();
                int i = this.f519c;
                if (i == iD) {
                    for (int i10 = 0; i10 < i; i10++) {
                        if (de.i.a(j(i10).b(), dVar.j(i10).b()) && de.i.a(j(i10).c(), dVar.j(i10).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ye.d
    public boolean f() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // af.b
    public final Set g() {
        return this.f523h.keySet();
    }

    @Override // ye.d
    public final List getAnnotations() {
        return pd.p.f10551v;
    }

    @Override // ye.d
    public final boolean h() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, od.c] */
    public int hashCode() {
        return ((Number) this.f525k.getValue()).intValue();
    }

    @Override // ye.d
    public final List i(int i) {
        List list = this.f[i];
        return list == null ? pd.p.f10551v : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, od.c] */
    @Override // ye.d
    public final ye.d j(int i) {
        return ((we.a[]) this.i.getValue())[i].d();
    }

    @Override // ye.d
    public final boolean k(int i) {
        return this.f522g[i];
    }

    public final void l(String str, boolean z2) {
        int i = this.f520d + 1;
        this.f520d = i;
        String[] strArr = this.f521e;
        strArr[i] = str;
        this.f522g[i] = z2;
        this.f[i] = null;
        if (i == this.f519c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                map.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f523h = map;
        }
    }

    public final String toString() {
        return pd.j.I(android.support.v4.media.session.b.P(0, this.f519c), ", ", this.f517a.concat("("), ")", new t(1, this), 24);
    }
}
