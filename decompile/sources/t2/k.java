package t2;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.ws.WebSocketProtocol;
import q2.k1;
import r1.i1;
import r1.j1;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends j1 {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;

    /* renamed from: x0, reason: collision with root package name */
    public static final k f12529x0 = new k(new j());

    /* renamed from: y0, reason: collision with root package name */
    public static final String f12530y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final String f12531z0;
    public final boolean o0;

    /* renamed from: p0, reason: collision with root package name */
    public final boolean f12532p0;

    /* renamed from: q0, reason: collision with root package name */
    public final boolean f12533q0;

    /* renamed from: r0, reason: collision with root package name */
    public final boolean f12534r0;

    /* renamed from: s0, reason: collision with root package name */
    public final boolean f12535s0;

    /* renamed from: t0, reason: collision with root package name */
    public final boolean f12536t0;

    /* renamed from: u0, reason: collision with root package name */
    public final boolean f12537u0;

    /* renamed from: v0, reason: collision with root package name */
    public final SparseArray f12538v0;

    /* renamed from: w0, reason: collision with root package name */
    public final SparseBooleanArray f12539w0;

    static {
        String str = a0.f12750a;
        f12530y0 = Integer.toString(UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 36);
        f12531z0 = Integer.toString(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, 36);
        A0 = Integer.toString(1002, 36);
        B0 = Integer.toString(1003, 36);
        C0 = Integer.toString(1004, 36);
        D0 = Integer.toString(WebSocketProtocol.CLOSE_NO_STATUS_CODE, 36);
        E0 = Integer.toString(1006, 36);
        F0 = Integer.toString(1007, 36);
        G0 = Integer.toString(1008, 36);
        H0 = Integer.toString(1009, 36);
        I0 = Integer.toString(1010, 36);
        J0 = Integer.toString(1011, 36);
        K0 = Integer.toString(1012, 36);
        L0 = Integer.toString(1013, 36);
        M0 = Integer.toString(1014, 36);
        N0 = Integer.toString(1015, 36);
        O0 = Integer.toString(1016, 36);
        P0 = Integer.toString(1017, 36);
        Q0 = Integer.toString(1018, 36);
    }

    public k(j jVar) {
        super(jVar);
        this.o0 = jVar.F;
        this.f12532p0 = jVar.G;
        this.f12533q0 = jVar.H;
        this.f12534r0 = jVar.I;
        this.f12535s0 = jVar.J;
        this.f12536t0 = jVar.K;
        this.f12537u0 = jVar.L;
        this.f12538v0 = jVar.M;
        this.f12539w0 = jVar.N;
    }

    @Override // r1.j1
    public final i1 a() {
        return new j(this);
    }

    @Override // r1.j1
    public final Bundle c() {
        Bundle c10 = super.c();
        c10.putBoolean(f12530y0, this.o0);
        c10.putBoolean(f12531z0, false);
        c10.putBoolean(A0, this.f12532p0);
        c10.putBoolean(M0, false);
        c10.putBoolean(B0, this.f12533q0);
        c10.putBoolean(C0, false);
        c10.putBoolean(D0, false);
        c10.putBoolean(E0, false);
        c10.putBoolean(N0, false);
        c10.putBoolean(Q0, this.f12534r0);
        c10.putBoolean(O0, this.f12535s0);
        c10.putBoolean(F0, this.f12536t0);
        c10.putBoolean(G0, false);
        c10.putBoolean(H0, this.f12537u0);
        c10.putBoolean(P0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i6 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f12538v0;
            if (i6 < sparseArray2.size()) {
                int keyAt = sparseArray2.keyAt(i6);
                for (Map.Entry entry : ((Map) sparseArray2.valueAt(i6)).entrySet()) {
                    if (entry.getValue() == null) {
                        arrayList2.add((k1) entry.getKey());
                        arrayList.add(Integer.valueOf(keyAt));
                    } else {
                        throw new ClassCastException();
                    }
                }
                c10.putIntArray(I0, a8.f.U(arrayList));
                c10.putParcelableArrayList(J0, u1.c.p(arrayList2, new o5.p(29)));
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
                if (sparseArray.size() <= 0) {
                    c10.putSparseParcelableArray(K0, sparseArray3);
                    i6++;
                } else {
                    sparseArray.keyAt(0);
                    r4.a.t(sparseArray.valueAt(0));
                    throw null;
                }
            } else {
                SparseBooleanArray sparseBooleanArray = this.f12539w0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                    iArr[i10] = sparseBooleanArray.keyAt(i10);
                }
                c10.putIntArray(L0, iArr);
                return c10;
            }
        }
    }

    @Override // r1.j1
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k.class == obj.getClass()) {
                k kVar = (k) obj;
                if (super.equals(kVar) && this.o0 == kVar.o0 && this.f12532p0 == kVar.f12532p0 && this.f12533q0 == kVar.f12533q0 && this.f12534r0 == kVar.f12534r0 && this.f12535s0 == kVar.f12535s0 && this.f12536t0 == kVar.f12536t0 && this.f12537u0 == kVar.f12537u0) {
                    SparseBooleanArray sparseBooleanArray = kVar.f12539w0;
                    SparseBooleanArray sparseBooleanArray2 = this.f12539w0;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        int i6 = 0;
                        while (true) {
                            if (i6 < size) {
                                if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i6)) < 0) {
                                    break;
                                }
                                i6++;
                            } else {
                                SparseArray sparseArray = kVar.f12538v0;
                                SparseArray sparseArray2 = this.f12538v0;
                                int size2 = sparseArray2.size();
                                if (sparseArray.size() == size2) {
                                    for (int i10 = 0; i10 < size2; i10++) {
                                        int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i10));
                                        if (indexOfKey >= 0) {
                                            Map map = (Map) sparseArray2.valueAt(i10);
                                            Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                            if (map2.size() == map.size()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    k1 k1Var = (k1) entry.getKey();
                                                    if (map2.containsKey(k1Var) && Objects.equals(entry.getValue(), map2.get(k1Var))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // r1.j1
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.o0 ? 1 : 0)) * 961) + (this.f12532p0 ? 1 : 0)) * 961) + (this.f12533q0 ? 1 : 0)) * 28629151) + (this.f12534r0 ? 1 : 0)) * 31) + (this.f12535s0 ? 1 : 0)) * 31) + (this.f12536t0 ? 1 : 0)) * 961) + (this.f12537u0 ? 1 : 0)) * 31;
    }
}
