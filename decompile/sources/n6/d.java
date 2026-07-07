package n6;

import com.playfy.tv.ui.fragments.SettingsFragment;
import gf.c0;
import he.y;
import ne.j;
import v6.v;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends j implements p {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9075x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f9076y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i6, le.c cVar) {
        super(i6, cVar);
        this.f9075x = 2;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f9075x) {
            case 0:
                return new d((e) this.f9076y, cVar, 0);
            case 1:
                return new d((SettingsFragment) this.f9076y, cVar, 1);
            case 2:
                d dVar = new d(2, cVar);
                dVar.f9076y = obj;
                return dVar;
            case 3:
                return new d((String) this.f9076y, cVar, 3);
            default:
                return new d((v) this.f9076y, cVar, 4);
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        le.c cVar = (le.c) obj2;
        switch (this.f9075x) {
            case 0:
                return ((d) create(c0Var, cVar)).invokeSuspend(y.f6101a);
            case 1:
                return ((d) create(c0Var, cVar)).invokeSuspend(y.f6101a);
            case 2:
                return ((d) create(c0Var, cVar)).invokeSuspend(y.f6101a);
            case 3:
                return ((d) create(c0Var, cVar)).invokeSuspend(y.f6101a);
            default:
                d dVar = (d) create(c0Var, cVar);
                y yVar = y.f6101a;
                dVar.invokeSuspend(yVar);
                return yVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, bg.j0] */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, le.c cVar, int i6) {
        super(2, cVar);
        this.f9075x = i6;
        this.f9076y = obj;
    }
}
