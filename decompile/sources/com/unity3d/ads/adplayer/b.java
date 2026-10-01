package com.unity3d.ads.adplayer;

import android.view.View;
import bf.o;
import cb.e;
import com.google.android.gms.internal.measurement.j5;
import com.playfy.tv.activities.PlayerActivity;
import com.unity3d.services.ads.token.INativeTokenGeneratorListener;
import com.unity3d.services.ads.token.InMemoryTokenStorage;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import db.k0;
import db.r;
import f2.l;
import f2.n;
import g2.q;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import i4.a0;
import i4.b0;
import i4.f1;
import i4.g1;
import i4.l1;
import i4.s1;
import java.util.List;
import kotlin.jvm.internal.k;
import l0.c;
import o5.p;
import r2.h;
import t0.s;
import t0.w1;
import u1.g;
import zb.d;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements f.b, INativeTokenGeneratorListener, IInvocationCallbackInvoker, e, g, n, s, a0, g1, f1 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3384x;

    public /* synthetic */ b(int i6) {
        this.f3384x = i6;
    }

    @Override // u1.g
    public void accept(Object obj) {
        switch (this.f3384x) {
            case 4:
                ((l) obj).a();
                return;
            case 16:
                ((l1) obj).pause();
                return;
            case 17:
                ((l1) obj).d0();
                return;
            case 18:
                ((l1) obj).E0();
                return;
            case 19:
                ((l1) obj).N0();
                return;
            case 21:
                ((l1) obj).P();
                return;
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                ((l1) obj).A();
                return;
            case 24:
                ((l1) obj).L0();
                return;
            case 25:
                ((l1) obj).K0();
                return;
            default:
                ((l1) obj).F();
                return;
        }
    }

    @Override // cb.e
    public Object apply(Object obj) {
        switch (this.f3384x) {
            case 3:
                return k0.o(Integer.valueOf(((h) obj).f11791x));
            default:
                q qVar = (q) obj;
                qVar.b();
                return k0.k(r.w(qVar.f5366f0.f10910b, new p(6)));
        }
    }

    @Override // i4.f1
    public void b(l1 l1Var, i4.s sVar, List list) {
        switch (this.f3384x) {
            case 27:
                l1Var.w0(list);
                return;
            default:
                l1Var.w0(list);
                return;
        }
    }

    @Override // i4.g1
    public Object c(b0 b0Var, i4.s sVar, int i6) {
        switch (this.f3384x) {
            case 14:
                b0Var.getClass();
                throw new ClassCastException();
            case 15:
                b0Var.getClass();
                throw new ClassCastException();
            case 20:
                return b0Var.n(sVar);
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                b0Var.getClass();
                throw new ClassCastException();
            default:
                d dVar = b0Var.f6305e;
                b0Var.s(sVar);
                dVar.getClass();
                return j5.l(new s1(-6));
        }
    }

    @Override // i4.a0
    public void d(i4.r rVar, int i6) {
        switch (this.f3384x) {
            case 11:
                rVar.getClass();
                return;
            case 12:
                rVar.getClass();
                return;
            default:
                rVar.b(i6);
                return;
        }
    }

    @Override // f.b
    public void g(Object obj) {
        FullScreenWebViewDisplay.w((f.a) obj);
    }

    @Override // com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker
    public void invokeCallback(com.unity3d.services.core.webview.bridge.Invocation invocation) {
        SharedInstances.webViewAppInvocationCallbackInvoker$lambda$0(invocation);
    }

    @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
    public void onReady(String str) {
        InMemoryTokenStorage.a(str);
    }

    @Override // t0.s
    public w1 v(View v10, w1 w1Var) {
        o[] oVarArr = PlayerActivity.V;
        k.e(v10, "v");
        c f3 = w1Var.f12417a.f(519);
        k.d(f3, "getInsets(...)");
        v10.setPadding(f3.f8062a, f3.f8063b, f3.f8064c, f3.f8065d);
        return w1.f12416b;
    }

    public /* synthetic */ b(int i6, Object obj, Object obj2) {
        this.f3384x = i6;
    }

    public /* synthetic */ b(Object obj, int i6) {
        this.f3384x = i6;
    }

    public /* synthetic */ b(String str, int i6, int i10, i4.o oVar) {
        this.f3384x = 15;
    }

    @Override // f2.n
    public void a() {
    }
}
