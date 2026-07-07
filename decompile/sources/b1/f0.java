package b1;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f0 extends ne.c {
    public FileOutputStream A;
    public /* synthetic */ Object B;
    public final /* synthetic */ g0 C;
    public int D;

    /* renamed from: x, reason: collision with root package name */
    public g0 f1291x;

    /* renamed from: y, reason: collision with root package name */
    public File f1292y;

    /* renamed from: z, reason: collision with root package name */
    public FileOutputStream f1293z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, ne.c cVar) {
        super(cVar);
        this.C = g0Var;
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.j(null, this);
    }
}
