package j1;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f6937a;

    public n0(p0 p0Var) {
        this.f6937a = p0Var;
    }

    @Override // j1.l0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean V;
        p0 p0Var = this.f6937a;
        ArrayList arrayList5 = p0Var.f6955n;
        if (p0.L(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + p0Var.f6943a);
        }
        int i6 = 0;
        if (p0Var.f6946d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            V = false;
        } else {
            ArrayList arrayList6 = p0Var.f6946d;
            a aVar = (a) arrayList6.get(arrayList6.size() - 1);
            p0Var.f6950h = aVar;
            ArrayList arrayList7 = aVar.f6855a;
            int size = arrayList7.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList7.get(i10);
                i10++;
                y yVar = ((w0) obj).f7006b;
                if (yVar != null) {
                    yVar.K = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            V = p0Var.V(arrayList3, arrayList4, null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            boolean booleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList3.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList3.get(i11);
                i11++;
                linkedHashSet.addAll(p0.G((a) obj2));
            }
            int size3 = arrayList5.size();
            while (i6 < size3) {
                Object obj3 = arrayList5.get(i6);
                i6++;
                n4.h hVar = (n4.h) obj3;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    hVar.b((y) it.next(), booleanValue);
                }
            }
        }
        return V;
    }
}
