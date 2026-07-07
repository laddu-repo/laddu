package l6;

import android.graphics.Bitmap;
import v6.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends ne.c {
    public c A;
    public Bitmap B;
    public /* synthetic */ Object C;
    public final /* synthetic */ k D;
    public int E;

    /* renamed from: x, reason: collision with root package name */
    public k f8237x;

    /* renamed from: y, reason: collision with root package name */
    public r f8238y;

    /* renamed from: z, reason: collision with root package name */
    public v6.k f8239z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, ne.c cVar) {
        super(cVar);
        this.D = kVar;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return k.a(this.D, null, 0, this);
    }
}
