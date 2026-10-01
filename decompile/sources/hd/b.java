package hd;

import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import b2.j;
import cf.p;
import com.google.android.material.divider.MaterialDivider;
import com.playfy.tv.databinding.FragmentRecyclerBinding;
import com.playfy.tv.ui.fragments.PlaylistFragment;
import he.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import l4.a0;
import l4.j0;
import l4.u;
import l4.v;
import l4.x;
import l4.z;
import nd.w;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6048x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f6049y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f6050z;

    public /* synthetic */ b(int i6, Object obj, Object obj2) {
        this.f6048x = i6;
        this.f6049y = obj;
        this.f6050z = obj2;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        v vVar;
        u c10;
        int i6;
        int i10;
        int i11;
        int i12 = this.f6048x;
        y yVar = y.f6101a;
        boolean z10 = true;
        int i13 = 0;
        Object obj2 = this.f6050z;
        Object obj3 = this.f6049y;
        switch (i12) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                g5.a _connection = (g5.a) obj;
                k.e(_connection, "_connection");
                d dVar = ((e) obj3).f6056d;
                g5.c d02 = _connection.d0("UPDATE OR REPLACE `favorites` SET `id` = ?,`title` = ?,`image` = ?,`formats` = ? WHERE `id` = ?");
                try {
                    int size = arrayList.size();
                    while (i13 < size) {
                        Object obj4 = arrayList.get(i13);
                        i13++;
                        if (obj4 != null) {
                            dVar.a(d02, obj4);
                            d02.X();
                            d02.reset();
                            e9.f.f(_connection);
                        }
                    }
                    c9.a.c(d02, null);
                    return yVar;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        c9.a.c(d02, th);
                        throw th2;
                    }
                }
            case 1:
                u uVar = (u) obj3;
                o4.h hVar = ((x) obj2).f8199b;
                a0 navOptions = (a0) obj;
                k.e(navOptions, "$this$navOptions");
                j jVar = navOptions.f8104a;
                jVar.f1380a = 0;
                jVar.f1381b = 0;
                if (uVar instanceof v) {
                    int i14 = u.C;
                    Iterator it = cf.l.M(new p(18), uVar).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            u uVar2 = (u) it.next();
                            u f3 = hVar.f();
                            if (f3 != null) {
                                vVar = f3.f8196z;
                            } else {
                                vVar = null;
                            }
                            if (k.a(uVar2, vVar)) {
                            }
                        } else {
                            int i15 = v.E;
                            navOptions.f8107d = ((u) cf.l.O(cf.l.M(new p(19), hVar.g()))).f8195y.f9924a;
                            navOptions.f8108e = true;
                        }
                    }
                }
                return yVar;
            case 2:
                j0 j0Var = (j0) obj3;
                z zVar = (z) obj2;
                l4.h backStackEntry = (l4.h) obj;
                k.e(backStackEntry, "backStackEntry");
                o4.c cVar = backStackEntry.E;
                u uVar3 = backStackEntry.f8141y;
                if (uVar3 == null) {
                    uVar3 = null;
                }
                if (uVar3 == null || (c10 = j0Var.c(uVar3, cVar.a(), zVar)) == null) {
                    return null;
                }
                if (c10.equals(uVar3)) {
                    return backStackEntry;
                }
                return j0Var.b().b(c10, c10.a(cVar.a()));
            default:
                FragmentRecyclerBinding fragmentRecyclerBinding = (FragmentRecyclerBinding) obj3;
                PlaylistFragment playlistFragment = (PlaylistFragment) obj2;
                List<String> list = (List) obj;
                int i16 = PlaylistFragment.F0;
                if (list.size() <= 2) {
                    z10 = false;
                }
                LinearLayout linearLayout = fragmentRecyclerBinding.f3304f;
                if (z10) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                linearLayout.setVisibility(i6);
                ImageButton imageButton = fragmentRecyclerBinding.f3300b;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageButton.setVisibility(i10);
                RecyclerView recyclerView = fragmentRecyclerBinding.f3303e;
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                recyclerView.setVisibility(i11);
                MaterialDivider materialDivider = fragmentRecyclerBinding.f3305g;
                if (!z10) {
                    i13 = 8;
                }
                materialDivider.setVisibility(i13);
                if (z10) {
                    nd.v vVar2 = (nd.v) playlistFragment.C0.getValue();
                    String selected = (String) playlistFragment.T().f10102h.getValue();
                    vVar2.getClass();
                    k.e(selected, "selected");
                    ArrayList arrayList2 = new ArrayList(ie.l.x(list, 10));
                    for (String str : list) {
                        arrayList2.add(new w(str, k.a(str, selected)));
                    }
                    vVar2.i(arrayList2);
                }
                return yVar;
        }
    }
}
