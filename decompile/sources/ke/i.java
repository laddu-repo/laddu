package ke;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements ce.l {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7974v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f7975w;

    public /* synthetic */ i(int i, String str) {
        this.f7974v = i;
        this.f7975w = str;
    }

    @Override // ce.l
    public final Object a(Object obj) throws Exception {
        switch (this.f7974v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                String str = (String) obj;
                de.i.e(str, "it");
                boolean zL = h.L(str);
                String str2 = this.f7975w;
                return zL ? str.length() < str2.length() ? str2 : str : str2.concat(str);
            default:
                v4.c cVarJ0 = ((v4.a) obj).j0("SELECT * FROM fav_channels WHERE name = ? LIMIT 1");
                String str3 = this.f7975w;
                try {
                    if (str3 == null) {
                        cVarJ0.e(1);
                    } else {
                        cVarJ0.K(1, str3);
                    }
                    int iM = com.bumptech.glide.d.m(cVarJ0, "id");
                    int iM2 = com.bumptech.glide.d.m(cVarJ0, "name");
                    int iM3 = com.bumptech.glide.d.m(cVarJ0, "image");
                    int iM4 = com.bumptech.glide.d.m(cVarJ0, "link");
                    int iM5 = com.bumptech.glide.d.m(cVarJ0, "playlist");
                    sc.c cVar = null;
                    String strN = null;
                    if (cVarJ0.Z()) {
                        String strN2 = cVarJ0.isNull(iM2) ? null : cVarJ0.n(iM2);
                        String strN3 = cVarJ0.isNull(iM3) ? null : cVarJ0.n(iM3);
                        String strN4 = cVarJ0.isNull(iM4) ? null : cVarJ0.n(iM4);
                        if (!cVarJ0.isNull(iM5)) {
                            strN = cVarJ0.n(iM5);
                        }
                        sc.c cVar2 = new sc.c(strN2, strN3, strN4, strN);
                        cVar2.f11788a = (int) cVarJ0.getLong(iM);
                        cVar = cVar2;
                    }
                    cVarJ0.close();
                    return cVar;
                } catch (Throwable th) {
                    cVarJ0.close();
                    throw th;
                }
        }
    }
}
