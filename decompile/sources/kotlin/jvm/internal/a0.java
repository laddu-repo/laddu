package kotlin.jvm.internal;

import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a0 implements bf.p {

    /* renamed from: x, reason: collision with root package name */
    public final e f8044x;

    /* renamed from: y, reason: collision with root package name */
    public final List f8045y;

    public a0(e eVar, List arguments) {
        k.e(arguments, "arguments");
        this.f8044x = eVar;
        this.f8045y = arguments;
    }

    public final String a(boolean z10) {
        String name;
        String L;
        e eVar = this.f8044x;
        Class r10 = cf.m.r(eVar);
        if (r10.isArray()) {
            if (r10.equals(boolean[].class)) {
                name = "kotlin.BooleanArray";
            } else if (r10.equals(char[].class)) {
                name = "kotlin.CharArray";
            } else if (r10.equals(byte[].class)) {
                name = "kotlin.ByteArray";
            } else if (r10.equals(short[].class)) {
                name = "kotlin.ShortArray";
            } else if (r10.equals(int[].class)) {
                name = "kotlin.IntArray";
            } else if (r10.equals(float[].class)) {
                name = "kotlin.FloatArray";
            } else if (r10.equals(long[].class)) {
                name = "kotlin.LongArray";
            } else if (r10.equals(double[].class)) {
                name = "kotlin.DoubleArray";
            } else {
                name = "kotlin.Array";
            }
        } else if (z10 && r10.isPrimitive()) {
            name = cf.m.s(eVar).getName();
        } else {
            name = r10.getName();
        }
        if (this.f8045y.isEmpty()) {
            L = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            L = ie.j.L(this.f8045y, ", ", "<", ">", new cf.n(this, 7), 24);
        }
        return name + L + HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f8044x.equals(a0Var.f8044x) && k.a(this.f8045y, a0Var.f8045y)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8045y.hashCode() + (this.f8044x.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return a(false) + " (Kotlin reflection is not available)";
    }
}
