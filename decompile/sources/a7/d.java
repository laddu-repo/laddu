package a7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import gf.o0;
import mf.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final v6.c f593a;

    static {
        of.e eVar = o0.f5693a;
        hf.d dVar = o.f8875a.A;
        of.d dVar2 = o0.f5694b;
        Bitmap.Config config = f.f596b;
        v6.b bVar = v6.b.ENABLED;
        f593a = new v6.c(dVar, dVar2, dVar2, dVar2, z6.d.f15224a, w6.d.f14127y, config, bVar, bVar, bVar);
    }

    public static final boolean a(v6.k kVar) {
        ImageView imageView;
        w6.d dVar = kVar.f13386f;
        x6.a aVar = kVar.f13383c;
        w6.i iVar = kVar.f13401w;
        int ordinal = dVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if ((kVar.B.f13352a != null || !(iVar instanceof w6.c)) && (!(aVar instanceof x6.a) || !(iVar instanceof w6.f) || (imageView = aVar.f14692y) == null || imageView != ((w6.f) iVar).f14130a)) {
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            return true;
        }
        return false;
    }

    public static final Drawable b(v6.k kVar, Integer num) {
        if (num == null || num.intValue() == 0) {
            return null;
        }
        Context context = kVar.f13381a;
        int intValue = num.intValue();
        Drawable f3 = c9.a.f(context, intValue);
        if (f3 != null) {
            return f3;
        }
        throw new IllegalStateException(h8.c.i(intValue, "Invalid resource ID: ").toString());
    }
}
