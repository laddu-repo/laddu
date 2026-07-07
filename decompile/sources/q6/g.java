package q6;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import gf.c0;
import gf.f0;
import he.y;
import java.util.List;
import v6.k;
import v6.o;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends ne.j implements p {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ h D;
    public final /* synthetic */ a E;
    public final /* synthetic */ o F;
    public final /* synthetic */ List G;
    public final /* synthetic */ l6.c H;
    public final /* synthetic */ k I;

    /* renamed from: x, reason: collision with root package name */
    public List f11117x;

    /* renamed from: y, reason: collision with root package name */
    public o f11118y;

    /* renamed from: z, reason: collision with root package name */
    public int f11119z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, a aVar, o oVar, List list, l6.c cVar, k kVar, le.c cVar2) {
        super(2, cVar2);
        this.D = hVar;
        this.E = aVar;
        this.F = oVar;
        this.G = list;
        this.H = cVar;
        this.I = kVar;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        g gVar = new g(this.D, this.E, this.F, this.G, this.H, this.I, cVar);
        gVar.C = obj;
        return gVar;
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((c0) obj, (le.c) obj2)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        c0 c0Var;
        o oVar;
        Bitmap f3;
        List list;
        int size;
        int i6;
        int i10 = this.B;
        l6.c cVar = this.H;
        a aVar = this.E;
        if (i10 != 0) {
            if (i10 == 1) {
                size = this.A;
                int i11 = this.f11119z;
                oVar = this.f11118y;
                list = this.f11117x;
                c0Var = (c0) this.C;
                he.a.f(obj);
                f3 = (Bitmap) obj;
                f0.l(c0Var.getCoroutineContext());
                i6 = i11 + 1;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            he.a.f(obj);
            c0Var = (c0) this.C;
            Drawable drawable = aVar.f11098a;
            boolean z10 = drawable instanceof BitmapDrawable;
            oVar = this.F;
            if (z10) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (ie.i.Z(a7.f.f595a, config)) {
                    f3 = bitmap;
                    cVar.getClass();
                    list = this.G;
                    size = list.size();
                    i6 = 0;
                }
            }
            f3 = a8.g.f(drawable, oVar.f13408b, oVar.f13410d, oVar.f13411e, oVar.f13412f);
            cVar.getClass();
            list = this.G;
            size = list.size();
            i6 = 0;
        }
        if (i6 >= size) {
            cVar.getClass();
            return new a(new BitmapDrawable(this.I.f13381a.getResources(), f3), aVar.f11099b, aVar.f11100c, aVar.f11101d);
        }
        if (list.get(i6) == null) {
            w6.h hVar = oVar.f13410d;
            this.C = c0Var;
            this.f11117x = list;
            this.f11118y = oVar;
            this.f11119z = i6;
            this.A = size;
            this.B = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
