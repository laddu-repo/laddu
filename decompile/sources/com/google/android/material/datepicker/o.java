package com.google.android.material.datepicker;

import android.view.View;
import java.util.NoSuchElementException;
import t0.w1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o implements t0.s, s3.b {
    public int A;
    public Object B;

    /* renamed from: x, reason: collision with root package name */
    public int f2673x;

    /* renamed from: y, reason: collision with root package name */
    public int f2674y;

    /* renamed from: z, reason: collision with root package name */
    public int f2675z;

    @Override // s3.b
    public int a() {
        return -1;
    }

    @Override // s3.b
    public int b() {
        return this.f2673x;
    }

    public long c() {
        int i6 = this.f2675z;
        if (i6 != 0) {
            long[] jArr = (long[]) this.B;
            int i10 = this.f2673x;
            long j = jArr[i10];
            this.f2673x = this.A & (i10 + 1);
            this.f2675z = i6 - 1;
            return j;
        }
        throw new NoSuchElementException();
    }

    @Override // s3.b
    public int d() {
        u1.t tVar = (u1.t) this.B;
        int i6 = this.f2674y;
        if (i6 == 8) {
            return tVar.y();
        }
        if (i6 == 16) {
            return tVar.E();
        }
        int i10 = this.f2675z;
        this.f2675z = i10 + 1;
        if (i10 % 2 == 0) {
            int y9 = tVar.y();
            this.A = y9;
            return (y9 & 240) >> 4;
        }
        return this.A & 15;
    }

    @Override // t0.s
    public w1 v(View view, w1 w1Var) {
        View view2 = (View) this.B;
        l0.c f3 = w1Var.f12417a.f(519);
        int i6 = this.f2673x;
        if (i6 >= 0) {
            view2.getLayoutParams().height = i6 + f3.f8063b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f2674y + f3.f8062a, this.f2675z + f3.f8063b, this.A + f3.f8064c, view2.getPaddingBottom());
        return w1Var;
    }
}
