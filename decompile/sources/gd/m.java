package gd;

import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.playfy.tv.databinding.EventItemBannerBinding;
import com.playfy.tv.databinding.EventItemBinding;
import com.playfy.tv.ui.CornerLabelTextview;
import p.q3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: u, reason: collision with root package name */
    public q3 f5628u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p f5629v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f5630w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f5631x;

    /* renamed from: y, reason: collision with root package name */
    public final r5.a f5632y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, View root) {
        super(root);
        kotlin.jvm.internal.k.e(root, "root");
        this.f5629v = pVar;
    }

    public static void s(kd.u uVar, TextView textView, ImageView imageView) {
        kd.a0 a0Var = uVar.C;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uVar.A);
        sb2.append(" | ");
        String str = a0Var.f7835x;
        if (str == null) {
            str = uVar.f7901y;
        }
        sb2.append(str);
        textView.setText(sb2.toString());
        String str2 = uVar.f7902z;
        l6.f a10 = l6.a.a(imageView.getContext());
        v6.i iVar = new v6.i(imageView.getContext());
        iVar.f13364c = str2;
        iVar.c(imageView);
        cf.m.J(iVar);
        ((l6.k) a10).b(iVar.a());
    }

    @Override // gd.o
    public final void r(Object obj) {
        int i6;
        CountDownTimer countDownTimer;
        int i10;
        CountDownTimer countDownTimer2;
        switch (this.f5630w) {
            case 0:
                if (obj instanceof kd.u) {
                    kd.u uVar = (kd.u) obj;
                    kd.a0 a0Var = uVar.C;
                    EventItemBannerBinding eventItemBannerBinding = (EventItemBannerBinding) this.f5632y;
                    CornerLabelTextview cornerLabelTextview = eventItemBannerBinding.f3271e;
                    if (a0Var.E > 0) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    cornerLabelTextview.setVisibility(i6);
                    s(uVar, eventItemBannerBinding.f3274h, eventItemBannerBinding.f3270d);
                    ImageView imageView = eventItemBannerBinding.f3268b;
                    String str = a0Var.F;
                    l6.f a10 = l6.a.a(imageView.getContext());
                    v6.i iVar = new v6.i(imageView.getContext());
                    iVar.f13364c = str;
                    iVar.c(imageView);
                    ((l6.k) a10).b(iVar.a());
                    q3 q3Var = this.f5628u;
                    if (q3Var != null && (countDownTimer = (CountDownTimer) q3Var.D) != null) {
                        countDownTimer.cancel();
                    }
                    this.f5628u = new q3(a0Var, eventItemBannerBinding.f3273g, eventItemBannerBinding.f3269c, this.f5631x.E, null, eventItemBannerBinding.f3272f);
                    return;
                }
                return;
            default:
                if (obj instanceof kd.u) {
                    kd.u uVar2 = (kd.u) obj;
                    kd.a0 a0Var2 = uVar2.C;
                    EventItemBinding eventItemBinding = (EventItemBinding) this.f5632y;
                    s(uVar2, eventItemBinding.f3284k, eventItemBinding.f3277c);
                    CornerLabelTextview cornerLabelTextview2 = eventItemBinding.f3278d;
                    if (a0Var2.E > 0) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    cornerLabelTextview2.setVisibility(i10);
                    eventItemBinding.f3282h.setText(a0Var2.f7836y);
                    eventItemBinding.j.setText(a0Var2.f7837z);
                    ImageView imageView2 = eventItemBinding.f3281g;
                    String str2 = a0Var2.A;
                    l6.f a11 = l6.a.a(imageView2.getContext());
                    v6.i iVar2 = new v6.i(imageView2.getContext());
                    iVar2.f13364c = str2;
                    iVar2.c(imageView2);
                    cf.m.J(iVar2);
                    ((l6.k) a11).b(iVar2.a());
                    ImageView imageView3 = eventItemBinding.f3283i;
                    String str3 = a0Var2.B;
                    l6.f a12 = l6.a.a(imageView3.getContext());
                    v6.i iVar3 = new v6.i(imageView3.getContext());
                    iVar3.f13364c = str3;
                    iVar3.c(imageView3);
                    cf.m.J(iVar3);
                    ((l6.k) a12).b(iVar3.a());
                    q3 q3Var2 = this.f5628u;
                    if (q3Var2 != null && (countDownTimer2 = (CountDownTimer) q3Var2.D) != null) {
                        countDownTimer2.cancel();
                    }
                    this.f5628u = new q3(a0Var2, eventItemBinding.f3280f, eventItemBinding.f3276b, this.f5631x.E, eventItemBinding.f3285l, eventItemBinding.f3279e);
                    return;
                }
                return;
        }
    }

    public final void t(TextView textView) {
        p pVar = this.f5629v;
        boolean booleanValue = ((Boolean) pVar.H.getValue()).booleanValue();
        View view = this.f13897a;
        if (booleanValue) {
            view.setPadding(0, 0, 0, 0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(0, 0, 0, 0);
                view.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        textView.setSelected(true);
        view.setOnFocusChangeListener(new a(this, 1));
        view.setOnClickListener(new fd.b(6, this, pVar));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(gd.p r3, com.playfy.tv.databinding.EventItemBannerBinding r4) {
        /*
            r2 = this;
            r0 = 0
            r2.f5630w = r0
            r2.f5631x = r3
            com.google.android.material.card.MaterialCardView r0 = r4.f3267a
            java.lang.String r1 = "getRoot(...)"
            kotlin.jvm.internal.k.d(r0, r1)
            r2.<init>(r3, r0)
            r2.f5632y = r4
            android.widget.TextView r3 = r4.f3274h
            r2.t(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.m.<init>(gd.p, com.playfy.tv.databinding.EventItemBannerBinding):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(gd.p r3, com.playfy.tv.databinding.EventItemBinding r4) {
        /*
            r2 = this;
            r0 = 1
            r2.f5630w = r0
            r2.f5631x = r3
            com.google.android.material.card.MaterialCardView r0 = r4.f3275a
            java.lang.String r1 = "getRoot(...)"
            kotlin.jvm.internal.k.d(r0, r1)
            r2.<init>(r3, r0)
            r2.f5632y = r4
            android.widget.TextView r3 = r4.f3284k
            r2.t(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.m.<init>(gd.p, com.playfy.tv.databinding.EventItemBinding):void");
    }
}
