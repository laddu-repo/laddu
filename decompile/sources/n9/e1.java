package n9;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e1 extends v.k {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9285h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f9286i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(h1 h1Var) {
        super(20);
        this.f9286i = h1Var;
    }

    @Override // v.k
    public Object c(Object obj) {
        switch (this.f9285h) {
            case 0:
                String str = (String) obj;
                w8.x.d(str);
                h1 h1Var = (h1) this.f9286i;
                h1Var.e1();
                w8.x.d(str);
                o oVar = h1Var.f9511z.f9303z;
                e4.P(oVar);
                j l22 = oVar.l2(str);
                if (l22 == null) {
                    return null;
                }
                u0 u0Var = ((n1) h1Var.f4301y).C;
                n1.g(u0Var);
                u0Var.L.b(str, "Populate EES config from database on cache miss. appId");
                h1Var.l1(str, h1Var.m1(str, (byte[]) l22.f9355y));
                e1 e1Var = h1Var.H;
                e1Var.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                synchronized (((ob.a) e1Var.f13171g)) {
                    Set<Map.Entry> entrySet = ((v6.p) e1Var.f13170f).f13421a.entrySet();
                    kotlin.jvm.internal.k.d(entrySet, "map.entries");
                    for (Map.Entry entry : entrySet) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (com.google.android.gms.internal.measurement.e0) linkedHashMap.get(str);
            default:
                return super.c(obj);
        }
    }

    @Override // v.k
    public void d(Object obj, Object obj2, Object obj3) {
        switch (this.f9285h) {
            case 1:
                t6.d dVar = (t6.d) obj2;
                ((j2.y) ((s8.l) this.f9286i).f12251y).u((t6.a) obj, dVar.f12618a, dVar.f12619b, dVar.f12620c);
                return;
            default:
                super.d(obj, obj2, obj3);
                return;
        }
    }

    @Override // v.k
    public int o(Object obj, Object obj2) {
        switch (this.f9285h) {
            case 1:
                return ((t6.d) obj2).f12620c;
            default:
                return super.o(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(int i6, s8.l lVar) {
        super(i6);
        this.f9286i = lVar;
    }
}
