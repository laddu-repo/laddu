package y8;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.gms.internal.measurement.j4;
import o5.e0;
import s8.l;
import s9.h;
import s9.n;
import u5.r;
import v8.q;
import w8.o;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final l f15013i = new l((b) new Object(), (ob.a) new Object());

    /* renamed from: a, reason: collision with root package name */
    public final Context f15014a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15015b;

    /* renamed from: c, reason: collision with root package name */
    public final l f15016c;

    /* renamed from: d, reason: collision with root package name */
    public final o f15017d;

    /* renamed from: e, reason: collision with root package name */
    public final v8.a f15018e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15019f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f15020g;

    /* renamed from: h, reason: collision with root package name */
    public final v8.d f15021h;

    public c(Context context, l lVar, o oVar, u8.b bVar) {
        String str;
        x.h(context, "Null context is not permitted.");
        x.h(lVar, "Api must not be null.");
        x.h(bVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        x.h(applicationContext, "The provided context did not have an application context.");
        this.f15014a = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            str = context.getAttributionTag();
        } else {
            str = null;
        }
        this.f15015b = str;
        this.f15016c = lVar;
        this.f15017d = oVar;
        this.f15018e = new v8.a(lVar, oVar, str);
        v8.d e10 = v8.d.e(applicationContext);
        this.f15021h = e10;
        this.f15019f = e10.E.getAndIncrement();
        this.f15020g = bVar.f12951a;
        h0 h0Var = e10.J;
        h0Var.sendMessage(h0Var.obtainMessage(7, this));
    }

    public final n a(w8.n nVar) {
        r rVar = new r(27, false);
        t8.d[] dVarArr = {g9.c.f5562a};
        rVar.f12916y = new w4.c(nVar);
        j4 j4Var = new j4(rVar, dVarArr, false);
        h hVar = new h();
        v8.d dVar = this.f15021h;
        dVar.getClass();
        v8.o oVar = new v8.o(new q(j4Var, hVar, this.f15020g), dVar.F.get(), this);
        h0 h0Var = dVar.J;
        h0Var.sendMessage(h0Var.obtainMessage(4, oVar));
        return hVar.f12263a;
    }
}
