package j6;

import android.view.LayoutInflater;
import j1.r;
import j1.y;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends l implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7239x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Class f7240y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ y f7241z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Class cls, y yVar, int i6) {
        super(1);
        this.f7239x = i6;
        this.f7240y = cls;
        this.f7241z = yVar;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        int i6 = this.f7239x;
        y yVar = this.f7241z;
        Class cls = this.f7240y;
        switch (i6) {
            case 0:
                y it = (y) obj;
                k.e(it, "it");
                LinkedHashMap linkedHashMap = k6.f.f7737a;
                LinkedHashMap linkedHashMap2 = k6.f.f7738b;
                Object obj2 = linkedHashMap2.get(cls);
                if (obj2 == null) {
                    obj2 = new k6.a(cls);
                    linkedHashMap2.put(cls, obj2);
                }
                Object invoke = ((k6.a) obj2).f7735a.invoke(null, yVar.G());
                k.c(invoke, "null cannot be cast to non-null type VB of by.kirich1409.viewbindingdelegate.internal.BindViewBinding");
                return (r5.a) invoke;
            case 1:
                y it2 = (y) obj;
                k.e(it2, "it");
                LinkedHashMap linkedHashMap3 = k6.f.f7737a;
                k6.c a10 = k6.f.a(cls);
                LayoutInflater layoutInflater = ((r) yVar).e();
                k.d(layoutInflater, "layoutInflater");
                return a10.a(layoutInflater);
            default:
                y it3 = (y) obj;
                k.e(it3, "it");
                LinkedHashMap linkedHashMap4 = k6.f.f7737a;
                k6.c a11 = k6.f.a(cls);
                LayoutInflater layoutInflater2 = yVar.e();
                k.d(layoutInflater2, "layoutInflater");
                return a11.a(layoutInflater2);
        }
    }
}
