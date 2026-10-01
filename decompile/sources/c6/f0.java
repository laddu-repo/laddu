package c6;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.ActionMenuView;
import com.livxow.tv.app.App;
import com.livxow.tv.utils.DataHelper;
import h.k0;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class f0 implements n.w, ef.e, ua.j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2170v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f2171w;

    public /* synthetic */ f0(Object obj) {
        this.f2171w = obj;
        this.f2170v = true;
    }

    @Override // ua.j
    public void a(ua.i iVar, int i) {
        StringBuilder sb2 = (StringBuilder) this.f2171w;
        if (this.f2170v) {
            this.f2170v = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i);
    }

    public void b(int i) {
        w1.a.j(!this.f2170v);
        ((SparseBooleanArray) this.f2171w).append(i, true);
    }

    @Override // ef.e
    public void c(IOException iOException) {
        b8.h.L((qc.j) this.f2171w, false, iOException.getMessage());
    }

    @Override // n.w
    public void d(n.l lVar, boolean z2) {
        o.j jVar;
        k0 k0Var = (k0) this.f2171w;
        if (this.f2170v) {
            return;
        }
        this.f2170v = true;
        ActionMenuView actionMenuView = k0Var.f5936e.f9199a.f681v;
        if (actionMenuView != null && (jVar = actionMenuView.O) != null) {
            jVar.c();
            o.f fVar = jVar.O;
            if (fVar != null && fVar.b()) {
                fVar.i.dismiss();
            }
        }
        k0Var.f.onPanelClosed(108, lVar);
        this.f2170v = false;
    }

    public t1.m e() {
        w1.a.j(!this.f2170v);
        this.f2170v = true;
        return new t1.m((SparseBooleanArray) this.f2171w);
    }

    public boolean f() {
        return this.f2170v;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L48
            if (r8 < 0) goto L48
            int r0 = r7.length()
            int r0 = r0 - r8
            if (r0 < 0) goto L48
            java.lang.Object r0 = r6.f2171w
            r0.f r0 = (r0.f) r0
            if (r0 != 0) goto L16
            boolean r7 = r6.f()
            return r7
        L16:
            r0.getClass()
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L1d:
            r4 = 1
            if (r2 >= r8) goto L3d
            if (r3 != r1) goto L3d
            char r3 = r7.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            c6.f0 r5 = r0.g.f11057a
            if (r3 == 0) goto L39
            if (r3 == r4) goto L37
            if (r3 == r1) goto L37
            switch(r3) {
                case 14: goto L39;
                case 15: goto L39;
                case 16: goto L37;
                case 17: goto L37;
                default: goto L35;
            }
        L35:
            r3 = r1
            goto L3a
        L37:
            r3 = r0
            goto L3a
        L39:
            r3 = r4
        L3a:
            int r2 = r2 + 1
            goto L1d
        L3d:
            if (r3 == 0) goto L47
            if (r3 == r4) goto L46
            boolean r7 = r6.f()
            return r7
        L46:
            return r0
        L47:
            return r4
        L48:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.f0.g(java.lang.CharSequence, int):boolean");
    }

    public void h() {
        this.f2170v = false;
    }

    public void i(char c10) {
        i iVar = (i) this.f2171w;
        iVar.j(iVar.f2194w, 1);
        char[] cArr = (char[]) iVar.f2195x;
        int i = iVar.f2194w;
        iVar.f2194w = i + 1;
        cArr[i] = c10;
    }

    @Override // ef.e
    public void j(ef.b0 b0Var) {
        String strM;
        ef.d0 d0Var = b0Var.B;
        if (this.f2170v) {
            try {
                vf.n nVarH = z7.b.h(new vf.h(d0Var.l()));
                vf.c cVar = nVarH.f13631w;
                cVar.o0(nVarH.f13630v);
                strM = cVar.H();
            } catch (IOException | IllegalArgumentException unused) {
                strM = d0Var.m();
            }
        } else {
            strM = d0Var.m();
        }
        Context applicationContext = App.P.getApplicationContext();
        String str = (applicationContext == null || strM.startsWith("{") || strM.startsWith("[")) ? strM : new String(DataHelper.MyApp(applicationContext, strM));
        if (TextUtils.isEmpty(str) || (!str.startsWith("{") && !str.startsWith("["))) {
            try {
                byte[] bArrDecode = Base64.decode(rc.a.b(strM), 0);
                SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{77, 56, 109, 107, 75, 108, 78, 76, 55, 53, 75, 52, 110, 108, 49, 53}, "AES");
                IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[]{107, 78, 55, 109, 53, 75, 108, 49, 112, 78, 53, 110, 107, 52, 120, 75});
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, ivParameterSpec);
                str = new String(cipher.doFinal(bArrDecode), StandardCharsets.UTF_8);
            } catch (Exception unused2) {
                str = "";
            }
        }
        if (!TextUtils.isEmpty(str)) {
            strM = str;
        }
        b8.h.L((qc.j) this.f2171w, b0Var.K, strM);
        b0Var.close();
    }

    @Override // n.w
    public boolean k(n.l lVar) {
        ((k0) this.f2171w).f.onMenuOpened(108, lVar);
        return true;
    }

    public synchronized void l(b0 b0Var, boolean z2) {
        try {
            if (this.f2170v || z2) {
                ((Handler) this.f2171w).obtainMessage(1, b0Var).sendToTarget();
            } else {
                this.f2170v = true;
                b0Var.e();
                this.f2170v = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public /* synthetic */ f0(Object obj, boolean z2) {
        this.f2171w = obj;
    }

    public f0(int i) {
        switch (i) {
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f2171w = new SparseBooleanArray();
                break;
            default:
                this.f2171w = new Handler(Looper.getMainLooper(), new e0(0));
                break;
        }
    }

    public f0(r0.f fVar, boolean z2) {
        this((Object) fVar, false);
        this.f2170v = z2;
    }

    public void m() {
    }

    public void n() {
    }
}
