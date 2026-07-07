package com.google.firebase.remoteconfig.ktx;

import a8.g;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import lg.c;
import qb.b;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@Keep
/* loaded from: classes.dex */
public final class FirebaseConfigLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        return g.m(c.e("fire-cfg-ktx", "22.1.2"));
    }
}
