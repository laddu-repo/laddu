package com.unity3d.ads.adplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.lifecycle.d1;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import d.n0;
import d.o0;
import d.q;
import f.c;
import gf.c0;
import he.f;
import he.g;
import he.j;
import he.y;
import j1.f0;
import java.util.Map;
import kf.h;
import kf.i;
import kf.y0;
import kotlin.jvm.internal.k;
import ne.e;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FullScreenWebViewDisplay extends q implements IServiceComponent {
    private final f adObject$delegate;
    private final f dispatchers$delegate;
    private String opportunityId = HttpUrl.FRAGMENT_ENCODE_SET;
    private final f sendDiagnosticEvent$delegate;
    private Map<String, ? extends Object> showOptions;
    private final c startForResult;

    public FullScreenWebViewDisplay() {
        FullScreenWebViewDisplay$special$$inlined$inject$default$1 fullScreenWebViewDisplay$special$$inlined$inject$default$1 = new FullScreenWebViewDisplay$special$$inlined$inject$default$1(this, HttpUrl.FRAGMENT_ENCODE_SET);
        g gVar = g.f6075z;
        this.sendDiagnosticEvent$delegate = he.a.c(gVar, fullScreenWebViewDisplay$special$$inlined$inject$default$1);
        this.adObject$delegate = he.a.d(new FullScreenWebViewDisplay$adObject$2(this));
        this.dispatchers$delegate = he.a.c(gVar, new FullScreenWebViewDisplay$special$$inlined$inject$default$2(this, HttpUrl.FRAGMENT_ENCODE_SET));
        c registerForActivityResult = registerForActivityResult(new g.b(2), new b(0));
        k.d(registerForActivityResult, "registerForActivityResul…n to this activity.\n    }");
        this.startForResult = registerForActivityResult;
    }

    private final AdObject getAdObject() {
        return (AdObject) this.adObject$delegate.getValue();
    }

    public final ISDKDispatchers getDispatchers() {
        return (ISDKDispatchers) this.dispatchers$delegate.getValue();
    }

    private final SendDiagnosticEvent getSendDiagnosticEvent() {
        return (SendDiagnosticEvent) this.sendDiagnosticEvent$delegate.getValue();
    }

    public final Object listenToAdPlayerEvents(le.c cVar) {
        gf.k kVar = new gf.k(1, a8.c.i(cVar));
        kVar.s();
        final f0 f0Var = new f0(AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages(), new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$1(this, kVar, null));
        y0.p(new f0(6, new h() { // from class: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;
                final /* synthetic */ FullScreenWebViewDisplay this$0;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2", f = "FullScreenWebViewDisplay.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ne.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(le.c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar, FullScreenWebViewDisplay fullScreenWebViewDisplay) {
                    this.$this_unsafeFlow = iVar;
                    this.this$0 = fullScreenWebViewDisplay;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // kf.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, le.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2d
                        if (r1 != r2) goto L25
                        he.a.f(r6)
                        goto L50
                    L25:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2d:
                        he.a.f(r6)
                        kf.i r6 = r4.$this_unsafeFlow
                        r1 = r5
                        com.unity3d.ads.adplayer.DisplayMessage r1 = (com.unity3d.ads.adplayer.DisplayMessage) r1
                        java.lang.String r1 = r1.getOpportunityId()
                        com.unity3d.ads.adplayer.FullScreenWebViewDisplay r3 = r4.this$0
                        java.lang.String r3 = com.unity3d.ads.adplayer.FullScreenWebViewDisplay.access$getOpportunityId$p(r3)
                        boolean r1 = kotlin.jvm.internal.k.a(r1, r3)
                        if (r1 == 0) goto L50
                        r0.label = r2
                        java.lang.Object r5 = r6.emit(r5, r0)
                        me.a r6 = me.a.f8833x
                        if (r5 != r6) goto L50
                        return r6
                    L50:
                        he.y r5 = he.y.f6101a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.FullScreenWebViewDisplay$listenToAdPlayerEvents$lambda$5$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, le.c cVar2) {
                Object collect = h.this.collect(new AnonymousClass2(iVar, this), cVar2);
                if (collect == me.a.f8833x) {
                    return collect;
                }
                return y.f6101a;
            }
        }, new FullScreenWebViewDisplay$listenToAdPlayerEvents$2$3(this, null)), d1.e(this));
        Object r10 = kVar.r();
        if (r10 == me.a.f8833x) {
            return r10;
        }
        return y.f6101a;
    }

    public final void loadWebView(WebView webView) {
        gf.f0.w(gf.f0.b(getDispatchers().getMain()), null, new FullScreenWebViewDisplay$loadWebView$1(webView, this, null), 3);
    }

    public final void openUrl(String str, Intent intent, boolean z10) {
        Object b10;
        try {
            if (intent.resolveActivity(getPackageManager()) != null && z10) {
                this.startForResult.a(intent);
            } else {
                intent.setFlags(268435456);
                startActivity(intent);
            }
            b10 = y.f6101a;
        } catch (Throwable th) {
            b10 = he.a.b(th);
        }
        gf.f0.w(d1.e(this), getDispatchers().getDefault(), new FullScreenWebViewDisplay$openUrl$1(str, !(b10 instanceof j), null), 2);
    }

    public static /* synthetic */ void openUrl$default(FullScreenWebViewDisplay fullScreenWebViewDisplay, String str, Intent intent, boolean z10, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            z10 = false;
        }
        fullScreenWebViewDisplay.openUrl(str, intent, z10);
    }

    public static /* synthetic */ void w(f.a aVar) {
        startForResult$lambda$7(aVar);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // d.q, h0.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        AdPlayer adPlayer;
        c0 scope;
        Object b10;
        Map<String, ? extends Object> map;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("opportunityId");
        if (stringExtra == null) {
            stringExtra = "not_provided";
        }
        this.opportunityId = stringExtra;
        if (stringExtra.equals("not_provided")) {
            setResult(0);
            gf.f0.w(gf.f0.b(getDispatchers().getDefault()), null, new FullScreenWebViewDisplay$onCreate$1(this, null), 3);
            finish();
            return;
        }
        AdObject adObject = getAdObject();
        if (adObject != null) {
            adPlayer = adObject.getAdPlayer();
        } else {
            adPlayer = null;
        }
        if (adPlayer != null && (scope = adPlayer.getScope()) != null && gf.f0.u(scope)) {
            boolean hasExtra = getIntent().hasExtra(AdUnitActivity.EXTRA_ORIENTATION);
            Boolean valueOf = Boolean.valueOf(hasExtra);
            if (!hasExtra) {
                valueOf = null;
            }
            if (valueOf != null) {
                setRequestedOrientation(getIntent().getIntExtra(AdUnitActivity.EXTRA_ORIENTATION, -1));
            }
            String stringExtra2 = getIntent().getStringExtra("showOptions");
            if (stringExtra2 != null) {
                try {
                    b10 = JSONObjectExtensionsKt.toBuiltInMap(new JSONObject(stringExtra2));
                } catch (Throwable th) {
                    b10 = he.a.b(th);
                }
                if (b10 instanceof j) {
                    b10 = null;
                }
                map = (Map) b10;
            } else {
                map = null;
            }
            this.showOptions = map;
            gf.f0.w(d1.e(this), null, new FullScreenWebViewDisplay$onCreate$6(this, null), 3);
            n0 onBackPressedDispatcher = getOnBackPressedDispatcher();
            k.d(onBackPressedDispatcher, "onBackPressedDispatcher");
            FullScreenWebViewDisplay$onCreate$7 onBackPressed = FullScreenWebViewDisplay$onCreate$7.INSTANCE;
            k.e(onBackPressed, "onBackPressed");
            onBackPressedDispatcher.a(this, new o0(onBackPressed));
            return;
        }
        setResult(0);
        gf.f0.w(gf.f0.b(getDispatchers().getDefault()), null, new FullScreenWebViewDisplay$onCreate$2(this, null), 3);
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        if (isFinishing()) {
            gf.f0.w(gf.f0.b(getDispatchers().getDefault()), null, new FullScreenWebViewDisplay$onDestroy$1(this, null), 3);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i6, KeyEvent keyEvent) {
        if (i6 == 4) {
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        gf.f0.w(gf.f0.b(getDispatchers().getDefault()), null, new FullScreenWebViewDisplay$onPause$1(this, null), 3);
        if (isFinishing()) {
            gf.f0.w(gf.f0.b(getDispatchers().getDefault()), null, new FullScreenWebViewDisplay$onPause$2(this, null), 3);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        gf.f0.w(gf.f0.b(getDispatchers().getDefault()), null, new FullScreenWebViewDisplay$onResume$1(this, null), 3);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        gf.f0.w(gf.f0.b(getDispatchers().getDefault()), null, new FullScreenWebViewDisplay$onWindowFocusChanged$1(this, z10, null), 3);
    }

    public static final void startForResult$lambda$7(f.a aVar) {
    }
}
