package x4;

import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final g f14609a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f14610b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f14611c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f14612d;

    public n(g observer, int[] tableIds, String[] tableNames) {
        boolean z10;
        Set set;
        kotlin.jvm.internal.k.e(observer, "observer");
        kotlin.jvm.internal.k.e(tableIds, "tableIds");
        kotlin.jvm.internal.k.e(tableNames, "tableNames");
        this.f14609a = observer;
        this.f14610b = tableIds;
        this.f14611c = tableNames;
        if (tableIds.length == tableNames.length) {
            if (tableNames.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                set = android.support.v4.media.session.b.r(tableNames[0]);
            } else {
                set = ie.t.f6848x;
            }
            this.f14612d = set;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
