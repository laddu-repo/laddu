package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import gf.c0;
import he.y;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import org.json.JSONArray;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidWebViewContainer$evaluateJavascript$2 extends j implements p {
    final /* synthetic */ JSONArray $arguments;
    final /* synthetic */ HandlerType $handlerType;
    int label;
    final /* synthetic */ AndroidWebViewContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidWebViewContainer$evaluateJavascript$2(JSONArray jSONArray, HandlerType handlerType, AndroidWebViewContainer androidWebViewContainer, c cVar) {
        super(2, cVar);
        this.$arguments = jSONArray;
        this.$handlerType = handlerType;
        this.this$0 = androidWebViewContainer;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidWebViewContainer$evaluateJavascript$2(this.$arguments, this.$handlerType, this.this$0, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidWebViewContainer$evaluateJavascript$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        StringBuilder shared_string_builder;
        if (this.label == 0) {
            he.a.f(obj);
            String jSONArray = this.$arguments.toString();
            k.d(jSONArray, "arguments.toString()");
            int length = jSONArray.length() + this.$handlerType.getJsPath().length() + 32 + 2;
            AndroidWebViewContainer.Companion companion = AndroidWebViewContainer.Companion;
            if (length > companion.getSHARED_STRING_BUILDER().capacity()) {
                shared_string_builder = new StringBuilder(length);
            } else {
                shared_string_builder = companion.getSHARED_STRING_BUILDER();
                k.e(shared_string_builder, "<this>");
                shared_string_builder.setLength(0);
            }
            HandlerType handlerType = this.$handlerType;
            shared_string_builder.append("javascript:window.nativebridge.");
            shared_string_builder.append(handlerType.getJsPath());
            shared_string_builder.append("(");
            shared_string_builder.append(jSONArray);
            shared_string_builder.append(");");
            this.this$0.getWebView().evaluateJavascript(shared_string_builder.toString(), null);
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
