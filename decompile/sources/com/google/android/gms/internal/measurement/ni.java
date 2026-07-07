package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class ni extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f2937b;

    public ni(jb jbVar, jb jbVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, jbVar);
        d(linkedHashMap, jbVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((sh) entry.getKey()).f3094c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.f2937b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, jb jbVar) {
        for (int i = 0; i < jbVar.a(); i++) {
            sh shVarG = jbVar.g(i);
            Object obj = linkedHashMap.get(shVarG);
            boolean z2 = shVarG.f3094c;
            Class cls = shVarG.f3093b;
            if (z2) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(shVarG, arrayList);
                }
                arrayList.add(cls.cast(jbVar.l(i)));
            } else {
                linkedHashMap.put(shVarG, cls.cast(jbVar.l(i)));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final void a(ji jiVar, ei eiVar) {
        for (Map.Entry entry : this.f2937b.entrySet()) {
            sh shVar = (sh) entry.getKey();
            Object value = entry.getValue();
            if (shVar.f3094c) {
                jiVar.b(shVar, ((List) value).iterator(), eiVar);
            } else {
                jiVar.a(shVar, value, eiVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final int b() {
        return this.f2937b.size();
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final Set c() {
        return this.f2937b.keySet();
    }
}
