package cg;

import bg.c0;
import com.google.protobuf.CodedOutputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f2104a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2105b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2106c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2107d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2108e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2109f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2110g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2111h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2112i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final Long f2113k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f2114l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f2115m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f2116n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f2117o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f2118p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f2119q;

    public g(c0 canonicalPath, boolean z10, String comment, long j, long j10, long j11, int i6, long j12, int i10, int i11, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        k.e(canonicalPath, "canonicalPath");
        k.e(comment, "comment");
        this.f2104a = canonicalPath;
        this.f2105b = z10;
        this.f2106c = comment;
        this.f2107d = j;
        this.f2108e = j10;
        this.f2109f = j11;
        this.f2110g = i6;
        this.f2111h = j12;
        this.f2112i = i10;
        this.j = i11;
        this.f2113k = l10;
        this.f2114l = l11;
        this.f2115m = l12;
        this.f2116n = num;
        this.f2117o = num2;
        this.f2118p = num3;
        this.f2119q = new ArrayList();
    }

    public /* synthetic */ g(c0 c0Var, boolean z10, String str, long j, long j10, long j11, int i6, long j12, int i10, int i11, Long l10, Long l11, Long l12, int i12) {
        this(c0Var, z10, (i12 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, (i12 & 8) != 0 ? -1L : j, (i12 & 16) != 0 ? -1L : j10, (i12 & 32) != 0 ? -1L : j11, (i12 & 64) != 0 ? -1 : i6, (i12 & 128) != 0 ? -1L : j12, (i12 & 256) != 0 ? -1 : i10, (i12 & 512) != 0 ? -1 : i11, (i12 & 1024) != 0 ? null : l10, (i12 & 2048) != 0 ? null : l11, (i12 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? null : l12, null, null, null);
    }
}
