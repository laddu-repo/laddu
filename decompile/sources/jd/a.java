package jd;

import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import okhttp3.Request;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a extends ne.j implements ve.p {
    public RandomAccessFile A;
    public String B;
    public byte[] C;
    public kotlin.jvm.internal.u D;
    public long E;
    public int F;
    public final /* synthetic */ b G;

    /* renamed from: x, reason: collision with root package name */
    public File f7350x;

    /* renamed from: y, reason: collision with root package name */
    public Request.Builder f7351y;

    /* renamed from: z, reason: collision with root package name */
    public InputStream f7352z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, le.c cVar) {
        super(2, cVar);
        this.G = bVar;
    }

    @Override // ne.a
    public final le.c create(Object obj, le.c cVar) {
        return new a(this.G, cVar);
    }

    @Override // ve.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((gf.c0) obj, (le.c) obj2)).invokeSuspend(he.y.f6101a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x01d6, code lost:
    
        if (r8 == r12) goto L79;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0018. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015c A[Catch: Exception -> 0x0031, TryCatch #2 {Exception -> 0x0031, blocks: (B:10:0x002d, B:13:0x0041, B:16:0x0153, B:18:0x015c, B:20:0x0160, B:25:0x017f, B:27:0x0186, B:45:0x004d, B:47:0x0056, B:49:0x00e2, B:51:0x00fc, B:53:0x0102, B:55:0x012b, B:57:0x0131, B:65:0x0060, B:67:0x0073, B:69:0x0097, B:72:0x00a8, B:74:0x00bb, B:75:0x00d1), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc A[Catch: Exception -> 0x0031, TryCatch #2 {Exception -> 0x0031, blocks: (B:10:0x002d, B:13:0x0041, B:16:0x0153, B:18:0x015c, B:20:0x0160, B:25:0x017f, B:27:0x0186, B:45:0x004d, B:47:0x0056, B:49:0x00e2, B:51:0x00fc, B:53:0x0102, B:55:0x012b, B:57:0x0131, B:65:0x0060, B:67:0x0073, B:69:0x0097, B:72:0x00a8, B:74:0x00bb, B:75:0x00d1), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021c A[Catch: Exception -> 0x0208, TryCatch #1 {Exception -> 0x0208, blocks: (B:40:0x01e6, B:58:0x020a, B:59:0x0212, B:60:0x0213, B:61:0x021b, B:62:0x021c, B:63:0x0232), top: B:2:0x0018 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x01d6 -> B:15:0x01da). Please report as a decompilation issue!!! */
    @Override // ne.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
