package k8;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.q6;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends o4.h1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7544h = 0;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(j1 j1Var) {
        super(20);
        this.i = j1Var;
    }

    @Override // o4.h1
    public final Object c(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.f7544h) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                String str = (String) obj;
                t7.y.d(str);
                j1 j1Var = (j1) this.i;
                j1Var.E();
                t7.y.d(str);
                n nVar = j1Var.f7447x.f7658x;
                n4.T(nVar);
                hd.a aVarL0 = nVar.L0(str);
                if (aVarL0 == null) {
                    return null;
                }
                v0 v0Var = ((p1) j1Var.f2053w).A;
                p1.l(v0Var);
                v0Var.J.b(str, "Populate EES config from database on cache miss. appId");
                j1Var.L(str, j1Var.M(str, (byte[]) aVarL0.f6279w));
                g1 g1Var = j1Var.G;
                synchronized (((w.b) g1Var.f9750g)) {
                    Set setEntrySet = ((LinkedHashMap) ((k4) g1Var.f).f7607v).entrySet();
                    de.i.d(setEntrySet, "<get-entries>(...)");
                    linkedHashMap = new LinkedHashMap(setEntrySet.size());
                    Set<Map.Entry> setEntrySet2 = ((LinkedHashMap) ((k4) g1Var.f).f7607v).entrySet();
                    de.i.d(setEntrySet2, "<get-entries>(...)");
                    for (Map.Entry entry : setEntrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        break;
                    }
                }
                return (q6) linkedHashMap.get(str);
            default:
                String str2 = (String) obj;
                de.i.e(str2, "key");
                return ((r4.h) this.i).f11189v.j0(str2);
        }
    }

    @Override // o4.h1
    public void d(boolean z2, Object obj, Object obj2, Object obj3) throws Exception {
        switch (this.f7544h) {
            case 1:
                Object obj4 = (String) obj;
                v4.c cVar = (v4.c) obj2;
                de.i.e(obj4, "key");
                de.i.e(cVar, "oldValue");
                cVar.close();
                super.d(z2, obj4, cVar, (v4.c) obj3);
                break;
            default:
                super.d(z2, obj, obj2, obj3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(r4.h hVar) {
        super(25);
        this.i = hVar;
    }
}
