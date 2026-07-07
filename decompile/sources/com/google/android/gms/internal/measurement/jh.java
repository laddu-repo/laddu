package com.google.android.gms.internal.measurement;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class jh extends sh {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh(String str, Class cls, boolean z2, boolean z10, int i) {
        super(str, cls, z2, z10);
        this.f = i;
    }

    @Override // com.google.android.gms.internal.measurement.sh
    public void a(Iterator it, ei eiVar) {
        switch (this.f) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean zHasNext = it.hasNext();
                    String str = this.f3092a;
                    if (!zHasNext) {
                        eiVar.a(next, str);
                    } else {
                        StringBuilder sb2 = new StringBuilder("[");
                        sb2.append(next);
                        do {
                            sb2.append(',');
                            sb2.append(it.next());
                        } while (it.hasNext());
                        sb2.append(']');
                        eiVar.a(sb2.toString(), str);
                    }
                }
                break;
            default:
                super.a(it, eiVar);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.sh
    public void b(Object obj, ei eiVar) {
        switch (this.f) {
            case 1:
                x xVar = (x) obj;
                if (xVar == null) {
                    return;
                }
                v vVar = xVar.f3214a.f3181x;
                vVar.getClass();
                int i = 0;
                while (true) {
                    if (!(i < vVar.b() - vVar.a())) {
                        return;
                    }
                    if (i >= vVar.b() - vVar.a()) {
                        throw new NoSuchElementException();
                    }
                    w wVar = vVar.f3151w;
                    int iA = vVar.a() + i;
                    i++;
                    Map.Entry entry = (Map.Entry) wVar.f3179v[iA];
                    if (((Set) entry.getValue()).isEmpty()) {
                        eiVar.a(null, (String) entry.getKey());
                    } else {
                        Iterator it = ((Set) entry.getValue()).iterator();
                        while (it.hasNext()) {
                            eiVar.a(it.next(), (String) entry.getKey());
                        }
                    }
                }
                break;
            default:
                super.b(obj, eiVar);
                return;
        }
    }
}
