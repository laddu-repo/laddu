package com.unity3d.services;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gf.c0;
import he.a;
import he.y;
import je.f;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.services.SDKErrorHandler$sendDiagnostic$1", f = "SDKErrorHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SDKErrorHandler$sendDiagnostic$1 extends j implements p {
    final /* synthetic */ String $name;
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ String $reason;
    final /* synthetic */ String $scopeName;
    final /* synthetic */ String $stackTrace;
    int label;
    final /* synthetic */ SDKErrorHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDKErrorHandler$sendDiagnostic$1(SDKErrorHandler sDKErrorHandler, String str, String str2, String str3, String str4, ByteString byteString, c cVar) {
        super(2, cVar);
        this.this$0 = sDKErrorHandler;
        this.$name = str;
        this.$reason = str2;
        this.$stackTrace = str3;
        this.$scopeName = str4;
        this.$opportunityId = byteString;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new SDKErrorHandler$sendDiagnostic$1(this.this$0, this.$name, this.$reason, this.$stackTrace, this.$scopeName, this.$opportunityId, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((SDKErrorHandler$sendDiagnostic$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        SendDiagnosticEvent sendDiagnosticEvent;
        if (this.label == 0) {
            a.f(obj);
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            String str = this.$name;
            String str2 = this.$reason;
            String str3 = this.$stackTrace;
            String str4 = this.$scopeName;
            ByteString byteString = this.$opportunityId;
            f fVar = new f();
            fVar.put("reason", str2);
            fVar.put("reason_debug", str3);
            fVar.put("coroutine_name", str4);
            if (byteString != null) {
                String uuid = ProtobufExtensionsKt.toUUID(byteString).toString();
                k.d(uuid, "it.toUUID().toString()");
                fVar.put("impressionOpportunityId", uuid);
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, null, fVar.b(), null, null, null, 58, null);
            return y.f6101a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
