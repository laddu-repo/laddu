package com.bumptech.glide;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public t6.a f2341v;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final boolean b(Object obj) {
        if (obj instanceof a) {
            return v6.m.b(this.f2341v, ((a) obj).f2341v);
        }
        return false;
    }

    public final int c() {
        t6.a aVar = this.f2341v;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b(obj);
    }

    public final int hashCode() {
        return c();
    }
}
