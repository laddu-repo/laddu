package d;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kf.f1;
import kf.r0;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements e5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3445b;

    public /* synthetic */ i(Object obj, int i6) {
        this.f3444a = i6;
        this.f3445b = obj;
    }

    @Override // e5.d
    public final Bundle a() {
        he.i[] iVarArr;
        Bundle bundle;
        int i6 = this.f3444a;
        Object obj = this.f3445b;
        switch (i6) {
            case 0:
                return q.j((q) obj);
            case 1:
                i.j jVar = (i.j) obj;
                do {
                } while (i.j.B(jVar.z()));
                jVar.f6218y.f(androidx.lifecycle.w.ON_STOP);
                return new Bundle();
            case 2:
                return ((j1.p0) obj).Z();
            case 3:
                b4.h hVar = (b4.h) obj;
                for (Map.Entry entry : ie.w.D((LinkedHashMap) hVar.f1469x).entrySet()) {
                    hVar.m(((f1) ((r0) entry.getValue())).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : ie.w.D((LinkedHashMap) hVar.A).entrySet()) {
                    hVar.m(((e5.d) entry2.getValue()).a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) hVar.f1471z;
                if (linkedHashMap.isEmpty()) {
                    iVarArr = new he.i[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new he.i((String) entry3.getKey(), entry3.getValue()));
                    }
                    iVarArr = (he.i[]) arrayList.toArray(new he.i[0]);
                }
                return k6.e.b((he.i[]) Arrays.copyOf(iVarArr, iVarArr.length));
            case 4:
                l4.x xVar = (l4.x) obj;
                o4.h hVar2 = xVar.f8199b;
                LinkedHashMap linkedHashMap2 = hVar2.f9909l;
                ie.h hVar3 = hVar2.f9904f;
                LinkedHashMap linkedHashMap3 = hVar2.f9908k;
                ArrayList arrayList2 = new ArrayList();
                Bundle b10 = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
                for (Map.Entry entry4 : ie.w.D(hVar2.f9915r.f8157a).entrySet()) {
                    String str = (String) entry4.getKey();
                    Bundle h4 = ((l4.j0) entry4.getValue()).h();
                    if (h4 != null) {
                        arrayList2.add(str);
                        c9.a.m(b10, str, h4);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    bundle = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
                    c9.a.o(b10, "android-support-nav:controller:navigatorState:names", arrayList2);
                    c9.a.m(bundle, "android-support-nav:controller:navigatorState", b10);
                } else {
                    bundle = null;
                }
                if (!hVar3.isEmpty()) {
                    if (bundle == null) {
                        bundle = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    Iterator<E> it = hVar3.iterator();
                    while (it.hasNext()) {
                        l4.h entry5 = (l4.h) it.next();
                        kotlin.jvm.internal.k.e(entry5, "entry");
                        int i10 = entry5.f8141y.f8195y.f9924a;
                        String str2 = entry5.C;
                        o4.c cVar = entry5.E;
                        Bundle a10 = cVar.a();
                        Bundle b11 = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
                        cVar.f9883h.c(b11);
                        Bundle b12 = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
                        c9.a.n("nav-entry-state:id", str2, b12);
                        b12.putInt("nav-entry-state:destination-id", i10);
                        if (a10 == null) {
                            a10 = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
                        }
                        c9.a.m(b12, "nav-entry-state:args", a10);
                        c9.a.m(b12, "nav-entry-state:saved-state", b11);
                        arrayList3.add(b12);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList3);
                }
                if (!linkedHashMap3.isEmpty()) {
                    if (bundle == null) {
                        bundle = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap3.size()];
                    ArrayList arrayList4 = new ArrayList();
                    int i11 = 0;
                    for (Map.Entry entry6 : linkedHashMap3.entrySet()) {
                        int intValue = ((Number) entry6.getKey()).intValue();
                        String str3 = (String) entry6.getValue();
                        int i12 = i11 + 1;
                        iArr[i11] = intValue;
                        if (str3 == null) {
                            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        arrayList4.add(str3);
                        i11 = i12;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    c9.a.o(bundle, "android-support-nav:controller:backStackIds", arrayList4);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Map.Entry entry7 : linkedHashMap2.entrySet()) {
                        String str4 = (String) entry7.getKey();
                        ie.h hVar4 = (ie.h) entry7.getValue();
                        arrayList5.add(str4);
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        Iterator it2 = hVar4.iterator();
                        while (it2.hasNext()) {
                            s8.n nVar = ((l4.i) it2.next()).f8143a;
                            nVar.getClass();
                            Bundle b13 = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
                            c9.a.n("nav-entry-state:id", (String) nVar.f12260b, b13);
                            b13.putInt("nav-entry-state:destination-id", nVar.f12259a);
                            Bundle bundle2 = (Bundle) nVar.f12261c;
                            if (bundle2 == null) {
                                bundle2 = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
                            }
                            c9.a.m(b13, "nav-entry-state:args", bundle2);
                            c9.a.m(b13, "nav-entry-state:saved-state", (Bundle) nVar.f12262d);
                            arrayList6.add(b13);
                        }
                        String key = "android-support-nav:controller:backStackStates:" + str4;
                        kotlin.jvm.internal.k.e(key, "key");
                        bundle.putParcelableArrayList(key, arrayList6);
                    }
                    c9.a.o(bundle, "android-support-nav:controller:backStackStates", arrayList5);
                }
                if (xVar.f8202e) {
                    if (bundle == null) {
                        bundle = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", xVar.f8202e);
                }
                if (bundle == null) {
                    Bundle EMPTY = Bundle.EMPTY;
                    kotlin.jvm.internal.k.d(EMPTY, "EMPTY");
                    return EMPTY;
                }
                return bundle;
            default:
                int i13 = ((NavHostFragment) obj).B0;
                if (i13 != 0) {
                    return k6.e.b(new he.i("android-support-nav:fragment:graphId", Integer.valueOf(i13)));
                }
                Bundle bundle3 = Bundle.EMPTY;
                kotlin.jvm.internal.k.b(bundle3);
                return bundle3;
        }
    }
}
