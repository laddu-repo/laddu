package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class s4 {

    /* renamed from: a, reason: collision with root package name */
    public static final v.e f2414a = new v.l(0);

    public static synchronized void a() {
        synchronized (s4.class) {
            v.e eVar = f2414a;
            Iterator it = ((v.d) eVar.values()).iterator();
            if (!it.hasNext()) {
                eVar.clear();
            } else {
                ((s4) it.next()).getClass();
                throw null;
            }
        }
    }
}
