package yf;

import com.google.android.gms.internal.measurement.p4;
import j2.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends p4 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15073c;

    public i(y yVar, boolean z10) {
        super(yVar);
        this.f15073c = z10;
    }

    @Override // com.google.android.gms.internal.measurement.p4
    public final void m(String value) {
        kotlin.jvm.internal.k.e(value, "value");
        if (this.f15073c) {
            super.m(value);
        } else {
            k(value);
        }
    }
}
