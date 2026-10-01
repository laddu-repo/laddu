package fd;

import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import com.playfy.tv.activities.SponsorActivity;
import com.playfy.tv.db.MyDB;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements ve.p {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5190x;

    public /* synthetic */ h0(int i6) {
        this.f5190x = i6;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        le.b bVar;
        switch (this.f5190x) {
            case 0:
                View view = (View) obj;
                l0.c insets = (l0.c) obj2;
                i0 i0Var = SponsorActivity.O;
                kotlin.jvm.internal.k.e(view, "view");
                kotlin.jvm.internal.k.e(insets, "insets");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(insets.f8062a, insets.f8063b, insets.f8064c, insets.f8065d);
                    view.setLayoutParams(marginLayoutParams);
                    return he.y.f6101a;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            case 1:
                tg.a single = (tg.a) obj;
                pg.a it = (pg.a) obj2;
                kotlin.jvm.internal.k.e(single, "$this$single");
                kotlin.jvm.internal.k.e(it, "it");
                return (MyDB) x4.c.c(android.support.v4.media.session.b.b(single), MyDB.class, "UserDatabase").b();
            case 2:
                tg.a factory = (tg.a) obj;
                pg.a it2 = (pg.a) obj2;
                kotlin.jvm.internal.k.e(factory, "$this$factory");
                kotlin.jvm.internal.k.e(it2, "it");
                return ((MyDB) factory.a(kotlin.jvm.internal.x.a(MyDB.class), null)).t();
            case 3:
                tg.a factory2 = (tg.a) obj;
                pg.a it3 = (pg.a) obj2;
                kotlin.jvm.internal.k.e(factory2, "$this$factory");
                kotlin.jvm.internal.k.e(it3, "it");
                return ((MyDB) factory2.a(kotlin.jvm.internal.x.a(MyDB.class), null)).u();
            case 4:
                tg.a factory3 = (tg.a) obj;
                pg.a it4 = (pg.a) obj2;
                kotlin.jvm.internal.k.e(factory3, "$this$factory");
                kotlin.jvm.internal.k.e(it4, "it");
                return ((MyDB) factory3.a(kotlin.jvm.internal.x.a(MyDB.class), null)).v();
            case 5:
                pg.a it5 = (pg.a) obj2;
                kotlin.jvm.internal.k.e((tg.a) obj, "$this$single");
                kotlin.jvm.internal.k.e(it5, "it");
                xf.b from = xf.c.f14725d;
                kotlin.jvm.internal.k.e(from, "from");
                xf.a aVar = from.f14726a.f14738d;
                o5.e0 module = from.f14727b;
                xf.i iVar = new xf.i(true, true, true, aVar);
                kotlin.jvm.internal.k.e(module, "module");
                return new xf.c(iVar, module);
            case 6:
                tg.a single2 = (tg.a) obj;
                pg.a it6 = (pg.a) obj2;
                kotlin.jvm.internal.k.e(single2, "$this$single");
                kotlin.jvm.internal.k.e(it6, "it");
                return new id.h(android.support.v4.media.session.b.b(single2), (xf.c) single2.a(kotlin.jvm.internal.x.a(xf.c.class), null), (SharedPreferences) single2.a(kotlin.jvm.internal.x.a(SharedPreferences.class), null));
            case 7:
                tg.a single3 = (tg.a) obj;
                pg.a it7 = (pg.a) obj2;
                kotlin.jvm.internal.k.e(single3, "$this$single");
                kotlin.jvm.internal.k.e(it7, "it");
                return android.support.v4.media.session.b.b(single3).getSharedPreferences("user_pref", 0);
            case 8:
                String acc = (String) obj;
                le.f element = (le.f) obj2;
                kotlin.jvm.internal.k.e(acc, "acc");
                kotlin.jvm.internal.k.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                le.h acc2 = (le.h) obj;
                le.f element2 = (le.f) obj2;
                kotlin.jvm.internal.k.e(acc2, "acc");
                kotlin.jvm.internal.k.e(element2, "element");
                le.h minusKey = acc2.minusKey(element2.getKey());
                le.i iVar2 = le.i.f8353x;
                if (minusKey != iVar2) {
                    le.d dVar = le.d.f8352x;
                    le.e eVar = (le.e) minusKey.get(dVar);
                    if (eVar == null) {
                        bVar = new le.b(element2, minusKey);
                    } else {
                        le.h minusKey2 = minusKey.minusKey(dVar);
                        if (minusKey2 == iVar2) {
                            return new le.b(eVar, element2);
                        }
                        bVar = new le.b(eVar, new le.b(element2, minusKey2));
                    }
                    return bVar;
                }
                return element2;
        }
    }
}
