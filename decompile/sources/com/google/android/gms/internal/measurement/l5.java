package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class l5 implements Cloneable {

    /* renamed from: x, reason: collision with root package name */
    public final m5 f2336x;

    /* renamed from: y, reason: collision with root package name */
    public m5 f2337y;

    public l5(m5 m5Var) {
        this.f2336x = m5Var;
        if (!m5Var.e()) {
            this.f2337y = (m5) m5Var.o(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public static void a(int i6, List list) {
        int size = list.size() - i6;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append("Element at index ");
        sb2.append(size);
        sb2.append(" is null.");
        String sb3 = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 >= i6) {
                list.remove(size2);
            } else {
                throw new NullPointerException(sb3);
            }
        }
    }

    public final void b() {
        if (!this.f2337y.e()) {
            m5 m5Var = (m5) this.f2336x.o(4);
            k6.f2322c.a(m5Var.getClass()).a(m5Var, this.f2337y);
            this.f2337y = m5Var;
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final l5 clone() {
        l5 l5Var = (l5) this.f2336x.o(5);
        l5Var.f2337y = d();
        return l5Var;
    }

    public final m5 d() {
        if (!this.f2337y.e()) {
            return this.f2337y;
        }
        this.f2337y.g();
        return this.f2337y;
    }

    public final m5 e() {
        m5 d10 = d();
        d10.getClass();
        boolean z10 = true;
        byte byteValue = ((Byte) d10.o(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z10 = false;
            } else {
                z10 = k6.f2322c.a(d10.getClass()).e(d10);
                d10.o(2);
            }
        }
        if (z10) {
            return d10;
        }
        throw new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void f(m5 m5Var) {
        m5 m5Var2 = this.f2336x;
        if (!m5Var2.equals(m5Var)) {
            if (!this.f2337y.e()) {
                m5 m5Var3 = (m5) m5Var2.o(4);
                k6.f2322c.a(m5Var3.getClass()).a(m5Var3, this.f2337y);
                this.f2337y = m5Var3;
            }
            m5 m5Var4 = this.f2337y;
            k6.f2322c.a(m5Var4.getClass()).a(m5Var4, m5Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, com.google.android.gms.internal.measurement.y4] */
    public final void g(byte[] bArr, int i6, f5 f5Var) {
        if (!this.f2337y.e()) {
            m5 m5Var = (m5) this.f2336x.o(4);
            k6.f2322c.a(m5Var.getClass()).a(m5Var, this.f2337y);
            this.f2337y = m5Var;
        }
        try {
            n6 a10 = k6.f2322c.a(this.f2337y.getClass());
            m5 m5Var2 = this.f2337y;
            ?? obj = new Object();
            f5Var.getClass();
            a10.h(m5Var2, bArr, 0, i6, obj);
        } catch (v5 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
