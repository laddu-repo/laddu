package a2;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Trace;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f154x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f155y;

    public /* synthetic */ a(w0 w0Var, v1 v1Var) {
        this.f154x = 3;
        this.f155y = v1Var;
    }

    private final void a() {
        e1.r rVar = (e1.r) this.f155y;
        synchronized (rVar.f4183d) {
            try {
                if (rVar.f4187h == null) {
                    return;
                }
                try {
                    q0.i d10 = rVar.d();
                    int i6 = d10.f10822f;
                    if (i6 == 2) {
                        synchronized (rVar.f4183d) {
                        }
                    }
                    if (i6 == 0) {
                        try {
                            int i10 = p0.i.f10450a;
                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            w8.l lVar = rVar.f4182c;
                            Context context = rVar.f4180a;
                            lVar.getClass();
                            q0.i[] iVarArr = {d10};
                            android.support.v4.media.session.b bVar = l0.f.f8069a;
                            a8.f.F("TypefaceCompat.createFromFontInfo");
                            try {
                                Typeface g10 = l0.f.f8069a.g(context, iVarArr, 0);
                                Trace.endSection();
                                MappedByteBuffer r10 = bf.y.r(rVar.f4180a, d10.f10817a);
                                if (r10 != null && g10 != null) {
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        ic.s sVar = new ic.s(g10, a8.g.n(r10));
                                        Trace.endSection();
                                        synchronized (rVar.f4183d) {
                                            try {
                                                a8.e eVar = rVar.f4187h;
                                                if (eVar != null) {
                                                    eVar.w(sVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        rVar.b();
                                        return;
                                    } finally {
                                        int i11 = p0.i.f10450a;
                                    }
                                }
                                throw new RuntimeException("Unable to open file.");
                            } finally {
                                Trace.endSection();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i6 + ")");
                } catch (Throwable th2) {
                    synchronized (rVar.f4183d) {
                        try {
                            a8.e eVar2 = rVar.f4187h;
                            if (eVar2 != null) {
                                eVar2.v(th2);
                            }
                            rVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    private final void b() {
        b4.h hVar = (b4.h) this.f155y;
        synchronized (((ArrayDeque) hVar.f1469x)) {
            SharedPreferences.Editor edit = ((SharedPreferences) hVar.f1471z).edit();
            String str = (String) hVar.A;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) hVar.f1469x).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) hVar.B);
            }
            edit.putString(str, sb2.toString()).commit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0343 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v33, types: [ve.a, kotlin.jvm.internal.l] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.a.run():void");
    }

    public /* synthetic */ a(Object obj, int i6) {
        this.f154x = i6;
        this.f155y = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(ve.a aVar) {
        this.f154x = 9;
        this.f155y = (kotlin.jvm.internal.l) aVar;
    }
}
