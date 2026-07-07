package xf;

import o5.e0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static final b f14725d = new c(new i(false, false, false, a.f14721y), zf.a.f15333a);

    /* renamed from: a, reason: collision with root package name */
    public final i f14726a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f14727b;

    /* renamed from: c, reason: collision with root package name */
    public final w8.e f14728c = new w8.e(3);

    public c(i iVar, e0 e0Var) {
        this.f14726a = iVar;
        this.f14727b = e0Var;
    }

    public final Object a(String string, sf.a deserializer) {
        kotlin.jvm.internal.k.e(deserializer, "deserializer");
        kotlin.jvm.internal.k.e(string, "string");
        yf.v vVar = new yf.v(string);
        Object c10 = new yf.s(this, yf.x.f15107z, vVar, deserializer.d()).c(deserializer);
        vVar.o();
        return c10;
    }
}
