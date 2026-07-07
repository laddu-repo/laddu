package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class lh extends jb {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f2870e;
    public int f;

    @Override // com.google.android.gms.internal.measurement.jb
    public final int a() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final sh g(int i) {
        if (i < this.f) {
            return (sh) this.f2870e[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final Object l(int i) {
        if (i < this.f) {
            return this.f2870e[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.measurement.jb
    public final Object n(sh shVar) {
        int iX = x(shVar);
        if (iX == -1) {
            return null;
        }
        return shVar.f3093b.cast(this.f2870e[iX + iX + 1]);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata{");
        for (int i = 0; i < this.f; i++) {
            sb2.append(" '");
            sb2.append(g(i));
            sb2.append("': ");
            sb2.append(l(i));
        }
        sb2.append(" }");
        return sb2.toString();
    }

    public final void w(sh shVar, Object obj) {
        int iX;
        if (!shVar.f3094c && (iX = x(shVar)) != -1) {
            eh.c(obj, "metadata value");
            this.f2870e[iX + iX + 1] = obj;
            return;
        }
        int i = this.f + 1;
        Object[] objArr = this.f2870e;
        int length = objArr.length;
        if (i + i > length) {
            this.f2870e = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.f2870e;
        int i10 = this.f;
        int i11 = i10 + i10;
        objArr2[i11] = shVar;
        eh.c(obj, "metadata value");
        objArr2[i11 + 1] = obj;
        this.f++;
    }

    public final int x(sh shVar) {
        for (int i = 0; i < this.f; i++) {
            if (this.f2870e[i + i].equals(shVar)) {
                return i;
            }
        }
        return -1;
    }
}
