package fd;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import com.playfy.tv.R;
import com.playfy.tv.activities.MainActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kf.f1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5192x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f5193y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f5194z;

    public /* synthetic */ j(int i6, Object obj, Object obj2) {
        this.f5192x = i6;
        this.f5193y = obj;
        this.f5194z = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.jvm.internal.w] */
    @Override // ve.a
    public final Object invoke() {
        Drawable decodeDrawable;
        Object obj;
        String[] names;
        String str;
        switch (this.f5192x) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.f5193y;
                Bundle bundle = (Bundle) this.f5194z;
                bf.o[] oVarArr = MainActivity.J;
                mainActivity.U().c(R.id.playerActivity, bundle, null);
                break;
            case 1:
                l4.k kVar = (l4.k) this.f5193y;
                l4.h hVar = (l4.h) this.f5194z;
                synchronized (kVar.f8148a) {
                    try {
                        f1 f1Var = kVar.f8149b;
                        Iterable iterable = (Iterable) f1Var.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (!kotlin.jvm.internal.k.a((l4.h) obj2, hVar)) {
                                arrayList.add(obj2);
                            } else {
                                f1Var.getClass();
                                f1Var.h(null, arrayList);
                                break;
                            }
                        }
                        f1Var.getClass();
                        f1Var.h(null, arrayList);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 2:
                m6.z zVar = (m6.z) this.f5193y;
                kotlin.jvm.internal.s sVar = (kotlin.jvm.internal.s) this.f5194z;
                ?? obj3 = new Object();
                m6.a0 a0Var = zVar.f8698a;
                bg.m m9 = a0Var.m();
                if (m9.I(0L, m6.r.f8679b) || m9.I(0L, m6.r.f8678a)) {
                    a0Var = new m6.d0(bg.b.d(new m6.q(a0Var.m())), new m6.b0(zVar.f8699b.f13407a, 1), null);
                }
                try {
                    decodeDrawable = ImageDecoder.decodeDrawable(zVar.b(a0Var), new m6.x(obj3, zVar, sVar));
                    return decodeDrawable;
                } finally {
                    ImageDecoder h4 = a9.c.h(obj3.f8055x);
                    if (h4 != null) {
                        h4.close();
                    }
                    a0Var.close();
                }
            case 3:
                l4.k kVar2 = (l4.k) this.f5193y;
                j1.y yVar = (j1.y) this.f5194z;
                for (l4.h hVar2 : (Iterable) ((f1) kVar2.f8153f.f8014x).getValue()) {
                    if (n4.f.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + hVar2 + " due to fragment " + yVar + " viewmodel being cleared");
                    }
                    kVar2.c(hVar2);
                }
                return he.y.f6101a;
            case 4:
                wf.v vVar = (wf.v) this.f5193y;
                String str2 = (String) this.f5194z;
                Enum[] enumArr = vVar.f14403a;
                wf.u uVar = new wf.u(str2, enumArr.length);
                for (Enum r02 : enumArr) {
                    uVar.j(r02.name(), false);
                }
                return uVar;
            default:
                uf.g gVar = (uf.g) this.f5193y;
                xf.c cVar = (xf.c) this.f5194z;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                xf.i iVar = cVar.f14726a;
                yf.n.k(gVar, cVar);
                int e10 = gVar.e();
                for (int i6 = 0; i6 < e10; i6++) {
                    List g10 = gVar.g(i6);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : g10) {
                        if (obj4 instanceof xf.s) {
                            arrayList2.add(obj4);
                        }
                    }
                    if (arrayList2.size() == 1) {
                        obj = arrayList2.get(0);
                    } else {
                        obj = null;
                    }
                    xf.s sVar2 = (xf.s) obj;
                    if (sVar2 != null && (names = sVar2.names()) != null) {
                        for (String str3 : names) {
                            if (kotlin.jvm.internal.k.a(gVar.getKind(), uf.i.f13135g)) {
                                str = "enum value";
                            } else {
                                str = "property";
                            }
                            if (!linkedHashMap.containsKey(str3)) {
                                linkedHashMap.put(str3, Integer.valueOf(i6));
                            } else {
                                String message = "The suggested name '" + str3 + "' for " + str + ' ' + gVar.f(i6) + " is already one of the names for " + str + ' ' + gVar.f(((Number) ie.w.u(str3, linkedHashMap)).intValue()) + " in " + gVar;
                                kotlin.jvm.internal.k.e(message, "message");
                                throw new IllegalArgumentException(message);
                            }
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return ie.s.f6847x;
                }
                return linkedHashMap;
        }
        return he.y.f6101a;
    }

    public /* synthetic */ j(l4.h hVar, l4.k kVar, n4.f fVar, j1.y yVar) {
        this.f5192x = 3;
        this.f5193y = kVar;
        this.f5194z = yVar;
    }

    public /* synthetic */ j(l4.k kVar, l4.h hVar, boolean z10) {
        this.f5192x = 1;
        this.f5193y = kVar;
        this.f5194z = hVar;
    }
}
