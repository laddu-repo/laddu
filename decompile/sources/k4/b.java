package k4;

import androidx.media3.ui.AspectRatioFrameLayout;
import java.util.Objects;
import n9.m2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7597x = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7598y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f7599z;

    public b(m2 m2Var, boolean z10) {
        this.f7598y = z10;
        Objects.requireNonNull(m2Var);
        this.f7599z = m2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r4 != r1) goto L21;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.f7597x
            r1 = 0
            switch(r0) {
                case 0: goto L6d;
                default: goto L6;
            }
        L6:
            java.lang.Object r0 = r9.f7599z
            n9.m2 r0 = (n9.m2) r0
            java.lang.Object r2 = r0.f4301y
            n9.n1 r2 = (n9.n1) r2
            boolean r3 = r2.a()
            java.lang.Boolean r4 = r2.V
            r5 = 1
            if (r4 == 0) goto L21
            java.lang.Boolean r4 = r2.V
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L21
            r4 = 1
            goto L22
        L21:
            r4 = 0
        L22:
            boolean r6 = r9.f7598y
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r2.V = r7
            if (r4 != r6) goto L3c
            n9.u0 r4 = r2.C
            n9.n1.g(r4)
            n9.s0 r4 = r4.L
            java.lang.String r7 = "Default data collection state already set to"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            r4.b(r8, r7)
        L3c:
            boolean r4 = r2.a()
            if (r4 == r3) goto L55
            boolean r4 = r2.a()
            java.lang.Boolean r7 = r2.V
            if (r7 == 0) goto L53
            java.lang.Boolean r7 = r2.V
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L53
            r1 = 1
        L53:
            if (r4 == r1) goto L69
        L55:
            n9.u0 r1 = r2.C
            n9.n1.g(r1)
            n9.s0 r1 = r1.I
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Default data collection is different than actual status"
            r1.c(r2, r3, r4)
        L69:
            r0.u1()
            return
        L6d:
            r9.f7598y = r1
            java.lang.Object r0 = r9.f7599z
            androidx.media3.ui.AspectRatioFrameLayout r0 = (androidx.media3.ui.AspectRatioFrameLayout) r0
            int r1 = androidx.media3.ui.AspectRatioFrameLayout.A
            r0.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.b.run():void");
    }

    public b(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f7599z = aspectRatioFrameLayout;
    }
}
