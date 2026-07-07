package a7;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.f0;
import he.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements androidx.lifecycle.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f591x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f592y;

    public /* synthetic */ c(Object obj, int i6) {
        this.f591x = i6;
        this.f592y = obj;
    }

    @Override // androidx.lifecycle.l
    public final void K(f0 f0Var) {
        switch (this.f591x) {
            case 0:
            case 1:
                return;
            default:
                j6.c cVar = (j6.c) this.f592y;
                if (!j6.c.f7235c.post(new j2.h(cVar, 1))) {
                    cVar.b();
                    return;
                }
                return;
        }
    }

    @Override // androidx.lifecycle.l
    public final void S(f0 owner) {
        switch (this.f591x) {
            case 0:
                ((gf.k) this.f592y).resumeWith(y.f6101a);
                return;
            case 1:
                kotlin.jvm.internal.k.e(owner, "owner");
                return;
            default:
                kotlin.jvm.internal.k.e(owner, "owner");
                return;
        }
    }

    @Override // androidx.lifecycle.l
    public final void d(f0 owner) {
        Handler handler;
        switch (this.f591x) {
            case 0:
                kotlin.jvm.internal.k.e(owner, "owner");
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = e1.b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new ad.a(2), 500L);
                ((androidx.lifecycle.y) this.f592y).c(this);
                return;
            default:
                kotlin.jvm.internal.k.e(owner, "owner");
                return;
        }
    }

    @Override // androidx.lifecycle.l
    public final void f(f0 owner) {
        switch (this.f591x) {
            case 0:
                r4.a.b(owner);
                return;
            case 1:
                r4.a.b(owner);
                return;
            default:
                kotlin.jvm.internal.k.e(owner, "owner");
                return;
        }
    }

    @Override // androidx.lifecycle.l
    public final void l(f0 f0Var) {
        int i6 = this.f591x;
    }

    @Override // androidx.lifecycle.l
    public final void y(f0 f0Var) {
        int i6 = this.f591x;
    }

    public c(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.y yVar) {
        this.f591x = 1;
        this.f592y = yVar;
    }

    private final /* synthetic */ void a(f0 f0Var) {
    }

    private final /* synthetic */ void b(f0 f0Var) {
    }

    private final /* synthetic */ void c(f0 f0Var) {
    }

    private final /* synthetic */ void e(f0 f0Var) {
    }

    private final void g(f0 f0Var) {
    }

    private final /* synthetic */ void h(f0 f0Var) {
    }

    private final /* synthetic */ void i(f0 f0Var) {
    }

    private final void j(f0 f0Var) {
    }
}
