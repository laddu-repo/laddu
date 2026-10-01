package ac;

import android.content.Context;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import javax.net.ssl.SSLPeerUnverifiedException;
import k8.k4;
import va.t1;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements ce.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f366w;

    public /* synthetic */ g0(int i, Object obj) {
        this.f365v = i;
        this.f366w = obj;
    }

    @Override // ce.a
    public final Object b() throws InterruptedException {
        switch (this.f365v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((l1) this.f366w).getClass();
                UUID uuidRandomUUID = UUID.randomUUID();
                de.i.d(uuidRandomUUID, "randomUUID(...)");
                String string = uuidRandomUUID.toString();
                de.i.d(string, "toString(...)");
                return string;
            case 1:
                ((bc.a) this.f366w).f1600a.await();
                return od.l.f10126a;
            case 2:
                return new c.z((c.a0) this.f366w);
            case 3:
                cd.c cVar = (cd.c) this.f366w;
                ad.e eVar = cVar.f2294v;
                de.i.b(cVar.D);
                ad.e eVar2 = new ad.e();
                com.bumptech.glide.e.u(eVar, eVar2);
                return eVar2;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                cd.d dVar = (cd.d) this.f366w;
                ad.e eVar3 = dVar.f2299v;
                de.i.b(dVar.C);
                ad.e eVar4 = new ad.e();
                com.bumptech.glide.e.u(eVar3, eVar4);
                return eVar4;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                ed.a aVar = (ed.a) ((ed.g) this.f366w).f4886c;
                ad.g gVar = aVar.f4866v;
                synchronized (gVar.f494w) {
                    gVar.f493v.G();
                }
                aVar.f4868x.A();
                return od.l.f10126a;
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                try {
                    return (List) ((ce.a) this.f366w).b();
                } catch (SSLPeerUnverifiedException unused) {
                    return pd.p.f10551v;
                }
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return (List) this.f366w;
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                fd.c cVar2 = (fd.c) this.f366w;
                if (!cVar2.F && !cVar2.E && t1.i(cVar2.f5389y.f4711a) && cVar2.G > 500) {
                    cVar2.l();
                }
                return od.l.f10126a;
            case 9:
                mf.q qVar = (mf.q) this.f366w;
                qVar.getClass();
                try {
                    qVar.R.B(2, 0, false);
                    break;
                } catch (IOException e7) {
                    mf.b bVar = mf.b.f8758y;
                    qVar.a(bVar, bVar, e7);
                }
                return od.l.f10126a;
            case 10:
                return ((p4.z) this.f366w).b();
            case 11:
                return ((ob.d) this.f366w).b(":memory:");
            case 12:
                r4.p pVar = (r4.p) this.f366w;
                return pVar.f11208v.b(pVar.f11209w);
            default:
                x4.h hVar = (x4.h) this.f366w;
                Context context = hVar.f14218v;
                String str = hVar.f14219w;
                k4 k4Var = new k4();
                k4Var.f7607v = null;
                x4.g gVar2 = new x4.g(context, str, k4Var, hVar.f14220x);
                gVar2.setWriteAheadLoggingEnabled(hVar.f14222z);
                return gVar2;
        }
    }
}
