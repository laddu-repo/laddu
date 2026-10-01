package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9.z0 f2615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y9.z0 f2616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f2617c;

    public eg(y9.z0 z0Var, y9.z0 z0Var2, UUID uuid) {
        this.f2615a = z0Var;
        this.f2616b = z0Var2;
        this.f2617c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eg)) {
            return false;
        }
        eg egVar = (eg) obj;
        return this.f2615a.equals(egVar.f2615a) && this.f2616b.equals(egVar.f2616b) && this.f2617c.equals(egVar.f2617c);
    }

    public final int hashCode() {
        return ((((((this.f2615a.hashCode() ^ 1000003) * 1000003) ^ this.f2616b.hashCode()) * 1000003) ^ this.f2617c.hashCode()) * 1000003) ^ ((int) (-4294967296L));
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.f2615a);
    }
}
