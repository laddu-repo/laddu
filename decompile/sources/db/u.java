package db;

import java.util.Map;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u extends m {

    /* renamed from: x, reason: collision with root package name */
    public final Object f4047x;

    /* renamed from: y, reason: collision with root package name */
    public int f4048y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ v f4049z;

    public u(v vVar, int i6) {
        this.f4049z = vVar;
        Object obj = v.G;
        this.f4047x = vVar.j()[i6];
        this.f4048y = i6;
    }

    public final void a() {
        int i6 = this.f4048y;
        Object obj = this.f4047x;
        v vVar = this.f4049z;
        if (i6 != -1 && i6 < vVar.size()) {
            if (e9.f.c(obj, vVar.j()[this.f4048y])) {
                return;
            }
        }
        Object obj2 = v.G;
        this.f4048y = vVar.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4047x;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        v vVar = this.f4049z;
        Map c10 = vVar.c();
        if (c10 != null) {
            return c10.get(this.f4047x);
        }
        a();
        int i6 = this.f4048y;
        if (i6 == -1) {
            return null;
        }
        return vVar.k()[i6];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        v vVar = this.f4049z;
        Map c10 = vVar.c();
        Object obj2 = this.f4047x;
        if (c10 != null) {
            return c10.put(obj2, obj);
        }
        a();
        int i6 = this.f4048y;
        if (i6 == -1) {
            vVar.put(obj2, obj);
            return null;
        }
        Object obj3 = vVar.k()[i6];
        vVar.k()[this.f4048y] = obj;
        return obj3;
    }
}
