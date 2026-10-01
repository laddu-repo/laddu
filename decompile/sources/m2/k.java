package m2;

import java.util.TreeSet;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final TreeSet f8512a = new TreeSet(new d2.a(6));

    /* renamed from: b, reason: collision with root package name */
    public int f8513b;

    /* renamed from: c, reason: collision with root package name */
    public int f8514c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8515d;

    public k() {
        e();
    }

    public static int b(int i6, int i10) {
        int min;
        int i11 = i6 - i10;
        if (Math.abs(i11) > 1000 && (min = (Math.min(i6, i10) - Math.max(i6, i10)) + Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 1000) {
            if (i6 < i10) {
                return min;
            }
            return -min;
        }
        return i11;
    }

    public final synchronized void a(j jVar) {
        this.f8513b = jVar.f8510a.f8504c;
        this.f8512a.add(jVar);
    }

    public final synchronized void c(i iVar, long j) {
        if (this.f8512a.size() < 5000) {
            int i6 = iVar.f8504c;
            if (!this.f8515d) {
                e();
                this.f8514c = lg.c.m(i6 - 1);
                this.f8515d = true;
                a(new j(iVar, j));
                return;
            }
            if (Math.abs(b(i6, i.a(this.f8513b))) < 1000) {
                if (b(i6, this.f8514c) > 0) {
                    a(new j(iVar, j));
                    return;
                }
                return;
            } else {
                this.f8514c = lg.c.m(i6 - 1);
                this.f8512a.clear();
                a(new j(iVar, j));
                return;
            }
        }
        throw new IllegalStateException("Queue size limit of 5000 reached.");
    }

    public final synchronized i d(long j) {
        if (this.f8512a.isEmpty()) {
            return null;
        }
        j jVar = (j) this.f8512a.first();
        int i6 = jVar.f8510a.f8504c;
        if (i6 != i.a(this.f8514c) && j < jVar.f8511b) {
            return null;
        }
        this.f8512a.pollFirst();
        this.f8514c = i6;
        return jVar.f8510a;
    }

    public final synchronized void e() {
        this.f8512a.clear();
        this.f8515d = false;
        this.f8514c = -1;
        this.f8513b = -1;
    }
}
