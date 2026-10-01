package gd;

import com.google.android.material.imageview.ShapeableImageView;
import com.playfy.tv.databinding.ChannelItemBinding;
import kd.h0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5625u;

    /* renamed from: v, reason: collision with root package name */
    public final ChannelItemBinding f5626v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(final gd.p r13, com.playfy.tv.databinding.ChannelItemBinding r14, int r15) {
        /*
            r12 = this;
            r12.f5625u = r15
            switch(r15) {
                case 1: goto L34;
                default: goto L5;
            }
        L5:
            com.google.android.material.card.MaterialCardView r3 = r14.f3202a
            java.lang.String r15 = "getRoot(...)"
            kotlin.jvm.internal.k.d(r3, r15)
            r12.<init>(r3)
            r12.f5626v = r14
            gd.a r14 = new gd.a
            r15 = 2
            r14.<init>(r12, r15)
            r3.setOnFocusChangeListener(r14)
            fd.h r14 = new fd.h
            r14.<init>(r12, r13, r3, r15)
            r3.setOnClickListener(r14)
            ve.l r4 = r13.D
            if (r4 == 0) goto L32
            gd.j r0 = new gd.j
            r5 = 0
            r1 = r12
            r2 = r13
            r0.<init>()
            r3.setOnLongClickListener(r0)
            goto L33
        L32:
            r1 = r12
        L33:
            return
        L34:
            r1 = r12
            r2 = r13
            com.google.android.material.card.MaterialCardView r9 = r14.f3202a
            java.lang.String r13 = "getRoot(...)"
            kotlin.jvm.internal.k.d(r9, r13)
            r12.<init>(r9)
            r1.f5626v = r14
            gd.a r13 = new gd.a
            r14 = 3
            r13.<init>(r12, r14)
            r9.setOnFocusChangeListener(r13)
            fd.b r13 = new fd.b
            r14 = 7
            r13.<init>(r14, r12, r2)
            r9.setOnClickListener(r13)
            ve.l r10 = r2.D
            if (r10 == 0) goto L63
            gd.j r6 = new gd.j
            r11 = 1
            r7 = r1
            r8 = r2
            r6.<init>()
            r9.setOnLongClickListener(r6)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.k.<init>(gd.p, com.playfy.tv.databinding.ChannelItemBinding, int):void");
    }

    @Override // gd.o
    public final void r(Object obj) {
        switch (this.f5625u) {
            case 0:
                if (obj instanceof kd.l) {
                    ChannelItemBinding channelItemBinding = this.f5626v;
                    ShapeableImageView shapeableImageView = channelItemBinding.f3203b;
                    kd.l lVar = (kd.l) obj;
                    String str = lVar.f7878z;
                    l6.f a10 = l6.a.a(shapeableImageView.getContext());
                    v6.i iVar = new v6.i(shapeableImageView.getContext());
                    iVar.f13364c = str;
                    iVar.c(shapeableImageView);
                    cf.m.J(iVar);
                    ((l6.k) a10).b(iVar.a());
                    channelItemBinding.f3204c.setText(lVar.f7877y);
                    return;
                }
                return;
            default:
                if (obj instanceof h0) {
                    ChannelItemBinding channelItemBinding2 = this.f5626v;
                    ShapeableImageView shapeableImageView2 = channelItemBinding2.f3203b;
                    h0 h0Var = (h0) obj;
                    String str2 = h0Var.f7859z;
                    l6.f a11 = l6.a.a(shapeableImageView2.getContext());
                    v6.i iVar2 = new v6.i(shapeableImageView2.getContext());
                    iVar2.f13364c = str2;
                    iVar2.c(shapeableImageView2);
                    cf.m.J(iVar2);
                    ((l6.k) a11).b(iVar2.a());
                    channelItemBinding2.f3204c.setText(h0Var.f7857x);
                    return;
                }
                return;
        }
    }
}
