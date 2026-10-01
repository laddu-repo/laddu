package n9;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f2 implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9307x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9308y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f9309z;

    public f2(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.n0 n0Var, String str, String str2, boolean z10) {
        this.B = n0Var;
        this.f9308y = str;
        this.f9309z = str2;
        this.A = z10;
        this.C = appMeasurementDynamiteService;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010b A[Catch: RuntimeException -> 0x00e5, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:33:0x010b, B:35:0x0116, B:38:0x0123, B:40:0x0129, B:41:0x0143, B:42:0x014c, B:46:0x0154, B:49:0x016d, B:50:0x017c, B:52:0x0174, B:53:0x018f, B:55:0x0195, B:57:0x019b, B:59:0x01a1, B:61:0x01a7, B:63:0x01af, B:65:0x01b7, B:67:0x01bd, B:70:0x01cf, B:75:0x0094, B:77:0x009a, B:79:0x00a4, B:81:0x00aa, B:83:0x00b0, B:85:0x00b6, B:87:0x00be, B:89:0x00c6, B:91:0x00ce, B:93:0x00d6, B:94:0x00ec, B:96:0x00fa), top: B:74:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0154 A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:33:0x010b, B:35:0x0116, B:38:0x0123, B:40:0x0129, B:41:0x0143, B:42:0x014c, B:46:0x0154, B:49:0x016d, B:50:0x017c, B:52:0x0174, B:53:0x018f, B:55:0x0195, B:57:0x019b, B:59:0x01a1, B:61:0x01a7, B:63:0x01af, B:65:0x01b7, B:67:0x01bd, B:70:0x01cf, B:75:0x0094, B:77:0x009a, B:79:0x00a4, B:81:0x00aa, B:83:0x00b0, B:85:0x00b6, B:87:0x00be, B:89:0x00c6, B:91:0x00ce, B:93:0x00d6, B:94:0x00ec, B:96:0x00fa), top: B:74:0x0094 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.f2.run():void");
    }

    public f2(ic.i iVar, boolean z10, Uri uri, String str, String str2) {
        this.A = z10;
        this.B = uri;
        this.f9308y = str;
        this.f9309z = str2;
        this.C = iVar;
    }

    public f2(m2 m2Var, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.B = atomicReference;
        this.f9308y = str;
        this.f9309z = str2;
        this.A = z10;
        Objects.requireNonNull(m2Var);
        this.C = m2Var;
    }

    public f2(h3 h3Var, l4 l4Var, boolean z10, u uVar, Bundle bundle) {
        this.B = l4Var;
        this.A = z10;
        this.f9308y = uVar;
        this.f9309z = bundle;
        Objects.requireNonNull(h3Var);
        this.C = h3Var;
    }
}
