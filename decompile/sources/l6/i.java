package l6;

import android.graphics.Bitmap;
import android.util.SparseArray;
import df.u;
import gf.f0;
import gf.o0;
import he.y;
import ie.w;
import java.util.ArrayList;
import kd.p0;
import od.c0;
import od.z;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends ne.j implements p {
    public Object A;
    public /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f8240x = 1;

    /* renamed from: y, reason: collision with root package name */
    public int f8241y;

    /* renamed from: z, reason: collision with root package name */
    public Object f8242z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c0 c0Var, p0 p0Var, le.c cVar) {
        super(2, cVar);
        this.C = c0Var;
        this.D = p0Var;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        switch (this.f8240x) {
            case 0:
                return new i((v6.k) this.f8242z, (k) this.A, (w6.h) this.B, (c) this.C, (Bitmap) this.D, cVar);
            default:
                i iVar = new i((c0) this.C, (p0) this.D, cVar);
                iVar.B = obj;
                return iVar;
        }
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        gf.c0 c0Var = (gf.c0) obj;
        le.c cVar = (le.c) obj2;
        switch (this.f8240x) {
            case 0:
                return ((i) create(c0Var, cVar)).invokeSuspend(y.f6101a);
            default:
                return ((i) create(c0Var, cVar)).invokeSuspend(y.f6101a);
        }
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        String h4;
        Object a02;
        dd.d dVar;
        String str;
        SparseArray sparseArray;
        dd.e eVar;
        String str2;
        int i6 = this.f8240x;
        me.a aVar = me.a.f8833x;
        Object obj2 = this.D;
        Object obj3 = this.C;
        int i10 = 1;
        int i11 = 0;
        switch (i6) {
            case 0:
                int i12 = this.f8241y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        he.a.f(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                he.a.f(obj);
                v6.k kVar = (v6.k) this.f8242z;
                ArrayList arrayList = ((k) this.A).f8253i;
                w6.h hVar = (w6.h) this.B;
                c cVar = (c) obj3;
                if (((Bitmap) obj2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q6.j jVar = new q6.j(kVar, arrayList, 0, kVar, hVar, cVar, z10);
                this.f8241y = 1;
                Object b10 = jVar.b(kVar, this);
                if (b10 == aVar) {
                    return aVar;
                }
                return b10;
            default:
                c0 c0Var = (c0) obj3;
                p0 p0Var = (p0) obj2;
                gf.c0 c0Var2 = (gf.c0) this.B;
                int i13 = this.f8241y;
                le.c cVar2 = null;
                try {
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            dVar = (dd.d) this.A;
                            he.a.f(obj);
                            if (dVar.f4095b == 1 && (sparseArray = dVar.f4094a) != null) {
                                eVar = (dd.e) sparseArray.get(91);
                                if (eVar == null && (eVar = (dd.e) sparseArray.get(22)) == null) {
                                    eVar = (dd.e) sparseArray.get(18);
                                }
                                if (eVar != null && (str2 = eVar.f4114b) != null) {
                                    return p0.a(p0Var, str2, 0, w.z(new he.i("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 17_5_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.1 Mobile/15E148 Safari/605.1.15/Clipbox+/2.2.8"), new he.i("Referer", "https://www.youtube.com/"), new he.i("Origin", "https://www.youtube.com"), new he.i("Connection", "keep-alive"), new he.i("Accept", "*/*"), new he.i("Accept-Encoding", "identity")), 25);
                                }
                            }
                            return p0Var;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = (String) this.f8242z;
                    he.a.f(obj);
                    h4 = str3;
                    a02 = obj;
                } else {
                    he.a.f(obj);
                    h4 = c0.h(c0Var, p0Var.f7891b);
                    if (h4 != null) {
                        w7.b bVar = new w7.b(f0.g(c0Var2, o0.f5694b.plus(f0.e()), new z("https://www.youtube.com/watch?v=".concat(h4), new cf.p(29), cVar2, i10), 2));
                        this.B = null;
                        this.f8242z = h4;
                        this.f8241y = 1;
                        a02 = bVar.a0(this);
                        if (a02 == aVar) {
                            return aVar;
                        }
                    }
                    return p0Var;
                }
                Response response = (Response) a02;
                if (response.isSuccessful()) {
                    ResponseBody body = response.body();
                    if (body != null) {
                        str = body.string();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    c6.h a10 = df.k.a(new df.k("\"hlsManifestUrl\"\\s*:\\s*\"([^\"]+)\""), str);
                    if (a10 != null) {
                        return p0.a(p0Var, u.F((String) ((df.i) a10.n()).get(1), "\\u0026", "&"), 0, c0.f(c0Var, response), 25);
                    }
                }
                dVar = new dd.d(c0Var.f10062b);
                this.B = null;
                this.f8242z = null;
                this.A = dVar;
                this.f8241y = 2;
                Object J = f0.J(o0.f5694b, new dd.c(dVar, h4, cVar2, i11), this);
                if (J != aVar) {
                    J = y.f6101a;
                }
                if (J == aVar) {
                    return aVar;
                }
                if (dVar.f4095b == 1) {
                    eVar = (dd.e) sparseArray.get(91);
                    if (eVar == null) {
                        eVar = (dd.e) sparseArray.get(18);
                    }
                    if (eVar != null) {
                        return p0.a(p0Var, str2, 0, w.z(new he.i("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 17_5_1 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.1 Mobile/15E148 Safari/605.1.15/Clipbox+/2.2.8"), new he.i("Referer", "https://www.youtube.com/"), new he.i("Origin", "https://www.youtube.com"), new he.i("Connection", "keep-alive"), new he.i("Accept", "*/*"), new he.i("Accept-Encoding", "identity")), 25);
                    }
                }
                return p0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v6.k kVar, k kVar2, w6.h hVar, c cVar, Bitmap bitmap, le.c cVar2) {
        super(2, cVar2);
        this.f8242z = kVar;
        this.A = kVar2;
        this.B = hVar;
        this.C = cVar;
        this.D = bitmap;
    }
}
