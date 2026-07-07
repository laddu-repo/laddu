package i7;

import b7.y;
import b7.z;
import java.util.HashSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f6656a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6657b;

    public g(String str, boolean z10, int i6) {
        this.f6656a = i6;
        this.f6657b = z10;
    }

    @Override // i7.b
    public final d7.d a(y yVar, b7.j jVar, j7.a aVar) {
        if (!((HashSet) yVar.I.f162y).contains(z.f1616x)) {
            n7.c.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new d7.m(this);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("MergePaths{mode=");
        int i6 = this.f6656a;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 != 5) {
                            str = "null";
                        } else {
                            str = "EXCLUDE_INTERSECTIONS";
                        }
                    } else {
                        str = "INTERSECT";
                    }
                } else {
                    str = "SUBTRACT";
                }
            } else {
                str = "ADD";
            }
        } else {
            str = "MERGE";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
