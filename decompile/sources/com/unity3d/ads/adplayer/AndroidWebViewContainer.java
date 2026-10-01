package com.unity3d.ads.adplayer;

import a2.e0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import df.n;
import gf.b0;
import gf.c0;
import gf.f0;
import he.y;
import java.util.WeakHashMap;
import kf.d1;
import kf.f1;
import kf.h;
import kf.i;
import kf.r0;
import kf.t0;
import kf.y0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import t0.h0;
import t0.q0;
import t0.t1;
import t0.w1;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes.dex */
public final class AndroidWebViewContainer implements WebViewContainer {
    private static final String JS_CLOSING_PARENTHESES = ")";
    private static final String JS_INSTRUCTION = "javascript:window.nativebridge.";
    private static final String JS_OPENING_PARENTHESES = "(";
    private static final String JS_SEMICOLON = ";";
    private final r0 _lastInputEvent;
    private final Context context;
    private final d1 lastInputEvent;
    private final c0 scope;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;
    private final WebView webView;
    private final AndroidWebViewClient webViewClient;
    public static final Companion Companion = new Companion(null);
    private static final StringBuilder SHARED_STRING_BUILDER = new StringBuilder(CodedOutputStream.DEFAULT_BUFFER_SIZE);

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", f = "AndroidWebViewContainer.kt", l = {53}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$2 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends j implements p {
        int label;

        public AnonymousClass2(c cVar) {
            super(2, cVar);
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // ve.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (c) obj2);
        }

        @Override // ne.a
        public final Object invokeSuspend(Object obj) {
            int i6 = this.label;
            if (i6 != 0) {
                if (i6 == 1) {
                    he.a.f(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                he.a.f(obj);
                AndroidWebViewContainer androidWebViewContainer = AndroidWebViewContainer.this;
                this.label = 1;
                Object onRenderProcessGone = androidWebViewContainer.onRenderProcessGone(this);
                me.a aVar = me.a.f8833x;
                if (onRenderProcessGone == aVar) {
                    return aVar;
                }
            }
            return y.f6101a;
        }

        public final Object invoke(boolean z10, c cVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z10), cVar)).invokeSuspend(y.f6101a);
        }
    }

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final StringBuilder getSHARED_STRING_BUILDER() {
            return AndroidWebViewContainer.SHARED_STRING_BUILDER;
        }

        private Companion() {
        }

        public static /* synthetic */ void getSHARED_STRING_BUILDER$annotations() {
        }
    }

    public AndroidWebViewContainer(WebView webView, AndroidWebViewClient webViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, gf.y mainDispatcher, gf.y defaultDispatcher, c0 adPlayerScope, Context context) {
        k.e(webView, "webView");
        k.e(webViewClient, "webViewClient");
        k.e(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        k.e(mainDispatcher, "mainDispatcher");
        k.e(defaultDispatcher, "defaultDispatcher");
        k.e(adPlayerScope, "adPlayerScope");
        k.e(context, "context");
        this.webView = webView;
        this.webViewClient = webViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.context = context;
        mf.e y9 = f0.y(f0.y(adPlayerScope, mainDispatcher), new b0("AndroidWebViewContainer"));
        this.scope = y9;
        f1 c10 = y0.c(null);
        this._lastInputEvent = c10;
        this.lastInputEvent = new t0(c10);
        final d1 isRenderProcessGone = webViewClient.isRenderProcessGone();
        y0.p(new j1.f0(6, new h() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1

            /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
            /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements i {
                final /* synthetic */ i $this_unsafeFlow;

                /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
                @e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2", f = "AndroidWebViewContainer.kt", l = {223}, m = "emit")
                /* renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends ne.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // ne.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(i iVar) {
                    this.$this_unsafeFlow = iVar;
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
                        boolean r0 = r6 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        int r1 = r0.label
                        r2 = 1
                        if (r1 == 0) goto L2d
                        if (r1 != r2) goto L25
                        he.a.f(r6)
                        goto L46
                    L25:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2d:
                        he.a.f(r6)
                        kf.i r6 = r4.$this_unsafeFlow
                        r1 = r5
                        java.lang.Boolean r1 = (java.lang.Boolean) r1
                        boolean r1 = r1.booleanValue()
                        if (r1 == 0) goto L46
                        r0.label = r2
                        java.lang.Object r5 = r6.emit(r5, r0)
                        me.a r6 = me.a.f8833x
                        if (r5 != r6) goto L46
                        return r6
                    L46:
                        he.y r5 = he.y.f6101a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, le.c):java.lang.Object");
                }
            }

            @Override // kf.h
            public Object collect(i iVar, c cVar) {
                Object collect = h.this.collect(new AnonymousClass2(iVar), cVar);
                if (collect == me.a.f8833x) {
                    return collect;
                }
                return y.f6101a;
            }
        }, new AnonymousClass2(null)), f0.y(y9, defaultDispatcher));
        webView.setOnTouchListener(new a(this, 0));
        applySafeAreaInsets();
    }

    public static final boolean _init_$lambda$1(AndroidWebViewContainer this$0, View view, MotionEvent motionEvent) {
        k.e(this$0, "this$0");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 1 || actionMasked == 5 || actionMasked == 6) {
            f1 f1Var = (f1) this$0._lastInputEvent;
            f1Var.getClass();
            f1Var.h(null, motionEvent);
            return false;
        }
        return false;
    }

    private final void applySafeAreaInsets() {
        WebView webView = this.webView;
        e0 e0Var = new e0(this, 13);
        WeakHashMap weakHashMap = q0.f12397a;
        h0.l(webView, e0Var);
    }

    public static final w1 applySafeAreaInsets$lambda$3(AndroidWebViewContainer this$0, View v10, w1 insets) {
        Object b10;
        k.e(this$0, "this$0");
        k.e(v10, "v");
        k.e(insets, "insets");
        t1 t1Var = insets.f12417a;
        l0.c f3 = t1Var.f(519);
        k.d(f3, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        l0.c f10 = t1Var.f(128);
        k.d(f10, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            b10 = Float.valueOf(this$0.context.getResources().getDisplayMetrics().density);
        } catch (Throwable th) {
            b10 = he.a.b(th);
        }
        Object valueOf = Float.valueOf(1.0f);
        if (b10 instanceof he.j) {
            b10 = valueOf;
        }
        float floatValue = ((Number) b10).floatValue();
        int applySafeAreaInsets$lambda$3$toPx = applySafeAreaInsets$lambda$3$toPx(Math.max(f3.f8062a, f10.f8062a), floatValue);
        int applySafeAreaInsets$lambda$3$toPx2 = applySafeAreaInsets$lambda$3$toPx(Math.max(f3.f8063b, f10.f8063b), floatValue);
        int applySafeAreaInsets$lambda$3$toPx3 = applySafeAreaInsets$lambda$3$toPx(Math.max(f3.f8064c, f10.f8064c), floatValue);
        int applySafeAreaInsets$lambda$3$toPx4 = applySafeAreaInsets$lambda$3$toPx(Math.max(f3.f8065d, f10.f8065d), floatValue);
        StringBuilder p10 = r4.a.p(applySafeAreaInsets$lambda$3$toPx, applySafeAreaInsets$lambda$3$toPx3, "\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '", "px');\n                    root.style.setProperty('--safe-area-inset-right', '", "px');\n                    root.style.setProperty('--safe-area-inset-top', '");
        p10.append(applySafeAreaInsets$lambda$3$toPx2);
        p10.append("px');\n                    root.style.setProperty('--safe-area-inset-bottom', '");
        p10.append(applySafeAreaInsets$lambda$3$toPx4);
        p10.append("px');\n                })();\n            ");
        f0.w(this$0.scope, null, new AndroidWebViewContainer$applySafeAreaInsets$1$1(this$0, n.s(p10.toString()), null), 3);
        return insets;
    }

    private static final int applySafeAreaInsets$lambda$3$toPx(int i6, float f3) {
        return (int) (i6 / f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onRenderProcessGone(le.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            he.a.f(r7)
            goto L42
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            he.a.f(r7)
            r0.L$0 = r6
            r0.label = r2
            java.lang.Object r7 = r6.destroy(r0)
            me.a r0 = me.a.f8833x
            if (r7 != r0) goto L41
            return r0
        L41:
            r0 = r6
        L42:
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r7 = r0.sendWebViewClientErrorDiagnostics
            com.unity3d.ads.adplayer.model.WebViewClientError r0 = new com.unity3d.ads.adplayer.model.WebViewClientError
            com.unity3d.ads.adplayer.model.ErrorReason r2 = com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE
            r4 = 4
            r5 = 0
            java.lang.String r1 = "Render process gone"
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.List r0 = a8.g.m(r0)
            r7.invoke(r0)
            he.y r7 = he.y.f6101a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.onRenderProcessGone(le.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object addJavascriptInterface(com.unity3d.ads.adplayer.WebViewBridge r5, java.lang.String r6, le.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            he.a.f(r7)     // Catch: java.util.concurrent.CancellationException -> L47
            goto L47
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            he.a.f(r7)
            gf.c0 r7 = r4.scope     // Catch: java.util.concurrent.CancellationException -> L47
            le.h r7 = r7.getCoroutineContext()     // Catch: java.util.concurrent.CancellationException -> L47
            com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2 r1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2     // Catch: java.util.concurrent.CancellationException -> L47
            r3 = 0
            r1.<init>(r4, r6, r5, r3)     // Catch: java.util.concurrent.CancellationException -> L47
            r0.label = r2     // Catch: java.util.concurrent.CancellationException -> L47
            java.lang.Object r5 = gf.f0.J(r7, r1, r0)     // Catch: java.util.concurrent.CancellationException -> L47
            me.a r6 = me.a.f8833x
            if (r5 != r6) goto L47
            return r6
        L47:
            he.y r5 = he.y.f6101a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.addJavascriptInterface(com.unity3d.ads.adplayer.WebViewBridge, java.lang.String, le.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object destroy(le.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            he.a.f(r5)
            goto L54
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            he.a.f(r5)
            gf.c0 r5 = r4.scope
            le.h r5 = r5.getCoroutineContext()
            gf.w1 r1 = gf.w1.f5722x
            le.h r5 = r5.plus(r1)
            com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2 r1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2
            r3 = 0
            r1.<init>(r4, r3)
            r0.L$0 = r4
            r0.label = r2
            java.lang.Object r5 = gf.f0.J(r5, r1, r0)
            me.a r0 = me.a.f8833x
            if (r5 != r0) goto L53
            return r0
        L53:
            r0 = r4
        L54:
            gf.c0 r5 = r0.scope
            gf.f0.i(r5)
            he.y r5 = he.y.f6101a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.destroy(le.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object evaluateJavascript(com.unity3d.ads.adplayer.HandlerType r5, org.json.JSONArray r6, le.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            he.a.f(r7)     // Catch: java.util.concurrent.CancellationException -> L47
            goto L47
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            he.a.f(r7)
            gf.c0 r7 = r4.scope     // Catch: java.util.concurrent.CancellationException -> L47
            le.h r7 = r7.getCoroutineContext()     // Catch: java.util.concurrent.CancellationException -> L47
            com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2 r1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2     // Catch: java.util.concurrent.CancellationException -> L47
            r3 = 0
            r1.<init>(r6, r5, r4, r3)     // Catch: java.util.concurrent.CancellationException -> L47
            r0.label = r2     // Catch: java.util.concurrent.CancellationException -> L47
            java.lang.Object r5 = gf.f0.J(r7, r1, r0)     // Catch: java.util.concurrent.CancellationException -> L47
            me.a r6 = me.a.f8833x
            if (r5 != r6) goto L47
            return r6
        L47:
            he.y r5 = he.y.f6101a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.evaluateJavascript(com.unity3d.ads.adplayer.HandlerType, org.json.JSONArray, le.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public d1 getLastInputEvent() {
        return this.lastInputEvent;
    }

    public final c0 getScope() {
        return this.scope;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final r0 get_lastInputEvent() {
        return this._lastInputEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r9 != r5) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadUrl(java.lang.String r8, le.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1 r0 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            me.a r5 = me.a.f8833x
            if (r1 == 0) goto L4d
            if (r1 == r4) goto L45
            if (r1 == r3) goto L3d
            if (r1 == r2) goto L31
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            java.lang.Object r8 = r0.L$1
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0
            he.a.f(r9)
            goto L90
        L3d:
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r8
            he.a.f(r9)
            goto L79
        L45:
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r8
            he.a.f(r9)
            goto L68
        L4d:
            he.a.f(r9)
            gf.c0 r9 = r7.scope
            le.h r9 = r9.getCoroutineContext()
            com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2 r1 = new com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2
            r6 = 0
            r1.<init>(r7, r8, r6)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = gf.f0.J(r9, r1, r0)
            if (r8 != r5) goto L67
            goto L8d
        L67:
            r8 = r7
        L68:
            com.unity3d.ads.adplayer.AndroidWebViewClient r9 = r8.webViewClient
            gf.i0 r9 = r9.getOnLoadFinished()
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r9.a0(r0)
            if (r9 != r5) goto L79
            goto L8d
        L79:
            java.util.List r9 = (java.util.List) r9
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L9b
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r2
            java.lang.Object r0 = r8.destroy(r0)
            if (r0 != r5) goto L8e
        L8d:
            return r5
        L8e:
            r0 = r8
            r8 = r9
        L90:
            com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics r9 = r0.sendWebViewClientErrorDiagnostics
            r9.invoke(r8)
            com.unity3d.ads.adplayer.LoadWebViewError r9 = new com.unity3d.ads.adplayer.LoadWebViewError
            r9.<init>(r8)
            throw r9
        L9b:
            he.y r8 = he.y.f6101a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidWebViewContainer.loadUrl(java.lang.String, le.c):java.lang.Object");
    }
}
