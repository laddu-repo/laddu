package com.google.protobuf;

import com.google.android.gms.internal.measurement.s6;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class u3 extends s6 {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ s3 f3059z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(s3 s3Var) {
        super(s3Var, 1);
        this.f3059z = s3Var;
    }

    @Override // com.google.android.gms.internal.measurement.s6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new t3(this.f3059z);
    }
}
