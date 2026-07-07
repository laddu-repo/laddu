package l4;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@i0("navigation")
/* loaded from: classes.dex */
public class w extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final k0 f8197c;

    public w(k0 navigatorProvider) {
        kotlin.jvm.internal.k.e(navigatorProvider, "navigatorProvider");
        this.f8197c = navigatorProvider;
    }

    @Override // l4.j0
    public final u a() {
        return new v(this);
    }

    @Override // l4.j0
    public final void d(List list, z zVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            u uVar = hVar.f8141y;
            kotlin.jvm.internal.k.c(uVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            v vVar = (v) uVar;
            Bundle a10 = hVar.E.a();
            s8.n nVar = vVar.D;
            int i6 = nVar.f12259a;
            if (i6 == 0) {
                o4.j jVar = vVar.f8195y;
                String superName = (String) jVar.f9926c;
                if (superName == null) {
                    superName = String.valueOf(jVar.f9924a);
                }
                kotlin.jvm.internal.k.e(superName, "superName");
                if (((v) nVar.f12260b).f8195y.f9924a == 0) {
                    superName = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(superName).toString());
            }
            u uVar2 = (u) ((v.m) nVar.f12261c).c(i6);
            if (uVar2 == null) {
                if (((String) nVar.f12262d) == null) {
                    nVar.f12262d = String.valueOf(nVar.f12259a);
                }
                String str = (String) nVar.f12262d;
                kotlin.jvm.internal.k.b(str);
                throw new IllegalArgumentException(h8.c.m("navigation destination ", str, " is not a direct child of this NavGraph"));
            }
            this.f8197c.b(uVar2.f8194x).d(a8.g.m(b().b(uVar2, uVar2.a(a10))), zVar);
        }
    }
}
