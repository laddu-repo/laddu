package v6;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.lifecycle.f0;
import androidx.lifecycle.y;
import ie.w;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Headers;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13362a;

    /* renamed from: b, reason: collision with root package name */
    public c f13363b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13364c;

    /* renamed from: d, reason: collision with root package name */
    public x6.a f13365d;

    /* renamed from: e, reason: collision with root package name */
    public j f13366e;

    /* renamed from: f, reason: collision with root package name */
    public w6.d f13367f;

    /* renamed from: g, reason: collision with root package name */
    public final List f13368g;

    /* renamed from: h, reason: collision with root package name */
    public z6.d f13369h;

    /* renamed from: i, reason: collision with root package name */
    public final Headers.Builder f13370i;
    public final LinkedHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f13371k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f13372l;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f13373m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f13374n;

    /* renamed from: o, reason: collision with root package name */
    public final p f13375o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f13376p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f13377q;

    /* renamed from: r, reason: collision with root package name */
    public w6.i f13378r;
    public y s;

    /* renamed from: t, reason: collision with root package name */
    public w6.i f13379t;

    /* renamed from: u, reason: collision with root package name */
    public w6.g f13380u;

    public i(Context context) {
        this.f13362a = context;
        this.f13363b = a7.d.f593a;
        this.f13364c = null;
        this.f13365d = null;
        this.f13366e = null;
        this.f13367f = null;
        this.f13368g = ie.r.f6846x;
        this.f13369h = null;
        this.f13370i = null;
        this.j = null;
        this.f13371k = true;
        this.f13372l = null;
        this.f13373m = null;
        this.f13374n = true;
        this.f13375o = null;
        this.f13376p = null;
        this.f13377q = null;
        this.f13378r = null;
        this.s = null;
        this.f13379t = null;
        this.f13380u = null;
    }

    public final k a() {
        Headers headers;
        t tVar;
        boolean z10;
        boolean z11;
        gf.y yVar;
        Object obj;
        q qVar;
        w6.f fVar;
        KeyEvent.Callback callback;
        int i6;
        w6.i iVar;
        Object obj2;
        Object obj3 = this.f13364c;
        if (obj3 == null) {
            obj3 = m.f13405y;
        }
        Object obj4 = obj3;
        x6.a aVar = this.f13365d;
        j jVar = this.f13366e;
        c cVar = this.f13363b;
        Bitmap.Config config = cVar.f13349g;
        w6.d dVar = this.f13367f;
        if (dVar == null) {
            dVar = cVar.f13348f;
        }
        w6.d dVar2 = dVar;
        z6.d dVar3 = this.f13369h;
        if (dVar3 == null) {
            dVar3 = cVar.f13347e;
        }
        z6.d dVar4 = dVar3;
        Headers.Builder builder = this.f13370i;
        if (builder != null) {
            headers = builder.build();
        } else {
            headers = null;
        }
        if (headers == null) {
            headers = a7.f.f597c;
        } else {
            Bitmap.Config[] configArr = a7.f.f595a;
        }
        Headers headers2 = headers;
        LinkedHashMap linkedHashMap = this.j;
        if (linkedHashMap != null) {
            tVar = new t(a8.c.q(linkedHashMap));
        } else {
            tVar = null;
        }
        if (tVar == null) {
            tVar = t.f13431b;
        }
        t tVar2 = tVar;
        Boolean bool = this.f13372l;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            this.f13363b.getClass();
            z10 = true;
        }
        Boolean bool2 = this.f13373m;
        if (bool2 != null) {
            z11 = bool2.booleanValue();
        } else {
            this.f13363b.getClass();
            z11 = false;
        }
        c cVar2 = this.f13363b;
        b bVar = cVar2.f13350h;
        b bVar2 = cVar2.f13351i;
        b bVar3 = cVar2.j;
        gf.y yVar2 = cVar2.f13343a;
        gf.y yVar3 = cVar2.f13344b;
        gf.y yVar4 = cVar2.f13345c;
        gf.y yVar5 = cVar2.f13346d;
        y yVar6 = this.s;
        Context context = this.f13362a;
        if (yVar6 == null) {
            x6.a aVar2 = this.f13365d;
            yVar = yVar5;
            if (aVar2 instanceof x6.a) {
                obj2 = aVar2.f14692y.getContext();
            } else {
                obj2 = context;
            }
            while (true) {
                if (obj2 instanceof f0) {
                    yVar6 = ((f0) obj2).getLifecycle();
                    break;
                }
                if (!(obj2 instanceof ContextWrapper)) {
                    yVar6 = null;
                    break;
                }
                obj2 = ((ContextWrapper) obj2).getBaseContext();
            }
            if (yVar6 == null) {
                yVar6 = h.f13360b;
            }
        } else {
            yVar = yVar5;
        }
        y yVar7 = yVar6;
        w6.i iVar2 = this.f13378r;
        if (iVar2 == null && (iVar2 = this.f13379t) == null) {
            x6.a aVar3 = this.f13365d;
            if (aVar3 instanceof x6.a) {
                ImageView imageView = aVar3.f14692y;
                if (imageView != null) {
                    ImageView.ScaleType scaleType = imageView.getScaleType();
                    obj = obj4;
                    if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                        iVar = new w6.e(w6.h.f14134c);
                        iVar2 = iVar;
                    }
                } else {
                    obj = obj4;
                }
                iVar = new w6.f(imageView);
                iVar2 = iVar;
            } else {
                obj = obj4;
                iVar2 = new w6.c(context);
            }
        } else {
            obj = obj4;
        }
        w6.i iVar3 = iVar2;
        w6.g gVar = this.f13380u;
        if (gVar == null) {
            w6.i iVar4 = this.f13378r;
            if (iVar4 instanceof w6.f) {
                fVar = (w6.f) iVar4;
            } else {
                fVar = null;
            }
            if (fVar == null || (callback = fVar.f14130a) == null) {
                x6.a aVar4 = this.f13365d;
                if (!(aVar4 instanceof x6.a)) {
                    aVar4 = null;
                }
                if (aVar4 != null) {
                    callback = aVar4.f14692y;
                } else {
                    callback = null;
                }
            }
            boolean z12 = callback instanceof ImageView;
            w6.g gVar2 = w6.g.f14132y;
            if (z12) {
                Bitmap.Config[] configArr2 = a7.f.f595a;
                ImageView.ScaleType scaleType2 = ((ImageView) callback).getScaleType();
                if (scaleType2 == null) {
                    i6 = -1;
                } else {
                    i6 = a7.e.f594a[scaleType2.ordinal()];
                }
                if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4) {
                    gVar = w6.g.f14131x;
                }
            }
            gVar = gVar2;
        }
        w6.g gVar3 = gVar;
        p pVar = this.f13375o;
        if (pVar != null) {
            qVar = new q(a8.c.q(pVar.f13421a));
        } else {
            qVar = null;
        }
        if (qVar == null) {
            qVar = q.f13422y;
        }
        return new k(context, obj, aVar, jVar, config, dVar2, this.f13368g, dVar4, headers2, tVar2, this.f13371k, z10, z11, this.f13374n, bVar, bVar2, bVar3, yVar2, yVar3, yVar4, yVar, yVar7, iVar3, gVar3, qVar, this.f13376p, this.f13377q, new d(this.f13378r, this.f13369h, this.f13367f, this.f13372l, this.f13373m), this.f13363b);
    }

    public final void b(boolean z10) {
        int i6;
        z6.d dVar;
        if (z10) {
            i6 = 100;
        } else {
            i6 = 0;
        }
        if (i6 > 0) {
            dVar = new z6.a(i6);
        } else {
            dVar = z6.d.f15224a;
        }
        this.f13369h = dVar;
    }

    public final void c(ImageView imageView) {
        this.f13365d = new x6.a(imageView);
        this.s = null;
        this.f13379t = null;
        this.f13380u = null;
    }

    public i(k kVar, Context context) {
        this.f13362a = context;
        this.f13363b = kVar.C;
        this.f13364c = kVar.f13382b;
        this.f13365d = kVar.f13383c;
        this.f13366e = kVar.f13384d;
        d dVar = kVar.B;
        this.f13367f = dVar.f13354c;
        this.f13368g = kVar.f13387g;
        this.f13369h = dVar.f13353b;
        this.f13370i = kVar.f13389i.newBuilder();
        this.j = w.E(kVar.j.f13432a);
        this.f13371k = kVar.f13390k;
        this.f13372l = dVar.f13355d;
        this.f13373m = dVar.f13356e;
        this.f13374n = kVar.f13393n;
        this.f13375o = new p(kVar.f13403y);
        this.f13376p = kVar.f13404z;
        this.f13377q = kVar.A;
        this.f13378r = dVar.f13352a;
        if (kVar.f13381a == context) {
            this.s = kVar.f13400v;
            this.f13379t = kVar.f13401w;
            this.f13380u = kVar.f13402x;
        } else {
            this.s = null;
            this.f13379t = null;
            this.f13380u = null;
        }
    }
}
