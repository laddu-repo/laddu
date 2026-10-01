package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class sh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f3093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3096e;

    public sh(String str, Class cls, boolean z2, boolean z10) {
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt2 = str.charAt(i);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        this.f3092a = str;
        this.f3093b = cls;
        this.f3094c = z2;
        this.f3095d = z10;
        int iIdentityHashCode = System.identityHashCode(this);
        long j8 = 0;
        for (int i10 = 0; i10 < 5; i10++) {
            j8 |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.f3096e = j8;
    }

    public void a(Iterator it, ei eiVar) {
        while (it.hasNext()) {
            b(it.next(), eiVar);
        }
    }

    public void b(Object obj, ei eiVar) {
        eiVar.a(obj, this.f3092a);
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.f3093b.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.f3092a;
        StringBuilder sb2 = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        j4.a.s(sb2, name, "/", str, "[");
        return j4.a.n(sb2, name2, "]");
    }
}
