package a7;

import ac.r0;
import ac.s0;
import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import t1.k0;
import t1.l0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements x6.g, x6.e, ma.e, w1.m, w1.n {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f225v;

    public /* synthetic */ u(int i) {
        this.f225v = i;
    }

    @Override // w1.m
    public void a(Object obj) {
        switch (this.f225v) {
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                ((l0) obj).o(new c2.o(2, new a5.d(2, "Player release timed out."), 1003));
                break;
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case 22:
            default:
                ((d2.k) obj).getClass();
                break;
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                ((l0) obj).n();
                break;
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                ((d2.k) obj).getClass();
                break;
            case 9:
                ((d2.k) obj).getClass();
                break;
            case 10:
                ((d2.k) obj).getClass();
                break;
            case 11:
                ((d2.k) obj).getClass();
                break;
            case 12:
                ((d2.k) obj).getClass();
                break;
            case 13:
                ((d2.k) obj).getClass();
                break;
            case 14:
                ((d2.k) obj).getClass();
                break;
            case 15:
                ((d2.k) obj).getClass();
                break;
            case 16:
                ((d2.k) obj).getClass();
                break;
            case 17:
                ((d2.k) obj).getClass();
                break;
            case 18:
                ((d2.k) obj).getClass();
                break;
            case 19:
                ((d2.k) obj).getClass();
                break;
            case 20:
                ((d2.k) obj).getClass();
                break;
            case 21:
                ((d2.k) obj).getClass();
                break;
            case 23:
                ((d2.k) obj).getClass();
                break;
            case 24:
                ((d2.k) obj).getClass();
                break;
            case 25:
                ((d2.k) obj).getClass();
                break;
            case 26:
                ((d2.k) obj).getClass();
                break;
            case 27:
                ((d2.k) obj).getClass();
                break;
            case 28:
                ((d2.k) obj).getClass();
                break;
        }
    }

    @Override // x6.e
    public Object apply(Object obj) {
        String strU = s0.f447b.u((r0) obj);
        de.i.d(strU, "encode(...)");
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = strU.getBytes(ke.a.f7954a);
        de.i.d(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // w1.n
    public void b(Object obj, t1.m mVar) {
        switch (this.f225v) {
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                ((l0) obj).z(new k0(mVar));
                break;
            default:
                break;
        }
    }

    @Override // ma.e
    public Object p(ad.c cVar) {
        switch (this.f225v) {
            case 3:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(cVar);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(cVar);
        }
    }

    public /* synthetic */ u(int i, Object obj) {
        this.f225v = i;
    }

    @Override // x6.g
    public void c(Exception exc) {
    }
}
