package ic;

import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements s9.e {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6763x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f6764y;

    public /* synthetic */ l(FirebaseMessaging firebaseMessaging, int i6) {
        this.f6763x = i6;
        this.f6764y = firebaseMessaging;
    }

    @Override // s9.e
    public final void onSuccess(Object obj) {
        int i6 = this.f6763x;
        FirebaseMessaging firebaseMessaging = this.f6764y;
        switch (i6) {
            case 0:
                z zVar = (z) obj;
                if (firebaseMessaging.f2846e.f()) {
                    zVar.h();
                    return;
                }
                return;
            default:
                s8.a aVar = (s8.a) obj;
                k7.c cVar = FirebaseMessaging.f2839l;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    a8.b.h(aVar.f12224x);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
