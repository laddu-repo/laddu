package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class mc implements Comparable {
    public final RuntimeException A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f2893v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f2894w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f2895x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f2896y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f2897z;

    public mc(long j8, String str, int i, long j9, Object obj) {
        p4.v.j(((j8 > 0L ? 1 : (j8 == 0L ? 0 : -1)) == 0) == (str != null));
        this.f2893v = j8;
        this.f2894w = str;
        this.f2895x = i;
        this.f2896y = j9;
        this.f2897z = obj;
        if (i != 5) {
            this.A = null;
            return;
        }
        if (obj == null) {
            this.A = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof t0)) {
            this.A = null;
        } else {
            this.A = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    public final Object a() {
        int i = this.f2895x;
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        long j8 = this.f2896y;
        if (i == 2) {
            return Long.valueOf(j8);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(j8));
        }
        Object obj = this.f2897z;
        if (i == 4) {
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((t0) obj).k();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.A;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        mc mcVar = (mc) obj;
        long j8 = mcVar.f2893v;
        long j9 = this.f2893v;
        int iCompare = Long.compare(j9, j8);
        if (iCompare != 0) {
            return iCompare;
        }
        if (j9 != 0) {
            return 0;
        }
        String str = this.f2894w;
        str.getClass();
        String str2 = mcVar.f2894w;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc)) {
            return false;
        }
        mc mcVar = (mc) obj;
        return this.f2893v == mcVar.f2893v && Objects.equals(this.f2894w, mcVar.f2894w);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f2893v), this.f2894w);
    }

    public final String toString() {
        String string = this.f2894w;
        if (string == null) {
            string = Long.toString(this.f2893v);
        }
        String strValueOf = String.valueOf(a());
        return d0.d.n(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length()), string, ":", strValueOf);
    }
}
