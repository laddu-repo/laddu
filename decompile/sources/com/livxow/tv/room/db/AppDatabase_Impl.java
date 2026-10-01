package com.livxow.tv.room.db;

import androidx.emoji2.text.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4.g;
import sc.b;
import tc.a;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile b f3691l;

    @Override // p4.u
    public final g d() {
        return new g(this, new HashMap(0), new HashMap(0), "fav_channels", "ns_data", "notifications");
    }

    @Override // p4.u
    public final h e() {
        return new a(this);
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
        map.put(b.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.livxow.tv.room.db.AppDatabase
    public final b q() {
        b bVar;
        if (this.f3691l != null) {
            return this.f3691l;
        }
        synchronized (this) {
            try {
                if (this.f3691l == null) {
                    this.f3691l = new b(this);
                }
                bVar = this.f3691l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
