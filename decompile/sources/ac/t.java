package ac;

import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements ce.l {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f448v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f449w;

    public /* synthetic */ t(int i, Object obj) {
        this.f448v = i;
        this.f449w = obj;
    }

    @Override // ce.l
    public final Object a(Object obj) {
        int i = this.f448v;
        od.l lVar = od.l.f10126a;
        Object obj2 = this.f449w;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                d1.c cVar = (d1.c) obj;
                de.i.e(cVar, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", cVar);
                return new m0(((n0) obj2).f432a.a(null), null, null);
            case 1:
                af.m mVar = (af.m) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return mVar.f521e[iIntValue] + ": " + mVar.j(iIntValue).b();
            case 2:
                de.i.e(obj, "it");
                return ((j0) obj2).b();
            case 3:
                kb.l lVar2 = (kb.l) obj2;
                h1.b bVar = (h1.b) obj;
                h1.e eVar = kb.l.f7898c;
                long j8 = 0;
                for (Map.Entry entry : bVar.a().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        h1.e eVar2 = (h1.e) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strD = lVar2.d(System.currentTimeMillis());
                        if (set.contains(strD)) {
                            Object[] objArr = {strD};
                            HashSet hashSet = new HashSet(1);
                            Object obj3 = objArr[0];
                            Objects.requireNonNull(obj3);
                            if (!hashSet.add(obj3)) {
                                throw new IllegalArgumentException("duplicate element: " + obj3);
                            }
                            bVar.d(eVar2, Collections.unmodifiableSet(hashSet));
                            j8++;
                        } else {
                            bVar.c(eVar2);
                        }
                    }
                }
                if (j8 == 0) {
                    bVar.c(eVar);
                } else {
                    bVar.d(eVar, Long.valueOf(j8));
                }
                return null;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                return ((ke.f) obj2).b(((Integer) obj).intValue());
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                w4.a aVar = (w4.a) obj;
                de.i.e(aVar, "db");
                ((b0.e) obj2).f1454h = aVar;
                return lVar;
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                p4.a aVar2 = (p4.a) obj;
                de.i.e(aVar2, "config");
                return ((p4.u) obj2).f(aVar2);
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return obj == ((pd.a) obj2) ? "(this Collection)" : String.valueOf(obj);
            default:
                ((ue.c) obj2).i(null);
                return lVar;
        }
    }

    public /* synthetic */ t(ue.c cVar, ue.b bVar) {
        this.f448v = 8;
        this.f449w = cVar;
    }
}
