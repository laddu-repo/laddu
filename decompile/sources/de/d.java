package de;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements ie.a, Serializable {
    public final boolean A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient ie.a f4505v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f4506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Class f4507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f4508y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f4509z;

    public d(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f4506w = obj;
        this.f4507x = cls;
        this.f4508y = str;
        this.f4509z = str2;
        this.A = z2;
    }

    public abstract ie.a c();

    public final e e() {
        boolean z2 = this.A;
        Class cls = this.f4507x;
        if (!z2) {
            return q.a(cls);
        }
        q.f4523a.getClass();
        return new k(cls);
    }
}
