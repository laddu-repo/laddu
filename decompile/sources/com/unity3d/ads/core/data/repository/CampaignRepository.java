package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.CampaignStateOuterClass;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public interface CampaignRepository {
    CampaignStateOuterClass.Campaign getCampaign(ByteString byteString);

    CampaignStateOuterClass.CampaignState getCampaignState();

    void removeState(ByteString byteString);

    void setCampaign(ByteString byteString, CampaignStateOuterClass.Campaign campaign);

    void setLoadTimestamp(ByteString byteString);

    void setShowTimestamp(ByteString byteString);
}
