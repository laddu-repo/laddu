package pa;

import android.animation.ObjectAnimator;
import com.unity3d.services.UnityAdsConstants;
import i.y;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u extends y {

    /* renamed from: i, reason: collision with root package name */
    public static final o5.b f10722i = new o5.b(Float.class, "animationFraction", 13);

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f10723c;

    /* renamed from: d, reason: collision with root package name */
    public final l1.a f10724d;

    /* renamed from: e, reason: collision with root package name */
    public final x f10725e;

    /* renamed from: f, reason: collision with root package name */
    public int f10726f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10727g;

    /* renamed from: h, reason: collision with root package name */
    public float f10728h;

    public u(x xVar) {
        super(3);
        this.f10726f = 1;
        this.f10725e = xVar;
        this.f10724d = new l1.a(1);
    }

    @Override // i.y
    public final void c() {
        ObjectAnimator objectAnimator = this.f10723c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // i.y
    public final void i() {
        p();
        this.f10723c.setDuration(this.f10725e.f10645n * 333.0f);
        q();
    }

    @Override // i.y
    public final void n() {
        p();
        q();
        this.f10723c.start();
    }

    public final void p() {
        if (this.f10723c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f10722i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.f10723c = ofFloat;
            ofFloat.setDuration(this.f10725e.f10645n * 333.0f);
            this.f10723c.setInterpolator(null);
            this.f10723c.setRepeatCount(-1);
            this.f10723c.addListener(new bb.b(this, 6));
        }
    }

    public final void q() {
        this.f10727g = true;
        this.f10726f = 1;
        ArrayList arrayList = (ArrayList) this.f6269b;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            p pVar = (p) obj;
            x xVar = this.f10725e;
            pVar.f10699c = xVar.f10637e[0];
            pVar.f10700d = xVar.f10641i / 2;
        }
    }

    @Override // i.y
    public final void l() {
    }

    @Override // i.y
    public final void o() {
    }

    @Override // i.y
    public final void k(c cVar) {
    }
}
