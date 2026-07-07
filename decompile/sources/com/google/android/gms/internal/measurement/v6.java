package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v6 extends x6 {
    @Override // com.google.android.gms.internal.measurement.x6
    public final void a(Object obj, long j, byte b10) {
        if (y6.f2538g) {
            y6.c(obj, j, b10);
        } else {
            y6.d(obj, j, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.x6
    public final boolean b(long j, Object obj) {
        if (y6.f2538g) {
            return y6.n(j, obj);
        }
        return y6.o(j, obj);
    }

    @Override // com.google.android.gms.internal.measurement.x6
    public final void c(Object obj, long j, boolean z10) {
        if (y6.f2538g) {
            y6.c(obj, j, z10 ? (byte) 1 : (byte) 0);
        } else {
            y6.d(obj, j, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.x6
    public final float d(long j, Object obj) {
        return Float.intBitsToFloat(this.f2522a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.x6
    public final void e(Object obj, long j, float f3) {
        this.f2522a.putInt(obj, j, Float.floatToIntBits(f3));
    }

    @Override // com.google.android.gms.internal.measurement.x6
    public final double f(long j, Object obj) {
        return Double.longBitsToDouble(this.f2522a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.x6
    public final void g(Object obj, long j, double d10) {
        this.f2522a.putLong(obj, j, Double.doubleToLongBits(d10));
    }
}
