package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class we {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public of f3201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y9.f0 f3202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f3203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f3204d;

    public ArrayList a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = this.f3203c;
        if (!arrayList2.isEmpty()) {
            int i = ve.f3166w;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw d0.d.g(it);
            }
            ve veVar = !arrayList3.isEmpty() ? new ve(outputStream, arrayList3) : null;
            if (veVar != null) {
                arrayList.add(veVar);
            }
        }
        Iterator it2 = this.f3202b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return arrayList;
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        }
        throw null;
    }
}
