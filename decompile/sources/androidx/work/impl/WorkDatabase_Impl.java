package androidx.work.impl;

import android.content.Context;
import androidx.lifecycle.j1;
import c6.h;
import e6.b;
import e6.e;
import e6.j;
import h5.d;
import j4.b0;
import java.util.HashMap;
import kotlin.jvm.internal.k;
import w4.c;
import x4.a;
import x4.i;
import x4.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f1191u = 0;

    /* renamed from: n, reason: collision with root package name */
    public volatile j f1192n;

    /* renamed from: o, reason: collision with root package name */
    public volatile b0 f1193o;

    /* renamed from: p, reason: collision with root package name */
    public volatile b0 f1194p;

    /* renamed from: q, reason: collision with root package name */
    public volatile j1 f1195q;

    /* renamed from: r, reason: collision with root package name */
    public volatile b0 f1196r;
    public volatile h s;

    /* renamed from: t, reason: collision with root package name */
    public volatile b0 f1197t;

    @Override // x4.w
    public final i e() {
        return new i(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // x4.w
    public final d g(a aVar) {
        y yVar = new y(aVar, new c(this));
        Context context = aVar.f14534a;
        k.e(context, "context");
        return aVar.f14536c.k(new a2.c(context, aVar.f14535b, yVar, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b0 t() {
        b0 b0Var;
        if (this.f1193o != null) {
            return this.f1193o;
        }
        synchronized (this) {
            try {
                if (this.f1193o == null) {
                    this.f1193o = new b0(this, 14);
                }
                b0Var = this.f1193o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b0 u() {
        b0 b0Var;
        if (this.f1197t != null) {
            return this.f1197t;
        }
        synchronized (this) {
            try {
                if (this.f1197t == null) {
                    this.f1197t = new b0(this, 15);
                }
                b0Var = this.f1197t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final j1 v() {
        j1 j1Var;
        if (this.f1195q != null) {
            return this.f1195q;
        }
        synchronized (this) {
            try {
                if (this.f1195q == null) {
                    this.f1195q = new j1(this);
                }
                j1Var = this.f1195q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j1Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b0 w() {
        b0 b0Var;
        if (this.f1196r != null) {
            return this.f1196r;
        }
        synchronized (this) {
            try {
                if (this.f1196r == null) {
                    this.f1196r = new b0(this, 16);
                }
                b0Var = this.f1196r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b0Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [c6.h, java.lang.Object] */
    @Override // androidx.work.impl.WorkDatabase
    public final h x() {
        h hVar;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    ?? obj = new Object();
                    obj.f1981x = this;
                    obj.f1982y = new b(this, 4);
                    obj.f1983z = new e(this, 1);
                    obj.A = new e(this, 2);
                    this.s = obj;
                }
                hVar = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final j y() {
        j jVar;
        if (this.f1192n != null) {
            return this.f1192n;
        }
        synchronized (this) {
            try {
                if (this.f1192n == null) {
                    this.f1192n = new j(this);
                }
                jVar = this.f1192n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b0 z() {
        b0 b0Var;
        if (this.f1194p != null) {
            return this.f1194p;
        }
        synchronized (this) {
            try {
                if (this.f1194p == null) {
                    this.f1194p = new b0(this, 17);
                }
                b0Var = this.f1194p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b0Var;
    }
}
