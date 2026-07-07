package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import k7.c;
import v5.f;
import v5.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends i {
    @Override // v5.i
    public final f a(ArrayList arrayList) {
        c cVar = new c(29);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            hashMap.putAll(Collections.unmodifiableMap(((f) obj).f13319a));
        }
        cVar.B(hashMap);
        f fVar = new f((HashMap) cVar.f7745y);
        f.b(fVar);
        return fVar;
    }
}
