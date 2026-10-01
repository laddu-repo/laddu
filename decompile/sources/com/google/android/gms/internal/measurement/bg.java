package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class bg extends da.k {
    public mb C;
    public final int D;

    public bg(mb mbVar, int i) {
        this.C = mbVar;
        this.D = i;
    }

    @Override // da.k
    public final void d() {
        AtomicLong atomicLong;
        long j8;
        int i;
        int i10;
        boolean z2;
        mb mbVar = this.C;
        this.C = null;
        if (mbVar == null) {
            return;
        }
        AtomicReference atomicReference = (AtomicReference) mbVar.f2890d;
        do {
            atomicLong = (AtomicLong) mbVar.f2889c;
            j8 = atomicLong.get();
            i = (int) j8;
            long j9 = j8 >>> 32;
            if (i == Integer.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 13);
                sb2.append("Refcount is: ");
                sb2.append(j8);
                throw new AssertionError(sb2.toString());
            }
            i10 = (int) j9;
            z2 = i == -2147483647;
            if (z2) {
                i10++;
            }
        } while (!atomicLong.compareAndSet(j8, (((long) i10) << 32) | (4294967295L & ((long) (i - 1)))));
        if (z2) {
            while (true) {
                cg cgVar = (cg) atomicReference.get();
                if (cgVar != null) {
                    if (cgVar.C <= this.D) {
                        cgVar.cancel(true);
                        while (!atomicReference.compareAndSet(cgVar, null)) {
                            if (atomicReference.get() != cgVar) {
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // da.k
    public final String l() {
        da.a0 a0Var;
        mb mbVar = this.C;
        if (mbVar == null || (a0Var = (da.a0) ((vd) mbVar.f2888b).f3164w) == null) {
            return null;
        }
        String string = a0Var.toString();
        String strN = d0.d.n(new StringBuilder(string.length() + 11), "callable=[", string, "]");
        cg cgVar = (cg) ((AtomicReference) this.C.f2890d).get();
        if (cgVar == null) {
            return strN;
        }
        int length = strN.length();
        String string2 = cgVar.toString();
        StringBuilder sb2 = new StringBuilder(string2.length() + length + 9 + 1);
        sb2.append(strN);
        sb2.append(", trial=[");
        sb2.append(string2);
        sb2.append("]");
        return sb2.toString();
    }
}
