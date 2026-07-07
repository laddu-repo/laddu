package d4;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u3.f f4047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1.t f4048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4050e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w2.g0 f4052h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t1.o f4056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4057n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f4058o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        this(0, 0, null, str);
        this.f4046a = 0;
    }

    @Override // d4.i
    public final void a() {
        switch (this.f4046a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.i = 0;
                this.f4053j = 0;
                this.f4054k = false;
                this.f4058o = -9223372036854775807L;
                break;
            default:
                this.i = 0;
                this.f4053j = 0;
                this.f4054k = false;
                this.f4058o = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03ec  */
    @Override // d4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w1.t r23) {
        /*
            Method dump skipped, instruction units count: 1274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.b.b(w1.t):void");
    }

    @Override // d4.i
    public final void c(boolean z2) {
        int i = this.f4046a;
    }

    @Override // d4.i
    public final void d(int i, long j8) {
        switch (this.f4046a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                this.f4058o = j8;
                break;
            default:
                this.f4058o = j8;
                break;
        }
    }

    @Override // d4.i
    public final void e(w2.q qVar, g0 g0Var) {
        switch (this.f4046a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                g0Var.a();
                g0Var.b();
                this.f4051g = g0Var.f4141e;
                g0Var.b();
                this.f4052h = qVar.r(g0Var.f4140d, 1);
                break;
            default:
                g0Var.a();
                g0Var.b();
                this.f4051g = g0Var.f4141e;
                g0Var.b();
                this.f4052h = qVar.r(g0Var.f4140d, 1);
                break;
        }
    }

    public b(int i, int i10, String str, String str2) {
        this.f4046a = i10;
        switch (i10) {
            case 1:
                u3.f fVar = new u3.f(16, new byte[16]);
                this.f4047b = fVar;
                this.f4048c = new w1.t(fVar.f12868b);
                this.i = 0;
                this.f4053j = 0;
                this.f4054k = false;
                this.f4058o = -9223372036854775807L;
                this.f4049d = str;
                this.f4050e = i;
                this.f = str2;
                break;
            default:
                u3.f fVar2 = new u3.f(128, new byte[128]);
                this.f4047b = fVar2;
                this.f4048c = new w1.t(fVar2.f12868b);
                this.i = 0;
                this.f4058o = -9223372036854775807L;
                this.f4049d = str;
                this.f4050e = i;
                this.f = str2;
                break;
        }
    }

    private final void f(boolean z2) {
    }

    private final void g(boolean z2) {
    }
}
