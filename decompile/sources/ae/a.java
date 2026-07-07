package ae;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f697a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f698b;

    /* renamed from: c, reason: collision with root package name */
    public final sd.c f699c;

    /* renamed from: d, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.c f700d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f701e;

    /* renamed from: f, reason: collision with root package name */
    public Object f702f;

    public /* synthetic */ a(Context context, sd.c cVar, Object obj, com.unity3d.scar.adapter.common.c cVar2, int i6) {
        this.f697a = i6;
        this.f698b = context;
        this.f699c = cVar;
        this.f701e = obj;
        this.f700d = cVar2;
    }

    public final void a(sd.b bVar) {
        switch (this.f697a) {
            case 0:
                AdRequest b10 = ((zd.a) this.f701e).b(this.f699c.f12290d);
                if (bVar != null) {
                    ((a8.i) this.f702f).getClass();
                }
                c(b10);
                return;
            default:
                AdRequest b11 = ((vd.a) this.f701e).b(this.f699c.f12290d);
                if (bVar != null) {
                    ((jb.b) this.f702f).getClass();
                }
                c(b11);
                return;
        }
    }

    public abstract void c(AdRequest adRequest);
}
