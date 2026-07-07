package com.unity3d.ads.adplayer;

import a8.g;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.log.Logger;
import gf.b0;
import gf.c0;
import gf.f0;
import he.i;
import he.y;
import ie.t;
import ie.w;
import java.util.Collection;
import kf.q0;
import kf.r0;
import kf.s0;
import kf.u0;
import kf.x0;
import kf.y0;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import org.json.JSONArray;
import org.json.JSONException;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class CommonWebViewBridge implements WebViewBridge {
    private final q0 _onInvocation;
    private final r0 callbacks;
    private final Logger logger;
    private final u0 onInvocation;
    private final c0 scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final WebViewContainer webViewContainer;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    @e(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends j implements p {
        int label;

        public AnonymousClass1(c cVar) {
            super(2, cVar);
        }

        @Override // ne.a
        public final c create(Object obj, c cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ve.p
        public final Object invoke(c0 c0Var, c cVar) {
            return ((AnonymousClass1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
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
                WebViewContainer webViewContainer = CommonWebViewBridge.this.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                Object addJavascriptInterface = webViewContainer.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this);
                me.a aVar = me.a.f8833x;
                if (addJavascriptInterface == aVar) {
                    return aVar;
                }
            }
            return y.f6101a;
        }
    }

    public CommonWebViewBridge(gf.y dispatcher, WebViewContainer webViewContainer, c0 adPlayerScope, SendDiagnosticEvent sendDiagnosticEvent, Logger logger) {
        k.e(dispatcher, "dispatcher");
        k.e(webViewContainer, "webViewContainer");
        k.e(adPlayerScope, "adPlayerScope");
        k.e(sendDiagnosticEvent, "sendDiagnosticEvent");
        k.e(logger, "logger");
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.logger = logger;
        mf.e y9 = f0.y(f0.y(adPlayerScope, dispatcher), new b0("CommonWebViewBridge"));
        this.scope = y9;
        this.callbacks = y0.c(t.f6848x);
        x0 b10 = y0.b(0, 5);
        this._onInvocation = b10;
        this.onInvocation = new s0(b10);
        f0.w(y9, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, JSONArray jSONArray, c cVar) {
        Object evaluateJavascript = this.webViewContainer.evaluateJavascript(handlerType, jSONArray, cVar);
        if (evaluateJavascript == me.a.f8833x) {
            return evaluateJavascript;
        }
        return y.f6101a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, c cVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        Object execute = execute(HandlerType.CALLBACK, new JSONArray((Collection) g.m(jSONArray)), cVar);
        if (execute == me.a.f8833x) {
            return execute;
        }
        return y.f6101a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public u0 getOnInvocation() {
        return this.onInvocation;
    }

    public final c0 getScope() {
        return this.scope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (r5.equals("OK") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        ((gf.q) r4).K(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if (r5.equals("success") == false) goto L35;
     */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void handleCallback(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = "callbackId"
            kotlin.jvm.internal.k.e(r4, r0)
            java.lang.String r0 = "callbackStatus"
            kotlin.jvm.internal.k.e(r5, r0)
            java.lang.String r0 = "rawParameters"
            kotlin.jvm.internal.k.e(r6, r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r6)
            java.lang.Object[] r6 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(r0)
            kf.r0 r0 = r3.callbacks
            kf.f1 r0 = (kf.f1) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            r2 = r1
            he.i r2 = (he.i) r2
            java.lang.Object r2 = r2.f6076x
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = kotlin.jvm.internal.k.a(r2, r4)
            if (r2 == 0) goto L26
            goto L3f
        L3e:
            r1 = 0
        L3f:
            he.i r1 = (he.i) r1
            if (r1 != 0) goto L45
            goto Lbd
        L45:
            java.lang.Object r4 = r1.f6077y
            gf.p r4 = (gf.p) r4
            int r0 = r5.hashCode()
            r2 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r0 == r2) goto L99
            r2 = 2524(0x9dc, float:3.537E-42)
            if (r0 == r2) goto L90
            r2 = 66247144(0x3f2d9e8, float:1.42735105E-36)
            if (r0 == r2) goto L6a
            r2 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r0 == r2) goto L61
            goto La7
        L61:
            java.lang.String r0 = "error"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L73
            goto La7
        L6a:
            java.lang.String r0 = "ERROR"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L73
            goto La7
        L73:
            java.lang.Exception r5 = new java.lang.Exception
            r0 = 0
            r6 = r6[r0]
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.k.c(r6, r2)
            java.lang.String r6 = (java.lang.String) r6
            r5.<init>(r6)
            gf.q r4 = (gf.q) r4
            r4.getClass()
            gf.t r6 = new gf.t
            r6.<init>(r5, r0)
            r4.K(r6)
            goto La7
        L90:
            java.lang.String r0 = "OK"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto La2
            goto La7
        L99:
            java.lang.String r0 = "success"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto La2
            goto La7
        La2:
            gf.q r4 = (gf.q) r4
            r4.K(r6)
        La7:
            kf.r0 r4 = r3.callbacks
        La9:
            r5 = r4
            kf.f1 r5 = (kf.f1) r5
            java.lang.Object r6 = r5.getValue()
            r0 = r6
            java.util.Set r0 = (java.util.Set) r0
            java.util.LinkedHashSet r0 = ie.y.y(r0, r1)
            boolean r5 = r5.f(r6, r0)
            if (r5 == 0) goto La9
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.handleCallback(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(String message) {
        JSONArray jSONArray;
        String str;
        String str2;
        JSONArray jSONArray2;
        String str3;
        k.e(message, "message");
        int i6 = 1;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                JSONArray jSONArray3 = new JSONArray(message);
                int length = jSONArray3.length();
                int i10 = 0;
                while (i10 < length) {
                    Object obj = jSONArray3.get(i10);
                    if (obj instanceof JSONArray) {
                        jSONArray = (JSONArray) obj;
                    } else {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        if (jSONArray.length() == 4) {
                            Object obj2 = jSONArray.get(0);
                            if (obj2 instanceof String) {
                                str = (String) obj2;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                Object obj3 = jSONArray.get(i6);
                                if (obj3 instanceof String) {
                                    str2 = (String) obj3;
                                } else {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    Object obj4 = jSONArray.get(2);
                                    if (obj4 instanceof JSONArray) {
                                        jSONArray2 = (JSONArray) obj4;
                                    } else {
                                        jSONArray2 = null;
                                    }
                                    if (jSONArray2 != null) {
                                        Object obj5 = jSONArray.get(3);
                                        if (obj5 instanceof String) {
                                            str3 = (String) obj5;
                                        } else {
                                            str3 = null;
                                        }
                                        if (str3 != null) {
                                            String str4 = str + '.' + str2;
                                            Logger logger = this.logger;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("Unity Ads WebView calling for: ");
                                            sb2.append(str4);
                                            sb2.append('(');
                                            sb2.append(jSONArray2);
                                            sb2.append(')');
                                            logger.debug(sb2.toString());
                                            f0.w(this.scope, null, new CommonWebViewBridge$handleInvocation$7(str4, jSONArray2, this, str3, message, null), 3);
                                            i10++;
                                            i6 = 1;
                                        } else {
                                            throw new IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + message).toString());
                                        }
                                    } else {
                                        throw new IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + message).toString());
                                    }
                                } else {
                                    throw new IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + message).toString());
                                }
                            } else {
                                throw new IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + message).toString());
                            }
                        } else {
                            throw new IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray).toString());
                        }
                    } else {
                        throw new IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + message).toString());
                    }
                }
            } catch (JSONException e10) {
                throw new IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: ".concat(message), e10);
            }
        } catch (Throwable th2) {
            th = th2;
            this.logger.error("Error handling invocation from webview (" + message + ')', th);
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = th.getClass().getSimpleName();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", null, w.y(new i("reason_debug", message2), new i("webview_invocation", message)), null, null, null, 58, null);
            throw new IllegalArgumentException("Invalid message passed to CommonWebViewBridge: ".concat(message), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object request(java.lang.String r11, java.lang.String r12, java.lang.Object[] r13, le.c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = (com.unity3d.ads.adplayer.CommonWebViewBridge$request$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = new com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            me.a r4 = me.a.f8833x
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            he.a.f(r14)
            return r14
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            java.lang.Object r11 = r0.L$0
            gf.p r11 = (gf.p) r11
            he.a.f(r14)
            goto L8c
        L3a:
            he.a.f(r14)
            gf.q r14 = gf.f0.a()
            int r1 = r14.hashCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            kf.r0 r5 = r10.callbacks
        L4b:
            r6 = r5
            kf.f1 r6 = (kf.f1) r6
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            java.util.Set r8 = (java.util.Set) r8
            he.i r9 = new he.i
            r9.<init>(r1, r14)
            java.util.LinkedHashSet r8 = ie.y.z(r8, r9)
            boolean r6 = r6.f(r7, r8)
            if (r6 == 0) goto L4b
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            r5.put(r11)
            r5.put(r12)
            r5.put(r1)
            int r11 = r13.length
            r12 = 0
        L74:
            if (r12 >= r11) goto L7e
            r1 = r13[r12]
            r5.put(r1)
            int r12 = r12 + 1
            goto L74
        L7e:
            com.unity3d.ads.adplayer.HandlerType r11 = com.unity3d.ads.adplayer.HandlerType.INVOCATION
            r0.L$0 = r14
            r0.label = r3
            java.lang.Object r11 = r10.execute(r11, r5, r0)
            if (r11 != r4) goto L8b
            goto L99
        L8b:
            r11 = r14
        L8c:
            r12 = 0
            r0.L$0 = r12
            r0.label = r2
            gf.q r11 = (gf.q) r11
            java.lang.Object r11 = r11.p(r0)
            if (r11 != r4) goto L9a
        L99:
            return r4
        L9a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.request(java.lang.String, java.lang.String, java.lang.Object[], le.c):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Object sendEvent(WebViewEvent webViewEvent, c cVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        Object execute = execute(HandlerType.EVENT, jSONArray, cVar);
        if (execute == me.a.f8833x) {
            return execute;
        }
        return y.f6101a;
    }
}
