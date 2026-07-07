package h2;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import r1.x0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: n, reason: collision with root package name */
    public static final o f5937n;

    /* renamed from: d, reason: collision with root package name */
    public final List f5938d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5939e;

    /* renamed from: f, reason: collision with root package name */
    public final List f5940f;

    /* renamed from: g, reason: collision with root package name */
    public final List f5941g;

    /* renamed from: h, reason: collision with root package name */
    public final List f5942h;

    /* renamed from: i, reason: collision with root package name */
    public final List f5943i;
    public final r1.q j;

    /* renamed from: k, reason: collision with root package name */
    public final List f5944k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f5945l;

    /* renamed from: m, reason: collision with root package name */
    public final List f5946m;

    static {
        List list = Collections.EMPTY_LIST;
        f5937n = new o(HttpUrl.FRAGMENT_ENCODE_SET, list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public o(String str, List list, List list2, List list3, List list4, List list5, List list6, r1.q qVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list2.size(); i6++) {
            Uri uri = ((n) list2.get(i6)).f5931a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f5938d = Collections.unmodifiableList(arrayList);
        this.f5939e = Collections.unmodifiableList(list2);
        this.f5940f = Collections.unmodifiableList(list3);
        this.f5941g = Collections.unmodifiableList(list4);
        this.f5942h = Collections.unmodifiableList(list5);
        this.f5943i = Collections.unmodifiableList(list6);
        this.j = qVar;
        if (list7 != null) {
            list9 = Collections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f5944k = list9;
        this.f5945l = Collections.unmodifiableMap(map);
        this.f5946m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i6 = 0; i6 < list.size(); i6++) {
            Uri uri = ((m) list.get(i6)).f5928a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i6, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < list2.size()) {
                    x0 x0Var = (x0) list2.get(i11);
                    if (x0Var.f11742y == i6 && x0Var.f11743z == i10) {
                        arrayList.add(obj);
                        break;
                    }
                    i11++;
                }
            }
        }
        return arrayList;
    }

    @Override // l2.a
    public final Object a(List list) {
        ArrayList c10 = c(0, this.f5939e, list);
        List list2 = Collections.EMPTY_LIST;
        return new o(this.f5947a, this.f5948b, c10, list2, c(1, this.f5941g, list), c(2, this.f5942h, list), list2, this.j, this.f5944k, this.f5949c, this.f5945l, this.f5946m);
    }
}
