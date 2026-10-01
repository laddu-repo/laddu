package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class va extends com.bumptech.glide.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3161e;

    public /* synthetic */ va(int i) {
        this.f3161e = i;
    }

    @Override // com.bumptech.glide.f
    public r7.c b(Context context, Looper looper, mb mbVar, Object obj, r7.g gVar, r7.h hVar) {
        switch (this.f3161e) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return new ab(context, looper, 51, mbVar, gVar, hVar);
            case 1:
                mbVar.getClass();
                Integer num = (Integer) mbVar.f2892g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new m8.a(context, looper, mbVar, bundle, gVar, hVar);
            case 2:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.b(context, looper, mbVar, obj, gVar, hVar);
        }
    }

    @Override // com.bumptech.glide.f
    public r7.c c(Context context, Looper looper, mb mbVar, Object obj, s7.j jVar, s7.j jVar2) {
        switch (this.f3161e) {
            case 3:
                return new v7.a(context, looper, 449, mbVar, jVar, jVar2);
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                return new v7.e(context, looper, mbVar, (t7.n) obj, jVar, jVar2);
            default:
                return super.c(context, looper, mbVar, obj, jVar, jVar2);
        }
    }
}
