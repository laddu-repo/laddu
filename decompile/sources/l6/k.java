package l6;

import a7.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import gf.c2;
import gf.f0;
import gf.o0;
import he.m;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import mf.o;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8245a;

    /* renamed from: b, reason: collision with root package name */
    public final v6.c f8246b;

    /* renamed from: c, reason: collision with root package name */
    public final m f8247c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8248d;

    /* renamed from: e, reason: collision with root package name */
    public final a7.j f8249e;

    /* renamed from: f, reason: collision with root package name */
    public final mf.e f8250f;

    /* renamed from: g, reason: collision with root package name */
    public final n9.j f8251g;

    /* renamed from: h, reason: collision with root package name */
    public final b f8252h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f8253i;

    public k(Context context, v6.c cVar, m mVar, m mVar2, he.f fVar, b bVar, a7.j jVar) {
        this.f8245a = context;
        this.f8246b = cVar;
        this.f8247c = mVar;
        this.f8248d = fVar;
        this.f8249e = jVar;
        c2 e10 = f0.e();
        of.e eVar = o0.f5693a;
        this.f8250f = f0.b(cf.m.A(e10, o.f8875a.A).plus(new j(this)));
        l lVar = new l(this);
        n9.j jVar2 = new n9.j(this, lVar);
        this.f8251g = jVar2;
        b4.h hVar = new b4.h(bVar);
        hVar.b(new s6.a(2), HttpUrl.class);
        int i6 = 5;
        hVar.b(new s6.a(i6), String.class);
        hVar.b(new s6.a(1), Uri.class);
        int i10 = 4;
        hVar.b(new s6.a(i10), Uri.class);
        int i11 = 3;
        hVar.b(new s6.a(i11), Integer.class);
        int i12 = 0;
        hVar.b(new s6.a(i12), byte[].class);
        Object obj = new Object();
        ArrayList arrayList = (ArrayList) hVar.B;
        arrayList.add(new he.i(obj, Uri.class));
        arrayList.add(new he.i(new r6.a(jVar.f606a), File.class));
        hVar.a(new p6.i(fVar, mVar2, jVar.f608c), Uri.class);
        hVar.a(new p6.a(i6), File.class);
        hVar.a(new p6.a(i12), Uri.class);
        hVar.a(new p6.a(i11), Uri.class);
        hVar.a(new p6.a(6), Uri.class);
        hVar.a(new p6.a(i10), Drawable.class);
        hVar.a(new p6.a(1), Bitmap.class);
        hVar.a(new p6.a(2), ByteBuffer.class);
        m6.d dVar = new m6.d(jVar.f609d, jVar.f610e);
        ArrayList arrayList2 = (ArrayList) hVar.f1470y;
        arrayList2.add(dVar);
        List p10 = a8.c.p((ArrayList) hVar.f1471z);
        this.f8252h = new b(p10, a8.c.p((ArrayList) hVar.A), a8.c.p(arrayList), a8.c.p((ArrayList) hVar.f1469x), a8.c.p(arrayList2));
        this.f8253i = ie.j.Q(p10, new q6.h(this, lVar, jVar2));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8 A[Catch: all -> 0x00db, TryCatch #4 {all -> 0x00db, blocks: (B:23:0x00de, B:25:0x00e8, B:26:0x00eb, B:28:0x00fd, B:29:0x0100, B:14:0x00bd, B:16:0x00c3, B:18:0x00c8, B:70:0x0182, B:71:0x0189), top: B:13:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd A[Catch: all -> 0x00db, TryCatch #4 {all -> 0x00db, blocks: (B:23:0x00de, B:25:0x00e8, B:26:0x00eb, B:28:0x00fd, B:29:0x0100, B:14:0x00bd, B:16:0x00c3, B:18:0x00c8, B:70:0x0182, B:71:0x0189), top: B:13:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d A[Catch: all -> 0x015d, TryCatch #5 {all -> 0x015d, blocks: (B:40:0x0147, B:42:0x014d, B:45:0x015f, B:47:0x0163, B:48:0x0172, B:49:0x0177), top: B:39:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015f A[Catch: all -> 0x015d, TryCatch #5 {all -> 0x015d, blocks: (B:40:0x0147, B:42:0x014d, B:45:0x015f, B:47:0x0163, B:48:0x0172, B:49:0x0177), top: B:39:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018e A[Catch: all -> 0x01a0, TRY_LEAVE, TryCatch #0 {all -> 0x01a0, blocks: (B:54:0x018a, B:56:0x018e, B:59:0x01a2, B:60:0x01aa), top: B:53:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a2 A[Catch: all -> 0x01a0, TRY_ENTER, TryCatch #0 {all -> 0x01a0, blocks: (B:54:0x018a, B:56:0x018e, B:59:0x01a2, B:60:0x01aa), top: B:53:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007b  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [v6.r] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [v6.k] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, l6.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(l6.k r21, v6.k r22, int r23, ne.c r24) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.k.a(l6.k, v6.k, int, ne.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r4 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(v6.f r3, x6.a r4, l6.c r5) {
        /*
            v6.k r0 = r3.f13358b
            android.graphics.drawable.Drawable r1 = r3.f13357a
            boolean r2 = r4 instanceof x6.a
            if (r2 != 0) goto Lb
            if (r4 == 0) goto L1f
            goto L15
        Lb:
            z6.d r2 = r0.f13388h
            z6.e r3 = r2.a(r4, r3)
            boolean r2 = r3 instanceof z6.c
            if (r2 == 0) goto L19
        L15:
            r4.b(r1)
            goto L1f
        L19:
            r5.getClass()
            r3.a()
        L1f:
            r5.getClass()
            v6.j r3 = r0.f13384d
            if (r3 == 0) goto L29
            r3.i()
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.k.c(v6.f, x6.a, l6.c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r4 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(v6.s r3, x6.a r4, l6.c r5) {
        /*
            v6.k r0 = r3.f13425b
            android.graphics.drawable.Drawable r1 = r3.f13424a
            boolean r2 = r4 instanceof x6.a
            if (r2 != 0) goto Lb
            if (r4 == 0) goto L1f
            goto L15
        Lb:
            z6.d r2 = r0.f13388h
            z6.e r3 = r2.a(r4, r3)
            boolean r2 = r3 instanceof z6.c
            if (r2 == 0) goto L19
        L15:
            r4.b(r1)
            goto L1f
        L19:
            r5.getClass()
            r3.a()
        L1f:
            r5.getClass()
            v6.j r3 = r0.f13384d
            if (r3 == 0) goto L29
            r3.onSuccess()
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.k.d(v6.s, x6.a, l6.c):void");
    }

    public final v6.e b(v6.k kVar) {
        f0.g(this.f8250f, null, new g(this, kVar, null, 0), 3);
        x6.a aVar = kVar.f13383c;
        if (aVar instanceof x6.a) {
            return a7.f.c(aVar.f14692y).a();
        }
        return new v6.m(1);
    }
}
