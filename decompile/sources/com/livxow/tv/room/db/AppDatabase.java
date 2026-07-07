package com.livxow.tv.room.db;

import android.content.Context;
import p4.q;
import p4.u;
import z7.b;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AppDatabase extends u {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile AppDatabase f3690k;

    public static AppDatabase r(Context context) {
        if (f3690k == null) {
            synchronized (AppDatabase.class) {
                try {
                    if (f3690k == null) {
                        q qVarN = b.n(context.getApplicationContext(), AppDatabase.class, "favorites_db");
                        qVarN.f10347n = false;
                        qVarN.f10348o = true;
                        f3690k = (AppDatabase) qVarN.a();
                    }
                } finally {
                }
            }
        }
        return f3690k;
    }

    public abstract sc.b q();
}
