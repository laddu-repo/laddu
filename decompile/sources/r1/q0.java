package r1;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f11682b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f11683c;

    /* renamed from: a, reason: collision with root package name */
    public final o f11684a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        u1.c.g(!false);
        f11682b = new q0(new o(sparseBooleanArray));
        String str = u1.a0.f12750a;
        f11683c = Integer.toString(0, 36);
    }

    public q0(o oVar) {
        this.f11684a = oVar;
    }

    public final boolean a(int i6) {
        return this.f11684a.f11592a.get(i6);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i6 = 0;
        while (true) {
            o oVar = this.f11684a;
            if (i6 < oVar.f11592a.size()) {
                arrayList.add(Integer.valueOf(oVar.b(i6)));
                i6++;
            } else {
                bundle.putIntegerArrayList(f11683c, arrayList);
                return bundle;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        return this.f11684a.equals(((q0) obj).f11684a);
    }

    public final int hashCode() {
        return this.f11684a.hashCode();
    }
}
