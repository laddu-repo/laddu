package c2;

import android.os.Build;
import db.p0;
import db.q1;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final c f1767d;

    /* renamed from: a, reason: collision with root package name */
    public final int f1768a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1769b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f1770c;

    /* JADX WARN: Type inference failed for: r1v1, types: [db.e0, db.o0] */
    static {
        c cVar;
        if (Build.VERSION.SDK_INT >= 33) {
            ?? e0Var = new db.e0(4);
            for (int i6 = 1; i6 <= 10; i6++) {
                e0Var.a(Integer.valueOf(u1.a0.r(i6)));
            }
            cVar = new c(2, e0Var.g());
        } else {
            cVar = new c(2, 10);
        }
        f1767d = cVar;
    }

    public c(int i6, Set set) {
        this.f1768a = i6;
        p0 k8 = p0.k(set);
        this.f1770c = k8;
        q1 it = k8.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 = Math.max(i10, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f1769b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1768a == cVar.f1768a && this.f1769b == cVar.f1769b && Objects.equals(this.f1770c, cVar.f1770c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = ((this.f1768a * 31) + this.f1769b) * 31;
        p0 p0Var = this.f1770c;
        if (p0Var == null) {
            hashCode = 0;
        } else {
            hashCode = p0Var.hashCode();
        }
        return i6 + hashCode;
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f1768a + ", maxChannelCount=" + this.f1769b + ", channelMasks=" + this.f1770c + "]";
    }

    public c(int i6, int i10) {
        this.f1768a = i6;
        this.f1769b = i10;
        this.f1770c = null;
    }
}
