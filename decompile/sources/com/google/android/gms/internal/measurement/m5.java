package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class m5 extends v4 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected t6 zzc;

    public m5() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = t6.f2446f;
    }

    public static m5 l(Class cls) {
        Map map = zzd;
        m5 m5Var = (m5) map.get(cls);
        if (m5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                m5Var = (m5) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (m5Var == null) {
            m5 m5Var2 = (m5) ((m5) y6.e(cls)).o(6);
            if (m5Var2 != null) {
                map.put(cls, m5Var2);
                return m5Var2;
            }
            throw new IllegalStateException();
        }
        return m5Var;
    }

    public static void m(Class cls, m5 m5Var) {
        m5Var.f();
        zzd.put(cls, m5Var);
    }

    public static Object n(Method method, m5 m5Var, Object... objArr) {
        try {
            return method.invoke(m5Var, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    @Override // com.google.android.gms.internal.measurement.v4
    public final int b(n6 n6Var) {
        if (e()) {
            int d10 = n6Var.d(this);
            if (d10 >= 0) {
                return d10;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(d10);
            throw new IllegalStateException(sb2.toString());
        }
        int i6 = this.zzb & Integer.MAX_VALUE;
        if (i6 == Integer.MAX_VALUE) {
            int d11 = n6Var.d(this);
            if (d11 >= 0) {
                this.zzb = (this.zzb & Integer.MIN_VALUE) | d11;
                return d11;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(d11).length() + 42);
            sb3.append("serialized size must be non-negative, was ");
            sb3.append(d11);
            throw new IllegalStateException(sb3.toString());
        }
        return i6;
    }

    public final void d(d5 d5Var) {
        n6 a10 = k6.f2322c.a(getClass());
        a6 a6Var = d5Var.f2183a;
        if (a6Var == null) {
            a6Var = new a6(d5Var);
        }
        a10.c(this, a6Var);
    }

    public final boolean e() {
        if ((this.zzb & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return k6.f2322c.a(getClass()).g(this, (m5) obj);
    }

    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final void g() {
        k6.f2322c.a(getClass()).f(this);
        f();
    }

    public final l5 h() {
        return (l5) o(5);
    }

    public final int hashCode() {
        if (!e()) {
            int i6 = this.zza;
            if (i6 == 0) {
                int i10 = k6.f2322c.a(getClass()).i(this);
                this.zza = i10;
                return i10;
            }
            return i6;
        }
        return k6.f2322c.a(getClass()).i(this);
    }

    public final l5 i() {
        l5 l5Var = (l5) o(5);
        l5Var.f(this);
        return l5Var;
    }

    public final void j() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int k() {
        if (e()) {
            int d10 = k6.f2322c.a(getClass()).d(this);
            if (d10 >= 0) {
                return d10;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(d10).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(d10);
            throw new IllegalStateException(sb2.toString());
        }
        int i6 = this.zzb & Integer.MAX_VALUE;
        if (i6 != Integer.MAX_VALUE) {
            return i6;
        }
        int d11 = k6.f2322c.a(getClass()).d(this);
        if (d11 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | d11;
            return d11;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(d11).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(d11);
        throw new IllegalStateException(sb3.toString());
    }

    public abstract Object o(int i6);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = f6.f2209a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        f6.b(this, sb2, 0);
        return sb2.toString();
    }
}
