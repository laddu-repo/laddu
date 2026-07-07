package k8;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f7341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f7342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y f7343y;

    public /* synthetic */ a(y yVar, String str, long j8, int i) {
        this.f7340v = i;
        this.f7341w = str;
        this.f7342x = j8;
        this.f7343y = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7340v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                y yVar = this.f7343y;
                yVar.D();
                String str = this.f7341w;
                t7.y.d(str);
                v.e eVar = yVar.f7844y;
                boolean zIsEmpty = eVar.isEmpty();
                long j8 = this.f7342x;
                if (zIsEmpty) {
                    yVar.f7845z = j8;
                }
                Integer num = (Integer) eVar.get(str);
                if (num != null) {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (eVar.f13021x < 100) {
                    eVar.put(str, 1);
                    yVar.f7843x.put(str, Long.valueOf(j8));
                } else {
                    v0 v0Var = ((p1) yVar.f2053w).A;
                    p1.l(v0Var);
                    v0Var.E.a("Too many ads visible");
                }
                break;
            default:
                y yVar2 = this.f7343y;
                p1 p1Var = (p1) yVar2.f2053w;
                yVar2.D();
                String str2 = this.f7341w;
                t7.y.d(str2);
                v.e eVar2 = yVar2.f7844y;
                Integer num2 = (Integer) eVar2.get(str2);
                if (num2 == null) {
                    v0 v0Var2 = p1Var.A;
                    p1.l(v0Var2);
                    v0Var2.B.b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    f3 f3Var = p1Var.G;
                    v0 v0Var3 = p1Var.A;
                    p1.k(f3Var);
                    c3 c3VarH = f3Var.H(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        eVar2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        eVar2.remove(str2);
                        v.e eVar3 = yVar2.f7843x;
                        Long l10 = (Long) eVar3.get(str2);
                        long j9 = this.f7342x;
                        if (l10 == null) {
                            p1.l(v0Var3);
                            v0Var3.B.a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j9 - l10.longValue();
                            eVar3.remove(str2);
                            yVar2.I(str2, jLongValue, c3VarH);
                        }
                        if (eVar2.isEmpty()) {
                            long j10 = yVar2.f7845z;
                            if (j10 != 0) {
                                yVar2.H(j9 - j10, c3VarH);
                                yVar2.f7845z = 0L;
                            } else {
                                p1.l(v0Var3);
                                v0Var3.B.a("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
