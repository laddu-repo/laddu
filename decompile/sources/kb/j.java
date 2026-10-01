package kb;

import androidx.media3.decoder.DecoderInputBuffer;
import da.m0;
import k8.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements ce.l {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7893v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f7894w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f7895x;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.f7893v = i;
        this.f7894w = obj;
        this.f7895x = obj2;
    }

    @Override // ce.l
    public final Object a(Object obj) throws Exception {
        switch (this.f7893v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                l lVar = (l) this.f7894w;
                String str = (String) this.f7895x;
                h1.b bVar = (h1.b) obj;
                lVar.getClass();
                bVar.d(l.f7899d, str);
                lVar.h(bVar, str);
                return null;
            case 1:
                ne.c cVar = (ne.c) this.f7894w;
                cVar.f9110x.removeCallbacks((m0) this.f7895x);
                return od.l.f10126a;
            default:
                sc.b bVar2 = (sc.b) this.f7894w;
                sc.c cVar2 = (sc.c) this.f7895x;
                v4.a aVar = (v4.a) obj;
                b0 b0Var = (b0) bVar2.f11787x;
                de.i.e(aVar, "connection");
                v4.c cVarJ0 = aVar.j0("INSERT OR REPLACE INTO `fav_channels` (`id`,`name`,`image`,`link`,`playlist`) VALUES (nullif(?, 0),?,?,?,?)");
                try {
                    b0Var.i(cVarJ0, cVar2);
                    cVarJ0.Z();
                    b8.h.h(cVarJ0, null);
                    return null;
                } finally {
                }
        }
    }
}
