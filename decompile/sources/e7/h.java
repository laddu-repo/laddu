package e7;

import android.graphics.Color;
import android.graphics.Matrix;
import j1.f0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final j7.a f4413a;

    /* renamed from: b, reason: collision with root package name */
    public final j7.a f4414b;

    /* renamed from: c, reason: collision with root package name */
    public final f f4415c;

    /* renamed from: d, reason: collision with root package name */
    public final i f4416d;

    /* renamed from: e, reason: collision with root package name */
    public final i f4417e;

    /* renamed from: f, reason: collision with root package name */
    public final i f4418f;

    /* renamed from: g, reason: collision with root package name */
    public final i f4419g;

    /* renamed from: h, reason: collision with root package name */
    public Matrix f4420h;

    public h(j7.a aVar, j7.a aVar2, b4.h hVar) {
        this.f4414b = aVar;
        this.f4413a = aVar2;
        e G0 = ((h7.a) hVar.f1471z).G0();
        this.f4415c = (f) G0;
        G0.a(this);
        aVar2.f(G0);
        i G02 = ((h7.b) hVar.A).G0();
        this.f4416d = G02;
        G02.a(this);
        aVar2.f(G02);
        i G03 = ((h7.b) hVar.B).G0();
        this.f4417e = G03;
        G03.a(this);
        aVar2.f(G03);
        i G04 = ((h7.b) hVar.f1469x).G0();
        this.f4418f = G04;
        G04.a(this);
        aVar2.f(G04);
        i G05 = ((h7.b) hVar.f1470y).G0();
        this.f4419g = G05;
        G05.a(this);
        aVar2.f(G05);
    }

    @Override // e7.a
    public final void a() {
        this.f4414b.a();
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, n7.a] */
    public final n7.a b(Matrix matrix, int i6) {
        float l10 = this.f4417e.l() * 0.017453292f;
        float floatValue = ((Float) this.f4418f.e()).floatValue();
        double d10 = l10;
        float sin = ((float) Math.sin(d10)) * floatValue;
        float cos = ((float) Math.cos(d10 + 3.141592653589793d)) * floatValue;
        float floatValue2 = ((Float) this.f4419g.e()).floatValue();
        int intValue = ((Integer) this.f4415c.e()).intValue();
        int argb = Color.argb(Math.round((((Float) this.f4416d.e()).floatValue() * i6) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
        ?? obj = new Object();
        obj.f9084a = floatValue2 * 0.33f;
        obj.f9085b = sin;
        obj.f9086c = cos;
        obj.f9087d = argb;
        obj.f9088e = null;
        obj.c(matrix);
        if (this.f4420h == null) {
            this.f4420h = new Matrix();
        }
        this.f4413a.f7262w.e().invert(this.f4420h);
        obj.c(this.f4420h);
        return obj;
    }

    public final void c(f0 f0Var) {
        this.f4416d.j(new g(f0Var));
    }
}
