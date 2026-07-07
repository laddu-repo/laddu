package b1;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e extends ne.c {
    public int A;

    /* renamed from: x, reason: collision with root package name */
    public Serializable f1283x;

    /* renamed from: y, reason: collision with root package name */
    public Iterator f1284y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f1285z;

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.f1285z = obj;
        this.A |= Integer.MIN_VALUE;
        return bf.y.a(null, null, this);
    }
}
