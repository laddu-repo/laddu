package androidx.datastore.preferences.protobuf;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.j2;
import com.google.android.gms.internal.measurement.m2;
import com.google.android.gms.internal.measurement.s1;
import com.google.android.gms.internal.measurement.t1;
import com.google.android.gms.internal.measurement.u1;
import com.google.android.gms.internal.measurement.x1;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f797c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f798d;

    public k(com.google.android.gms.internal.measurement.w0 w0Var) {
        this.f798d = w0Var;
        w0Var.f3186x = this;
    }

    public static final void T(int i) throws u1 {
        if ((i & 3) != 0) {
            throw new u1("Failed to parse the message.");
        }
    }

    public static final void U(int i) throws u1 {
        if ((i & 7) != 0) {
            throw new u1("Failed to parse the message.");
        }
    }

    public void A(s1 s1Var) throws u1 {
        int iQ;
        int iQ2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        if (s1Var instanceof x1) {
            x1 x1Var = (x1) s1Var;
            int i = this.f795a & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new t1();
                }
                int iG = w0Var.G();
                U(iG);
                int i10 = w0Var.i() + iG;
                do {
                    x1Var.d(w0Var.z());
                } while (w0Var.i() < i10);
                return;
            }
            do {
                x1Var.d(w0Var.z());
                if (w0Var.h()) {
                    return;
                } else {
                    iQ2 = w0Var.q();
                }
            } while (iQ2 == this.f795a);
        } else {
            int i11 = this.f795a & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new t1();
                }
                int iG2 = w0Var.G();
                U(iG2);
                int i12 = w0Var.i() + iG2;
                do {
                    s1Var.add(Long.valueOf(w0Var.z()));
                } while (w0Var.i() < i12);
                return;
            }
            do {
                s1Var.add(Long.valueOf(w0Var.z()));
                if (w0Var.h()) {
                    return;
                } else {
                    iQ = w0Var.q();
                }
            } while (iQ == this.f795a);
            iQ2 = iQ;
        }
        this.f797c = iQ2;
    }

    public void B(s1 s1Var) throws u1 {
        int iQ;
        int iQ2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        if (s1Var instanceof com.google.android.gms.internal.measurement.j1) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) s1Var;
            int i = this.f795a & 7;
            if (i == 2) {
                int iG = w0Var.G();
                T(iG);
                int i10 = w0Var.i() + iG;
                do {
                    j1Var.d(w0Var.A());
                } while (w0Var.i() < i10);
                return;
            }
            if (i != 5) {
                throw new t1();
            }
            do {
                j1Var.d(w0Var.A());
                if (w0Var.h()) {
                    return;
                } else {
                    iQ2 = w0Var.q();
                }
            } while (iQ2 == this.f795a);
        } else {
            int i11 = this.f795a & 7;
            if (i11 == 2) {
                int iG2 = w0Var.G();
                T(iG2);
                int i12 = w0Var.i() + iG2;
                do {
                    s1Var.add(Integer.valueOf(w0Var.A()));
                } while (w0Var.i() < i12);
                return;
            }
            if (i11 != 5) {
                throw new t1();
            }
            do {
                s1Var.add(Integer.valueOf(w0Var.A()));
                if (w0Var.h()) {
                    return;
                } else {
                    iQ = w0Var.q();
                }
            } while (iQ == this.f795a);
            iQ2 = iQ;
        }
        this.f797c = iQ2;
    }

    public void C(s1 s1Var) throws u1 {
        int iQ;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        int i = this.f795a & 7;
        if (i == 0) {
            do {
                s1Var.add(Boolean.valueOf(w0Var.B()));
                if (w0Var.h()) {
                    return;
                } else {
                    iQ = w0Var.q();
                }
            } while (iQ == this.f795a);
            this.f797c = iQ;
            return;
        }
        if (i != 2) {
            throw new t1();
        }
        int i10 = w0Var.i() + w0Var.G();
        do {
            s1Var.add(Boolean.valueOf(w0Var.B()));
        } while (w0Var.i() < i10);
        S(i10);
    }

    public void D(s1 s1Var, boolean z2) throws t1 {
        String strC;
        int iQ;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        if ((this.f795a & 7) != 2) {
            throw new t1();
        }
        do {
            if (z2) {
                O(2);
                strC = w0Var.D();
            } else {
                O(2);
                strC = w0Var.C();
            }
            s1Var.add(strC);
            if (w0Var.h()) {
                return;
            } else {
                iQ = w0Var.q();
            }
        } while (iQ == this.f795a);
        this.f797c = iQ;
    }

    public void E(s1 s1Var, m2 m2Var, com.google.android.gms.internal.measurement.a1 a1Var) throws u1 {
        int iQ;
        int i = this.f795a;
        if ((i & 7) != 2) {
            throw new t1();
        }
        do {
            com.google.android.gms.internal.measurement.i1 i1VarA = m2Var.a();
            P(i1VarA, m2Var, a1Var);
            m2Var.h(i1VarA);
            s1Var.add(i1VarA);
            com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
            if (w0Var.h() || this.f797c != 0) {
                return;
            } else {
                iQ = w0Var.q();
            }
        } while (iQ == i);
        this.f797c = iQ;
    }

    public void F(s1 s1Var, m2 m2Var, com.google.android.gms.internal.measurement.a1 a1Var) throws t1 {
        int iQ;
        int i = this.f795a;
        if ((i & 7) != 3) {
            throw new t1();
        }
        do {
            com.google.android.gms.internal.measurement.i1 i1VarA = m2Var.a();
            Q(i1VarA, m2Var, a1Var);
            m2Var.h(i1VarA);
            s1Var.add(i1VarA);
            com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
            if (w0Var.h() || this.f797c != 0) {
                return;
            } else {
                iQ = w0Var.q();
            }
        } while (iQ == i);
        this.f797c = iQ;
    }

    public void G(s1 s1Var) throws t1 {
        int iQ;
        if ((this.f795a & 7) != 2) {
            throw new t1();
        }
        do {
            s1Var.add(W());
            com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
            if (w0Var.h()) {
                return;
            } else {
                iQ = w0Var.q();
            }
        } while (iQ == this.f795a);
        this.f797c = iQ;
    }

    public void H(s1 s1Var) throws u1 {
        int iQ;
        int iQ2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        if (s1Var instanceof com.google.android.gms.internal.measurement.j1) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) s1Var;
            int i = this.f795a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new t1();
                }
                int i10 = w0Var.i() + w0Var.G();
                do {
                    j1Var.d(w0Var.G());
                } while (w0Var.i() < i10);
                S(i10);
                return;
            }
            do {
                j1Var.d(w0Var.G());
                if (w0Var.h()) {
                    return;
                } else {
                    iQ2 = w0Var.q();
                }
            } while (iQ2 == this.f795a);
        } else {
            int i11 = this.f795a & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new t1();
                }
                int i12 = w0Var.i() + w0Var.G();
                do {
                    s1Var.add(Integer.valueOf(w0Var.G()));
                } while (w0Var.i() < i12);
                S(i12);
                return;
            }
            do {
                s1Var.add(Integer.valueOf(w0Var.G()));
                if (w0Var.h()) {
                    return;
                } else {
                    iQ = w0Var.q();
                }
            } while (iQ == this.f795a);
            iQ2 = iQ;
        }
        this.f797c = iQ2;
    }

    public void I(s1 s1Var) throws u1 {
        int iQ;
        int iQ2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        if (s1Var instanceof com.google.android.gms.internal.measurement.j1) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) s1Var;
            int i = this.f795a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new t1();
                }
                int i10 = w0Var.i() + w0Var.G();
                do {
                    j1Var.d(w0Var.H());
                } while (w0Var.i() < i10);
                S(i10);
                return;
            }
            do {
                j1Var.d(w0Var.H());
                if (w0Var.h()) {
                    return;
                } else {
                    iQ2 = w0Var.q();
                }
            } while (iQ2 == this.f795a);
        } else {
            int i11 = this.f795a & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new t1();
                }
                int i12 = w0Var.i() + w0Var.G();
                do {
                    s1Var.add(Integer.valueOf(w0Var.H()));
                } while (w0Var.i() < i12);
                S(i12);
                return;
            }
            do {
                s1Var.add(Integer.valueOf(w0Var.H()));
                if (w0Var.h()) {
                    return;
                } else {
                    iQ = w0Var.q();
                }
            } while (iQ == this.f795a);
            iQ2 = iQ;
        }
        this.f797c = iQ2;
    }

    public void J(s1 s1Var) throws u1 {
        int iQ;
        int iQ2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        if (s1Var instanceof com.google.android.gms.internal.measurement.j1) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) s1Var;
            int i = this.f795a & 7;
            if (i == 2) {
                int iG = w0Var.G();
                T(iG);
                int i10 = w0Var.i() + iG;
                do {
                    j1Var.d(w0Var.I());
                } while (w0Var.i() < i10);
                return;
            }
            if (i != 5) {
                throw new t1();
            }
            do {
                j1Var.d(w0Var.I());
                if (w0Var.h()) {
                    return;
                } else {
                    iQ2 = w0Var.q();
                }
            } while (iQ2 == this.f795a);
        } else {
            int i11 = this.f795a & 7;
            if (i11 == 2) {
                int iG2 = w0Var.G();
                T(iG2);
                int i12 = w0Var.i() + iG2;
                do {
                    s1Var.add(Integer.valueOf(w0Var.I()));
                } while (w0Var.i() < i12);
                return;
            }
            if (i11 != 5) {
                throw new t1();
            }
            do {
                s1Var.add(Integer.valueOf(w0Var.I()));
                if (w0Var.h()) {
                    return;
                } else {
                    iQ = w0Var.q();
                }
            } while (iQ == this.f795a);
            iQ2 = iQ;
        }
        this.f797c = iQ2;
    }

    public void K(s1 s1Var) throws u1 {
        int iQ;
        int iQ2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        if (s1Var instanceof x1) {
            x1 x1Var = (x1) s1Var;
            int i = this.f795a & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new t1();
                }
                int iG = w0Var.G();
                U(iG);
                int i10 = w0Var.i() + iG;
                do {
                    x1Var.d(w0Var.J());
                } while (w0Var.i() < i10);
                return;
            }
            do {
                x1Var.d(w0Var.J());
                if (w0Var.h()) {
                    return;
                } else {
                    iQ2 = w0Var.q();
                }
            } while (iQ2 == this.f795a);
        } else {
            int i11 = this.f795a & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new t1();
                }
                int iG2 = w0Var.G();
                U(iG2);
                int i12 = w0Var.i() + iG2;
                do {
                    s1Var.add(Long.valueOf(w0Var.J()));
                } while (w0Var.i() < i12);
                return;
            }
            do {
                s1Var.add(Long.valueOf(w0Var.J()));
                if (w0Var.h()) {
                    return;
                } else {
                    iQ = w0Var.q();
                }
            } while (iQ == this.f795a);
            iQ2 = iQ;
        }
        this.f797c = iQ2;
    }

    public void L(s1 s1Var) throws u1 {
        int iQ;
        int iQ2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        if (s1Var instanceof com.google.android.gms.internal.measurement.j1) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) s1Var;
            int i = this.f795a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new t1();
                }
                int i10 = w0Var.i() + w0Var.G();
                do {
                    j1Var.d(w0Var.K());
                } while (w0Var.i() < i10);
                S(i10);
                return;
            }
            do {
                j1Var.d(w0Var.K());
                if (w0Var.h()) {
                    return;
                } else {
                    iQ2 = w0Var.q();
                }
            } while (iQ2 == this.f795a);
        } else {
            int i11 = this.f795a & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new t1();
                }
                int i12 = w0Var.i() + w0Var.G();
                do {
                    s1Var.add(Integer.valueOf(w0Var.K()));
                } while (w0Var.i() < i12);
                S(i12);
                return;
            }
            do {
                s1Var.add(Integer.valueOf(w0Var.K()));
                if (w0Var.h()) {
                    return;
                } else {
                    iQ = w0Var.q();
                }
            } while (iQ == this.f795a);
            iQ2 = iQ;
        }
        this.f797c = iQ2;
    }

    public void M(s1 s1Var) throws u1 {
        int iQ;
        int iQ2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        if (s1Var instanceof x1) {
            x1 x1Var = (x1) s1Var;
            int i = this.f795a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new t1();
                }
                int i10 = w0Var.i() + w0Var.G();
                do {
                    x1Var.d(w0Var.L());
                } while (w0Var.i() < i10);
                S(i10);
                return;
            }
            do {
                x1Var.d(w0Var.L());
                if (w0Var.h()) {
                    return;
                } else {
                    iQ2 = w0Var.q();
                }
            } while (iQ2 == this.f795a);
        } else {
            int i11 = this.f795a & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new t1();
                }
                int i12 = w0Var.i() + w0Var.G();
                do {
                    s1Var.add(Long.valueOf(w0Var.L()));
                } while (w0Var.i() < i12);
                S(i12);
                return;
            }
            do {
                s1Var.add(Long.valueOf(w0Var.L()));
                if (w0Var.h()) {
                    return;
                } else {
                    iQ = w0Var.q();
                }
            } while (iQ == this.f795a);
            iQ2 = iQ;
        }
        this.f797c = iQ2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        r12.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        r1.e(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void N(com.google.android.gms.internal.measurement.z1 r12, a7.j r13, com.google.android.gms.internal.measurement.a1 r14) {
        /*
            r11 = this;
            r0 = 2
            r11.O(r0)
            java.lang.Object r1 = r11.f798d
            com.google.android.gms.internal.measurement.w0 r1 = (com.google.android.gms.internal.measurement.w0) r1
            int r2 = r1.G()
            int r2 = r1.d(r2)
            java.lang.Object r3 = r13.f204y
            java.lang.String r4 = ""
            r5 = r3
        L15:
            int r6 = r11.V()     // Catch: java.lang.Throwable -> L49
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L7e
            boolean r7 = r1.h()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L25
            goto L7e
        L25:
            r7 = 1
            r8 = 0
            java.lang.String r9 = "Unable to parse map entry."
            if (r6 == r7) goto L5a
            if (r6 == r0) goto L4d
            boolean r6 = r1.h()     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.t1 -> L4b
            if (r6 != 0) goto L3f
            int r6 = r11.f795a     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.t1 -> L4b
            int r7 = r11.f796b     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.t1 -> L4b
            if (r6 != r7) goto L3a
            goto L3f
        L3a:
            boolean r6 = r1.s(r6)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.t1 -> L4b
            goto L40
        L3f:
            r6 = r8
        L40:
            if (r6 == 0) goto L43
            goto L15
        L43:
            com.google.android.gms.internal.measurement.u1 r6 = new com.google.android.gms.internal.measurement.u1     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.t1 -> L4b
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.t1 -> L4b
            throw r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.t1 -> L4b
        L49:
            r12 = move-exception
            goto L85
        L4b:
            r6 = move-exception
            goto L64
        L4d:
            java.lang.Object r6 = r13.f203x     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.t1 -> L4b
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.a3) r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.t1 -> L4b
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.t1 -> L4b
            java.lang.Object r5 = r11.R(r6, r7, r14)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.t1 -> L4b
            goto L15
        L5a:
            java.lang.Object r6 = r13.f202w     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.t1 -> L4b
            com.google.android.gms.internal.measurement.a3 r6 = (com.google.android.gms.internal.measurement.a3) r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.t1 -> L4b
            r7 = 0
            java.lang.Object r4 = r11.R(r6, r7, r7)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.measurement.t1 -> L4b
            goto L15
        L64:
            boolean r7 = r1.h()     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L75
            int r7 = r11.f795a     // Catch: java.lang.Throwable -> L49
            int r10 = r11.f796b     // Catch: java.lang.Throwable -> L49
            if (r7 != r10) goto L71
            goto L75
        L71:
            boolean r8 = r1.s(r7)     // Catch: java.lang.Throwable -> L49
        L75:
            if (r8 == 0) goto L78
            goto L15
        L78:
            com.google.android.gms.internal.measurement.u1 r12 = new com.google.android.gms.internal.measurement.u1     // Catch: java.lang.Throwable -> L49
            r12.<init>(r9, r6)     // Catch: java.lang.Throwable -> L49
            throw r12     // Catch: java.lang.Throwable -> L49
        L7e:
            r12.put(r4, r5)     // Catch: java.lang.Throwable -> L49
            r1.e(r2)
            return
        L85:
            r1.e(r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.k.N(com.google.android.gms.internal.measurement.z1, a7.j, com.google.android.gms.internal.measurement.a1):void");
    }

    public void O(int i) {
        if ((this.f795a & 7) != i) {
            throw new t1();
        }
    }

    public void P(Object obj, m2 m2Var, com.google.android.gms.internal.measurement.a1 a1Var) throws u1 {
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        int iG = w0Var.G();
        if (w0Var.f3184v + w0Var.f3185w >= 100) {
            throw new u1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iD = w0Var.d(iG);
        w0Var.f3184v++;
        m2Var.f(obj, this, a1Var);
        w0Var.r(0);
        w0Var.f3184v--;
        w0Var.e(iD);
    }

    public void Q(Object obj, m2 m2Var, com.google.android.gms.internal.measurement.a1 a1Var) {
        int i = this.f796b;
        this.f796b = ((this.f795a >>> 3) << 3) | 4;
        try {
            m2Var.f(obj, this, a1Var);
            if (this.f795a == this.f796b) {
            } else {
                throw new u1("Failed to parse the message.");
            }
        } finally {
            this.f796b = i;
        }
    }

    public Object R(a3 a3Var, Class cls, com.google.android.gms.internal.measurement.a1 a1Var) throws u1 {
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        a3 a3Var2 = a3.f2470x;
        switch (a3Var.ordinal()) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                O(1);
                return Double.valueOf(w0Var.t());
            case 1:
                O(5);
                return Float.valueOf(w0Var.u());
            case 2:
                O(0);
                return Long.valueOf(w0Var.w());
            case 3:
                O(0);
                return Long.valueOf(w0Var.v());
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                O(0);
                return Integer.valueOf(w0Var.x());
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                O(1);
                return Long.valueOf(w0Var.z());
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                O(5);
                return Integer.valueOf(w0Var.A());
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                O(0);
                return Boolean.valueOf(w0Var.B());
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                O(2);
                return w0Var.D();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                O(2);
                m2 m2VarA = j2.f2783c.a(cls);
                com.google.android.gms.internal.measurement.i1 i1VarA = m2VarA.a();
                P(i1VarA, m2VarA, a1Var);
                m2VarA.h(i1VarA);
                return i1VarA;
            case 11:
                return W();
            case 12:
                O(0);
                return Integer.valueOf(w0Var.G());
            case 13:
                O(0);
                return Integer.valueOf(w0Var.H());
            case 14:
                O(5);
                return Integer.valueOf(w0Var.I());
            case 15:
                O(1);
                return Long.valueOf(w0Var.J());
            case 16:
                O(0);
                return Integer.valueOf(w0Var.K());
            case 17:
                O(0);
                return Long.valueOf(w0Var.L());
        }
    }

    public void S(int i) throws u1 {
        if (((com.google.android.gms.internal.measurement.w0) this.f798d).i() != i) {
            throw new u1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public int V() {
        int iQ = this.f797c;
        if (iQ != 0) {
            this.f795a = iQ;
            this.f797c = 0;
        } else {
            iQ = ((com.google.android.gms.internal.measurement.w0) this.f798d).q();
            this.f795a = iQ;
        }
        if (iQ == 0 || iQ == this.f796b) {
            return Integer.MAX_VALUE;
        }
        return iQ >>> 3;
    }

    public com.google.android.gms.internal.measurement.t0 W() {
        O(2);
        return ((com.google.android.gms.internal.measurement.w0) this.f798d).E();
    }

    public void X(s1 s1Var) throws u1 {
        int iQ;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        int i = this.f795a & 7;
        if (i == 1) {
            do {
                s1Var.add(Double.valueOf(w0Var.t()));
                if (w0Var.h()) {
                    return;
                } else {
                    iQ = w0Var.q();
                }
            } while (iQ == this.f795a);
            this.f797c = iQ;
            return;
        }
        if (i != 2) {
            throw new t1();
        }
        int iG = w0Var.G();
        U(iG);
        int i10 = w0Var.i() + iG;
        do {
            s1Var.add(Double.valueOf(w0Var.t()));
        } while (w0Var.i() < i10);
    }

    public void Y(s1 s1Var) throws u1 {
        int iQ;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        int i = this.f795a & 7;
        if (i == 2) {
            int iG = w0Var.G();
            T(iG);
            int i10 = w0Var.i() + iG;
            do {
                s1Var.add(Float.valueOf(w0Var.u()));
            } while (w0Var.i() < i10);
            return;
        }
        if (i != 5) {
            throw new t1();
        }
        do {
            s1Var.add(Float.valueOf(w0Var.u()));
            if (w0Var.h()) {
                return;
            } else {
                iQ = w0Var.q();
            }
        } while (iQ == this.f795a);
        this.f797c = iQ;
    }

    public void Z(s1 s1Var) throws u1 {
        int iQ;
        int iQ2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        if (s1Var instanceof x1) {
            x1 x1Var = (x1) s1Var;
            int i = this.f795a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new t1();
                }
                int i10 = w0Var.i() + w0Var.G();
                do {
                    x1Var.d(w0Var.v());
                } while (w0Var.i() < i10);
                S(i10);
                return;
            }
            do {
                x1Var.d(w0Var.v());
                if (w0Var.h()) {
                    return;
                } else {
                    iQ2 = w0Var.q();
                }
            } while (iQ2 == this.f795a);
        } else {
            int i11 = this.f795a & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new t1();
                }
                int i12 = w0Var.i() + w0Var.G();
                do {
                    s1Var.add(Long.valueOf(w0Var.v()));
                } while (w0Var.i() < i12);
                S(i12);
                return;
            }
            do {
                s1Var.add(Long.valueOf(w0Var.v()));
                if (w0Var.h()) {
                    return;
                } else {
                    iQ = w0Var.q();
                }
            } while (iQ == this.f795a);
            iQ2 = iQ;
        }
        this.f797c = iQ2;
    }

    public int a() {
        int i = this.f797c;
        if (i != 0) {
            this.f795a = i;
            this.f797c = 0;
        } else {
            this.f795a = ((j) this.f798d).u();
        }
        int i10 = this.f795a;
        if (i10 == 0 || i10 == this.f796b) {
            return Integer.MAX_VALUE;
        }
        return i10 >>> 3;
    }

    public void b(Object obj, u0 u0Var, n nVar) {
        int i = this.f796b;
        this.f796b = ((this.f795a >>> 3) << 3) | 4;
        try {
            u0Var.g(obj, this, nVar);
            if (this.f795a == this.f796b) {
            } else {
                throw new z("Failed to parse the message.");
            }
        } finally {
            this.f796b = i;
        }
    }

    public void c(Object obj, u0 u0Var, n nVar) throws z {
        j jVar = (j) this.f798d;
        int iV = jVar.v();
        if (jVar.f791a >= 100) {
            throw new z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = jVar.e(iV);
        jVar.f791a++;
        u0Var.g(obj, this, nVar);
        jVar.a(0);
        jVar.f791a--;
        jVar.d(iE);
    }

    public void d(w wVar) throws z {
        int iU;
        j jVar = (j) this.f798d;
        int i = this.f795a & 7;
        if (i == 0) {
            do {
                ((s0) wVar).add(Boolean.valueOf(jVar.f()));
                if (jVar.c()) {
                    return;
                } else {
                    iU = jVar.u();
                }
            } while (iU == this.f795a);
            this.f797c = iU;
            return;
        }
        if (i != 2) {
            throw z.b();
        }
        int iB = jVar.b() + jVar.v();
        do {
            ((s0) wVar).add(Boolean.valueOf(jVar.f()));
        } while (jVar.b() < iB);
        v(iB);
    }

    public g e() throws y {
        w(2);
        return ((j) this.f798d).g();
    }

    public void f(w wVar) throws y {
        int iU;
        j jVar = (j) this.f798d;
        if ((this.f795a & 7) != 2) {
            throw z.b();
        }
        do {
            ((s0) wVar).add(e());
            if (jVar.c()) {
                return;
            } else {
                iU = jVar.u();
            }
        } while (iU == this.f795a);
        this.f797c = iU;
    }

    public void g(w wVar) throws z {
        int iU;
        j jVar = (j) this.f798d;
        int i = this.f795a & 7;
        if (i == 1) {
            do {
                ((s0) wVar).add(Double.valueOf(jVar.h()));
                if (jVar.c()) {
                    return;
                } else {
                    iU = jVar.u();
                }
            } while (iU == this.f795a);
            this.f797c = iU;
            return;
        }
        if (i != 2) {
            throw z.b();
        }
        int iV = jVar.v();
        if ((iV & 7) != 0) {
            throw new z("Failed to parse the message.");
        }
        int iB = jVar.b() + iV;
        do {
            ((s0) wVar).add(Double.valueOf(jVar.h()));
        } while (jVar.b() < iB);
    }

    public void h(w wVar) throws z {
        int iU;
        j jVar = (j) this.f798d;
        int i = this.f795a & 7;
        if (i == 0) {
            do {
                ((s0) wVar).add(Integer.valueOf(jVar.i()));
                if (jVar.c()) {
                    return;
                } else {
                    iU = jVar.u();
                }
            } while (iU == this.f795a);
            this.f797c = iU;
            return;
        }
        if (i != 2) {
            throw z.b();
        }
        int iB = jVar.b() + jVar.v();
        do {
            ((s0) wVar).add(Integer.valueOf(jVar.i()));
        } while (jVar.b() < iB);
        v(iB);
    }

    public Object i(p1 p1Var, Class cls, n nVar) throws z {
        j jVar = (j) this.f798d;
        switch (p1Var.ordinal()) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                w(1);
                return Double.valueOf(jVar.h());
            case 1:
                w(5);
                return Float.valueOf(jVar.l());
            case 2:
                w(0);
                return Long.valueOf(jVar.n());
            case 3:
                w(0);
                return Long.valueOf(jVar.w());
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                w(0);
                return Integer.valueOf(jVar.m());
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                w(1);
                return Long.valueOf(jVar.k());
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                w(5);
                return Integer.valueOf(jVar.j());
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                w(0);
                return Boolean.valueOf(jVar.f());
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                w(2);
                return jVar.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                u0 u0VarA = r0.f848c.a(cls);
                v vVarI = u0VarA.i();
                c(vVarI, u0VarA, nVar);
                u0VarA.d(vVarI);
                return vVarI;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(jVar.v());
            case 13:
                w(0);
                return Integer.valueOf(jVar.i());
            case 14:
                w(5);
                return Integer.valueOf(jVar.o());
            case 15:
                w(1);
                return Long.valueOf(jVar.p());
            case 16:
                w(0);
                return Integer.valueOf(jVar.q());
            case 17:
                w(0);
                return Long.valueOf(jVar.r());
        }
    }

    public void j(w wVar) throws z {
        int iU;
        j jVar = (j) this.f798d;
        int i = this.f795a & 7;
        if (i == 2) {
            int iV = jVar.v();
            if ((iV & 3) != 0) {
                throw new z("Failed to parse the message.");
            }
            int iB = jVar.b() + iV;
            do {
                ((s0) wVar).add(Integer.valueOf(jVar.j()));
            } while (jVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw z.b();
        }
        do {
            ((s0) wVar).add(Integer.valueOf(jVar.j()));
            if (jVar.c()) {
                return;
            } else {
                iU = jVar.u();
            }
        } while (iU == this.f795a);
        this.f797c = iU;
    }

    public void k(w wVar) throws z {
        int iU;
        j jVar = (j) this.f798d;
        int i = this.f795a & 7;
        if (i == 1) {
            do {
                ((s0) wVar).add(Long.valueOf(jVar.k()));
                if (jVar.c()) {
                    return;
                } else {
                    iU = jVar.u();
                }
            } while (iU == this.f795a);
            this.f797c = iU;
            return;
        }
        if (i != 2) {
            throw z.b();
        }
        int iV = jVar.v();
        if ((iV & 7) != 0) {
            throw new z("Failed to parse the message.");
        }
        int iB = jVar.b() + iV;
        do {
            ((s0) wVar).add(Long.valueOf(jVar.k()));
        } while (jVar.b() < iB);
    }

    public void l(w wVar) throws z {
        int iU;
        j jVar = (j) this.f798d;
        int i = this.f795a & 7;
        if (i == 2) {
            int iV = jVar.v();
            if ((iV & 3) != 0) {
                throw new z("Failed to parse the message.");
            }
            int iB = jVar.b() + iV;
            do {
                ((s0) wVar).add(Float.valueOf(jVar.l()));
            } while (jVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw z.b();
        }
        do {
            ((s0) wVar).add(Float.valueOf(jVar.l()));
            if (jVar.c()) {
                return;
            } else {
                iU = jVar.u();
            }
        } while (iU == this.f795a);
        this.f797c = iU;
    }

    public void m(w wVar) throws z {
        int iU;
        j jVar = (j) this.f798d;
        int i = this.f795a & 7;
        if (i == 0) {
            do {
                ((s0) wVar).add(Integer.valueOf(jVar.m()));
                if (jVar.c()) {
                    return;
                } else {
                    iU = jVar.u();
                }
            } while (iU == this.f795a);
            this.f797c = iU;
            return;
        }
        if (i != 2) {
            throw z.b();
        }
        int iB = jVar.b() + jVar.v();
        do {
            ((s0) wVar).add(Integer.valueOf(jVar.m()));
        } while (jVar.b() < iB);
        v(iB);
    }

    public void n(w wVar) throws z {
        int iU;
        j jVar = (j) this.f798d;
        int i = this.f795a & 7;
        if (i == 0) {
            do {
                ((s0) wVar).add(Long.valueOf(jVar.n()));
                if (jVar.c()) {
                    return;
                } else {
                    iU = jVar.u();
                }
            } while (iU == this.f795a);
            this.f797c = iU;
            return;
        }
        if (i != 2) {
            throw z.b();
        }
        int iB = jVar.b() + jVar.v();
        do {
            ((s0) wVar).add(Long.valueOf(jVar.n()));
        } while (jVar.b() < iB);
        v(iB);
    }

    public void o(w wVar) throws z {
        int iU;
        j jVar = (j) this.f798d;
        int i = this.f795a & 7;
        if (i == 2) {
            int iV = jVar.v();
            if ((iV & 3) != 0) {
                throw new z("Failed to parse the message.");
            }
            int iB = jVar.b() + iV;
            do {
                ((s0) wVar).add(Integer.valueOf(jVar.o()));
            } while (jVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw z.b();
        }
        do {
            ((s0) wVar).add(Integer.valueOf(jVar.o()));
            if (jVar.c()) {
                return;
            } else {
                iU = jVar.u();
            }
        } while (iU == this.f795a);
        this.f797c = iU;
    }

    public void p(w wVar) throws z {
        int iU;
        j jVar = (j) this.f798d;
        int i = this.f795a & 7;
        if (i == 1) {
            do {
                ((s0) wVar).add(Long.valueOf(jVar.p()));
                if (jVar.c()) {
                    return;
                } else {
                    iU = jVar.u();
                }
            } while (iU == this.f795a);
            this.f797c = iU;
            return;
        }
        if (i != 2) {
            throw z.b();
        }
        int iV = jVar.v();
        if ((iV & 7) != 0) {
            throw new z("Failed to parse the message.");
        }
        int iB = jVar.b() + iV;
        do {
            ((s0) wVar).add(Long.valueOf(jVar.p()));
        } while (jVar.b() < iB);
    }

    public void q(w wVar) throws z {
        int iU;
        j jVar = (j) this.f798d;
        int i = this.f795a & 7;
        if (i == 0) {
            do {
                ((s0) wVar).add(Integer.valueOf(jVar.q()));
                if (jVar.c()) {
                    return;
                } else {
                    iU = jVar.u();
                }
            } while (iU == this.f795a);
            this.f797c = iU;
            return;
        }
        if (i != 2) {
            throw z.b();
        }
        int iB = jVar.b() + jVar.v();
        do {
            ((s0) wVar).add(Integer.valueOf(jVar.q()));
        } while (jVar.b() < iB);
        v(iB);
    }

    public void r(w wVar) throws z {
        int iU;
        j jVar = (j) this.f798d;
        int i = this.f795a & 7;
        if (i == 0) {
            do {
                ((s0) wVar).add(Long.valueOf(jVar.r()));
                if (jVar.c()) {
                    return;
                } else {
                    iU = jVar.u();
                }
            } while (iU == this.f795a);
            this.f797c = iU;
            return;
        }
        if (i != 2) {
            throw z.b();
        }
        int iB = jVar.b() + jVar.v();
        do {
            ((s0) wVar).add(Long.valueOf(jVar.r()));
        } while (jVar.b() < iB);
        v(iB);
    }

    public void s(w wVar, boolean z2) throws y {
        String strS;
        int iU;
        j jVar = (j) this.f798d;
        if ((this.f795a & 7) != 2) {
            throw z.b();
        }
        do {
            if (z2) {
                w(2);
                strS = jVar.t();
            } else {
                w(2);
                strS = jVar.s();
            }
            ((s0) wVar).add(strS);
            if (jVar.c()) {
                return;
            } else {
                iU = jVar.u();
            }
        } while (iU == this.f795a);
        this.f797c = iU;
    }

    public void t(w wVar) throws z {
        int iU;
        j jVar = (j) this.f798d;
        int i = this.f795a & 7;
        if (i == 0) {
            do {
                ((s0) wVar).add(Integer.valueOf(jVar.v()));
                if (jVar.c()) {
                    return;
                } else {
                    iU = jVar.u();
                }
            } while (iU == this.f795a);
            this.f797c = iU;
            return;
        }
        if (i != 2) {
            throw z.b();
        }
        int iB = jVar.b() + jVar.v();
        do {
            ((s0) wVar).add(Integer.valueOf(jVar.v()));
        } while (jVar.b() < iB);
        v(iB);
    }

    public void u(w wVar) throws z {
        int iU;
        j jVar = (j) this.f798d;
        int i = this.f795a & 7;
        if (i == 0) {
            do {
                ((s0) wVar).add(Long.valueOf(jVar.w()));
                if (jVar.c()) {
                    return;
                } else {
                    iU = jVar.u();
                }
            } while (iU == this.f795a);
            this.f797c = iU;
            return;
        }
        if (i != 2) {
            throw z.b();
        }
        int iB = jVar.b() + jVar.v();
        do {
            ((s0) wVar).add(Long.valueOf(jVar.w()));
        } while (jVar.b() < iB);
        v(iB);
    }

    public void v(int i) throws z {
        if (((j) this.f798d).b() != i) {
            throw z.e();
        }
    }

    public void w(int i) throws y {
        if ((this.f795a & 7) != i) {
            throw z.b();
        }
    }

    public boolean x() {
        int i;
        j jVar = (j) this.f798d;
        if (jVar.c() || (i = this.f795a) == this.f796b) {
            return false;
        }
        return jVar.x(i);
    }

    public void y(s1 s1Var) throws u1 {
        int iQ;
        int iQ2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        if (s1Var instanceof x1) {
            x1 x1Var = (x1) s1Var;
            int i = this.f795a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new t1();
                }
                int i10 = w0Var.i() + w0Var.G();
                do {
                    x1Var.d(w0Var.w());
                } while (w0Var.i() < i10);
                S(i10);
                return;
            }
            do {
                x1Var.d(w0Var.w());
                if (w0Var.h()) {
                    return;
                } else {
                    iQ2 = w0Var.q();
                }
            } while (iQ2 == this.f795a);
        } else {
            int i11 = this.f795a & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new t1();
                }
                int i12 = w0Var.i() + w0Var.G();
                do {
                    s1Var.add(Long.valueOf(w0Var.w()));
                } while (w0Var.i() < i12);
                S(i12);
                return;
            }
            do {
                s1Var.add(Long.valueOf(w0Var.w()));
                if (w0Var.h()) {
                    return;
                } else {
                    iQ = w0Var.q();
                }
            } while (iQ == this.f795a);
            iQ2 = iQ;
        }
        this.f797c = iQ2;
    }

    public void z(s1 s1Var) throws u1 {
        int iQ;
        int iQ2;
        com.google.android.gms.internal.measurement.w0 w0Var = (com.google.android.gms.internal.measurement.w0) this.f798d;
        if (s1Var instanceof com.google.android.gms.internal.measurement.j1) {
            com.google.android.gms.internal.measurement.j1 j1Var = (com.google.android.gms.internal.measurement.j1) s1Var;
            int i = this.f795a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new t1();
                }
                int i10 = w0Var.i() + w0Var.G();
                do {
                    j1Var.d(w0Var.x());
                } while (w0Var.i() < i10);
                S(i10);
                return;
            }
            do {
                j1Var.d(w0Var.x());
                if (w0Var.h()) {
                    return;
                } else {
                    iQ2 = w0Var.q();
                }
            } while (iQ2 == this.f795a);
        } else {
            int i11 = this.f795a & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new t1();
                }
                int i12 = w0Var.i() + w0Var.G();
                do {
                    s1Var.add(Integer.valueOf(w0Var.x()));
                } while (w0Var.i() < i12);
                S(i12);
                return;
            }
            do {
                s1Var.add(Integer.valueOf(w0Var.x()));
                if (w0Var.h()) {
                    return;
                } else {
                    iQ = w0Var.q();
                }
            } while (iQ == this.f795a);
            iQ2 = iQ;
        }
        this.f797c = iQ2;
    }

    public k(j jVar) {
        Charset charset = x.f870a;
        this.f798d = jVar;
        jVar.f792b = this;
    }
}
