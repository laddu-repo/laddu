package k4;

import android.content.Context;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l0 extends FrameLayout implements f0 {
    public d A;
    public float B;
    public float C;

    /* renamed from: x, reason: collision with root package name */
    public final c f7651x;

    /* renamed from: y, reason: collision with root package name */
    public final j0 f7652y;

    /* renamed from: z, reason: collision with root package name */
    public List f7653z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [k4.j0, android.view.View, android.webkit.WebView] */
    public l0(Context context) {
        super(context, null);
        this.f7653z = Collections.EMPTY_LIST;
        this.A = d.f7611g;
        this.B = 0.0533f;
        this.C = 0.08f;
        c cVar = new c(context, 0);
        this.f7651x = cVar;
        ?? webView = new WebView(context, null);
        this.f7652y = webView;
        webView.setBackgroundColor(0);
        addView(cVar);
        addView(webView);
    }

    @Override // k4.f0
    public final void a(List list, d dVar, float f3, float f10) {
        this.A = dVar;
        this.B = f3;
        this.C = f10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            t1.b bVar = (t1.b) list.get(i6);
            if (bVar.f12461d != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f7653z.isEmpty() || !arrayList2.isEmpty()) {
            this.f7653z = arrayList2;
            c();
        }
        this.f7651x.a(arrayList, dVar, f3, f10);
        invalidate();
    }

    public final String b(int i6, float f3) {
        float A = a8.e.A(i6, f3, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (A == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(A / getContext().getResources().getDisplayMetrics().density)};
        String str = u1.a0.f12750a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x04b8, code lost:
    
        if (((android.text.style.TypefaceSpan) r3).getFamily() != null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x01f9, code lost:
    
        if (r12 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x01fc, code lost:
    
        r30 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01ff, code lost:
    
        if (r12 != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0541 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.l0.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        if (z10 && !this.f7653z.isEmpty()) {
            c();
        }
    }
}
