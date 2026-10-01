package e2;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import r1.x0;
import u1.a0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f4214a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4215b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4216c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4217d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4218e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4219f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4220g;

    /* renamed from: h, reason: collision with root package name */
    public final long f4221h;

    /* renamed from: i, reason: collision with root package name */
    public final u f4222i;
    public final t j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f4223k;

    /* renamed from: l, reason: collision with root package name */
    public final i f4224l;

    /* renamed from: m, reason: collision with root package name */
    public final List f4225m;

    public c(long j, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, u uVar, t tVar, Uri uri, ArrayList arrayList) {
        this.f4214a = j;
        this.f4215b = j10;
        this.f4216c = j11;
        this.f4217d = z10;
        this.f4218e = j12;
        this.f4219f = j13;
        this.f4220g = j14;
        this.f4221h = j15;
        this.f4224l = iVar;
        this.f4222i = uVar;
        this.f4223k = uri;
        this.j = tVar;
        this.f4225m = arrayList;
    }

    @Override // l2.a
    public final Object a(List list) {
        long j;
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new x0(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i6 = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i6 >= this.f4225m.size()) {
                break;
            }
            if (((x0) linkedList.peek()).f11741x != i6) {
                long c10 = c(i6);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i6);
                List list2 = b10.f4246c;
                x0 x0Var = (x0) linkedList.poll();
                int i10 = x0Var.f11741x;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = x0Var.f11742y;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.f4206c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(x0Var.f11743z));
                        x0Var = (x0) linkedList.poll();
                        if (x0Var.f11741x != i10) {
                            break;
                        }
                    } while (x0Var.f11742y == i11);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f4204a, aVar.f4205b, arrayList3, aVar.f4207d, aVar.f4208e, aVar.f4209f));
                    if (x0Var.f11741x != i10) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(x0Var);
                arrayList.add(new h(b10.f4244a, b10.f4245b - j10, arrayList2, b10.f4247d));
                j11 = j10;
            }
            i6++;
        }
        long j12 = j11;
        long j13 = this.f4215b;
        if (j13 != -9223372036854775807L) {
            j = j13 - j12;
        }
        return new c(this.f4214a, j, this.f4216c, this.f4217d, this.f4218e, this.f4219f, this.f4220g, this.f4221h, this.f4224l, this.f4222i, this.j, this.f4223k, arrayList);
    }

    public final h b(int i6) {
        return (h) this.f4225m.get(i6);
    }

    public final long c(int i6) {
        List list = this.f4225m;
        if (i6 == list.size() - 1) {
            long j = this.f4215b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j - ((h) list.get(i6)).f4245b;
        }
        return ((h) list.get(i6 + 1)).f4245b - ((h) list.get(i6)).f4245b;
    }

    public final long d(int i6) {
        return a0.Q(c(i6));
    }
}
