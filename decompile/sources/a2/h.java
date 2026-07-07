package a2;

import java.util.Locale;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f250a;

    /* renamed from: b, reason: collision with root package name */
    public int f251b;

    /* renamed from: c, reason: collision with root package name */
    public int f252c;

    /* renamed from: d, reason: collision with root package name */
    public int f253d;

    /* renamed from: e, reason: collision with root package name */
    public int f254e;

    /* renamed from: f, reason: collision with root package name */
    public int f255f;

    /* renamed from: g, reason: collision with root package name */
    public int f256g;

    /* renamed from: h, reason: collision with root package name */
    public int f257h;

    /* renamed from: i, reason: collision with root package name */
    public int f258i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f259k;

    /* renamed from: l, reason: collision with root package name */
    public int f260l;

    public final String toString() {
        int i6 = this.f250a;
        int i10 = this.f251b;
        int i11 = this.f252c;
        int i12 = this.f253d;
        int i13 = this.f254e;
        int i14 = this.f255f;
        int i15 = this.f256g;
        int i16 = this.f257h;
        int i17 = this.f258i;
        int i18 = this.j;
        long j = this.f259k;
        int i19 = this.f260l;
        String str = u1.a0.f12750a;
        Locale locale = Locale.US;
        StringBuilder p10 = r4.a.p(i6, i10, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        p10.append(i11);
        p10.append("\n skippedInputBuffers=");
        p10.append(i12);
        p10.append("\n renderedOutputBuffers=");
        p10.append(i13);
        p10.append("\n skippedOutputBuffers=");
        p10.append(i14);
        p10.append("\n droppedBuffers=");
        p10.append(i15);
        p10.append("\n droppedInputBuffers=");
        p10.append(i16);
        p10.append("\n maxConsecutiveDroppedBuffers=");
        p10.append(i17);
        p10.append("\n droppedToKeyframeEvents=");
        p10.append(i18);
        p10.append("\n totalVideoFrameProcessingOffsetUs=");
        p10.append(j);
        p10.append("\n videoFrameProcessingOffsetCount=");
        p10.append(i19);
        p10.append("\n}");
        return p10.toString();
    }
}
