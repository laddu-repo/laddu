package com.unity3d.ads.core.data.repository;

import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import gf.c0;
import he.a;
import he.y;
import java.util.Map;
import kf.f1;
import kf.r0;
import le.c;
import ne.e;
import ne.j;
import uc.b;
import uc.d;
import uc.f;
import uc.g;
import uc.h;
import uc.i;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidOpenMeasurementRepository$startSession$2 extends j implements p {
    final /* synthetic */ ByteString $opportunityId;
    final /* synthetic */ OmidOptions $options;
    final /* synthetic */ WebView $webView;
    int label;
    final /* synthetic */ AndroidOpenMeasurementRepository this$0;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidOpenMeasurementRepository$startSession$2(AndroidOpenMeasurementRepository androidOpenMeasurementRepository, ByteString byteString, OmidOptions omidOptions, WebView webView, c cVar) {
        super(2, cVar);
        this.this$0 = androidOpenMeasurementRepository;
        this.$opportunityId = byteString;
        this.$options = omidOptions;
        this.$webView = webView;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidOpenMeasurementRepository$startSession$2(this.this$0, this.$opportunityId, this.$options, this.$webView, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidOpenMeasurementRepository$startSession$2) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        OmidManager omidManager;
        OmidManager omidManager2;
        i iVar;
        d createHtmlAdSessionContext;
        OmidManager omidManager3;
        OmidManager omidManager4;
        i iVar2;
        if (this.label == 0) {
            a.f(obj);
            try {
                if (this.this$0.isOMActive()) {
                    r0Var = this.this$0.activeSessions;
                    if (((Map) ((f1) r0Var).getValue()).containsKey(this.$opportunityId.toStringUtf8())) {
                        return new OMResult.Failure("om_session_already_exists", null, 2, null);
                    }
                    f creativeType = this.$options.getCreativeType();
                    if (creativeType != null) {
                        omidManager = this.this$0.omidManager;
                        g impressionType = this.$options.getImpressionType();
                        if (impressionType == null) {
                            impressionType = g.DEFINED_BY_JAVASCRIPT;
                        }
                        g gVar = impressionType;
                        h impressionOwner = this.$options.getImpressionOwner();
                        h hVar = h.JAVASCRIPT;
                        if (impressionOwner == null) {
                            impressionOwner = hVar;
                        }
                        h videoEventsOwner = this.$options.getVideoEventsOwner();
                        if (videoEventsOwner == null) {
                            videoEventsOwner = hVar;
                        }
                        uc.c createAdSessionConfiguration = omidManager.createAdSessionConfiguration(creativeType, gVar, impressionOwner, videoEventsOwner, this.$options.getIsolateVerificationScripts());
                        int ordinal = creativeType.ordinal();
                        if (ordinal == 1) {
                            omidManager2 = this.this$0.omidManager;
                            iVar = this.this$0.partner;
                            createHtmlAdSessionContext = omidManager2.createHtmlAdSessionContext(iVar, this.$webView, null, this.$options.getCustomReferenceData());
                        } else if (ordinal == 3) {
                            omidManager4 = this.this$0.omidManager;
                            iVar2 = this.this$0.partner;
                            createHtmlAdSessionContext = omidManager4.createJavaScriptAdSessionContext(iVar2, this.$webView, null, this.$options.getCustomReferenceData());
                        } else {
                            return new OMResult.Failure("om_creative_type_invalid", null, 2, null);
                        }
                        omidManager3 = this.this$0.omidManager;
                        b createAdSession = omidManager3.createAdSession(createAdSessionConfiguration, createHtmlAdSessionContext);
                        createAdSession.a(this.$webView);
                        createAdSession.b();
                        this.this$0.addSession(this.$opportunityId, createAdSession);
                        return OMResult.Success.INSTANCE;
                    }
                    return new OMResult.Failure("om_creative_type_null", null, 2, null);
                }
                return new OMResult.Failure("om_not_active", null, 2, null);
            } catch (Throwable th) {
                return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
