package ac;

import android.content.res.Resources;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements ce.l {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f441v;

    public /* synthetic */ r(int i) {
        this.f441v = i;
    }

    @Override // ce.l
    public final Object a(Object obj) throws Exception {
        switch (this.f441v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                d1.c cVar = (d1.c) obj;
                de.i.e(cVar, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", cVar);
                return dc.i.f4486b;
            case 1:
                Resources resources = (Resources) obj;
                de.i.e(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 2:
                sd.f fVar = (sd.f) obj;
                if (fVar instanceof me.s) {
                    return (me.s) fVar;
                }
                return null;
            case 3:
                v4.c cVar2 = (v4.c) obj;
                de.i.e(cVar2, "it");
                return Boolean.valueOf(cVar2.Z());
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                v4.c cVar3 = (v4.c) obj;
                de.i.e(cVar3, "statement");
                qd.i iVar = new qd.i();
                while (cVar3.Z()) {
                    iVar.add(Integer.valueOf((int) cVar3.getLong(0)));
                }
                return qf.g.d(iVar);
            default:
                v4.c cVarJ0 = ((v4.a) obj).j0("SELECT * FROM fav_channels");
                try {
                    int iM = com.bumptech.glide.d.m(cVarJ0, "id");
                    int iM2 = com.bumptech.glide.d.m(cVarJ0, "name");
                    int iM3 = com.bumptech.glide.d.m(cVarJ0, "image");
                    int iM4 = com.bumptech.glide.d.m(cVarJ0, "link");
                    int iM5 = com.bumptech.glide.d.m(cVarJ0, "playlist");
                    ArrayList arrayList = new ArrayList();
                    while (cVarJ0.Z()) {
                        String strN = null;
                        String strN2 = cVarJ0.isNull(iM2) ? null : cVarJ0.n(iM2);
                        String strN3 = cVarJ0.isNull(iM3) ? null : cVarJ0.n(iM3);
                        String strN4 = cVarJ0.isNull(iM4) ? null : cVarJ0.n(iM4);
                        if (!cVarJ0.isNull(iM5)) {
                            strN = cVarJ0.n(iM5);
                        }
                        sc.c cVar4 = new sc.c(strN2, strN3, strN4, strN);
                        cVar4.f11788a = (int) cVarJ0.getLong(iM);
                        arrayList.add(cVar4);
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarJ0.close();
                }
        }
    }
}
