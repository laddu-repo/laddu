package nd;

import androidx.lifecycle.o0;
import com.playfy.tv.activities.MainActivity;
import com.playfy.tv.ui.fragments.PlaylistFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd.h0;
import kf.f1;
import od.i0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9705x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PlaylistFragment f9706y;

    public /* synthetic */ l(PlaylistFragment playlistFragment, int i6) {
        this.f9705x = i6;
        this.f9706y = playlistFragment;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        List list;
        List list2;
        jd.x xVar = null;
        switch (this.f9705x) {
            case 0:
                PlaylistFragment playlistFragment = this.f9706y;
                h0 item = (h0) obj;
                int i6 = PlaylistFragment.F0;
                kotlin.jvm.internal.k.e(item, "item");
                Object obj2 = playlistFragment.U().f10104k.f973e;
                Object obj3 = obj2;
                if (obj2 == o0.f968k) {
                    obj3 = null;
                }
                if (obj3 instanceof jd.x) {
                    xVar = (jd.x) obj3;
                }
                if (xVar != null && (list2 = (List) xVar.f7412a) != null) {
                    list = cf.m.t(list2, item);
                } else {
                    list = ie.r.f6846x;
                }
                List list3 = list;
                MainActivity.W((MainActivity) playlistFragment.E(), String.valueOf(list3.indexOf(item)), 0, list3, false, 2);
                break;
            case 1:
                PlaylistFragment playlistFragment2 = this.f9706y;
                String title = (String) obj;
                int i10 = PlaylistFragment.F0;
                kotlin.jvm.internal.k.e(title, "title");
                i0 U = playlistFragment2.U();
                U.getClass();
                f1 f1Var = U.f10102h;
                f1Var.getClass();
                f1Var.h(null, title);
                break;
            case 2:
                PlaylistFragment playlistFragment3 = this.f9706y;
                String str = (String) obj;
                int i11 = PlaylistFragment.F0;
                he.m mVar = playlistFragment3.C0;
                v vVar = (v) mVar.getValue();
                kotlin.jvm.internal.k.b(str);
                vVar.getClass();
                List<w> list4 = vVar.A.f13855f;
                kotlin.jvm.internal.k.d(list4, "getCurrentList(...)");
                ArrayList arrayList = new ArrayList(ie.l.x(list4, 10));
                for (w wVar : list4) {
                    boolean z10 = wVar.f9721b;
                    String title2 = wVar.f9720a;
                    if (z10 != kotlin.jvm.internal.k.a(title2, str)) {
                        boolean a10 = kotlin.jvm.internal.k.a(title2, str);
                        kotlin.jvm.internal.k.e(title2, "title");
                        wVar = new w(title2, a10);
                    }
                    arrayList.add(wVar);
                }
                vVar.i(arrayList);
                v vVar2 = (v) mVar.getValue();
                vVar2.getClass();
                List list5 = vVar2.A.f13855f;
                kotlin.jvm.internal.k.d(list5, "getCurrentList(...)");
                Iterator it = list5.iterator();
                int i12 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (!kotlin.jvm.internal.k.a(((w) it.next()).f9720a, str)) {
                            i12++;
                        }
                    } else {
                        i12 = -1;
                    }
                }
                if (i12 >= 0) {
                    playlistFragment3.N().f3303e.post(new a2.o0(i12, 3, playlistFragment3));
                }
                return he.y.f6101a;
            default:
                PlaylistFragment playlistFragment4 = this.f9706y;
                String selected = (String) obj;
                int i13 = PlaylistFragment.F0;
                kotlin.jvm.internal.k.e(selected, "selected");
                if (!kotlin.jvm.internal.k.a((String) playlistFragment4.U().f10102h.getValue(), selected)) {
                    i0 U2 = playlistFragment4.U();
                    U2.getClass();
                    f1 f1Var2 = U2.f10102h;
                    f1Var2.getClass();
                    f1Var2.h(null, selected);
                }
                return he.y.f6101a;
        }
        return he.y.f6101a;
    }
}
