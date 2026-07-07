package h2;

import db.c1;
import db.i0;
import db.k0;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends j {
    public final String I;
    public final k0 J;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(String str, long j, long j10, String str2, String str3) {
        this(str, null, HttpUrl.FRAGMENT_ENCODE_SET, 0L, -1, -9223372036854775807L, null, str2, str3, j, j10, false, c1.B);
        i0 i0Var = k0.f4008y;
    }

    public i(String str, i iVar, String str2, long j, int i6, long j10, r1.m mVar, String str3, String str4, long j11, long j12, boolean z10, List list) {
        super(str, iVar, j, i6, j10, mVar, str3, str4, j11, j12, z10);
        this.I = str2;
        this.J = k0.k(list);
    }
}
