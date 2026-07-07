package od;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import java.util.LinkedHashMap;
import kf.f1;
import kf.r0;
import kf.t0;
import kf.y0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n0 extends k1 {

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f10129b;

    /* renamed from: c, reason: collision with root package name */
    public final Application f10130c;

    /* renamed from: d, reason: collision with root package name */
    public final a1 f10131d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10132e;

    /* renamed from: f, reason: collision with root package name */
    public final t0 f10133f;

    /* renamed from: g, reason: collision with root package name */
    public final f1 f10134g;

    /* renamed from: h, reason: collision with root package name */
    public final he.m f10135h;

    public n0(SharedPreferences sharedPreferences, Application application, a1 a1Var) {
        boolean z10;
        t0 t0Var;
        this.f10129b = sharedPreferences;
        this.f10130c = application;
        this.f10131d = a1Var;
        if (Build.VERSION.SDK_INT < 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        b4.h hVar = a1Var.f883b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) hVar.f1469x;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) hVar.f1471z;
        if (linkedHashMap.containsKey("permissionChecked")) {
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) hVar.f1469x;
            Object obj = linkedHashMap3.get("permissionChecked");
            if (obj == null) {
                if (!linkedHashMap2.containsKey("permissionChecked")) {
                    linkedHashMap2.put("permissionChecked", valueOf);
                }
                obj = y0.c(linkedHashMap2.get("permissionChecked"));
                linkedHashMap3.put("permissionChecked", obj);
            }
            t0Var = new t0((r0) obj);
        } else {
            LinkedHashMap linkedHashMap4 = (LinkedHashMap) hVar.B;
            Object obj2 = linkedHashMap4.get("permissionChecked");
            if (obj2 == null) {
                if (!linkedHashMap2.containsKey("permissionChecked")) {
                    linkedHashMap2.put("permissionChecked", valueOf);
                }
                obj2 = y0.c(linkedHashMap2.get("permissionChecked"));
                linkedHashMap4.put("permissionChecked", obj2);
            }
            t0Var = new t0((r0) obj2);
        }
        this.f10133f = t0Var;
        this.f10134g = y0.c(jd.w.f7411a);
        gf.f0.w(d1.g(this), null, new l0(this, null), 3);
        this.f10135h = he.a.d(new androidx.lifecycle.i(this, 21));
    }

    public final void getData() {
        f1 f1Var = this.f10134g;
        f1Var.getClass();
        le.c cVar = null;
        f1Var.h(null, jd.w.f7411a);
        if (!this.f10132e) {
            gf.f0.w(d1.g(this), null, new l0(this, null), 3);
        } else {
            gf.f0.w(d1.g(this), null, new androidx.lifecycle.c(this, cVar, 16), 3);
        }
    }
}
