package o3;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final long f9869a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9870b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9871c;

    public d(long j, long j10, List list) {
        this.f9869a = j;
        this.f9870b = j10;
        this.f9871c = Collections.unmodifiableList(list);
    }

    @Override // o3.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f9869a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return r4.a.m(sb2, this.f9870b, " }");
    }
}
