package cf;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2064a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2065b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2066c;

    public /* synthetic */ i(int i6, Object obj, Object obj2) {
        this.f2064a = i6;
        this.f2065b = obj;
        this.f2066c = obj2;
    }

    @Override // cf.j
    public final Iterator iterator() {
        switch (this.f2064a) {
            case 0:
                return new h(this);
            case 1:
                j jVar = (j) this.f2065b;
                ArrayList arrayList = new ArrayList();
                Iterator it = jVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                Comparator comparator = (Comparator) this.f2066c;
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList, comparator);
                }
                return arrayList.iterator();
            case 2:
                return new df.b(this);
            default:
                return new f(this);
        }
    }

    public i(File start, se.g gVar) {
        this.f2064a = 3;
        kotlin.jvm.internal.k.e(start, "start");
        this.f2065b = start;
        this.f2066c = gVar;
    }

    public i(CharSequence input, ve.p pVar) {
        this.f2064a = 2;
        kotlin.jvm.internal.k.e(input, "input");
        this.f2065b = input;
        this.f2066c = pVar;
    }
}
