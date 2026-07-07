package pa;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import i.y;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class w extends y {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f10731k = {533, 567, 850, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f10732l = {1267, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 333, 0};

    /* renamed from: m, reason: collision with root package name */
    public static final o5.b f10733m = new o5.b(Float.class, "animationFraction", 14);

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f10734c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f10735d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator[] f10736e;

    /* renamed from: f, reason: collision with root package name */
    public final x f10737f;

    /* renamed from: g, reason: collision with root package name */
    public int f10738g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10739h;

    /* renamed from: i, reason: collision with root package name */
    public float f10740i;
    public c j;

    public w(Context context, x xVar) {
        super(2);
        this.f10738g = 0;
        this.j = null;
        this.f10737f = xVar;
        this.f10736e = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // i.y
    public final void c() {
        ObjectAnimator objectAnimator = this.f10734c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // i.y
    public final void i() {
        p();
        ObjectAnimator objectAnimator = this.f10734c;
        x xVar = this.f10737f;
        objectAnimator.setDuration(xVar.f10645n * 1800.0f);
        this.f10735d.setDuration(xVar.f10645n * 1800.0f);
        q();
    }

    @Override // i.y
    public final void k(c cVar) {
        this.j = cVar;
    }

    @Override // i.y
    public final void l() {
        ObjectAnimator objectAnimator = this.f10735d;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            c();
            if (((s) this.f6268a).isVisible()) {
                this.f10735d.setFloatValues(this.f10740i, 1.0f);
                this.f10735d.setDuration((1.0f - this.f10740i) * 1800.0f);
                this.f10735d.start();
            }
        }
    }

    @Override // i.y
    public final void n() {
        p();
        q();
        this.f10734c.start();
    }

    @Override // i.y
    public final void o() {
        this.j = null;
    }

    public final void p() {
        ObjectAnimator objectAnimator = this.f10734c;
        x xVar = this.f10737f;
        o5.b bVar = f10733m;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, bVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f10734c = ofFloat;
            ofFloat.setDuration(xVar.f10645n * 1800.0f);
            this.f10734c.setInterpolator(null);
            this.f10734c.setRepeatCount(-1);
            this.f10734c.addListener(new v(this, 0));
        }
        if (this.f10735d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, bVar, 1.0f);
            this.f10735d = ofFloat2;
            ofFloat2.setDuration(xVar.f10645n * 1800.0f);
            this.f10735d.setInterpolator(null);
            this.f10735d.addListener(new v(this, 1));
        }
    }

    public final void q() {
        this.f10738g = 0;
        ArrayList arrayList = (ArrayList) this.f6269b;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((p) obj).f10699c = this.f10737f.f10637e[0];
        }
    }
}
