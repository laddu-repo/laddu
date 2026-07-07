package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.services.UnityAdsConstants;
import gf.f0;
import gf.y;
import ie.s;
import ie.t;
import ie.w;
import java.util.Map;
import java.util.Set;
import kf.f1;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.k;
import le.c;
import uc.b;
import uc.i;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidOpenMeasurementRepository implements OpenMeasurementRepository {
    private final r0 _isOMActive;
    private final r0 activeSessions;
    private final r0 finishedSessions;
    private final y mainDispatcher;
    private final OmidManager omidManager;
    private final i partner;

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, uc.i] */
    public AndroidOpenMeasurementRepository(y mainDispatcher, OmidManager omidManager) {
        k.e(mainDispatcher, "mainDispatcher");
        k.e(omidManager, "omidManager");
        this.mainDispatcher = mainDispatcher;
        this.omidManager = omidManager;
        if (!TextUtils.isEmpty(UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME)) {
            if (!TextUtils.isEmpty("4.16.5")) {
                this.partner = new Object();
                this.activeSessions = y0.c(s.f6847x);
                this.finishedSessions = y0.c(t.f6848x);
                this._isOMActive = y0.c(Boolean.FALSE);
                return;
            }
            throw new IllegalArgumentException("Version is null or empty");
        }
        throw new IllegalArgumentException("Name is null or empty");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSession(ByteString byteString, b bVar) {
        f1 f1Var;
        Object value;
        r0 r0Var = this.activeSessions;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
        } while (!f1Var.f(value, w.A((Map) value, new he.i(byteString.toStringUtf8(), bVar))));
    }

    private final OMData buildOmData() {
        return new OMData(this.omidManager.getVersion(), UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b getSession(ByteString byteString) {
        return (b) ((Map) ((f1) this.activeSessions).getValue()).get(byteString.toStringUtf8());
    }

    private final void removeSession(ByteString byteString) {
        f1 f1Var;
        Object value;
        Map E;
        r0 r0Var = this.activeSessions;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
            Map map = (Map) value;
            Object stringUtf8 = byteString.toStringUtf8();
            k.d(stringUtf8, "opportunityId.toStringUtf8()");
            k.e(map, "<this>");
            E = w.E(map);
            E.remove(stringUtf8);
            int size = E.size();
            if (size != 0) {
                if (size == 1) {
                    E = w.F(E);
                }
            } else {
                E = s.f6847x;
            }
        } while (!f1Var.f(value, E));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sessionFinished(ByteString byteString) {
        f1 f1Var;
        Object value;
        String stringUtf8;
        r0 r0Var = this.finishedSessions;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
            stringUtf8 = byteString.toStringUtf8();
            k.d(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!f1Var.f(value, ie.y.z((Set) value, stringUtf8)));
        removeSession(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object activateOM(Context context, c cVar) {
        return f0.J(this.mainDispatcher, new AndroidOpenMeasurementRepository$activateOM$2(this, context, null), cVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object finishSession(ByteString byteString, c cVar) {
        return f0.J(this.mainDispatcher, new AndroidOpenMeasurementRepository$finishSession$2(this, byteString, null), cVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public OMData getOmData() {
        return buildOmData();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean hasSessionFinished(ByteString opportunityId) {
        k.e(opportunityId, "opportunityId");
        return ((Set) ((f1) this.finishedSessions).getValue()).contains(opportunityId.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object impressionOccurred(ByteString byteString, boolean z10, c cVar) {
        return f0.J(this.mainDispatcher, new AndroidOpenMeasurementRepository$impressionOccurred$2(this, byteString, z10, null), cVar);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean isOMActive() {
        return ((Boolean) ((f1) this._isOMActive).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public void setOMActive(boolean z10) {
        f1 f1Var;
        Object value;
        r0 r0Var = this._isOMActive;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
            ((Boolean) value).getClass();
        } while (!f1Var.f(value, Boolean.valueOf(z10)));
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, c cVar) {
        return f0.J(this.mainDispatcher, new AndroidOpenMeasurementRepository$startSession$2(this, byteString, omidOptions, webView, null), cVar);
    }
}
