package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b1 extends i1 {
    public final /* synthetic */ int B = 3;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(k1 k1Var, Activity activity, i0 i0Var) {
        super(k1Var.f2316x, true);
        this.D = activity;
        this.E = i0Var;
        this.C = k1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:18|19|20|(1:22)|23|24|(12:55|56|57|27|(1:54)(1:31)|32|33|34|(1:36)(1:50)|37|38|(2:40|41)(4:42|(1:48)(1:45)|46|47))|26|27|(1:29)|54|32|33|34|(0)(0)|37|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        r7.d(r0, true, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1 A[Catch: Exception -> 0x0091, b -> 0x00c4, TRY_ENTER, TryCatch #0 {b -> 0x00c4, blocks: (B:36:0x00c1, B:37:0x00c8, B:50:0x00c6), top: B:34:0x00bf, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[Catch: Exception -> 0x0091, TryCatch #2 {Exception -> 0x0091, blocks: (B:20:0x0076, B:22:0x008c, B:23:0x0094, B:27:0x00aa, B:29:0x00b1, B:32:0x00ba, B:36:0x00c1, B:37:0x00c8, B:38:0x00da, B:40:0x00e0, B:42:0x00e8, B:46:0x0101, B:50:0x00c6, B:53:0x00d7, B:56:0x00a1), top: B:19:0x0076, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8 A[Catch: Exception -> 0x0091, TryCatch #2 {Exception -> 0x0091, blocks: (B:20:0x0076, B:22:0x008c, B:23:0x0094, B:27:0x00aa, B:29:0x00b1, B:32:0x00ba, B:36:0x00c1, B:37:0x00c8, B:38:0x00da, B:40:0x00e0, B:42:0x00e8, B:46:0x0101, B:50:0x00c6, B:53:0x00d7, B:56:0x00a1), top: B:19:0x0076, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6 A[Catch: Exception -> 0x0091, b -> 0x00c4, TryCatch #0 {b -> 0x00c4, blocks: (B:36:0x00c1, B:37:0x00c8, B:50:0x00c6), top: B:34:0x00bf, outer: #2 }] */
    @Override // com.google.android.gms.internal.measurement.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b1.a():void");
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public void b() {
        switch (this.B) {
            case 1:
                ((i0) this.E).w(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(k1 k1Var, Bundle bundle, Activity activity) {
        super(k1Var.f2316x, true);
        this.E = bundle;
        this.D = activity;
        this.C = k1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(l1 l1Var, Context context, Bundle bundle) {
        super(l1Var, true);
        this.D = context;
        this.E = bundle;
        this.C = l1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(l1 l1Var, String str, i0 i0Var) {
        super(l1Var, true);
        this.D = str;
        this.E = i0Var;
        Objects.requireNonNull(l1Var);
        this.C = l1Var;
    }
}
