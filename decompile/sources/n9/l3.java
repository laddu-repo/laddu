package n9;

import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l3 implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9381x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f9382y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ p3 f9383z;

    public l3(p3 p3Var, long j, int i6) {
        this.f9381x = i6;
        switch (i6) {
            case 1:
                this.f9382y = j;
                Objects.requireNonNull(p3Var);
                this.f9383z = p3Var;
                return;
            default:
                this.f9382y = j;
                Objects.requireNonNull(p3Var);
                this.f9383z = p3Var;
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (r2.Q.a() != false) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.l3.run():void");
    }
}
