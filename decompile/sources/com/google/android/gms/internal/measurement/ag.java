package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ag implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2487v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f2488w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f2489x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f2490y;

    public /* synthetic */ ag() {
        this.f2487v = 14;
    }

    private final void a() {
        int i;
        o8.o oVarE;
        p7.a aVar = (p7.a) this.f2489x;
        Intent intent = aVar.f10396v;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            oVarE = b8.h.o(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = aVar.f10396v;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = aVar.f10396v;
            Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (numValueOf != null) {
                bundle.putInt("google.product_id", numValueOf.intValue());
            }
            Context context = (Context) this.f2488w;
            bundle.putBoolean("supports_message_handled", true);
            p7.m mVarD = p7.m.d(context);
            synchronized (mVarD) {
                i = mVarD.f10429v;
                mVarD.f10429v = i + 1;
            }
            oVarE = mVarD.e(new p7.l(i, 2, bundle, 0));
        }
        oVarE.b(p7.h.f10412w, new p7.i((CountDownLatch) this.f2490y));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x050d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ag.run():void");
    }

    public String toString() {
        switch (this.f2487v) {
            case 1:
                cb cbVar = (cb) this.f2490y;
                StringBuilder sb2 = new StringBuilder(cbVar.toString().length() + 14);
                sb2.append("propagating=[");
                sb2.append(cbVar);
                sb2.append("]");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ag(Object obj, Object obj2, Object obj3, int i) {
        this.f2487v = i;
        this.f2488w = obj;
        this.f2489x = obj2;
        this.f2490y = obj3;
    }

    public /* synthetic */ ag(Object obj, Object obj2, Object obj3, int i, boolean z2) {
        this.f2487v = i;
        this.f2488w = obj2;
        this.f2489x = obj3;
        this.f2490y = obj;
    }

    public ag(k8.p3 p3Var, AtomicReference atomicReference, k8.v4 v4Var) {
        this.f2487v = 7;
        this.f2488w = atomicReference;
        this.f2489x = v4Var;
        Objects.requireNonNull(p3Var);
        this.f2490y = p3Var;
    }
}
