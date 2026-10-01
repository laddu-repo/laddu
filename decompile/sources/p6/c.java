package p6;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
import m6.b0;
import m6.d0;
import p5.p;
import v6.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10589a;

    /* renamed from: b, reason: collision with root package name */
    public final o f10590b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10591c;

    public /* synthetic */ c(Object obj, o oVar, int i6) {
        this.f10589a = i6;
        this.f10591c = obj;
        this.f10590b = oVar;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, bg.m, bg.k] */
    @Override // p6.g
    public final Object a(le.c cVar) {
        int i6 = this.f10589a;
        boolean z10 = true;
        m6.h hVar = m6.h.f8662y;
        Object obj = this.f10591c;
        o oVar = this.f10590b;
        switch (i6) {
            case 0:
                return new d(new BitmapDrawable(oVar.f13407a.getResources(), (Bitmap) obj), false, hVar);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    ?? obj2 = new Object();
                    obj2.write(byteBuffer);
                    byteBuffer.position(0);
                    return new m(new d0(obj2, new b0(oVar.f13407a, 1), null), null, hVar);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = a7.f.f595a;
                if (!(drawable instanceof VectorDrawable) && !(drawable instanceof p)) {
                    z10 = false;
                }
                if (z10) {
                    drawable = new BitmapDrawable(oVar.f13407a.getResources(), a8.g.f(drawable, oVar.f13408b, oVar.f13410d, oVar.f13411e, oVar.f13412f));
                }
                return new d(drawable, z10, hVar);
        }
    }
}
