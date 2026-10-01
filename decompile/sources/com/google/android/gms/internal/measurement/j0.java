package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j0 extends x implements l0 {
    @Override // com.google.android.gms.internal.measurement.l0
    public final void beginAdUnitExposure(String str, long j) {
        Parcel J = J();
        J.writeString(str);
        J.writeLong(j);
        K(J, 23);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        z.b(J, bundle);
        K(J, 9);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void endAdUnitExposure(String str, long j) {
        Parcel J = J();
        J.writeString(str);
        J.writeLong(j);
        K(J, 24);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void generateEventId(n0 n0Var) {
        Parcel J = J();
        z.c(J, n0Var);
        K(J, 22);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCachedAppInstanceId(n0 n0Var) {
        Parcel J = J();
        z.c(J, n0Var);
        K(J, 19);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getConditionalUserProperties(String str, String str2, n0 n0Var) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        z.c(J, n0Var);
        K(J, 10);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCurrentScreenClass(n0 n0Var) {
        Parcel J = J();
        z.c(J, n0Var);
        K(J, 17);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCurrentScreenName(n0 n0Var) {
        Parcel J = J();
        z.c(J, n0Var);
        K(J, 16);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getGmpAppId(n0 n0Var) {
        Parcel J = J();
        z.c(J, n0Var);
        K(J, 21);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getMaxUserProperties(String str, n0 n0Var) {
        Parcel J = J();
        J.writeString(str);
        z.c(J, n0Var);
        K(J, 6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getUserProperties(String str, String str2, boolean z10, n0 n0Var) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        ClassLoader classLoader = z.f2542a;
        J.writeInt(z10 ? 1 : 0);
        z.c(J, n0Var);
        K(J, 5);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void initialize(d9.a aVar, v0 v0Var, long j) {
        Parcel J = J();
        z.c(J, aVar);
        z.b(J, v0Var);
        J.writeLong(j);
        K(J, 1);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j) {
        Parcel J = J();
        J.writeString(str);
        J.writeString(str2);
        z.b(J, bundle);
        J.writeInt(1);
        J.writeInt(1);
        J.writeLong(j);
        K(J, 2);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void logHealthData(int i6, String str, d9.a aVar, d9.a aVar2, d9.a aVar3) {
        Parcel J = J();
        J.writeInt(5);
        J.writeString("Error with data collection. Data lost.");
        z.c(J, aVar);
        z.c(J, aVar2);
        z.c(J, aVar3);
        K(J, 33);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityCreatedByScionActivityInfo(x0 x0Var, Bundle bundle, long j) {
        Parcel J = J();
        z.b(J, x0Var);
        z.b(J, bundle);
        J.writeLong(j);
        K(J, 53);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityDestroyedByScionActivityInfo(x0 x0Var, long j) {
        Parcel J = J();
        z.b(J, x0Var);
        J.writeLong(j);
        K(J, 54);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityPausedByScionActivityInfo(x0 x0Var, long j) {
        Parcel J = J();
        z.b(J, x0Var);
        J.writeLong(j);
        K(J, 55);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityResumedByScionActivityInfo(x0 x0Var, long j) {
        Parcel J = J();
        z.b(J, x0Var);
        J.writeLong(j);
        K(J, 56);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivitySaveInstanceStateByScionActivityInfo(x0 x0Var, n0 n0Var, long j) {
        Parcel J = J();
        z.b(J, x0Var);
        z.c(J, n0Var);
        J.writeLong(j);
        K(J, 57);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityStartedByScionActivityInfo(x0 x0Var, long j) {
        Parcel J = J();
        z.b(J, x0Var);
        J.writeLong(j);
        K(J, 51);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityStoppedByScionActivityInfo(x0 x0Var, long j) {
        Parcel J = J();
        z.b(J, x0Var);
        J.writeLong(j);
        K(J, 52);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void retrieveAndUploadBatches(p0 p0Var) {
        Parcel J = J();
        z.c(J, p0Var);
        K(J, 58);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel J = J();
        z.b(J, bundle);
        J.writeLong(j);
        K(J, 8);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setCurrentScreenByScionActivityInfo(x0 x0Var, String str, String str2, long j) {
        Parcel J = J();
        z.b(J, x0Var);
        J.writeString(str);
        J.writeString(str2);
        J.writeLong(j);
        K(J, 50);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setDataCollectionEnabled(boolean z10) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setUserProperty(String str, String str2, d9.a aVar, boolean z10, long j) {
        Parcel J = J();
        J.writeString("fcm");
        J.writeString("_ln");
        z.c(J, aVar);
        J.writeInt(1);
        J.writeLong(j);
        K(J, 4);
    }
}
