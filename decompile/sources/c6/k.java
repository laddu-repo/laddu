package c6;

import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f2204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o6.a f2206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s0.c f2207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2208e;

    public k(Class cls, Class cls2, Class cls3, List list, o6.a aVar, hd.a aVar2) {
        this.f2204a = cls;
        this.f2205b = list;
        this.f2206c = aVar;
        this.f2207d = aVar2;
        this.f2208e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final b0 a(int i, int i10, a6.i iVar, i iVar2, com.bumptech.glide.load.data.f fVar) {
        b0 b0VarB;
        a6.m mVar;
        int iG;
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        Object eVar;
        s0.c cVar = this.f2207d;
        List list = (List) cVar.k();
        v6.f.c(list, "Argument must not be null");
        try {
            b0 b0VarB2 = b(fVar, i, i10, iVar, list);
            cVar.e(list);
            j jVar = (j) iVar2.f2195x;
            int i11 = iVar2.f2194w;
            h hVar = jVar.f2199v;
            Class<?> cls = b0VarB2.get().getClass();
            a6.l lVarB = null;
            if (i11 != 4) {
                a6.m mVarE = hVar.e(cls);
                mVar = mVarE;
                b0VarB = mVarE.b(jVar.C, b0VarB2, jVar.G, jVar.H);
            } else {
                b0VarB = b0VarB2;
                mVar = null;
            }
            if (!b0VarB2.equals(b0VarB)) {
                b0VarB2.e();
            }
            if (hVar.f2179c.b().f2369d.b(b0VarB.d()) != null) {
                lVarB = hVar.f2179c.b().f2369d.b(b0VarB.d());
                if (lVarB == null) {
                    throw new com.bumptech.glide.j(b0VarB.d());
                }
                iG = lVarB.g(jVar.J);
            } else {
                iG = 3;
            }
            a6.l lVar = lVarB;
            a6.f fVar2 = jVar.R;
            ArrayList arrayListB = hVar.b();
            int size = arrayListB.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z2 = false;
                    break;
                }
                if (((g6.r) arrayListB.get(i12)).f5694a.equals(fVar2)) {
                    z2 = true;
                    break;
                }
                i12++;
            }
            switch (jVar.I.f2212a) {
                default:
                    z10 = true;
                    if (((z2 || i11 != 3) && i11 != 1) || iG != 2) {
                    }
                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                case 1:
                    z10 = false;
                    break;
            }
            if (z10) {
                if (lVar == null) {
                    throw new com.bumptech.glide.j(b0VarB.get().getClass());
                }
                int iC = y.e.c(iG);
                if (iC == 0) {
                    z11 = false;
                    z12 = true;
                    eVar = new e(jVar.R, jVar.D);
                } else {
                    if (iC != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(iG != 1 ? iG != 2 ? iG != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                    }
                    z11 = false;
                    z12 = true;
                    eVar = new d0(hVar.f2179c.f2353a, jVar.R, jVar.D, jVar.G, jVar.H, mVar, cls, jVar.J);
                }
                a0 a0Var = (a0) a0.f2142z.k();
                a0Var.f2146y = z11;
                a0Var.f2145x = z12;
                a0Var.f2144w = b0VarB;
                a7.j jVar2 = jVar.A;
                jVar2.f202w = eVar;
                jVar2.f203x = lVar;
                jVar2.f204y = a0Var;
                b0VarB = a0Var;
            }
            return this.f2206c.a(b0VarB, iVar);
        } catch (Throwable th) {
            cVar.e(list);
            throw th;
        }
    }

    public final b0 b(com.bumptech.glide.load.data.f fVar, int i, int i10, a6.i iVar, List list) throws w {
        List list2 = this.f2205b;
        int size = list2.size();
        b0 b0VarB = null;
        for (int i11 = 0; i11 < size; i11++) {
            a6.k kVar = (a6.k) list2.get(i11);
            try {
                if (kVar.a(fVar.n(), iVar)) {
                    b0VarB = kVar.b(fVar.n(), i, i10, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e7) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e7);
                }
                list.add(e7);
            }
            if (b0VarB != null) {
                break;
            }
        }
        if (b0VarB != null) {
            return b0VarB;
        }
        throw new w(this.f2208e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f2204a + ", decoders=" + this.f2205b + ", transcoder=" + this.f2206c + '}';
    }
}
