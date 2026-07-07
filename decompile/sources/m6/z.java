package m6;

import android.graphics.ImageDecoder;
import android.os.Build;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z implements k {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f8698a;

    /* renamed from: b, reason: collision with root package name */
    public final v6.o f8699b;

    public z(a0 a0Var, v6.o oVar) {
        this.f8698a = a0Var;
        this.f8699b = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.jvm.internal.s, java.lang.Object] */
    @Override // m6.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(le.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof m6.w
            if (r0 == 0) goto L13
            r0 = r7
            m6.w r0 = (m6.w) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L1a
        L13:
            m6.w r0 = new m6.w
            ne.c r7 = (ne.c) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.f8691z
            int r1 = r0.B
            r2 = 2
            r3 = 1
            me.a r4 = me.a.f8833x
            if (r1 == 0) goto L42
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r0 = r0.f8689x
            kotlin.jvm.internal.s r0 = (kotlin.jvm.internal.s) r0
            he.a.f(r7)
            goto L72
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            kotlin.jvm.internal.s r1 = r0.f8690y
            java.lang.Object r3 = r0.f8689x
            m6.z r3 = (m6.z) r3
            he.a.f(r7)
            goto L61
        L42:
            he.a.f(r7)
            kotlin.jvm.internal.s r7 = new kotlin.jvm.internal.s
            r7.<init>()
            fd.j r1 = new fd.j
            r5 = 2
            r1.<init>(r5, r6, r7)
            r0.f8689x = r6
            r0.f8690y = r7
            r0.B = r3
            java.lang.Object r1 = gf.f0.D(r1, r0)
            if (r1 != r4) goto L5d
            goto L70
        L5d:
            r3 = r1
            r1 = r7
            r7 = r3
            r3 = r6
        L61:
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            r0.f8689x = r1
            r5 = 0
            r0.f8690y = r5
            r0.B = r2
            android.graphics.drawable.Drawable r7 = r3.c(r7, r0)
            if (r7 != r4) goto L71
        L70:
            return r4
        L71:
            r0 = r1
        L72:
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            boolean r0 = r0.f8051x
            m6.i r1 = new m6.i
            r1.<init>(r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.z.a(le.c):java.lang.Object");
    }

    public final ImageDecoder.Source b(a0 a0Var) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        ImageDecoder.Source createSource3;
        ImageDecoder.Source createSource4;
        ImageDecoder.Source createSource5;
        ImageDecoder.Source createSource6;
        ImageDecoder.Source createSource7;
        bg.c0 f3 = a0Var.f();
        if (f3 != null) {
            createSource7 = ImageDecoder.createSource(f3.toFile());
            return createSource7;
        }
        a8.b l10 = a0Var.l();
        boolean z10 = l10 instanceof a;
        v6.o oVar = this.f8699b;
        if (z10) {
            createSource6 = ImageDecoder.createSource(oVar.f13407a.getAssets(), ((a) l10).f8640a);
            return createSource6;
        }
        if (l10 instanceof g) {
            createSource5 = ImageDecoder.createSource(oVar.f13407a.getContentResolver(), ((g) l10).f8660a);
            return createSource5;
        }
        if (l10 instanceof c0) {
            c0 c0Var = (c0) l10;
            if (c0Var.f8645a.equals(oVar.f13407a.getPackageName())) {
                createSource4 = ImageDecoder.createSource(oVar.f13407a.getResources(), c0Var.f8646b);
                return createSource4;
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 31) {
            createSource3 = ImageDecoder.createSource(a0Var.m().p());
            return createSource3;
        }
        if (i6 == 30) {
            createSource2 = ImageDecoder.createSource(ByteBuffer.wrap(a0Var.m().p()));
            return createSource2;
        }
        createSource = ImageDecoder.createSource(a0Var.d().toFile());
        return createSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable c(android.graphics.drawable.Drawable r5, ne.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof m6.y
            if (r0 == 0) goto L13
            r0 = r6
            m6.y r0 = (m6.y) r0
            int r1 = r0.f8697z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8697z = r1
            goto L18
        L13:
            m6.y r0 = new m6.y
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f8695x
            int r0 = r0.f8697z
            if (r0 == 0) goto L2f
            r5 = 1
            if (r0 != r5) goto L27
            he.a.f(r6)
            r5 = 0
            r6 = r5
            goto L65
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            he.a.f(r6)
            boolean r6 = a9.c.w(r5)
            if (r6 != 0) goto L39
            return r5
        L39:
            android.graphics.drawable.AnimatedImageDrawable r6 = a9.c.i(r5)
            v6.o r0 = r4.f8699b
            v6.q r1 = r0.f13417l
            v6.q r0 = r0.f13417l
            java.lang.String r2 = "coil#repeat_count"
            java.util.Map r1 = r1.f13423x
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto L7b
            a9.c.s(r6)
            java.lang.String r6 = "coil#animation_start_callback"
            java.util.Map r1 = r0.f13423x
            java.lang.Object r6 = r1.get(r6)
            if (r6 != 0) goto L75
            java.lang.String r6 = "coil#animation_end_callback"
            java.util.Map r0 = r0.f13423x
            java.lang.Object r6 = r0.get(r6)
            if (r6 != 0) goto L6f
            r6 = r4
        L65:
            o6.c r0 = new o6.c
            v6.o r6 = r6.f8699b
            w6.g r6 = r6.f13411e
            r0.<init>(r5, r6)
            return r0
        L6f:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L75:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L7b:
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.z.c(android.graphics.drawable.Drawable, ne.c):android.graphics.drawable.Drawable");
    }
}
