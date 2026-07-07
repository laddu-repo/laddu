package com.bumptech.glide.manager;

import androidx.media3.ui.AspectRatioFrameLayout;
import java.util.Objects;
import k8.u2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2421v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2422w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2423x;

    public /* synthetic */ o(Object obj, boolean z2, int i) {
        this.f2421v = i;
        this.f2423x = obj;
        this.f2422w = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.f2421v
            r1 = 0
            switch(r0) {
                case 0: goto L85;
                case 1: goto L79;
                case 2: goto L6d;
                default: goto L6;
            }
        L6:
            java.lang.Object r0 = r9.f2423x
            k8.u2 r0 = (k8.u2) r0
            java.lang.Object r2 = r0.f2053w
            k8.p1 r2 = (k8.p1) r2
            boolean r3 = r2.b()
            java.lang.Boolean r4 = r2.T
            r5 = 1
            if (r4 == 0) goto L21
            java.lang.Boolean r4 = r2.T
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L21
            r4 = r5
            goto L22
        L21:
            r4 = r1
        L22:
            boolean r6 = r9.f2422w
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r2.T = r7
            if (r4 != r6) goto L3c
            k8.v0 r4 = r2.A
            k8.p1.l(r4)
            k8.t0 r4 = r4.J
            java.lang.String r7 = "Default data collection state already set to"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            r4.b(r8, r7)
        L3c:
            boolean r4 = r2.b()
            if (r4 == r3) goto L55
            boolean r4 = r2.b()
            java.lang.Boolean r7 = r2.T
            if (r7 == 0) goto L53
            java.lang.Boolean r7 = r2.T
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L53
            r1 = r5
        L53:
            if (r4 == r1) goto L69
        L55:
            k8.v0 r1 = r2.A
            k8.p1.l(r1)
            k8.t0 r1 = r1.G
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Default data collection is different than actual status"
            r1.c(r2, r3, r4)
        L69:
            r0.V()
            return
        L6d:
            r9.f2422w = r1
            java.lang.Object r0 = r9.f2423x
            androidx.media3.ui.AspectRatioFrameLayout r0 = (androidx.media3.ui.AspectRatioFrameLayout) r0
            int r1 = androidx.media3.ui.AspectRatioFrameLayout.f1320y
            r0.getClass()
            return
        L79:
            java.lang.Object r0 = r9.f2423x
            com.bumptech.glide.manager.s r0 = (com.bumptech.glide.manager.s) r0
            com.bumptech.glide.manager.m r0 = r0.f2431w
            boolean r1 = r9.f2422w
            r0.a(r1)
            return
        L85:
            java.lang.Object r0 = r9.f2423x
            com.bumptech.glide.manager.p r0 = (com.bumptech.glide.manager.p) r0
            boolean r1 = r9.f2422w
            v6.m.a()
            java.lang.Object r0 = r0.f2425b
            c2.b r0 = (c2.b) r0
            boolean r2 = r0.f1685v
            r0.f1685v = r1
            if (r2 == r1) goto L9f
            java.lang.Object r0 = r0.f1686w
            com.bumptech.glide.manager.m r0 = (com.bumptech.glide.manager.m) r0
            r0.a(r1)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.o.run():void");
    }

    public o(u2 u2Var, boolean z2) {
        this.f2421v = 3;
        this.f2422w = z2;
        Objects.requireNonNull(u2Var);
        this.f2423x = u2Var;
    }

    public o(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f2421v = 2;
        this.f2423x = aspectRatioFrameLayout;
    }
}
