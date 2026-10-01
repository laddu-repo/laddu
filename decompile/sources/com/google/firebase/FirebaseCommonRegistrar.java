package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import i4.u0;
import ic.m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import jb.g;
import qb.a;
import qb.b;
import qb.h;
import qb.p;
import zb.c;
import zb.d;
import zb.e;
import zb.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        a a10 = b.a(lc.b.class);
        a10.a(new h(2, 0, lc.a.class));
        a10.f11152g = new u0(22);
        arrayList.add(a10.b());
        p pVar = new p(pb.a.class, Executor.class);
        a aVar = new a(c.class, new Class[]{e.class, f.class});
        aVar.a(h.a(Context.class));
        aVar.a(h.a(g.class));
        aVar.a(new h(2, 0, d.class));
        aVar.a(new h(1, 1, lc.b.class));
        aVar.a(new h(pVar, 1, 0));
        aVar.f11152g = new m(pVar, 2);
        arrayList.add(aVar.b());
        arrayList.add(lg.c.e("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(lg.c.e("fire-core", "21.0.0"));
        arrayList.add(lg.c.e("device-name", a(Build.PRODUCT)));
        arrayList.add(lg.c.e("device-model", a(Build.DEVICE)));
        arrayList.add(lg.c.e("device-brand", a(Build.BRAND)));
        arrayList.add(lg.c.i("android-target-sdk", new u0(16)));
        arrayList.add(lg.c.i("android-min-sdk", new u0(17)));
        arrayList.add(lg.c.i("android-platform", new u0(18)));
        arrayList.add(lg.c.i("android-installer", new u0(19)));
        try {
            he.e.f6071y.getClass();
            str = "2.2.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(lg.c.e("kotlin", str));
        }
        return arrayList;
    }
}
