package r1;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: f, reason: collision with root package name */
    public static final String f11384f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f11385g;

    /* renamed from: a, reason: collision with root package name */
    public final int f11386a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11387b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11388c;

    /* renamed from: d, reason: collision with root package name */
    public final q[] f11389d;

    /* renamed from: e, reason: collision with root package name */
    public int f11390e;

    static {
        String str = u1.a0.f12750a;
        f11384f = Integer.toString(0, 36);
        f11385g = Integer.toString(1, 36);
    }

    public e1(String str, q... qVarArr) {
        boolean z10;
        if (qVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        this.f11387b = str;
        this.f11389d = qVarArr;
        this.f11386a = qVarArr.length;
        int i6 = k0.i(qVarArr[0].f11670n);
        this.f11388c = i6 == -1 ? k0.i(qVarArr[0].f11669m) : i6;
        String str2 = qVarArr[0].f11661d;
        str2 = (str2 == null || str2.equals("und")) ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        int i10 = qVarArr[0].f11663f | Http2.INITIAL_MAX_FRAME_SIZE;
        for (int i11 = 1; i11 < qVarArr.length; i11++) {
            String str3 = qVarArr[i11].f11661d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? HttpUrl.FRAGMENT_ENCODE_SET : str3)) {
                b(i11, "languages", qVarArr[0].f11661d, qVarArr[i11].f11661d);
                return;
            } else {
                if (i10 != (qVarArr[i11].f11663f | Http2.INITIAL_MAX_FRAME_SIZE)) {
                    b(i11, "role flags", Integer.toBinaryString(qVarArr[0].f11663f), Integer.toBinaryString(qVarArr[i11].f11663f));
                    return;
                }
            }
        }
    }

    public static void b(int i6, String str, String str2, String str3) {
        u1.a.h("TrackGroup", HttpUrl.FRAGMENT_ENCODE_SET, new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i6 + ")"));
    }

    public final int a(q qVar) {
        int i6 = 0;
        while (true) {
            q[] qVarArr = this.f11389d;
            if (i6 < qVarArr.length) {
                if (qVar == qVarArr[i6]) {
                    return i6;
                }
                i6++;
            } else {
                return -1;
            }
        }
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        q[] qVarArr = this.f11389d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(qVarArr.length);
        int length = qVarArr.length;
        int i6 = 0;
        while (i6 < length) {
            q qVar = qVarArr[i6];
            List list = qVar.f11673q;
            Bundle bundle2 = new Bundle();
            bundle2.putString(q.R, qVar.f11658a);
            bundle2.putString(q.S, qVar.f11659b);
            String str = q.f11654w0;
            db.k0 k0Var = qVar.f11660c;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(k0Var.size());
            int size = k0Var.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = k0Var.get(i10);
                i10++;
                t tVar = (t) obj;
                tVar.getClass();
                Bundle bundle3 = new Bundle();
                q[] qVarArr2 = qVarArr;
                String str2 = tVar.f11694a;
                int i11 = length;
                if (str2 != null) {
                    bundle3.putString(t.f11692c, str2);
                }
                bundle3.putString(t.f11693d, tVar.f11695b);
                arrayList2.add(bundle3);
                qVarArr = qVarArr2;
                length = i11;
            }
            q[] qVarArr3 = qVarArr;
            int i12 = length;
            bundle2.putParcelableArrayList(str, arrayList2);
            bundle2.putString(q.T, qVar.f11661d);
            bundle2.putInt(q.U, qVar.f11662e);
            bundle2.putInt(q.V, qVar.f11663f);
            int i13 = qVar.f11664g;
            if (i13 != q.Q.f11664g) {
                bundle2.putInt(q.f11655x0, i13);
            }
            bundle2.putInt(q.W, qVar.f11665h);
            bundle2.putInt(q.X, qVar.f11666i);
            bundle2.putString(q.Y, qVar.f11667k);
            bundle2.putString(q.Z, qVar.f11669m);
            bundle2.putString(q.f11633a0, qVar.f11670n);
            bundle2.putInt(q.f11634b0, qVar.f11671o);
            for (int i14 = 0; i14 < list.size(); i14++) {
                bundle2.putByteArray(q.f11635c0 + "_" + Integer.toString(i14, 36), (byte[]) list.get(i14));
            }
            bundle2.putParcelable(q.f11636d0, qVar.f11674r);
            bundle2.putLong(q.f11637e0, qVar.s);
            bundle2.putInt(q.f11638f0, qVar.f11676u);
            bundle2.putInt(q.f11639g0, qVar.f11677v);
            bundle2.putInt(q.f11657z0, qVar.f11678w);
            bundle2.putInt(q.A0, qVar.f11679x);
            bundle2.putFloat(q.f11640h0, qVar.f11680y);
            bundle2.putInt(q.f11641i0, qVar.f11681z);
            bundle2.putFloat(q.f11642j0, qVar.A);
            bundle2.putByteArray(q.f11643k0, qVar.B);
            bundle2.putInt(q.f11644l0, qVar.C);
            h hVar = qVar.D;
            if (hVar != null) {
                String str3 = q.f11645m0;
                Bundle bundle4 = new Bundle();
                bundle4.putInt(h.f11432i, hVar.f11437a);
                bundle4.putInt(h.j, hVar.f11438b);
                bundle4.putInt(h.f11433k, hVar.f11439c);
                bundle4.putByteArray(h.f11434l, hVar.f11440d);
                bundle4.putInt(h.f11435m, hVar.f11441e);
                bundle4.putInt(h.f11436n, hVar.f11442f);
                bundle2.putBundle(str3, bundle4);
            }
            bundle2.putInt(q.f11656y0, qVar.E);
            bundle2.putInt(q.f11646n0, qVar.F);
            bundle2.putInt(q.o0, qVar.G);
            bundle2.putInt(q.f11647p0, qVar.H);
            bundle2.putInt(q.f11648q0, qVar.I);
            bundle2.putInt(q.f11649r0, qVar.J);
            bundle2.putInt(q.f11650s0, qVar.K);
            bundle2.putInt(q.f11652u0, qVar.M);
            bundle2.putInt(q.f11653v0, qVar.N);
            bundle2.putInt(q.f11651t0, qVar.O);
            arrayList.add(bundle2);
            i6++;
            qVarArr = qVarArr3;
            length = i12;
        }
        bundle.putParcelableArrayList(f11384f, arrayList);
        bundle.putString(f11385g, this.f11387b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (this.f11387b.equals(e1Var.f11387b) && Arrays.equals(this.f11389d, e1Var.f11389d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f11390e == 0) {
            this.f11390e = Arrays.hashCode(this.f11389d) + h8.c.g(this.f11387b, 527, 31);
        }
        return this.f11390e;
    }

    public final String toString() {
        return this.f11387b + ": " + Arrays.toString(this.f11389d);
    }
}
