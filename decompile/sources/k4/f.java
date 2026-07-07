package k4;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.playfy.tv.R;
import db.c1;
import java.util.ArrayList;
import java.util.List;
import r1.j1;
import r1.k1;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f extends w4.k0 {
    public List A = new ArrayList();
    public final /* synthetic */ q B;
    public final /* synthetic */ int C;
    public final /* synthetic */ q D;

    public f(q qVar, int i6) {
        this.C = i6;
        this.D = qVar;
        this.B = qVar;
    }

    @Override // w4.k0
    public final int a() {
        if (this.A.isEmpty()) {
            return 0;
        }
        return this.A.size() + 1;
    }

    @Override // w4.k0
    public /* bridge */ /* synthetic */ void d(i1 i1Var, int i6) {
        switch (this.C) {
            case 1:
                j((m) i1Var, i6);
                return;
            default:
                j((m) i1Var, i6);
                return;
        }
    }

    @Override // w4.k0
    public final i1 f(ViewGroup viewGroup, int i6) {
        return new m(LayoutInflater.from(this.B.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    public boolean h(j1 j1Var) {
        for (int i6 = 0; i6 < this.A.size(); i6++) {
            if (j1Var.D.containsKey(((n) this.A.get(i6)).f7656a.f11571b)) {
                return true;
            }
        }
        return false;
    }

    public void i(List list) {
        Drawable drawable;
        String str;
        q qVar = this.D;
        ImageView imageView = qVar.f7667c0;
        boolean z10 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= ((c1) list).A) {
                break;
            }
            n nVar = (n) ((c1) list).get(i6);
            k1 k1Var = nVar.f7656a;
            if (k1Var.f11574e[nVar.f7657b]) {
                z10 = true;
                break;
            }
            i6++;
        }
        if (imageView != null) {
            if (z10) {
                drawable = qVar.E0;
            } else {
                drawable = qVar.F0;
            }
            imageView.setImageDrawable(drawable);
            if (z10) {
                str = qVar.G0;
            } else {
                str = qVar.H0;
            }
            imageView.setContentDescription(str);
        }
        this.A = list;
    }

    public void j(m mVar, int i6) {
        int i10;
        switch (this.C) {
            case 1:
                k(mVar, i6);
                if (i6 > 0) {
                    n nVar = (n) this.A.get(i6 - 1);
                    View view = mVar.f7655v;
                    if (nVar.f7656a.f11574e[nVar.f7657b]) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    view.setVisibility(i10);
                    return;
                }
                return;
            default:
                k(mVar, i6);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:
    
        if (r9.f11574e[r5.f7657b] != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(k4.m r8, int r9) {
        /*
            r7 = this;
            k4.q r0 = r7.B
            r1.u0 r3 = r0.M0
            if (r3 != 0) goto L7
            return
        L7:
            if (r9 != 0) goto L7a
            int r9 = r7.C
            switch(r9) {
                case 0: goto L4d;
                default: goto Le;
            }
        Le:
            android.widget.TextView r9 = r8.f7654u
            r0 = 2132017343(0x7f1400bf, float:1.9672962E38)
            r9.setText(r0)
            r9 = 0
            r0 = 0
        L18:
            java.util.List r1 = r7.A
            int r1 = r1.size()
            if (r0 >= r1) goto L37
            java.util.List r1 = r7.A
            java.lang.Object r1 = r1.get(r0)
            k4.n r1 = (k4.n) r1
            r1.k1 r2 = r1.f7656a
            int r1 = r1.f7657b
            boolean[] r2 = r2.f11574e
            boolean r1 = r2[r1]
            if (r1 == 0) goto L34
            r0 = 0
            goto L38
        L34:
            int r0 = r0 + 1
            goto L18
        L37:
            r0 = 1
        L38:
            android.view.View r1 = r8.f7655v
            if (r0 == 0) goto L3d
            goto L3e
        L3d:
            r9 = 4
        L3e:
            r1.setVisibility(r9)
            android.view.View r8 = r8.f13897a
            com.google.android.material.datepicker.n r9 = new com.google.android.material.datepicker.n
            r0 = 4
            r9.<init>(r7, r0)
            r8.setOnClickListener(r9)
            goto L79
        L4d:
            android.widget.TextView r9 = r8.f7654u
            r0 = 2132017342(0x7f1400be, float:1.967296E38)
            r9.setText(r0)
            k4.q r9 = r7.D
            r1.u0 r9 = r9.M0
            r9.getClass()
            r1.j1 r9 = r9.H0()
            boolean r9 = r7.h(r9)
            android.view.View r0 = r8.f7655v
            if (r9 == 0) goto L6a
            r9 = 4
            goto L6b
        L6a:
            r9 = 0
        L6b:
            r0.setVisibility(r9)
            android.view.View r8 = r8.f13897a
            com.google.android.material.datepicker.n r9 = new com.google.android.material.datepicker.n
            r0 = 2
            r9.<init>(r7, r0)
            r8.setOnClickListener(r9)
        L79:
            return
        L7a:
            java.util.List r0 = r7.A
            r1 = 1
            int r9 = r9 - r1
            java.lang.Object r9 = r0.get(r9)
            r5 = r9
            k4.n r5 = (k4.n) r5
            r1.k1 r9 = r5.f7656a
            r1.e1 r4 = r9.f11571b
            r1.j1 r9 = r3.H0()
            db.n0 r9 = r9.D
            java.lang.Object r9 = r9.get(r4)
            r0 = 0
            if (r9 == 0) goto La1
            r1.k1 r9 = r5.f7656a
            int r2 = r5.f7657b
            boolean[] r9 = r9.f11574e
            boolean r9 = r9[r2]
            if (r9 == 0) goto La1
            goto La2
        La1:
            r1 = 0
        La2:
            android.widget.TextView r9 = r8.f7654u
            java.lang.String r2 = r5.f7658c
            r9.setText(r2)
            android.view.View r9 = r8.f7655v
            if (r1 == 0) goto Lae
            goto Laf
        Lae:
            r0 = 4
        Laf:
            r9.setVisibility(r0)
            android.view.View r8 = r8.f13897a
            k4.o r1 = new k4.o
            r6 = 0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r8.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.f.k(k4.m, int):void");
    }

    private final void l(String str) {
    }
}
