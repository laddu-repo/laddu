package com.tonyodev.fetch2.database;

import ad.c;
import android.content.Context;
import de.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4.a;
import p4.g;
import p4.x;
import s5.d;
import x4.h;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class DownloadDatabase_Impl extends DownloadDatabase {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile c f3698k;

    @Override // p4.u
    public final g d() {
        return new g(this, new HashMap(0), new HashMap(0), "requests");
    }

    @Override // p4.u
    public final w4.c f(a aVar) {
        x xVar = new x(aVar, new d(this));
        Context context = aVar.f10266a;
        i.e(context, "context");
        String str = aVar.f10267b;
        aVar.f10268c.getClass();
        return new h(context, str, xVar);
    }

    @Override // p4.u
    public final List h(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // p4.u
    public final Set k() {
        return new HashSet();
    }

    @Override // p4.u
    public final Map l() {
        HashMap map = new HashMap();
        map.put(c.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.tonyodev.fetch2.database.DownloadDatabase
    public final c q() {
        c cVar;
        if (this.f3698k != null) {
            return this.f3698k;
        }
        synchronized (this) {
            try {
                if (this.f3698k == null) {
                    this.f3698k = new c(this);
                }
                cVar = this.f3698k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
