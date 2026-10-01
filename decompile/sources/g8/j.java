package g8;

import a2.a2;
import android.content.Context;
import androidx.lifecycle.j1;
import j1.f0;
import j4.b0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements h5.c {

    /* renamed from: x, reason: collision with root package name */
    public Context f5542x;

    /* JADX WARN: Type inference failed for: r0v7, types: [p.q3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [g8.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, ic.s] */
    public k a() {
        Context context = this.f5542x;
        if (context != null) {
            ?? obj = new Object();
            obj.f5543x = i8.a.a(n.f5548a);
            lc.c cVar = new lc.c(context);
            obj.f5544y = cVar;
            obj.f5545z = i8.a.a(new b0(cVar, new u5.r(cVar, 9)));
            lc.c cVar2 = obj.f5544y;
            int i6 = 16;
            obj.A = new a2(cVar2, i6);
            ge.a a10 = i8.a.a(new f0(14, obj.A, i8.a.a(new u5.r(cVar2, i6))));
            obj.B = a10;
            zb.d dVar = new zb.d(17);
            lc.c cVar3 = obj.f5544y;
            j1 j1Var = new j1(cVar3, a10, dVar, 28);
            ge.a aVar = obj.f5543x;
            ge.a aVar2 = obj.f5545z;
            b4.h hVar = new b4.h(aVar, aVar2, j1Var, a10, a10);
            ?? obj2 = new Object();
            obj2.f10362x = cVar3;
            obj2.f10363y = aVar2;
            obj2.f10364z = a10;
            obj2.A = j1Var;
            obj2.B = aVar;
            obj2.C = a10;
            obj2.D = a10;
            ?? obj3 = new Object();
            obj3.f6781x = aVar;
            obj3.f6782y = a10;
            obj3.f6783z = j1Var;
            obj3.A = a10;
            obj.C = i8.a.a(new j1(hVar, (Object) obj2, (Object) obj3, 18));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    @Override // h5.c
    public h5.d k(a2.c cVar) {
        Context context = this.f5542x;
        String str = (String) cVar.f172z;
        ca.e callback = (ca.e) cVar.A;
        kotlin.jvm.internal.k.e(callback, "callback");
        if (str != null && str.length() != 0) {
            a2.c cVar2 = new a2.c(context, str, callback, true);
            return new i5.h((Context) cVar2.f171y, (String) cVar2.f172z, (ca.e) cVar2.A, cVar2.f170x);
        }
        throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
    }
}
