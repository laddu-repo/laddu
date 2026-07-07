package wc;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import p.l;
import uc.j;

/* loaded from: classes.dex */
public final class a implements d {
    public static final a C;
    public e A;
    public boolean B;

    /* renamed from: x, reason: collision with root package name */
    public l f14276x;

    /* renamed from: y, reason: collision with root package name */
    public Date f14277y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f14278z;

    /* JADX WARN: Type inference failed for: r0v0, types: [wc.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [wc.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, p.l] */
    static {
        ?? obj = new Object();
        ?? obj2 = new Object();
        obj2.f14276x = new Object();
        obj2.A = obj;
        C = obj2;
    }

    @Override // wc.d
    public final void a(boolean z10) {
        Date date;
        if (!this.B && z10) {
            this.f14276x.getClass();
            Date date2 = new Date();
            Date date3 = this.f14277y;
            if (date3 == null || date2.after(date3)) {
                this.f14277y = date2;
                if (this.f14278z) {
                    Iterator it = Collections.unmodifiableCollection(c.f14279c.f14281b).iterator();
                    while (it.hasNext()) {
                        yc.a aVar = ((j) it.next()).f13098e;
                        Date date4 = this.f14277y;
                        if (date4 != null) {
                            date = (Date) date4.clone();
                        } else {
                            date = null;
                        }
                        aVar.a(date);
                    }
                }
            }
        }
        this.B = z10;
    }
}
