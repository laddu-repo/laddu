package com.unity3d.ads.core.data.datasource;

import df.u;
import he.y;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidUnityBootConfigDataSource$getValue$1$1$1 extends l implements ve.l {
    final /* synthetic */ String $prefix;
    final /* synthetic */ w $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidUnityBootConfigDataSource$getValue$1$1$1(String str, w wVar) {
        super(1);
        this.$prefix = str;
        this.$value = wVar;
    }

    @Override // ve.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return y.f6101a;
    }

    public final void invoke(String line) {
        k.e(line, "line");
        if (u.H(line, this.$prefix, false)) {
            w wVar = this.$value;
            String substring = line.substring(this.$prefix.length());
            k.d(substring, "this as java.lang.String).substring(startIndex)");
            wVar.f8055x = substring;
        }
    }
}
