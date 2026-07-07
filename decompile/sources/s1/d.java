package s1;

import db.k0;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f11977a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11978b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f11979c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f11980d;

    public d(k0 k0Var) {
        this.f11977a = k0Var;
        e eVar = e.f11981e;
        this.f11980d = false;
    }

    public final void a() {
        ArrayList arrayList = this.f11978b;
        arrayList.clear();
        this.f11980d = false;
        int i6 = 0;
        while (true) {
            k0 k0Var = this.f11977a;
            if (i6 >= k0Var.size()) {
                break;
            }
            g gVar = (g) k0Var.get(i6);
            gVar.flush();
            if (gVar.isActive()) {
                arrayList.add(gVar);
            }
            i6++;
        }
        this.f11979c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= b(); i10++) {
            this.f11979c[i10] = ((g) arrayList.get(i10)).d();
        }
    }

    public final int b() {
        return this.f11979c.length - 1;
    }

    public final boolean c() {
        if (this.f11980d && ((g) this.f11978b.get(b())).c() && !this.f11979c[b()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        return !this.f11978b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z10;
        ByteBuffer byteBuffer2;
        boolean z11;
        for (boolean z12 = true; z12; z12 = z10) {
            z10 = false;
            for (int i6 = 0; i6 <= b(); i6++) {
                if (!this.f11979c[i6].hasRemaining()) {
                    ArrayList arrayList = this.f11978b;
                    g gVar = (g) arrayList.get(i6);
                    if (gVar.c()) {
                        if (!this.f11979c[i6].hasRemaining() && i6 < b()) {
                            ((g) arrayList.get(i6 + 1)).g();
                        }
                    } else {
                        if (i6 > 0) {
                            byteBuffer2 = this.f11979c[i6 - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = g.f11986a;
                        }
                        long remaining = byteBuffer2.remaining();
                        gVar.f(byteBuffer2);
                        this.f11979c[i6] = gVar.d();
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.f11979c[i6].hasRemaining()) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        z10 |= z11;
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        k0 k0Var = ((d) obj).f11977a;
        k0 k0Var2 = this.f11977a;
        if (k0Var2.size() != k0Var.size()) {
            return false;
        }
        for (int i6 = 0; i6 < k0Var2.size(); i6++) {
            if (k0Var2.get(i6) != k0Var.get(i6)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f11977a.hashCode();
    }
}
