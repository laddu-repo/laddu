package g4;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends FrameLayout implements r0 {
    public float A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f5627v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v0 f5628w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f5629x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c f5630y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f5631z;

    public x0(Context context) {
        super(context, null);
        this.f5629x = Collections.EMPTY_LIST;
        this.f5630y = c.f5492g;
        this.f5631z = 0.0533f;
        this.A = 0.08f;
        b bVar = new b(context, 0);
        this.f5627v = bVar;
        v0 v0Var = new v0(context, null);
        this.f5628w = v0Var;
        v0Var.setBackgroundColor(0);
        addView(bVar);
        addView(v0Var);
    }

    @Override // g4.r0
    public final void a(List list, c cVar, float f, float f4) {
        this.f5630y = cVar;
        this.f5631z = f;
        this.A = f4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            v1.b bVar = (v1.b) list.get(i);
            if (bVar.f13056d != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f5629x.isEmpty() || !arrayList2.isEmpty()) {
            this.f5629x = arrayList2;
            c();
        }
        this.f5627v.a(arrayList, cVar, f, f4);
        invalidate();
    }

    public final String b(int i, float f) {
        float fI = com.bumptech.glide.d.I(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fI == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fI / getContext().getResources().getDisplayMetrics().density)};
        int i10 = w1.b0.f13686a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0546 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instruction units count: 1862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.x0.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i10, int i11, int i12) {
        super.onLayout(z2, i, i10, i11, i12);
        if (!z2 || this.f5629x.isEmpty()) {
            return;
        }
        c();
    }
}
