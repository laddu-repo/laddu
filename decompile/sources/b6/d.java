package b6;

import android.os.Build;
import e6.i;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f1479e = o.h("NetworkMeteredCtrlr");

    @Override // b6.c
    public final boolean a(i iVar) {
        if (iVar.j.f13306a == 5) {
            return true;
        }
        return false;
    }

    @Override // b6.c
    public final boolean b(Object obj) {
        a6.a aVar = (a6.a) obj;
        if (Build.VERSION.SDK_INT < 26) {
            o.f().b(f1479e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !aVar.f579a;
        }
        if (!aVar.f579a || !aVar.f581c) {
            return true;
        }
        return false;
    }
}
