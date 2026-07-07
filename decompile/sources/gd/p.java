package gd;

import android.app.UiModeManager;
import android.content.Context;
import android.os.CountDownTimer;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.playfy.tv.App;
import com.playfy.tv.R;
import com.playfy.tv.databinding.ChannelItemBinding;
import com.playfy.tv.databinding.DialogMultiStreamBinding;
import com.playfy.tv.databinding.EventItemBannerBinding;
import com.playfy.tv.databinding.EventItemBinding;
import com.playfy.tv.databinding.InlineBannerLyBinding;
import java.util.List;
import kd.h0;
import p.q3;
import w4.e0;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p extends e0 {
    public final nd.c B;
    public final ve.l C;
    public final ve.l D;
    public boolean E;
    public final App F;
    public final he.m G;
    public final he.m H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(nd.c cVar, fd.t tVar, ve.l lVar, boolean z10, int i6) {
        super(new y(3));
        cVar = (i6 & 1) != 0 ? null : cVar;
        tVar = (i6 & 2) != 0 ? null : tVar;
        lVar = (i6 & 4) != 0 ? null : lVar;
        z10 = (i6 & 8) != 0 ? false : z10;
        this.B = cVar;
        this.C = tVar;
        this.D = lVar;
        this.E = z10;
        Context applicationContext = p7.a.a().getApplicationContext();
        kotlin.jvm.internal.k.c(applicationContext, "null cannot be cast to non-null type com.playfy.tv.App");
        this.F = (App) applicationContext;
        final int i10 = 0;
        this.G = he.a.d(new ve.a(this) { // from class: gd.h

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ p f5618y;

            {
                this.f5618y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                boolean z11;
                switch (i10) {
                    case 0:
                        return (id.h) a8.b.f(this.f5618y.F).a(kotlin.jvm.internal.x.a(id.h.class), null);
                    default:
                        Object systemService = this.f5618y.F.getSystemService("uimode");
                        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
                        if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        });
        final int i11 = 1;
        this.H = he.a.d(new ve.a(this) { // from class: gd.h

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ p f5618y;

            {
                this.f5618y = this;
            }

            @Override // ve.a
            public final Object invoke() {
                boolean z11;
                switch (i11) {
                    case 0:
                        return (id.h) a8.b.f(this.f5618y.F).a(kotlin.jvm.internal.x.a(id.h.class), null);
                    default:
                        Object systemService = this.f5618y.F.getSystemService("uimode");
                        kotlin.jvm.internal.k.c(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
                        if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        });
    }

    public static final void j(p pVar, Context context, final String str, List list, Parcelable parcelable) {
        final p pVar2 = pVar;
        final Parcelable parcelable2 = parcelable;
        if (pVar2.B == null) {
            ve.l lVar = pVar2.C;
            if (lVar != null) {
                lVar.invoke(parcelable2);
                return;
            }
            return;
        }
        if (list.size() < 2) {
            nd.c cVar = pVar2.B;
            List list2 = pVar2.A.f13855f;
            kotlin.jvm.internal.k.d(list2, "getCurrentList(...)");
            cVar.a(str, 0, cf.m.t(list2, parcelable2), Boolean.valueOf(pVar2.E), 0);
            return;
        }
        DialogMultiStreamBinding inflate = DialogMultiStreamBinding.inflate(LayoutInflater.from(context), null, false);
        ConstraintLayout constraintLayout = inflate.f3231a;
        kotlin.jvm.internal.k.d(constraintLayout, "getRoot(...)");
        final i.h e10 = cf.m.e(context, constraintLayout);
        final int i6 = 0;
        for (Object obj : list) {
            int i10 = i6 + 1;
            if (i6 >= 0) {
                String str2 = (String) obj;
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.dialog_multi_stream_item, (ViewGroup) constraintLayout, false);
                ((TextView) inflate2.findViewById(R.id.stream_name)).setText(str2);
                TextView textView = (TextView) inflate2.findViewById(R.id.hd_badge);
                if (df.m.I(str2, "FHD", true)) {
                    kotlin.jvm.internal.k.b(textView);
                    textView.setVisibility(0);
                    textView.setText("FHD");
                } else if (df.m.I(str2, "HD", true)) {
                    kotlin.jvm.internal.k.b(textView);
                    textView.setVisibility(0);
                    textView.setText("HD");
                }
                inflate2.setOnClickListener(new View.OnClickListener() { // from class: gd.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        i.h.this.dismiss();
                        p pVar3 = pVar2;
                        nd.c cVar2 = pVar3.B;
                        Integer valueOf = Integer.valueOf(i6);
                        List list3 = pVar3.A.f13855f;
                        kotlin.jvm.internal.k.d(list3, "getCurrentList(...)");
                        cVar2.a(str, valueOf, cf.m.t(list3, parcelable2), Boolean.valueOf(pVar3.E), 0);
                    }
                });
                inflate.f3233c.addView(inflate2);
                pVar2 = pVar;
                parcelable2 = parcelable;
                i6 = i10;
            } else {
                ie.k.w();
                throw null;
            }
        }
        inflate.f3232b.setOnClickListener(new fd.g(e10, 2));
        e10.show();
    }

    @Override // w4.k0
    public final int c(int i6) {
        String str;
        Object h4 = h(i6);
        if (h4 instanceof kd.u) {
            String str2 = ((kd.u) h4).C.F;
            if (str2 == null || !df.u.H(str2, "http", false)) {
                return 0;
            }
            return 4;
        }
        if (h4 instanceof l) {
            return 3;
        }
        if (h4 instanceof kd.l) {
            return 1;
        }
        if (h4 instanceof h0) {
            return 2;
        }
        if (h4 != null) {
            str = h4.getClass().getSimpleName();
        } else {
            str = null;
        }
        throw new IllegalArgumentException("Unknown item type at position " + i6 + ": " + str);
    }

    @Override // w4.k0
    public final void d(i1 i1Var, int i6) {
        if (i1Var instanceof o) {
            Object h4 = h(i6);
            kotlin.jvm.internal.k.d(h4, "getItem(...)");
            ((o) i1Var).r(h4);
        }
    }

    @Override // w4.k0
    public final i1 f(ViewGroup viewGroup, int i6) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            return new m(this, EventItemBannerBinding.inflate(from, viewGroup, false));
                        }
                        throw new IllegalArgumentException(h8.c.i(i6, "Unknown view type: "));
                    }
                    LinearLayout linearLayout = InlineBannerLyBinding.inflate(from, viewGroup, false).f3307a;
                    kotlin.jvm.internal.k.d(linearLayout, "getRoot(...)");
                    i1 i1Var = new i1(linearLayout);
                    linearLayout.removeAllViews();
                    linearLayout.setVisibility(8);
                    ((id.h) this.G.getValue()).d(linearLayout);
                    return i1Var;
                }
                return new k(this, ChannelItemBinding.inflate(from, viewGroup, false), 1);
            }
            return new k(this, ChannelItemBinding.inflate(from, viewGroup, false), 0);
        }
        return new m(this, EventItemBinding.inflate(from, viewGroup, false));
    }

    @Override // w4.k0
    public final void g(i1 holder) {
        CountDownTimer countDownTimer;
        kotlin.jvm.internal.k.e(holder, "holder");
        if (holder instanceof m) {
            m mVar = (m) holder;
            q3 q3Var = mVar.f5628u;
            if (q3Var != null && (countDownTimer = (CountDownTimer) q3Var.D) != null) {
                countDownTimer.cancel();
            }
            mVar.f5628u = null;
        }
    }
}
