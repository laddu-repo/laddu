package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import he.i;
import ie.s;
import ie.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kf.f1;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidCampaignRepository implements CampaignRepository {
    private final r0 campaigns;
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public AndroidCampaignRepository(GetSharedDataTimestamps getSharedDataTimestamps) {
        k.e(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.campaigns = y0.c(s.f6847x);
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public CampaignStateOuterClass.Campaign getCampaign(ByteString opportunityId) {
        k.e(opportunityId, "opportunityId");
        return (CampaignStateOuterClass.Campaign) ((Map) ((f1) this.campaigns).getValue()).get(opportunityId.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public CampaignStateOuterClass.CampaignState getCampaignState() {
        Collection values = ((Map) ((f1) this.campaigns).getValue()).values();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : values) {
            if (((CampaignStateOuterClass.Campaign) obj).hasShowTimestamp()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.Companion;
        CampaignStateOuterClass.CampaignState.Builder newBuilder = CampaignStateOuterClass.CampaignState.newBuilder();
        k.d(newBuilder, "newBuilder()");
        CampaignStateKt.Dsl _create = companion._create(newBuilder);
        _create.addAllShownCampaigns(_create.getShownCampaigns(), arrayList);
        _create.addAllLoadedCampaigns(_create.getLoadedCampaigns(), arrayList2);
        return _create._build();
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void removeState(ByteString opportunityId) {
        f1 f1Var;
        Object value;
        Map E;
        k.e(opportunityId, "opportunityId");
        r0 r0Var = this.campaigns;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
            Map map = (Map) value;
            Object stringUtf8 = opportunityId.toStringUtf8();
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

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setCampaign(ByteString opportunityId, CampaignStateOuterClass.Campaign campaign) {
        f1 f1Var;
        Object value;
        k.e(opportunityId, "opportunityId");
        k.e(campaign, "campaign");
        r0 r0Var = this.campaigns;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
        } while (!f1Var.f(value, w.A((Map) value, new i(opportunityId.toStringUtf8(), campaign))));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setLoadTimestamp(ByteString opportunityId) {
        k.e(opportunityId, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(opportunityId);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            k.d(builder, "this.toBuilder()");
            CampaignKt.Dsl _create = companion._create(builder);
            _create.setLoadTimestamp(this.getSharedDataTimestamps.invoke());
            setCampaign(opportunityId, _create._build());
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setShowTimestamp(ByteString opportunityId) {
        k.e(opportunityId, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(opportunityId);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            k.d(builder, "this.toBuilder()");
            CampaignKt.Dsl _create = companion._create(builder);
            _create.setShowTimestamp(this.getSharedDataTimestamps.invoke());
            setCampaign(opportunityId, _create._build());
        }
    }
}
