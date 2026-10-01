package md;

import androidx.media3.decoder.DecoderInputBuffer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import re.t;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f8641v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Serializable f8642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f8643x;

    public b(HashMap map) {
        this.f8641v = 0;
        this.f8642w = new HashMap();
        this.f8643x = new ArrayList();
        String str = (String) map.get("cookie");
        if (str != null) {
            for (String str2 : str.split(";")) {
                String[] strArrSplit = str2.trim().split("=");
                if (strArrSplit.length == 2) {
                    ((HashMap) this.f8642w).put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
    }

    public void a() {
        Iterator it = ((ArrayList) this.f8643x).iterator();
        if (it.hasNext()) {
            throw d0.d.g(it);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8641v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return ((HashMap) this.f8642w).keySet().iterator();
            default:
                p9.d dVar = (p9.d) this.f8643x;
                return ((pa.a) dVar.f10441e).e(dVar, (String) this.f8642w);
        }
    }

    public String toString() {
        switch (this.f8641v) {
            case 1:
                t tVar = new t(", ");
                StringBuilder sb2 = new StringBuilder();
                sb2.append('[');
                tVar.a(sb2, iterator());
                sb2.append(']');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public b(p9.d dVar, String str) {
        this.f8641v = 1;
        this.f8642w = str;
        this.f8643x = dVar;
    }
}
