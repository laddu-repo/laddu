package wb;

import java.util.Date;
import java.util.HashMap;
import ub.f;
import ub.g;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements vb.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f14263f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f14264g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14266a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14267b;

    /* renamed from: c, reason: collision with root package name */
    public final a f14268c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14269d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f14262e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f14265h = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [wb.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [wb.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [wb.c, java.lang.Object] */
    static {
        final int i6 = 0;
        f14263f = new f() { // from class: wb.b
            @Override // ub.a
            public final void a(Object obj, Object obj2) {
                switch (i6) {
                    case 0:
                        ((g) obj2).d((String) obj);
                        return;
                    default:
                        ((g) obj2).e(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final int i10 = 1;
        f14264g = new f() { // from class: wb.b
            @Override // ub.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).d((String) obj);
                        return;
                    default:
                        ((g) obj2).e(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f14266a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f14267b = hashMap2;
        this.f14268c = f14262e;
        this.f14269d = false;
        hashMap2.put(String.class, f14263f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f14264g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f14265h);
        hashMap.remove(Date.class);
    }

    public final vb.a a(Class cls, ub.d dVar) {
        this.f14266a.put(cls, dVar);
        this.f14267b.remove(cls);
        return this;
    }
}
