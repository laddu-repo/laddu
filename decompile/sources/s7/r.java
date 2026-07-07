package s7;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.measurement.mb;
import com.google.android.gms.internal.measurement.t6;
import com.google.android.gms.internal.measurement.va;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import t7.y;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class r extends f8.g implements r7.g, r7.h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final va f11541l = l8.b.f8313a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f11542e;
    public final Handler f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final va f11543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f11544h;
    public final mb i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m8.a f11545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o2.p f11546k;

    public r(Context context, t6 t6Var, mb mbVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f11542e = context;
        this.f = t6Var;
        this.i = mbVar;
        this.f11544h = (Set) mbVar.f2888b;
        this.f11543g = f11541l;
    }

    @Override // r7.h
    public final void c(q7.b bVar) {
        this.f11546k.e(bVar);
    }

    @Override // r7.g
    public final void e(int i) {
        o2.p pVar = this.f11546k;
        j jVar = (j) ((d) pVar.A).E.get((a) pVar.f9504x);
        if (jVar != null) {
            if (jVar.f11526l) {
                jVar.n(new q7.b(17, null, null));
            } else {
                jVar.e(i);
            }
        }
    }

    @Override // r7.g
    public final void f() {
        GoogleSignInAccount googleSignInAccountA;
        m8.a aVar = this.f11545j;
        aVar.getClass();
        try {
            aVar.B.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = aVar.f12316c;
                ReentrantLock reentrantLock = n7.a.f9011c;
                y.g(context);
                ReentrantLock reentrantLock2 = n7.a.f9011c;
                reentrantLock2.lock();
                try {
                    if (n7.a.f9012d == null) {
                        n7.a.f9012d = new n7.a(context.getApplicationContext());
                    }
                    n7.a aVar2 = n7.a.f9012d;
                    reentrantLock2.unlock();
                    String strA = aVar2.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        StringBuilder sb2 = new StringBuilder(20 + String.valueOf(strA).length());
                        sb2.append("googleSignInAccount:");
                        sb2.append(strA);
                        String strA2 = aVar2.a(sb2.toString());
                        if (strA2 != null) {
                            try {
                                googleSignInAccountA = GoogleSignInAccount.a(strA2);
                            } catch (JSONException unused) {
                                googleSignInAccountA = null;
                            }
                        }
                    }
                    googleSignInAccountA = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountA = null;
            }
            Integer num = aVar.D;
            y.g(num);
            t7.r rVar = new t7.r(2, account, num.intValue(), googleSignInAccountA);
            m8.d dVar = (m8.d) aVar.m();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(dVar.f);
            int i = d8.a.f4385a;
            parcelObtain.writeInt(1);
            int iC0 = com.bumptech.glide.d.c0(parcelObtain, 20293);
            com.bumptech.glide.d.b0(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            com.bumptech.glide.d.X(parcelObtain, 2, rVar, 0);
            com.bumptech.glide.d.d0(parcelObtain, iC0);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                dVar.f2790e.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                parcelObtain2.recycle();
            } catch (Throwable th2) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                throw th2;
            }
        } catch (RemoteException e7) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f.post(new o8.m(9, this, new m8.f(1, new q7.b(8, null, null), null)));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e7);
            }
        }
    }
}
