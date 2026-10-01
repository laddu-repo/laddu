package pa;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.unity3d.services.UnityAdsConstants;
import i.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class s extends o {
    public final r K;
    public y L;
    public p5.p M;

    public s(Context context, e eVar, r rVar, y yVar) {
        super(context, eVar);
        this.K = rVar;
        this.L = yVar;
        yVar.f6268a = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.s.draw(android.graphics.Canvas):void");
    }

    @Override // pa.o
    public final boolean e(boolean z10, boolean z11, boolean z12) {
        p5.p pVar;
        boolean e10 = super.e(z10, z11, z12);
        if (g() && (pVar = this.M) != null) {
            return pVar.setVisible(z10, z11);
        }
        if (!isRunning()) {
            this.L.c();
        }
        if (z10 && (z12 || (Build.VERSION.SDK_INT <= 22 && !g()))) {
            this.L.n();
        }
        return e10;
    }

    public final boolean g() {
        if (this.f10696z != null && Settings.Global.getFloat(this.f10694x.getContentResolver(), "animator_duration_scale", 1.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.K.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.K.f();
    }
}
